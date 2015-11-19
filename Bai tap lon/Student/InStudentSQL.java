/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.ArrayList;

/**
 *
 * @author Tran Xuan Hao
 */
public interface InStudentSQL {

    public ArrayList<Student> getAll();
    public ArrayList<Student> TimTheoMaLop(String maLop);
    public Student addSV(Student sv);
    public Student updateSV_by_ID(Student sv);
    public void DeleteSV_byID(String maSV);
    public ArrayList<Student> checkIDSV(String maSV);
    
}
