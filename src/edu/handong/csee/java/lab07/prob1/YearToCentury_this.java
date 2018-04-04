package edu.handong.csee.java.lab07.prob1;

/*제작자: 김도영 21700082
 * 자바프로그래밍 02분반
 * 날짜: 04/04
 * 설명: 이 프로그램은 년도를 세기로 바꿔주는 함수를 제공하는 클래스
 */

public class YearToCentury_this { //year값을 선언하는 함수
	int year; //year값을 선언

	public YearToCentury_this() {//year값을 0으로 초기화하는 함수
		year = 0; //year값을 0으로 초기화
	}

	public YearToCentury_this(int year) {//year값을 가져오는 함수
		this.year = year; //year값을 가져온다
	}

	public int calc_century() { //세기값을 계산하는 함수
		if (year % 100 == 0) //만약 100으로 나누어 떨어진다면
			year = year / 100; //그냥 계산해서 세기값으로 출력
		else { //아니면
			year = (year / 100) + 1; //1을 더해서 세기값을 출력
		}
		return year; //year값을 리턴
	}

}
