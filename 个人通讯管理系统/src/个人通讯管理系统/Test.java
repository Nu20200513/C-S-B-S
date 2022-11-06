package 个人通讯管理系统;

import java.sql.SQLException;
import java.util.Scanner;

public class Test extends Communication {
	public static void main(String[] args) throws SQLException {
		Communication n = new Communication();
		int k = 1;
		Scanner input = new Scanner(System.in);
		System.out.println(" 请输入通讯录名: ");
		n.name_2 = input.next();
		System.out.println(" 这是 " + n.name_2 + " 的通讯录 ");
		while (k != 0) {
			System.out.println("***** 通讯录管理系统 ***** ");
			System.out.println("***** 1: 添加功能    ***** ");
			System.out.println("***** 2: 查询功能    ***** ");
			System.out.println("***** 3: 修改功能    ***** ");
			System.out.println("***** 4: 删除功能    ***** ");
			System.out.println("***** 5: 退出系统    ***** ");
			System.out.println(" 请输入操作的编号： ");
			int m = input.nextInt();
			Communication s = new Communication();
			switch (m) {
			case 1: // 添加
				s.Add();
				break;
			case 2: // 查询
				s.Search();
				break;
			case 3: // 修改
				s.Modification();
				break;
			case 4: // 删除
				s.Delete();
				break;
			case 5: // 退出系统
				k = 0;
				break;
			default: // 退出系统
				k = 0;
				break;
			}
		}
		input.close();
	}
}
