package ����ͨѶ����ϵͳ;

import java.util.Scanner;

public class Communication {

	static String Name[] = new String[50];
	static int Number[] = new int[50];
	static String E_mail[] = new String[50];
	static String Phone[] = new String[50];

	String name_2;

	public void Add() { // ��ӹ���
		Scanner input = new Scanner(System.in);
		System.out.println(" �������������");
		int n = input.nextInt();
		int m = 0; // ������ӵ�����
		System.out.println(" �������ϵ����Ϣ ");
		for (int i = 0; i < Name.length; i++) {
			if (Name[i] != null) {
				continue;
			}

			System.out.println(" �������ţ�");

			while (true) {
				int s = input.nextInt();
				int j;
				for (j = 0; j < i; j++) {
					if (s == Number[j]) {
						System.out.println("��������ı���Ѵ��ڣ����������룡");
						break;
					}
				}
				if (j == i) {
					Number[i] = s;
					break;
				}
			}
			System.out.println(" ������������");
			Name[i] = input.next();
			System.out.println(" ���������䣺");
			E_mail[i] = input.next();
			System.out.println(" ������绰���룺");
			Phone[i] = input.next();
			System.out.println("���" + "\t" + "���� " + "\t" + "����" + "\t" + "�绰����");
			System.out.println(Number[i] + "\t" + Name[i] + "\t" + E_mail[i] + "\t" + Phone[i]);
			if (++m >= n)
				break;
		}
	}

	public void Search() { // ��ѯ����
		Scanner input = new Scanner(System.in);
		int k = 1;
		while (k != 0) {
			System.out.println("***** 1: ������ѯ ***** ");
			System.out.println("***** 2: ��Ų�ѯ ***** ");
			System.out.println("***** 3: ��ַ��ѯ ***** ");
			System.out.println("***** 4: �˳���ѯ ***** ");
			System.out.println(" �������ѯ��ţ� ");
			int core = input.nextInt();
			switch (core) {
			case 1: // ��������ѯ
				System.out.println(" �������ѯ����ϵ��������");
				String name1 = input.next();
				for (int i = 0; i < Name.length; i++) {
					if (name1.equals(Name[i])) {
						System.out.println("���" + "\t" + "���� " + "\t" + "����" + "\t" + "�绰����");
						System.out.println(Number[i] + "\t" + Name[i] + "\t" + E_mail[i] + "\t" + Phone[i]);
					}
				}
				break;
			case 2: // ����Ų�ѯ
				System.out.println(" �������ѯ�ı�ţ�");
				int n = input.nextInt();
				for (int i = 0; i < Name.length; i++) {
					if (n == Number[i]) {
						System.out.println("���" + "\t" + "���� " + "\t" + "����" + "\t" + "�绰����");
						System.out.println(Number[i] + "\t" + Name[i] + "\t" + E_mail[i] + "\t" + Phone[i]);
						break;
					}
				}
				break;
			case 3: // �˳�ϵͳ
				k = 0;
				break;
			default:// �˳�ϵͳ
				k = 0;
				break;
			}
		}
	}

	public void Modification() { // �޸Ĺ���
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println(" �������޸ĵ���ϵ��������");
			String name1 = input.next();
			int i;
			for (i = 0; i < Name.length; i++) {
				if (name1.equals(Name[i])) {
					int core = 0;
					while (core != 7) {
						System.out.println("*****1: �޸ı��***** ");
						System.out.println("*****2: �޸�����***** ");
						System.out.println("*****3: �޸��ʼ�***** ");
						System.out.println("*****4: �޸ĵ绰����***");
						System.out.println("*****5: �˳�*********");
						System.out.println(" ��������Ҫ�޸����ݵı�ţ� ");
						core = input.nextInt();
						switch (core) {
						case 1:
							System.out.println(" �������޸ĺ�ı�ţ�");
							Number[i] = input.nextInt();
							break;
						case 2:
							System.out.println(" �������޸ĺ��������");
							Name[i] = input.next();
							break;
						case 3:
							System.out.println(" �������޸ĺ���ʼ���");
							E_mail[i] = input.next();
							break;
						case 4:
							System.out.println(" �������޸ĺ�ĵ绰��");
							Phone[i] = input.next();
							break;
						}
					}
					break;
				}
			}
			if (i == Name.length) {
				System.out.println("û�и���ϵ�ˣ������������޸ĵ���ϵ��������");
			} else {
				break;
			}
		}
	}

	public void Delete() { // ɾ������
		System.out.println(" ������ɾ������ϵ��������");
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
					System.out.println("ɾ����ϵ�˳ɹ���");
					break;
				}
			}
			if (i == Name.length) {
				System.out.println("û�и���ϵ�ˣ������������޸ĵ���ϵ��������");
			} else {
				break;
			}
		}
	}
}
