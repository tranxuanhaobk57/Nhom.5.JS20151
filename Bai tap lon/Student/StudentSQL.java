/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import ConectDB.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Tran Xuan Hao
 */
public class StudentSQL implements InStudentSQL {

    @Override
    public ArrayList<Student> getAll() {
        ArrayList<Student> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select * from tblSinhVien");
                rs = ps.executeQuery();
                list = new ArrayList<>();
                while (rs.next()) {
                    Student sv = new Student();
                    sv.setMaSV(rs.getString(1));
                    sv.setTenSV(rs.getString(2));
                    sv.setMaLop(rs.getString(3));
                    sv.setHeDaoTao(rs.getString(4));
                    sv.setNgaySinh(new Date(rs.getDate(5).getTime()));
                    sv.setDiaChi(rs.getString(6));
                    sv.setGioiTinh(rs.getBoolean(7));
                    sv.setSoDT(rs.getString(8));
                    list.add(sv);
                }
            } catch (Exception e) {
                e.toString();
            }finally{
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public ArrayList<Student> TimTheoMaLop(String maLop) {
        ArrayList<Student> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select * from tblSinhVien where MaLop = ?");
                rs = ps.executeQuery();
                list = new ArrayList<>();
                while (rs.next()) {
                    Student sv = new Student();
                    sv.setMaSV(rs.getString(1));
                    sv.setTenSV(rs.getString(2));
                    sv.setMaLop(rs.getString(3));
                    sv.setHeDaoTao(rs.getString(4));
                    sv.setNgaySinh(new Date(rs.getDate(5).getTime()));
                    sv.setDiaChi(rs.getString(6));
                    sv.setGioiTinh(rs.getBoolean(7));
                    sv.setSoDT(rs.getString(8));
                    list.add(sv);
                }
            } catch (Exception e) {
                e.toString();
            }finally{
                DBConnect.close();
            }
        }
        return list;
    }

    @Override
    public Student addSV(Student sv) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("insert into tblSinhVien(MaSV,HoTen,MaLop,HeDaoTao,NgaySinh,DiaChi,GioiTinh,SDT) values(?,?,?,?,?,?,?,?)");
                ps.setNString(1, sv.getMaSV());
                ps.setNString(2, sv.getTenSV());
                ps.setNString(3, sv.getMaLop());
                ps.setNString(4, sv.getHeDaoTao());
                ps.setDate(5, new java.sql.Date(sv.getNgaySinh().getTime()));
                ps.setNString(6, sv.getDiaChi());
                ps.setBoolean(7, sv.isGioiTinh());
                ps.setNString(8, sv.getSoDT());

                int row = ps.executeUpdate();
                if (row < 1) {
                    sv = null;
                }
            } catch (Exception e) {
                e.toString();
            }finally{
                DBConnect.close();
            }
        }
        return sv;
    }

    @Override
    public Student updateSV_by_ID(Student sv) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("update tblSinhVien set HoTen=?, Malop=?, HeDaoTao=?, NgaySinh=?, DiaChi=?, GioiTinh=?, SDT=? where MaSV=?");
                ps.setString(1, sv.getTenSV());
                ps.setString(2, sv.getMaLop());
                ps.setString(3, sv.getHeDaoTao());
                ps.setDate(4, new java.sql.Date(sv.getNgaySinh().getTime()));
                ps.setString(5, sv.getDiaChi());
                ps.setBoolean(6, sv.isGioiTinh());
                ps.setString(7, sv.getSoDT());
                ps.setString(8, sv.getMaSV());
                
                if(ps.executeUpdate()<1){
                    sv = null;
                }
            } catch (Exception e) {
                e.toString();
            }finally{
                DBConnect.close();
            }
        }
        return sv;
    }
    @Override
    public void DeleteSV_byID(String maSV){
        PreparedStatement ps = null;
        if(DBConnect.open()){
            try{
                ps = DBConnect.cnn.prepareStatement("delete from tblSinhVien where MaSinhVien = ?");
                ps.setString(1,maSV);
                ps.executeUpdate();
            }catch(Exception e){
                e.toString();
            }finally{
                DBConnect.close();
            }
        }
    }
    @Override
    public ArrayList<Student> checkIDSV(String maSV){
        ArrayList<Student> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if(DBConnect.open()){
            try{
                ps = DBConnect.cnn.prepareStatement("select * from tblSinhVien where MaSinhVien = ?");
                ps.setString(1, maSV);
                rs = ps.executeQuery();
                list = new ArrayList<Student>();
                while(rs.next()){
                    Student sv = new Student();
                    sv.setMaSV(maSV);
                    list.add(sv);
                }
            }catch(Exception e){
                e.toString();
            }finally{
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }
}
