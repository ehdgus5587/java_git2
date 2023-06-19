import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

//jvn
// -javac HelloWorld.java
// java HelloWorld =
// 함수는 기본으로 () 소괄호로 판단 소괄호 앞에는 함수명
// 함수는 --> 만드는법+ 써먹는법
public class Hello {

	public static void hiEveryone() {
		System.out.println("안녕하세요.");
	}

	public static void main(String[] args) {
		System.out.println(add(3,5));
		System.out.println(sub(3,5)); //-2
		System.out.println(mul(3,5)); //15
		System.out.println(gradCher(90.8)); //수
		System.out.println(gradCher(80.0)); //우
		System.out.println(gradCher(50.0)); //가
		
		//showStar(1);
		
		//showStar(2);
		
		//showStar(5);
		
		showStar(10);
		
//		showAge(18,170); //value = 값 = 변수값
//		showAge(17,160);
		
//		int height = 190;
		
//		showAge(22,height);
	}

	public static void hicar() {
		System.out.println("안녕하세요 함수입니다.");
	}

	public static void showFnuctioc() {
		System.out.println("함수1");
		System.out.println("함수2");
	}

//	public static void showStar1() {
//		for(int i =1 ; i <=5;i++) {
//			for(int j =1 ; j<= i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	//변수 선언= 피라미터 = 인자
	public static void showAge(int age,int tall) {
		System.out.println("제나이는" + age + "입니다");
		System.out.println("제키는" + tall + "입니다");
		double height = 190;
	}
//	리턴타입 함수명(파라미터들) {
//		return 리턴값
//}	
	
	public static int add(int num1,int num2) {
		int result = num1 + num2;
		return result;
	}
	public static int sub(int num1,int num2) {
		int result = num1 - num2;
		return result;
	}
	public static int mul(int num1,int num2) {
		int result = num1 * num2;
		return result;
	}
	public static char gradCher(double avg) {
		char ch = '가';
		
		if(avg >= 90) {
			ch = '수';
		}else if(avg >= 80) {
			ch = '우';
		}else if(avg >= 70) {
			ch = '미';
		}else if(avg >= 60) {
			ch = '양';
		}else if(avg >= 50) {
			ch = '가';
		}
		
		return ch;			
	}
	public static void showStar(int num) {
		
		for(int i=1;i<= num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");{
					
				}
			}
			System.out.println();
		}
	}
	
	}	

