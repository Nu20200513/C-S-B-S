package ����ͨѶ����ϵͳ;

import java.sql.SQLException;
import java.util.Scanner;

public class Test extends Communication {
	public static void main(String[] args) throws SQLException {
		Communication n = new Communication();
		int k = 1;
		Scanner input = new Scanner(System.in);
		System.out.println(" ������ͨѶ¼��: ");
		n.name_2 = input.next();
		System.out.println(" ���� " + n.name_2 + " ��ͨѶ¼ ");
		while (k != 0) {
			System.out.println("***** ͨѶ¼����ϵͳ ***** ");
			System.out.println("***** 1: ��ӹ���    ***** ");
			System.out.println("***** 2: ��ѯ����    ***** ");
			System.out.println("***** 3: �޸Ĺ���    ***** ");
			System.out.println("***** 4: ɾ������    ***** ");
			System.out.println("***** 5: �˳�ϵͳ    ***** ");
			System.out.println(" ����������ı�ţ� ");
			int m = input.nextInt();
			Communication s = new Communication();
			switch (m) {
			case 1: // ���
				s.Add();
				break;
			case 2: // ��ѯ
				s.Search();
				break;
			case 3: // �޸�
				s.Modification();
				break;
			case 4: // ɾ��
				s.Delete();
				break;
			case 5: // �˳�ϵͳ
				k = 0;
				break;
			default: // �˳�ϵͳ
				k = 0;
				break;
			}
		}
		input.close();
	}
}
