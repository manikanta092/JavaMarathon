import java.util.Scanner;

public class HeightConverterApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the height in inches: ");
	int height = scan.nextInt();
	HeightConverter hc = new HeightConverter();
	System.out.printf("%.2f",hc.convertInchesToFeet(height));
}
}
