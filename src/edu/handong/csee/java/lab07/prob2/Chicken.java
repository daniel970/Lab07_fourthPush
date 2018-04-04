package edu.handong.csee.java.lab07.prob2;

/*제작자: 김도영 21700082
 * 자바프로그래밍 02분반
 * 날짜: 04/04
 * 설명:
 */

public class Chicken { //chicken 함수, 게터와 세터를 모아둠
		private String name; //name 함수 생성
		private double price;//price 함수 생성
		private int stars;//stars 함수 생성

		public Chicken()
		{
		this.name = ""; //name의 값을 설정합니다.
		this.price = 0.0; //price의 값을 설정합니다.
		this.stars = 0; //stars의 값을 설정합니다.
		}

		public Chicken(String name, double price, int stars) //chicken함수
		{
		this.name = name; //바깥의 name 함수를 가져와서 사용가능하게 합니다.
		this.price = price; //바깥의 price 함수를 가져와서 사용가능하게 합니다.
		this.stars = stars; //바깥의 stars 함수를 가져와서 사용가능하게 합니다.
		}

		public String get_name() //getter name 함수
		{
		return this.name; //name을 초기화해서 return, name값을 사용가능하게 가져옵니다.
		}

		public double get_price() //getter price 함수
		{
		return this.price;//price을 초기화해서 return, 값을 사용가능하게 가져옵니다.
		}

		public int get_stars() //getter stars 함수
		{
		return this.stars;//stars을 초기화해서 return, 값을 사용가능하게 가져옵니다.
		}

		public void set_name(String name) //name 사용가능하게 만드는 함수
		{
		this.name = name;//name을 초기화
		}

		public void set_price(double price) //price 사용가능하게 만드는 함수
		{
		this.price = price;//price을 초기화
		}

		public void set_stars(int stars) //stars 사용가능하게 만드는 함수
		{
		this.stars = stars;//stars을 초기화
		}

	}
