/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LopHoc;

import ConnectDB.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Tran Xuan Hao
 */
public class LopHocSQL implements InLopHocSQL {

    @Override
    public ArrayList<LopHoc> getAll() {
        ArrayList<LopHoc> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select * from tblLop");
                rs = ps.executeQuery();
                list = new ArrayList<LopHoc>();
                while (rs.next()) {
                    LopHoc lop = new LopHoc();
                    lop.setMalop(rs.getString(1));
                    lop.setTenlop(rs.getString(2));
                    lop.setMalop(rs.getString(3));
                    lop.setKhoahoc(rs.getString(4));
                    list.add(lop);
                }
            } catch (Exception e) {
                e.toString();
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public ArrayList<LopHoc> TimBangMaKhoa(String makhoa) {
        ArrayList<LopHoc> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select * tblLop where MaKhoa = ?");
                ps.setString(1, makhoa);
                list = new ArrayList<LopHoc>();
                while (rs.next()) {
                    LopHoc lop = new LopHoc();
                    lop.setMalop(rs.getString(1));
                    lop.setTenlop(rs.getString(2));
                    lop.setMakhoa(rs.getString(3));
                    lop.setKhoahoc(rs.getString(4));
                    list.add(lop);
                }
            } catch (Exception e) {
                e.toString();
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public LopHoc addLopHoc(LopHoc lp) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("insert into tblLop(MaLop,TenLop,MaKhoa,KhoaHoc) values (?,?,?,?)");
                ps.setString(1, lp.getMalop());
                ps.setString(2, lp.getTenlop());
                ps.setString(3, lp.getMakhoa());
                ps.setString(4, lp.getKhoahoc());

                if (ps.executeUpdate() < 1) {
                    lp = null;
                }
            } catch (Exception e) {
                e.toString();
            } finally {
                DBConnect.close();
            }
        }
        return lp;
    }

    @Override
    public LopHoc updateByID(LopHoc lp) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("update tblLop set TenLop = ?, MaKhoa = ?, KhoaHoc = ? where MaLop = ?");
                ps.setString(1, lp.getTenlop());
                ps.setString(2, lp.getMakhoa());
                ps.setString(3, lp.getKhoahoc());
                ps.setString(4, lp.getMalop());
                if (ps.executeUpdate() < 1) {
                    lp = null;
                }
            } catch (Exception e) {
                e.toString();
            } finally {
                DBConnect.close();
            }
        }
        return lp;
    }

    @Override
    public void deleteLop(String maLop) throws SQLException {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            ps = DBConnect.cnn.prepareStatement("delete from tblLop where MaLop = ?");
            ps.setString(1, maLop);
            ps.executeUpdate();
            DBConnect.close();
        }
    }

    @Override
    public ArrayList<LopHoc> CheckID(String IDLop) {
        ArrayList<LopHoc> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select * from tblLop where MaLop = ?");
                ps.setString(1, IDLop);
                rs = ps.executeQuery();
                while (rs.next()) {
                    LopHoc lop = new LopHoc();
                    lop.setMalop(rs.getString(1));
                    list.add(lop);
                }
            } catch (Exception e) {
                e.toString();
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }
}
