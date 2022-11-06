package 个人通讯管理系统;

import java.util.Scanner;

public class Communication {

	static String Name[] = new String[50];
	static int Number[] = new int[50];
	static String E_mail[] = new String[50];
	static String Phone[] = new String[50];

	String name_2;

	public void Add() { // 添加功能
		Scanner input = new Scanner(System.in);
		System.out.println(" 请输入添加人数");
		int n = input.nextInt();
		int m = 0; // 计算添加的人数
		System.out.println(" 请添加联系人信息 ");
		for (int i = 0; i < Name.length; i++) {
			if (Name[i] != null) {
				continue;
			}

			System.out.println(" 请输入编号：");

			while (true) {
				int s = input.nextInt();
				int j;
				for (j = 0; j < i; j++) {
					if (s == Number[j]) {
						System.out.println("您所输入的编号已存在，请重新输入！");
						break;
					}
				}
				if (j == i) {
					Number[i] = s;
					break;
				}
			}
			System.out.println(" 请输入姓名：");
			Name[i] = input.next();
			System.out.println(" 请输入邮箱：");
			E_mail[i] = input.next();
			System.out.println(" 请输入电话号码：");
			Phone[i] = input.next();
			System.out.println("编号" + "\t" + "姓名 " + "\t" + "邮箱" + "\t" + "电话号码");
			System.out.println(Number[i] + "\t" + Name[i] + "\t" + E_mail[i] + "\t" + Phone[i]);
			if (++m >= n)
				break;
		}
	}

	public void Search() { // 查询功能
		Scanner input = new Scanner(System.in);
		int k = 1;
		while (k != 0) {
			System.out.println("***** 1: 姓名查询 ***** ");
			System.out.println("***** 2: 编号查询 ***** ");
			System.out.println("***** 3: 地址查询 ***** ");
			System.out.println("***** 4: 退出查询 ***** ");
			System.out.println(" 请输入查询编号： ");
			int core = input.nextInt();
			switch (core) {
			case 1: // 按姓名查询
				System.out.println(" 请输入查询的联系人姓名：");
				String name1 = input.next();
				for (int i = 0; i < Name.length; i++) {
					if (name1.equals(Name[i])) {
						System.out.println("编号" + "\t" + "姓名 " + "\t" + "邮箱" + "\t" + "电话号码");
						System.out.println(Number[i] + "\t" + Name[i] + "\t" + E_mail[i] + "\t" + Phone[i]);
					}
				}
				break;
			case 2: // 按编号查询
				System.out.println(" 请输入查询的编号：");
				int n = input.nextInt();
				for (int i = 0; i < Name.length; i++) {
					if (n == Number[i]) {
						System.out.println("编号" + "\t" + "姓名 " + "\t" + "邮箱" + "\t" + "电话号码");
						System.out.println(Number[i] + "\t" + Name[i] + "\t" + E_mail[i] + "\t" + Phone[i]);
						break;
					}
				}
				break;
			case 3: // 退出系统
				k = 0;
				break;
			default:// 退出系统
				k = 0;
				break;
			}
		}
	}

	public void Modification() { // 修改功能
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println(" 请输入修改的联系人姓名：");
			String name1 = input.next();
			int i;
			for (i = 0; i < Name.length; i++) {
				if (name1.equals(Name[i])) {
					int core = 0;
					while (core != 7) {
						System.out.println("*****1: 修改编号***** ");
						System.out.println("*****2: 修改姓名***** ");
						System.out.println("*****3: 修改邮件***** ");
						System.out.println("*****4: 修改电话号码***");
						System.out.println("*****5: 退出*********");
						System.out.println(" 请输入你要修改内容的编号： ");
						core = input.nextInt();
						switch (core) {
						case 1:
							System.out.println(" 请输入修改后的编号：");
							Number[i] = input.nextInt();
							break;
						case 2:
							System.out.println(" 请输入修改后的姓名：");
							Name[i] = input.next();
							break;
						case 3:
							System.out.println(" 请输入修改后的邮件：");
							E_mail[i] = input.next();
							break;
						case 4:
							System.out.println(" 请输入修改后的电话：");
							Phone[i] = input.next();
							break;
						}
					}
					break;
				}
			}
			if (i == Name.length) {
				System.out.println("没有该联系人，请重新输入修改的联系人姓名：");
			} else {
				break;
			}
		}
	}

	public void Delete() { // 删除功能
		System.out.println(" 请输入删除的联系人姓名：");
		Scanner input = new Scanner(System.in);
		while (true) {
			String name1 = input.next();
			int i;
			for (i = 0; i < Name.length; i++) {
				if (name1.equals(Name[i])) {
					for (int j = i; j < Name.length - 1; j++) {
						Number[j] = Number[j + 1];
						Name[j] = Name[j + 1];
						E_mail[j] = E_mail[j + 1];
						Phone[j] = Phone[j + 1];
					}
					int endlndex = Name.length - 1;
					Number[endlndex] = 0;
					Name[endlndex] = null;
					E_mail[endlndex] = null;
					Phone[endlndex] = null;
					System.out.println("删除联系人成功！");
					break;
				}
			}
			if (i == Name.length) {
				System.out.println("没有该联系人，请重新输入修改的联系人姓名：");
			} else {
				break;
			}
		}
	}
}
