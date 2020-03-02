package day01;

public class Variable {
	final static int NUMBER = 5;
	public static void main(String[] args) {
		char ch = '*';
		System.out.println("아래의 그림을 Memory space라고 가정한다.");
		System.out.println("Memory address : 0X100 으로 가정 ");
		upper(NUMBER, ch);
		System.out.println("위의 그림에서 값이 처음 저장될 때, Initialization으로 표현한다.");
		System.out.println("이 후에 해당 주소로 값이 적용되는 것은 저장으로 표현된다.");
		
		// 이와 같이 variable이란 결국, 주소에(0X100) data type에 맞는 
		// 메모리 공간을 allocation하여 그 공간에 이름을 주어 접근할 수 있게 한다.
		// 번외로 
		// Constant (ex. final int MAX = 100;) 결국 final로 선언된 Variable name과 같다.
		// Literal int(data type) val(Variable name) = 100(Literal);
	}
	private static void upper(int x, char ch) {
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				for(int k = 0; k < 2; k++) {
					if(k==0) {
						if(i==0 || j==0 || j==4 || i==4)
							System.out.printf("%-2s",ch);
						else
							System.out.printf("  ");
					}else {
						if(i==2 && j==4)
							System.out.print("<<<< Variable value Initialization");
					}
				}
			}	
			System.out.println();
		}
	
	}
	
}
