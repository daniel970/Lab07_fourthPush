package edu.handong.csee.java.lab07.prob3;
import java.util.Random;

/*제작자: 김도영 21700082
 * 자바프로그래밍 02분반
 * 날짜: 04/04
 * 설명: 네 학생의 결석수를 렌덤으로 출력, 결석수에 따라서 문자를 출력하는 프로그램
 */

public class Attendance_main { //메인함수

	public static void main(String[] args) {
	Attendance s_1 = new Attendance(); //첫번째 학생의 함수 생성
	Attendance s_2 = new Attendance();//두번째 학생의 함수 생성
	Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0);//세번째 학생의 함수 생성하고 값을 지정
	Attendance s_4 = new Attendance("Martha", 2, "21733444", 0);//네번째 학생의 함수 생성하고 값을 지정
	
	s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0);//첫번째 학생의 값 초기화
	s_2.set_name("Kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0);//두번째 학생의 값 초기화
	
	Random randomGenerator = new Random(); //렌덤한 숫자를 생성할 Random생성
	
	s_1.set_missed(randomGenerator.nextInt(10)); //1번재 학생 결석수를 임의로 생성
	s_2.set_missed(randomGenerator.nextInt(10)); //2번재 학생 결석수를 임의로 생성
	s_3.set_missed(randomGenerator.nextInt(10)); //3번재 학생 결석수를 임의로 생성
	s_4.set_missed(randomGenerator.nextInt(10)); //4번재 학생 결석수를 임의로 생성
	
	if(s_1.get_missed() > 6) //만약 1번째 학생이 6번초과해서 결석값이 나오면
	{
		System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course"); //낙제했다는 문자 출력
		System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());//결석수를 출력
	}
	else //만약 6번초과 안해서 결석값이 나오면
		System.out.println("We'll see about the grade, " + s_1.get_name()); //점수에서 펼가하겠다는 문자 출력
	
	if(s_2.get_missed() > 6) //만약 2번째 학생이 6번초과해서 결석값이 나오면
	{
		System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");//낙제했다는 문자 출력
		System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());//결석수를 출력
	}
	else//만약 6번초과 안해서 결석값이 나오면
		System.out.println("We'll see about the grade, " + s_2.get_name());//점수에서 펼가하겠다는 문자 출력
	
	if(s_3.get_missed() > 6) //만약 3번째 학생이 6번초과해서 결석값이 나오면
	{
		System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");//낙제했다는 문자 출력
		System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());//결석수를 출력
	}
	else//만약 6번초과 안해서 결석값이 나오면
		System.out.println("We'll see about the grade, " + s_3.get_name());//점수에서 펼가하겠다는 문자 출력
	
	if(s_4.get_missed() > 6) //만약 4번째 학생이 6번초과해서 결석값이 나오면
	{
		System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");//낙제했다는 문자 출력
		System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed()); //결석수를 출력
	}
	else//만약 6번초과 안해서 결석값이 나오면
		System.out.println("We'll see about the grade, " + s_4.get_name());//점수에서 펼가하겠다는 문자 출력
	
	}
	
}
