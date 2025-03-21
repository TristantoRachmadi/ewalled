public class Main {
    public static void main(String[] args) {
        String name = "Kai";
        int x = 5;
        int y = 9;
        x = 1;
        int sum = x + y;
        System.out.println("Hello " + name);
        System.out.println("Result: " + sum);

        double weight = 80;
        double height = 1.73;
        double bmi = weight/(height*height);
        System.out.println("BMI Index: " + bmi);
    }
}