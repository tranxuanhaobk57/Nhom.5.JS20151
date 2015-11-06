/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyMonHoc;

/**
 *
 * @author Dang94
 */
public class MonHoc {
    private String maMH;
    private String tenMH;
    private int soTC;
    private String phongHoc;
    private int hocKy;
    private String hinhThucThi;    
public MonHoc(){
    
}
public MonHoc(String maMH, String tenMH, int soTC, String phongHoc, int hocKy, String hinhThucThi){
    this.maMH=maMH;
    this.tenMH=tenMH;
    this.soTC=soTC;
    this.phongHoc=phongHoc;
    this.hocKy=hocKy;
    this.hinhThucThi=hinhThucThi;
}

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    public String getHinhThucThi() {
        return hinhThucThi;
    }

    public void setHinhThucThi(String hinhThucThi) {
        this.hinhThucThi = hinhThucThi;
    }

}

