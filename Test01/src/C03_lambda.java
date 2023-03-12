import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
//    int sum2(int a);
    //여기서 주의해야 할 점은 Calculator 인터페이스의 메서드가 1개 이상이면 람다함수를 사용할 수 없다는 점이다.
}

class MyCalculator implements Calculator {
    public int sum(int a, int b) {
        return a+b;
    }

//	@Override
//	public int sum2(int a) {
//		return 0;
//	}
}

public class C03_lambda {
    public static void main(String[] args) {
//        Calculator mc = new MyCalculator();
//        int result = mc.sum(3, 4);
//        System.out.println(result);  // 7 출력
    	
    	Calculator mc = (int a ,int b) -> a+b;
    	   int result = mc.sum(3, 4);
           System.out.println(result);
           
           Calculator mc1 = Integer::sum;
           int result1 = mc1.sum(3, 4);
           System.out.println(result1);
           
           BiFunction<Integer, Integer, Integer> mc2 = (a, b) -> a + b;
           int result2 = mc2.apply(3, 4);  // sum이 아닌 apply 메서드를 사용해야 한다.
           System.out.println(result2);  // 7 출력
           
           BinaryOperator<Integer> mc3 = (a, b) -> a + b;
           int result3 = mc3.apply(3, 4);
           System.out.println(result3);  // 7 출력
    	
    }
}