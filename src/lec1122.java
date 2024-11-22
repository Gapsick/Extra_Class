public class lec1122 {

	public static void main(String[] args) {

		char foo[][] = new char[4][];

		foo[0] = new char[5];
		foo[1] = new char[3];
		foo[2] = new char[1];
		foo[3] = new char[4];

		foo[0][0] = 'h';
		foo[0][1] = 'e';
		foo[0][2] = 'l';
		foo[0][3] = 'l';
		foo[0][4] = 'o';

		foo[1][0] = 'h';
		foo[1][1] = 'o';
		foo[1][2] = 'w';

		foo[2][0] = 'a';

		foo[3][0] = 't';
		foo[3][1] = 'o';
		foo[3][2] = 'p';
		foo[3][3] = 's';

		for (int i = 0; i < foo.length; i++) {
			for (int j = 0; j < foo[i].length; j++) {
				System.out.print(foo[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(char[] v : foo) {
			System.out.println(v);
		}

		short bar[][][] = new short [2][][];
		bar[0] = new short[3][];
		bar[1] = new short[1][];

		bar[0][0] = new short[5];
		bar[0][2] = new short[2];
		bar[1][0] = new short[3];


	}

}
