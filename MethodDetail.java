package chapter07.method;

public class MethodDetail {
	public static void main(String[] args) {
		AA a = new AA();
		int[] res = a.getSumandSub(10, 5);
	
		System.out.println("得到了调用方法返回的数组=" + res[0]);
		System.out.println(res[1]);
	}
}
	
class AA {
	public int[] getSumandSub(int n1, int n2) {
		int resarr[] = new int[2];
		//
		resarr[0] = n1 + n2;
		resarr[1] = n1 - n2;
		return resarr;
	} 
}
