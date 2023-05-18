package chapter07.method;

public class Method02 {
	public static void main(String[] args) {
		int [][] map = {{1,1,1}, {2,2,2}, {3,3,3} };
		Mytools tool = new Mytools();
		tool.PrintArr(map);
		tool.PrintArr(map);
		tool.PrintArr(map);
	}
}

class Mytools {
	public void PrintArr(int[][] map) {
		System.out.println("遍历map[][]数组====");
		for(int i = 0; i < map.length; i++ ) {
			for(int j = 0; j < map[i].length; j++)
				System.out.println(map[i][j] + "\t" );
		}
		System.out.println(     );
	}
}
