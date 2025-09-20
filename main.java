public class main {
    public static void main(String[] args) {
        Student student = new Student("A", 100);
        Student student = new Student("A", 100);

        System.out.println("Name: " + student.getName());
        System.out.println("Roll: " + student.getRoll());

        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(15, 3));
        System.out.println("Subtraction: " + calculator.subtract(15, 3));
        System.out.println("Multiplication: " + calculator.multiply(15, 3));
        System.out.println("Division: " + calculator.divide(15, 3));
    }
}