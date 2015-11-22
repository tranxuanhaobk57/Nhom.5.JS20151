/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyMonHoc;

import ConnectDB.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dang94
 */
public class MonHocIMPL implements MonHocDAO {

    @Override
    public ArrayList<MonHoc> getAll() {
         ArrayList<MonHoc> list = null;
         PreparedStatement ps=null;
         ResultSet rs=null;
         if(DBConnect.open()){
             try{
                 ps=DBConnect.con.prepareStatement("Select* from tblMonHoc");
                 rs=ps.executeQuery();
                 list=new ArrayList<>();
                 while(rs.next()){
                     MonHoc mh=new MonHoc();
                     mh.setMaMH(rs.getString(1));
                     mh.setTenMH(rs.getString(2));
                     mh.setSoTC(rs.getInt(3));
                     mh.setHinhThucThi(rs.getString(4));
                     mh.setHocKy(rs.getInt(5));
                     mh.setPhongHoc(rs.getString(6));
                     list.add(mh);
                 }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(MonHocIMPL.class.getName()).log(Level.SEVERE, null, ex);
             }
             finally{
                 DBConnect.close(ps,rs);
             }
         }
         return list;
     
    }

    @Override
    public ArrayList<MonHoc> findMaMH(String maMH) {
        ArrayList<MonHoc> list =null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        if(DBConnect.open()){
            try{
                ps=DBConnect.con.prepareStatement("select * tblMonHoc where MaMH=?");
                ps.setString(1, maMH);
                rs=ps.executeQuery();
                list=new ArrayList<>();
                while(rs.next()){
                    MonHoc mh =new MonHoc();
                   mh.setMaMH(rs.getString(1));
                     mh.setTenMH(rs.getString(2));
                     mh.setSoTC(rs.getInt(3));
                     mh.setHinhThucThi(rs.getString(4));
                     mh.setHocKy(rs.getInt(5));
                     mh.setPhongHoc(rs.getString(6));
                     list.add(mh);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocIMPL.class.getName()).log(Level.SEVERE, null, ex);
            }
        finally{
                 DBConnect.close(ps,rs);
             }
         }
         return list;
    }

    @Override
    public MonHoc addNew(MonHoc mh) {
        PreparedStatement ps=null;
        if(DBConnect.open()){
            try{
                ps=DBConnect.con.prepareCall("insert into tblMonHoc(MaMH, TenMH, SoTinChi, HinhThucThi, HocKy, PhongHoc) value(?,?,?,?,?,?)");
                ps.setString(1, mh.getMaMH());
                ps.setString(2, mh.getTenMH());
                ps.setInt(3, mh.getSoTC());
                ps.setString(4, mh.getHinhThucThi());
                ps.setInt(5, mh.getHocKy());
                ps.setString(6, mh.getPhongHoc());
                int row=ps.executeUpdate();
                if(row<1){
                    mh=null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocIMPL.class.getName()).log(Level.SEVERE, null, ex);
            }
     finally{
                 DBConnect.close(ps);
             }
         }
         return mh;
    }

    @Override
    public MonHoc update(MonHoc mh) {
        PreparedStatement ps=null;
        if(DBConnect.open()){
            try{
            ps=DBConnect.con.prepareStatement("update tblMonHoc set TenMH=?, SoTinChi=?, HinhThucThi=?, HocKy=?, PhongHoc=? where MaMH=?");
            ps.setString(1, mh.getTenMH());
            ps.setInt(2, mh.getSoTC());
            ps.setString(3, mh.getHinhThucThi());
            ps.setInt(4, mh.getHocKy());
            ps.setString(5, mh.getPhongHoc());
            ps.setString(6, mh.getMaMH());
            int row=ps.executeUpdate();
            if(row<1){
                mh=null;
            }
            
        }   catch (SQLException ex) {
                Logger.getLogger(MonHocIMPL.class.getName()).log(Level.SEVERE, null, ex);
            }
       finally {
                DBConnect.close();
            }
        }
        return mh;

    }
    public void delMH(String MaMH) throws SQLException, ClassNotFoundException{
        PreparedStatement ps=null;
        if(DBConnect.open()){
            ps=DBConnect.con.prepareStatement("delete from tblMonHoc where MaMH=?");
            ps.setString(1, MaMH);
            ps.executeUpdate();
            DBConnect.close();
        }
    }

    @Override
    public ArrayList<MonHoc> CheckID(String maMH) {
        ArrayList<MonHoc> list=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        if(DBConnect.open()){
            try{
                ps=DBConnect.con.prepareStatement("select * from tblMonHoc where MaMH=?");
                ps.setString(1, maMH);
                rs=ps.executeQuery();
                list=new ArrayList<MonHoc>();
                while(rs.next()){
                    MonHoc mh=new MonHoc();
                    mh.setMaMH(rs.getString(1));
                    list.add(mh);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocIMPL.class.getName()).log(Level.SEVERE, null, ex);
            }
       finally{
            DBConnect.close(ps, rs);
            }
        }
        return  list;

    }
    
}
