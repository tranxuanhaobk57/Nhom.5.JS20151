/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Khoa;

/**
 *
 * @author Tran Xuan Hao
 */
public class Khoa {

    private String maKhoa;
    private String tenKhoa;
    private String sdt;

    public Khoa() {
    }
    public Khoa(String makhoa,String tenkhoa,String sdt){
        this.maKhoa = makhoa;
        this.tenKhoa = tenkhoa;
        this.sdt = sdt;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
