package edu.handong.csee.java.lab07.prob3;
import java.util.Random;

/*������: �赵�� 21700082
 * �ڹ����α׷��� 02�й�
 * ��¥: 04/04
 * ����: �� �л��� �Ἦ���� �������� ���, �Ἦ���� ���� ���ڸ� ����ϴ� ���α׷�
 */

public class Attendance_main { //�����Լ�

	public static void main(String[] args) {
	Attendance s_1 = new Attendance(); //ù��° �л��� �Լ� ����
	Attendance s_2 = new Attendance();//�ι�° �л��� �Լ� ����
	Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0);//����° �л��� �Լ� �����ϰ� ���� ����
	Attendance s_4 = new Attendance("Martha", 2, "21733444", 0);//�׹�° �л��� �Լ� �����ϰ� ���� ����
	
	s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0);//ù��° �л��� �� �ʱ�ȭ
	s_2.set_name("Kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0);//�ι�° �л��� �� �ʱ�ȭ
	
	Random randomGenerator = new Random(); //������ ���ڸ� ������ Random����
	
	s_1.set_missed(randomGenerator.nextInt(10)); //1���� �л� �Ἦ���� ���Ƿ� ����
	s_2.set_missed(randomGenerator.nextInt(10)); //2���� �л� �Ἦ���� ���Ƿ� ����
	s_3.set_missed(randomGenerator.nextInt(10)); //3���� �л� �Ἦ���� ���Ƿ� ����
	s_4.set_missed(randomGenerator.nextInt(10)); //4���� �л� �Ἦ���� ���Ƿ� ����
	
	if(s_1.get_missed() > 6) //���� 1��° �л��� 6���ʰ��ؼ� �Ἦ���� ������
	{
		System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course"); //�����ߴٴ� ���� ���
		System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());//�Ἦ���� ���
	}
	else //���� 6���ʰ� ���ؼ� �Ἦ���� ������
		System.out.println("We'll see about the grade, " + s_1.get_name()); //�������� ��ϰڴٴ� ���� ���
	
	if(s_2.get_missed() > 6) //���� 2��° �л��� 6���ʰ��ؼ� �Ἦ���� ������
	{
		System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");//�����ߴٴ� ���� ���
		System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());//�Ἦ���� ���
	}
	else//���� 6���ʰ� ���ؼ� �Ἦ���� ������
		System.out.println("We'll see about the grade, " + s_2.get_name());//�������� ��ϰڴٴ� ���� ���
	
	if(s_3.get_missed() > 6) //���� 3��° �л��� 6���ʰ��ؼ� �Ἦ���� ������
	{
		System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");//�����ߴٴ� ���� ���
		System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());//�Ἦ���� ���
	}
	else//���� 6���ʰ� ���ؼ� �Ἦ���� ������
		System.out.println("We'll see about the grade, " + s_3.get_name());//�������� ��ϰڴٴ� ���� ���
	
	if(s_4.get_missed() > 6) //���� 4��° �л��� 6���ʰ��ؼ� �Ἦ���� ������
	{
		System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");//�����ߴٴ� ���� ���
		System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed()); //�Ἦ���� ���
	}
	else//���� 6���ʰ� ���ؼ� �Ἦ���� ������
		System.out.println("We'll see about the grade, " + s_4.get_name());//�������� ��ϰڴٴ� ���� ���
	
	}
	
}
