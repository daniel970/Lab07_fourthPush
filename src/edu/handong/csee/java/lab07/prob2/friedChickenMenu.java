package edu.handong.csee.java.lab07.prob2;

/*제작자: 김도영 21700082
 * 자바프로그래밍 02분반
 * 날짜: 04/04
 * 설명: 이 프로그램은 메뉴의 평점을 출력해주는 프로그램입니다.
 */

public class friedChickenMenu { //메인함수
	public static void main(String[] args) {
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5); //instance를 새로 생성하여서 값을 초기화
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);//instance를 새로 생성하여서 값을 초기화
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);//instance를 새로 생성하여서 값을 초기화
		
		menu1.set_stars(3); //메뉴1의 값을 3으로 받음
		menu2.set_stars(4);//메뉴2의 값을 3으로 받음
		menu3.set_stars(1);//메뉴3의 값을 3으로 받음
	
		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars()); //메뉴1의 평점을 출력
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars()); //메뉴2의 평점을 출력
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars()); //메뉴3의 평점을 출력
	}
}

