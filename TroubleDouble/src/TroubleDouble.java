import java.util.Scanner;

public class TroubleDouble {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a= scan.nextInt();
	int res=doubleTheNumber(a);
	System.out.println(res);
}
public static int doubleTheNumber(int num1) {
	return num1*2;
}
}
