package chapter07.method;

public class Verparameter01 {
	public static void main(String[] args) {
		Kbcs dykbcs = new Kbcs();
		System.out.println(dykbcs.sum(1, 1));
		System.out.println(dykbcs.sum(1, 2, 3));
		System.out.println(dykbcs.sum(1, 2, 3,4,5,5,3));
		System.out.println(dykbcs.sum(1, 2, 3,4,5,5,3,4,5,3,45,35,435,3));


		
		
		
		
	}
}
class Kbcs {
//	public int sum(int n1, int n2) {
//		return n1 + n2;
//		
//	}
//	public int sum(int n1, int n2, int n3) {
//		return n1 + n2 + n3;
//	}
//	public int sum(int n1, int n2, int n3, int n4) {
//		return n1 + n2 + n3 + n4;
//	}
	
	public int sum(int...nums) {
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res += nums[i];
			}
		return res;
	}
	
	
	
	
}