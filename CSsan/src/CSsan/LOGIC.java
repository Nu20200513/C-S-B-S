package CSsan;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LOGIC {
	
	public ResultSet ViewContact (String who) throws SQLException {
		JDBCD jdbc = new JDBCD();
		 
		ResultSet rs = null;
		ResultSet rs1 = jdbc.select_name(who);
		ResultSet rs2 = jdbc.select_phone(who);
		
		//这里将结果集设置为可向前滚动才行
		if (rs1.next()) {
			rs1.previous();
			rs = rs1;
		}
		else rs = rs2;
		
		return rs;
	}
	
	public boolean AddContact(String name, String phone) {
		
		JDBCD jdbc = new JDBCD();
		 
		 if (jdbc.insert(name, phone)) {
			 return true;
		 } 
		 else {
			 return false;
		 } 
	}
	
	public void ModifyContact(int who, int how, String after) {
		
		JDBCD jdbc = new JDBCD();
		
		if (how == 1) jdbc.update_name(who, after);
		if (how == 2) jdbc.update_phone(who, after);
		
	}
	
	public boolean DeleteContact (int id) {
		JDBCD jdbc = new JDBCD();
		 
		 if (jdbc.delete(id)) {
			 return true;
		 }
		 else {
			 return false;
		 }
	}
}
