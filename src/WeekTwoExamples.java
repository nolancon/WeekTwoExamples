import java.util.Scanner;

public class WeekTwoExamples {
    public static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        asciiValues();
        asciiValuesRecursive();
        algebraicExpression();
        assignmentTests();
        capitalLetter();
        circle();
        operators();
    }
    public static void asciiValues() {
        int comp = 1;
        while (comp != 0) {
            System.out.println("Enter char:");
            char input = sc.next().charAt(0);
            comp = Character.compare(input, 'x');
            int charAsciiVal = Character.getNumericValue(input);
            System.out.println("Ascii value of char is: " + charAsciiVal);
        }
    }
    public static void asciiValuesRecursive() {
        System.out.println("Enter char:");
        char input = sc.next().charAt(0);
        int comp = Character.compare(input, 'x');
        if (comp != 0) {
            int charAsciiVal = Character.getNumericValue(input);
            System.out.println("Ascii value of char is: " + charAsciiVal);
            asciiValuesRecursive();
        }
    }

    public static void algebraicExpression() {
        int x = 2, a = 3;
        // y = ax^3 + 7
        System.out.println(a * Math.pow(x,3) + 7);
    }

    public static void assignmentTests() {
        System.out.println("Enter integer (1...10):");
        int input = 0;
        try {
            input = sc.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }
        if (input >= 1 && input <= 5){
            System.out.println("Square of " + input + " is " + Math.sqrt(input));
        } else if (input  >= 6 && input <= 10) {
            System.out.println("Cube of " + input + " is " + Math.pow(input,3));
        } else if (input > 10 || input <= 0) {
            System.out.println("Error. Number must be between 0 and 10");
        }
    }

    public static void capitalLetter(){
        System.out.println("Enter a letter:");
        char letter = sc.next().charAt(0);
        if (Character.isLetter(letter) != true) {
            System.out.println("Error: input is not a letter");
            return;
        }
        if (Character.isLowerCase(letter) == true){
            System.out.println("Lowercase: " + letter);
        } else {
            System.out.println("Uppercase: " + letter);
        }
    }

    public static void circle() {
        System.out.println("Enter radius:");
        float radius = sc.nextFloat();
        System.out.println("Diameter: " + (radius * 2));
        System.out.printf("Circumference: %.2f\n", (2 * Math.PI * radius));
        System.out.printf("Area: %.2f\n",(Math.PI * Math.pow(radius,2)));
    }
    public static void operators(){
        int x = 5;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x);
    }

}
