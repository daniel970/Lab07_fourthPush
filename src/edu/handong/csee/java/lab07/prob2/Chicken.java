package edu.handong.csee.java.lab07.prob2;

/*������: �赵�� 21700082
 * �ڹ����α׷��� 02�й�
 * ��¥: 04/04
 * ����:
 */

public class Chicken { //chicken �Լ�, ���Ϳ� ���͸� ��Ƶ�
		private String name; //name �Լ� ����
		private double price;//price �Լ� ����
		private int stars;//stars �Լ� ����

		public Chicken()
		{
		this.name = ""; //name�� ���� �����մϴ�.
		this.price = 0.0; //price�� ���� �����մϴ�.
		this.stars = 0; //stars�� ���� �����մϴ�.
		}

		public Chicken(String name, double price, int stars) //chicken�Լ�
		{
		this.name = name; //�ٱ��� name �Լ��� �����ͼ� ��밡���ϰ� �մϴ�.
		this.price = price; //�ٱ��� price �Լ��� �����ͼ� ��밡���ϰ� �մϴ�.
		this.stars = stars; //�ٱ��� stars �Լ��� �����ͼ� ��밡���ϰ� �մϴ�.
		}

		public String get_name() //getter name �Լ�
		{
		return this.name; //name�� �ʱ�ȭ�ؼ� return, name���� ��밡���ϰ� �����ɴϴ�.
		}

		public double get_price() //getter price �Լ�
		{
		return this.price;//price�� �ʱ�ȭ�ؼ� return, ���� ��밡���ϰ� �����ɴϴ�.
		}

		public int get_stars() //getter stars �Լ�
		{
		return this.stars;//stars�� �ʱ�ȭ�ؼ� return, ���� ��밡���ϰ� �����ɴϴ�.
		}

		public void set_name(String name) //name ��밡���ϰ� ����� �Լ�
		{
		this.name = name;//name�� �ʱ�ȭ
		}

		public void set_price(double price) //price ��밡���ϰ� ����� �Լ�
		{
		this.price = price;//price�� �ʱ�ȭ
		}

		public void set_stars(int stars) //stars ��밡���ϰ� ����� �Լ�
		{
		this.stars = stars;//stars�� �ʱ�ȭ
		}

	}
