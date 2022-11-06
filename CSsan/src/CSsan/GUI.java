package CSsan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GUI {
public static void main(String args[]) throws SQLException {
		
        System.out.println("个人通讯录");
        LOGIC lc = new LOGIC();
        
        while (true) {
        	System.out.println("1、查看联系人信息      2、添加新的联系人   "
        	 		+ "3、修改联系人信息    4、删除联系人     5、退出");
        	
        	Scanner input = new Scanner(System.in);
       	 	int op = input.nextInt();
       	 	
       	 	if (op == 5) break;
       	 	else if (op < 5) {
       	 	 if (op == 1) {
    			 System.out.println("输入联系人姓名或电话");
    			 
//    			 String q = input.next();
    			 String op2 = input.next();
    			 
    			 ResultSet rs = lc.ViewContact(op2);
    			 
    			 System.out.println("系统id		用户名		电话");
    			 
    			 if (rs != null)
    			 while (rs.next()) {
    				System.out.println(rs.getString(1)+"		"+rs.getString(2)+
    						"		" + rs.getString(3));
    			 }
    
    		 }
    		 if (op == 2) {
    			 System.out.println("输入联系人姓名和电话");
    			 
    			 String name, phone;
    			 name = input.next();
    			 phone = input.next();
    			 
    			 boolean now = lc.AddContact(name, phone);
    			 
    			 if (now) {
    				 System.out.println("添加成功");
    			 } 
    			 else {
    				 System.out.println("添加失败");
    			 } 
    		 }
    		 if (op == 3) {
    			 System.out.println("输入要修改的系统id");
    			 int op2 = input.nextInt();
    			 
    			 System.out.println("输入要修改的内容(1、name, 2、phone):");
    			 int bool = input.nextInt();
    			 
    			 System.out.println("输入修改后的值");
    			 String op3 = input.next();
    			 
    			 lc.ModifyContact(op2, bool, op3);
    		 }
    		 if (op == 4) {
    			 System.out.println("输入要删除的系统id");
    			 int op2 = input.nextInt();
    			 
    			 boolean now = lc.DeleteContact(op2);
    			 
    			 if (now) {
    				 System.out.println("删除成功");
    			 }
    			 else {
    				 System.out.println("删除失败");
    			 }
    			 
    		 }
       	 	}
       	 	else continue;
        }
	}
}
