/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyMonHoc;

import java.util.ArrayList;

/**
 *
 * @author Dang94
 */
public interface MonHocDAO {
     public ArrayList<MonHoc> getAll();
     public ArrayList<MonHoc> findMaMH(String maMH);
     public MonHoc addNew(MonHoc mh);
     public MonHoc update(MonHoc mh);
     public ArrayList<MonHoc> CheckID(String maMH);
}
