import java.util.Scanner;

public class TemperatureConv {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double temperature;
        String unit;
        double result;
        
        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();
        System.out.print("Enter Farenheit (F) or Celcius (C): ");
        unit = scanner.next().toUpperCase();

        result = (unit.equals("F")) ? (temperature  * 9/5) + 32 : (temperature - 32) * 5 / 9;

        System.out.printf("Result: %.1f %s", result, unit);

        scanner.close();
    }
}
