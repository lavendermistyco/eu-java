public class Variables {

    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Write a method that multiples 3 integers together and return the product
    public static int multiplyNumbers(int a, int b, int c) {
         return a*b*c;
    }


    public static void main(String[] args) {
        int twentyFive = 25;
        int b = 30;
        
        int sum = addNumbers(twentyFive, b);
        System.out.println("The sum is: "+ sum);

        System.out.println(multiplyNumbers(4,5,6));

        // byte
        byte age = 25;
        System.out.println("Age: " + age);

        /*  This is a comment
            Hi  
         */

        // short
        short year = 2021;
        System.out.println("Year: " + year);

        // int
        int salary = 50000;
        System.out.println("Salary: $" + salary);

        // long
        long distance = 9876543210L;
        System.out.println("Distance: " + distance + " meters");

        // float
        float price = 19.99f;
        System.out.println("Price: $" + price);

        // double
        double height = 5.9;
        System.out.println("Height: " + height + " feet");

        // char
        char grade = 'A';
        System.out.println("Grade: " + grade);

        // boolean
        boolean isJavaFun = true;
        System.out.println("Is Java fun? " + isJavaFun);
    }
}
