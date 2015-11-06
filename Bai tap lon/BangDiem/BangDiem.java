/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangDiem;

/**
 *
 * @author Tran Xuan Hao
 */
public class BangDiem {
    private String maSV;
    private String maHocPhan;
    private int lanThi;
    private int heSo;
    private float diem;
    
    public BangDiem(){
    }
    public BangDiem(String masv,String mahp,int lanthi,int heso,float mark){
        this.maSV = masv;
        this.maHocPhan = mahp;
        this.heSo = heso;
        this.lanThi = lanthi;
        this.diem = mark;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public int getLanThi() {
        return lanThi;
    }

    public void setLanThi(int lanThi) {
        this.lanThi = lanThi;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
}
