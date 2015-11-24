/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LopHoc;

/**
 *
 * @author Tran Xuan Hao
 */
public class LopHoc {
    
    private String malop;
    private String tenlop;
    private String makhoa;
    private String khoahoc;
//
    public LopHoc(){
        
    }
    public LopHoc(String malop,String tenLop,String maKhoa,String khoaHoc){
        this.malop = malop;
        this.tenlop = tenLop;
        this.makhoa = maKhoa;
        this.khoahoc = khoaHoc;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }
    
}
