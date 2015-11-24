/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Khoa;

import java.util.ArrayList;

/**
 *
 * @author Tran Xuan Hao
 */
public interface InKhoaSQL {
     public ArrayList<Khoa> getAll();
     public Khoa addNew(Khoa khoa);
     public Khoa updateBangID(Khoa khoa);
     public ArrayList<Khoa> checkID(String makhoa);
}
