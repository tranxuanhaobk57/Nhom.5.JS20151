/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoVien;

import java.util.ArrayList;

/**
 *
 * @author Tran Xuan Hao
 */
public interface InGiaoVienSQL {

    public ArrayList<GiaoVien> getAll();

    public ArrayList<GiaoVien> findByMaMonHoc(String mamh);

    public GiaoVien addNew(GiaoVien gv);

    public GiaoVien updateByMaGV(GiaoVien gv);

    public ArrayList<GiaoVien> CheckID(String magv);
}
