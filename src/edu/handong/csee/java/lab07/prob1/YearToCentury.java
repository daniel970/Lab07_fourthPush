package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;

/*������: �赵�� 21700082
 * �ڹ����α׷��� 02�й�
 * ��¥: 04/04
 * ����: �� ���α׷��� �⵵�� ����� �ٲ��ݴϴ�.
 */

public class YearToCentury {
	
	public static void main(String [] args)
		{
			int yr = 0; //yr���� ����
			Scanner keyboard = new Scanner(System.in); //��ĳ�ʸ� ����
	
			System.out.println("Input year: "); //������ �޾ƿ� ���� ���
			yr = keyboard.nextInt(); //�Է°��� ����
	
			YearToCentury_this year = new YearToCentury_this(yr); //�޾ƿ� �⵵���� ����� �ٲ��ش�
			System.out.println(yr + " is " + year.calc_century() + "th century."); //���Ⱚ�� ���
		}


}
