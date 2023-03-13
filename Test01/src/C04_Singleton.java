class Singleton {
	private static Singleton one;

    private Singleton() {
	}
    
    public static Singleton getInstance() {
    	if(one==null) {
            one = new Singleton();
        }
        return one;
    }
}
/*
 * 왜냐하면 Singleton 클래스의 생성자에 private 키워드로 다른 클래스에서 Singleton 클래스의 생성자로의 접근을 막았기 때문이다. 
 * 이렇게 생성자를 private 으로 만들어 버리면 다른 클래스에서 Singleton 클래스를 new 를 이용하여 생성할 수 없게 된다.
new를 이용하여 무수히 많은 객체를 생성한다면 싱글톤의 정의에 어긋나지 않겠는가? 그래서 일단 new로 객체를 생성할 수 없도록 막은 것이다.
 */

public class C04_Singleton {

	public static void main(String[] args) {
		// 싱글톤은 단 하나의 객체만을 생성하게 강제하는 패턴이다. 
		//Singleton singleton = new Singleton();  // 컴파일 오류가 발생한다.
		
		Singleton sg1 =  Singleton.getInstance();
		Singleton sg2 =  Singleton.getInstance();
		
		System.out.println(sg1);
		System.out.println(sg2);
	}

}
