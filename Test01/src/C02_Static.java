class HouseLee {
    static String lastname = "이";
    
    static int count = 0;
    HouseLee() {
        count++;  // count는 더이상 객체변수가 아니므로 this를 제거하는 것이 좋다.
        System.out.println(count);  // this 제거
    }
}
public class C02_Static {
	public static void main(String[] args) {
		HouseLee lee1 = new HouseLee();
        HouseLee lee2 = new HouseLee();//count 값이 공유되어 다음과 같이 count가 증가되어 출력된다.
		
        System.out.println(lee1.lastname);
        System.out.println(lee2.lastname);
	}
	/*
	 * 위와 같이 lastname 변수에 static 키워드를 붙이면 자바는 메모리 할당을 딱 한번만 하게 되어 메모리 사용에 이점이 있다.
	 * static을 사용하는 또 한가지 이유로 공유 개념을 들 수 있다.
	 *  static 으로 설정하면 같은 곳의 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유하게 되는 것이다.
	 */

}
