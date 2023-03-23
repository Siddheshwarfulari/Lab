package cube;

import java.util.Scanner;

public class cube_eg {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    scanner.close();
    System.out.println("The cube of given numbe is: "+(num*num*num));
	}

}
