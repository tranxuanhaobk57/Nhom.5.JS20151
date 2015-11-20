/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LopHoc;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Tran Xuan Hao
 */
public interface InLopHocSQL {
    public ArrayList<LopHoc> getAll();
    public ArrayList<LopHoc> TimBangMaKhoa(String makhoa);
    public LopHoc addLopHoc(LopHoc lp);
    public LopHoc updateByID(LopHoc lp);
    public void deleteLop(String maLop)throws SQLException;
    public ArrayList<LopHoc> CheckID(String IDLop);
}
