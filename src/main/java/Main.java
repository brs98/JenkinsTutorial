import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        while (true) {
            System.out.print("Input: ");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            String[] splits = s.split(" ");
            int value = 0;
            switch (splits[0]) {
                case "add":
                    value = calculator.add(Integer.parseInt(splits[1]), Integer.parseInt(splits[2]));
                    break;
                case "subtract":
                    value = calculator.subtract(Integer.parseInt(splits[1]), Integer.parseInt(splits[2]));
                    break;
                case "multiply":
                    value = calculator.multiply(Integer.parseInt(splits[1]), Integer.parseInt(splits[2]));
                    break;
                case "divide":
                    value = calculator.divide(Integer.parseInt(splits[1]), Integer.parseInt(splits[2]));
                    break;
                case "fibonacci":
                    value = calculator.fibonacciNumberFinder(Integer.parseInt(splits[1]));
                    break;
                case "binary":
                    value = Integer.parseInt(calculator.intToBinaryNumber(Integer.parseInt(splits[1])));
                    break;
                default:
                    System.out.println("Not a valid command.");
                    break;
            }
            System.out.println("Output: " + value);
        }
    }
}
