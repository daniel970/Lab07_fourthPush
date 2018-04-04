package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;

/*제작자: 김도영 21700082
 * 자바프로그래밍 02분반
 * 날짜: 04/04
 * 설명: 이 프로그램은 년도를 세기로 바꿔줍니다.
 */

public class YearToCentury {
	
	public static void main(String [] args)
		{
			int yr = 0; //yr값을 지정
			Scanner keyboard = new Scanner(System.in); //스캐너를 생성
	
			System.out.println("Input year: "); //연도를 받아올 문자 출력
			yr = keyboard.nextInt(); //입력값을 저장
	
			YearToCentury_this year = new YearToCentury_this(yr); //받아온 년도값을 세기로 바꿔준다
			System.out.println(yr + " is " + year.calc_century() + "th century."); //세기값을 출력
		}


}
