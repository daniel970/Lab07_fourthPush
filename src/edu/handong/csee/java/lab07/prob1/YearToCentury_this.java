package edu.handong.csee.java.lab07.prob1;

/*������: �赵�� 21700082
 * �ڹ����α׷��� 02�й�
 * ��¥: 04/04
 * ����: �� ���α׷��� �⵵�� ����� �ٲ��ִ� �Լ��� �����ϴ� Ŭ����
 */

public class YearToCentury_this { //year���� �����ϴ� �Լ�
	int year; //year���� ����

	public YearToCentury_this() {//year���� 0���� �ʱ�ȭ�ϴ� �Լ�
		year = 0; //year���� 0���� �ʱ�ȭ
	}

	public YearToCentury_this(int year) {//year���� �������� �Լ�
		this.year = year; //year���� �����´�
	}

	public int calc_century() { //���Ⱚ�� ����ϴ� �Լ�
		if (year % 100 == 0) //���� 100���� ������ �������ٸ�
			year = year / 100; //�׳� ����ؼ� ���Ⱚ���� ���
		else { //�ƴϸ�
			year = (year / 100) + 1; //1�� ���ؼ� ���Ⱚ�� ���
		}
		return year; //year���� ����
	}

}
