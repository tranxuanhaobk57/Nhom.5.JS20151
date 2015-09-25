package com.bkacad.completeproj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DemoJDBC {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm;
		String strConnection = "jdbc:sqlserver://MRGIAP-PC\\SQL2012;databaseName=BKJP_BaiTapCSDL;user=jsp1501;password=jsp1501";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(strConnection);
		} catch (SQLException | ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		String strSQL = "select msv, hoten, gt, CONVERT(VARCHAR, ns, 101) ns, que, lop from tblSV ";
		try {
			pstm = conn.prepareStatement(strSQL);
			// pstm.setString(1, "svjp01");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString("msv") + ", ");
				System.out.print(rs.getString("hoten") + ", ");
				System.out.print(rs.getString("gt") + ", ");
				System.out.print(rs.getString("ns") + ", ");
				System.out.print(rs.getString("que") + ", ");
				System.out.println(rs.getString("lop"));
			}
		} catch (Exception ex) {
		}
	}

}
