import java.util.Scanner;

public class TempertarureConverterApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double temp=scan.nextDouble();
	TemperatureConverter temperatureConverter = new TemperatureConverter();

	System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(temp));
	
}
}
