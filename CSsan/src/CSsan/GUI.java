package CSsan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GUI {
public static void main(String args[]) throws SQLException {
		
        System.out.println("����ͨѶ¼");
        LOGIC lc = new LOGIC();
        
        while (true) {
        	System.out.println("1���鿴��ϵ����Ϣ      2������µ���ϵ��   "
        	 		+ "3���޸���ϵ����Ϣ    4��ɾ����ϵ��     5���˳�");
        	
        	Scanner input = new Scanner(System.in);
       	 	int op = input.nextInt();
       	 	
       	 	if (op == 5) break;
       	 	else if (op < 5) {
       	 	 if (op == 1) {
    			 System.out.println("������ϵ��������绰");
    			 
//    			 String q = input.next();
    			 String op2 = input.next();
    			 
    			 ResultSet rs = lc.ViewContact(op2);
    			 
    			 System.out.println("ϵͳid		�û���		�绰");
    			 
    			 if (rs != null)
    			 while (rs.next()) {
    				System.out.println(rs.getString(1)+"		"+rs.getString(2)+
    						"		" + rs.getString(3));
    			 }
    
    		 }
    		 if (op == 2) {
    			 System.out.println("������ϵ�������͵绰");
    			 
    			 String name, phone;
    			 name = input.next();
    			 phone = input.next();
    			 
    			 boolean now = lc.AddContact(name, phone);
    			 
    			 if (now) {
    				 System.out.println("��ӳɹ�");
    			 } 
    			 else {
    				 System.out.println("���ʧ��");
    			 } 
    		 }
    		 if (op == 3) {
    			 System.out.println("����Ҫ�޸ĵ�ϵͳid");
    			 int op2 = input.nextInt();
    			 
    			 System.out.println("����Ҫ�޸ĵ�����(1��name, 2��phone):");
    			 int bool = input.nextInt();
    			 
    			 System.out.println("�����޸ĺ��ֵ");
    			 String op3 = input.next();
    			 
    			 lc.ModifyContact(op2, bool, op3);
    		 }
    		 if (op == 4) {
    			 System.out.println("����Ҫɾ����ϵͳid");
    			 int op2 = input.nextInt();
    			 
    			 boolean now = lc.DeleteContact(op2);
    			 
    			 if (now) {
    				 System.out.println("ɾ���ɹ�");
    			 }
    			 else {
    				 System.out.println("ɾ��ʧ��");
    			 }
    			 
    		 }
       	 	}
       	 	else continue;
        }
	}
}
