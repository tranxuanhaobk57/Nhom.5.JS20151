/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

/**
 *
 * @author Tran Xuan Hao
 */
public class Search {
    private String malop;
    private String maSV;
    
    public Search(){
    }
    public Search(String imaLop, String imaSV){
        this.maSV = imaSV;
        this.malop = imaLop;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    
}
