package day01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCasting {
	public static void main(String[] args) {
		// Casting test
		// 방식 data type 별 조합  
		// test는 Junit4 사용 
		// 예상대로 되는지의 확인이며, 
		// 궁극적인 목적은 각 data type 의 casting에 대한 이해가 제대로 되었는지 확인하는 것과 테스트의 방법론에 대한 고찰 
		// 최대한 단순화된 형태로 할 것. 
		
		//casting 의 특성상 data type이 보다 큰 방향으로 변환되므로(그것이 Explicit casting이 아니라면)
		//모든 type 의 casting을 직접해보는 것은 시간낭비. 
		//따라서 String만 하겠음.
		//StringTest

		//값 확인 
		System.out.println("" + 1.0f);
		System.out.println("" + 1.0);
		System.out.println("" + true);
		//type check
		String str = "" + 1.0f;
		String str2 = "" + 1.0;
		String str3 = "" + true;
		
		
		//Second charTest
		//Third 
	}
	
//	@Test
//	public void StringTest() { // private주니 되지 않음... Exception발생 에러명 initializtion 상속과 관련이 있을거라고 예상됨.  
//		String str = "1"; // 비교값 String 기준  
//		//예상되는 결과 boolean, 을 제외한 모든 것들이 true 
//		//boolean은 "true"로 출력 될 것.
//		//예상이 틀림. 
//		//double, float 또한 String으로 Casting 되지 않았음.
//      //는 1.0이라서 였음... 바보네	
//	    //확인 결과 String으로 모든 타입이 String으로 변환되는 것을 확인함.
//		//직접적인 확인을 위해 println 활용 
//		assertEquals(str,"" + (byte)1); // byte	
//		assertEquals(str,"" + (short)1); // short	
//		assertEquals(str,"" + 1); // int	
////		assertEquals(str,""+1.0f); // float
////		assertEquals(str,""+1.0); // double
//		assertEquals(str,"" + '1'); // char
////		assertEquals(str,""+true); // boolean
//		assertEquals(str,"" + "1"); // String
//	}
	
}
