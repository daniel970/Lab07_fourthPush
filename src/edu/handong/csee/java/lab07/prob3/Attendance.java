package edu.handong.csee.java.lab07.prob3;
import java.util.*; 

/*제작자: 김도영 21700082
 * 자바프로그래밍 02분반
 * 날짜: 04/04
 * 설명: 네 학생의 결석수를 렌덤으로 출력, 결석수에 따라서 문자를 출력하는 프로그램 (그 프로그램의 초기화 함수를 모은 프로그램)
 */

public class Attendance {
	private String name = ""; //이름함수를 private로 생성
	private int year = 0; //년도함수를 private로 생성
	private String student_id = ""; //학번함수를 private로 생성
	private int missed = 0; //결석값 함수를 private로 생성

	//Constructors
	public Attendance()
	{
	this.name = "Null"; //이름함수를 Null로 초기화합니다.
	this.year = 0; //년도함수를 0으로 초기화합니다.
	this.student_id = "Null"; //학번함수를 Null로 초기화합니다.
	this.missed = 0; //결석값 함수를 0으로 초기화합니다.
	}

	public Attendance(String name, int year, String student_id, int missed)
	{
	this.name = name; //이름 변수를 불러옵니다
	this.year = year; //년도 변수를 불러옵니다.
	this.student_id = student_id; //학번 변수를 불러옵니다.
	this.missed = missed; //결석수 변수를 불러옵니다.
	}
	
	//getters
	public String get_name() //이름 가져오는 함수
	{
	return name; //이름값을 리턴.
	}
	public int get_year()//년도를 가져오는 함수
	{
	return year;//년도값을 리턴.
	}

	public String get_id()//학번값을 가져오는 함수
	{
	return student_id;//학번값을 리턴.
	}
	public int get_missed()//이름 가져오는 함수
	{
	return missed;//결석수 값을 리턴.
	}

	//Setters
	public void set_name(String name) //name 의 setter함수
	{
	this.name = name; //name 값을 저장
	}
	public void set_year(int year) //year 의 setter함수
	{
	this.year = year;//year 값을 저장
	}
	public void set_id(String student_id) //학번 의 setter함수
	{
	this.student_id = student_id;//학번 값을 저장
	}
	public void set_missed(int missed) //결석수 값 의 setter함수
	{ 
	this.missed = missed;//결석수 값을 저장
	}
}

