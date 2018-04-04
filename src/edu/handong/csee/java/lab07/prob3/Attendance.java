package edu.handong.csee.java.lab07.prob3;
import java.util.*; 

/*������: �赵�� 21700082
 * �ڹ����α׷��� 02�й�
 * ��¥: 04/04
 * ����: �� �л��� �Ἦ���� �������� ���, �Ἦ���� ���� ���ڸ� ����ϴ� ���α׷� (�� ���α׷��� �ʱ�ȭ �Լ��� ���� ���α׷�)
 */

public class Attendance {
	private String name = ""; //�̸��Լ��� private�� ����
	private int year = 0; //�⵵�Լ��� private�� ����
	private String student_id = ""; //�й��Լ��� private�� ����
	private int missed = 0; //�Ἦ�� �Լ��� private�� ����

	//Constructors
	public Attendance()
	{
	this.name = "Null"; //�̸��Լ��� Null�� �ʱ�ȭ�մϴ�.
	this.year = 0; //�⵵�Լ��� 0���� �ʱ�ȭ�մϴ�.
	this.student_id = "Null"; //�й��Լ��� Null�� �ʱ�ȭ�մϴ�.
	this.missed = 0; //�Ἦ�� �Լ��� 0���� �ʱ�ȭ�մϴ�.
	}

	public Attendance(String name, int year, String student_id, int missed)
	{
	this.name = name; //�̸� ������ �ҷ��ɴϴ�
	this.year = year; //�⵵ ������ �ҷ��ɴϴ�.
	this.student_id = student_id; //�й� ������ �ҷ��ɴϴ�.
	this.missed = missed; //�Ἦ�� ������ �ҷ��ɴϴ�.
	}
	
	//getters
	public String get_name() //�̸� �������� �Լ�
	{
	return name; //�̸����� ����.
	}
	public int get_year()//�⵵�� �������� �Լ�
	{
	return year;//�⵵���� ����.
	}

	public String get_id()//�й����� �������� �Լ�
	{
	return student_id;//�й����� ����.
	}
	public int get_missed()//�̸� �������� �Լ�
	{
	return missed;//�Ἦ�� ���� ����.
	}

	//Setters
	public void set_name(String name) //name �� setter�Լ�
	{
	this.name = name; //name ���� ����
	}
	public void set_year(int year) //year �� setter�Լ�
	{
	this.year = year;//year ���� ����
	}
	public void set_id(String student_id) //�й� �� setter�Լ�
	{
	this.student_id = student_id;//�й� ���� ����
	}
	public void set_missed(int missed) //�Ἦ�� �� �� setter�Լ�
	{ 
	this.missed = missed;//�Ἦ�� ���� ����
	}
}

