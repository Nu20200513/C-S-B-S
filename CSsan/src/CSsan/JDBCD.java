package CSsan;

import java.sql.*;


import org.junit.Test;

public class JDBCD {
	private Connection con;
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String userName = "root";
	private String password = "123456";
	private String url = "jdbc:mysql://localhost:3306/here";
	
	public JDBCD() {
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void finalize() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//��ѯ��������
	public ResultSet select_name(String name) throws SQLException {
		String sql = "select * from t_user where uname = ?";
		
		//������޸�Ϊ ������ǰ����������
		PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_READ_ONLY);
		pstmt.setString(1, name);
		
		ResultSet rs = pstmt.executeQuery();	
		
		return rs;
	}
	
	//��ѯ���ݵ绰���� 
	public ResultSet select_phone(String phone) throws SQLException {
		String sql = "select * from t_user where uphone = ?";
		
		PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_READ_ONLY);
		pstmt.setString(1, phone);
		
		ResultSet rs = pstmt.executeQuery();	
		
		return rs;
	}
	
	//����
	public Boolean insert(String name, String phone) {
		String sql = "insert into t_user values (null, ?,?)";
		
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			
			pstmt.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	//�޸� ����
	public void update_name (int id, String name) {
		String sql="update t_user set uname = ? where uid= ? ";//����һ��mysql���
		
		
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//�޸ĵ绰
	public void update_phone (int id, String phone) {
		String sql="update t_user set uphone = ? where uid= ? ";//����һ��mysql���
		
		
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setInt(2, id);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//ɾ��
	public Boolean delete(int id) {
		String sql="delete from t_user where uid=?";
		
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			pstmt.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	@Test
    public void test1() throws Exception {   //���淽���в�ͬ���쳣����ֱ���׳�һ������쳣
		JDBCD j = new JDBCD();
		
		j.delete(3);
    	
    }
}