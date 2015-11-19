/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.Date;

/**
 *
 * @author Tran Xuan Hao
 */
public class Student {

    private String maSV;
    private String tenSV;
    private String maLop;
    private String diaChi;
    private String heDaoTao;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String soDT;

    public Student() {
    }

    public Student(String masv, String tensv, String malop, String diachi, String hedaotao, Date ngaysinh, boolean gioitinh, String sodt) {
        this.maSV = masv;
        this.tenSV = tensv;
        this.maLop = malop;
        this.diaChi = diachi;
        this.heDaoTao = hedaotao;
        this.ngaySinh = ngaysinh;
        this.gioiTinh = gioitinh;
        this.soDT = sodt;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHeDaoTao() {
        return heDaoTao;
    }

    public void setHeDaoTao(String heDaoTao) {
        this.heDaoTao = heDaoTao;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
    
}
