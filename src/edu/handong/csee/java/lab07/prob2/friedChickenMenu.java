package edu.handong.csee.java.lab07.prob2;

/*������: �赵�� 21700082
 * �ڹ����α׷��� 02�й�
 * ��¥: 04/04
 * ����: �� ���α׷��� �޴��� ������ ������ִ� ���α׷��Դϴ�.
 */

public class friedChickenMenu { //�����Լ�
	public static void main(String[] args) {
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5); //instance�� ���� �����Ͽ��� ���� �ʱ�ȭ
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);//instance�� ���� �����Ͽ��� ���� �ʱ�ȭ
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);//instance�� ���� �����Ͽ��� ���� �ʱ�ȭ
		
		menu1.set_stars(3); //�޴�1�� ���� 3���� ����
		menu2.set_stars(4);//�޴�2�� ���� 3���� ����
		menu3.set_stars(1);//�޴�3�� ���� 3���� ����
	
		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars()); //�޴�1�� ������ ���
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars()); //�޴�2�� ������ ���
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars()); //�޴�3�� ������ ���
	}
}

