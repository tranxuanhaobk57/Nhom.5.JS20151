/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoVien;

import ConnectDB.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Xuan Hao
 */
public class GiaoVienSQL implements InGiaoVienSQL {

    @Override
    public ArrayList<GiaoVien> getAll() {
        // throw new UnsupportedOperationException("Not supported yet.");
        ArrayList<GiaoVien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select *from tblGiaoVien");
                rs = ps.executeQuery();
                list = new ArrayList<>();
                while (rs.next()) {
                    GiaoVien gv = new GiaoVien();
                    gv.setMagv(rs.getString(1));
                    gv.setHotengv(rs.getString(2));
                    gv.setMamh(rs.getString(3));
                    gv.setNgaysinh(new Date(rs.getDate(4).getTime()));
                    gv.setGioitinh(rs.getBoolean(5));
                    gv.setEmail(rs.getString(6));
                    gv.setDiachi(rs.getString(7));
                    gv.setSdt(rs.getString(8));

                    list.add(gv);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GiaoVienSQL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public ArrayList<GiaoVien> findByMaMonHoc(String mamh) {
        ArrayList<GiaoVien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select  * from tblGiaoVien where MaMH = ?");
                ps.setString(1, mamh);
                rs = ps.executeQuery();
                list = new ArrayList<>();
                while (rs.next()) {
                    GiaoVien gv = new GiaoVien();
                    gv.setMagv(rs.getString(1));
                    gv.setHotengv(rs.getString(2));
                    gv.setMamh(rs.getString(3));
                    gv.setNgaysinh(new Date(rs.getDate(4).getTime()));
                    gv.setGioitinh(rs.getBoolean(5));
                    gv.setEmail(rs.getString(6));
                    gv.setDiachi(rs.getString(7));
                    gv.setSdt(rs.getString(8));
                    list.add(gv);

                }
            } catch (SQLException ex) {
                Logger.getLogger(GiaoVienSQL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public GiaoVien addNew(GiaoVien gv) {
        PreparedStatement ps = null;

        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("INSERT INTO tblGiaoVien values (?,?,?,?,?,?,?,?)");
                ps.setString(1, gv.getMagv());
                ps.setString(2, gv.getHotengv());
                ps.setString(3, gv.getMamh());
                ps.setDate(4, new java.sql.Date(gv.getNgaysinh().getTime()));
                ps.setBoolean(5, gv.isGioitinh());
                ps.setString(6, gv.getEmail());
                ps.setString(7, gv.getDiachi());
                ps.setString(8, gv.getSdt());

                int row = ps.executeUpdate();
                if (row < 1) {
                    gv = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(GiaoVienSQL.class.getName()).log(Level.SEVERE, null, ex);
                gv = null;
            } finally {
                DBConnect.close(ps);
            }
        }
        return gv;
    }

    @Override
    public GiaoVien updateByMaGV(GiaoVien gv) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("update tblGiaoVien set HoTenGV =?,"
                        + "MaMH= ?,NgaySinh=?,"
                        + "GioiTinh=?, Email = ?, DiaChi = ?, "
                        + "SDT = ? where MaGV = ?");

                ps.setString(1, gv.getHotengv());
                ps.setString(2, gv.getMamh());
                ps.setDate(3, new java.sql.Date(gv.getNgaysinh().getTime()));
                ps.setBoolean(4, gv.isGioitinh());
                ps.setString(5, gv.getEmail());
                ps.setString(6, gv.getDiachi());
                ps.setString(7, gv.getSdt());
                ps.setString(8, gv.getMagv());

                int row = ps.executeUpdate();
                if (row < 1) {
                    gv = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(GiaoVienSQL.class.getName()).log(Level.SEVERE, null, ex);
                gv = null;
            } finally {
                DBConnect.close();
            }
        }
        return gv;
    }

    public void deleteGV(String GiaoVienID) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            ps = DBConnect.cnn.prepareStatement("delete from tblGiaoVien where MaGV= ?");
            ps.setString(1, GiaoVienID);
            ps.executeUpdate();
            DBConnect.close();
        }
    }

    @Override
    public ArrayList<GiaoVien> CheckID(String magv) {
        ArrayList<GiaoVien> list = null;
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.cnn.prepareStatement("select *from tblGiaoVien where MaGV=?");
                psCheck.setString(1, magv);
                rs = psCheck.executeQuery();
                list = new ArrayList<>();
                while (rs.next()) {
                    GiaoVien giaoVien = new GiaoVien();
                    giaoVien.setMagv(rs.getString(1));
                    list.add(giaoVien);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GiaoVienSQL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(psCheck, rs);
            }
        }
        return list;
    }
}
