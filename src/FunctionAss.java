import java.util.Scanner;

public class FunctionAss {
    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);

        //Define two methods to print the maximum and the minimum number respectively
        //among three numbers entered by the user.
//        System.out.print("Enter a value 1 : ");
//        int a = inpu.nextInt();
//        System.out.print("Enter a value 2 : ");
//        int b = inpu.nextInt();
//        System.out.print("Enter a value 3 : ");
//        int c = inpu.nextInt();
//
//        //Function for maxium value
//        int max = maximumValue(a, b, c);
//        //Function for Minimum Value
//        int min = minimumValue(a,b,c);
//
//        System.out.println("The maximum value is: " + max);
//        System.out.println("The minimum value is: " + min);

        //Define a program to find out whether a given number is even or odd.

//        int a = inpu.nextInt();
//
//        checkEvenOdd(a);

        //A person is eligible to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is eligible to vote.

//        int age = inpu.nextInt();
//        ageCheckVote(age);

        //Write a program to print the sum of two numbers entered by user by defining your own method.
//        int a = inpu.nextInt();
//        int b = inpu.nextInt();
//
//        int sol = sumTwoNumber(a,b);
//        System.out.println(sol);

        //Define a method that returns the product of two numbers entered by user.
//        int a = inpu.nextInt();
//        int b = inpu.nextInt();
//
//        int sol = productTwoNumber(a,b);
//        System.out.println(sol);

        //Write a program to print the circumference and area of a circle of radius entered
        //by user by defining your own method.

        int radius = inpu.nextInt();
        circleAreaCircum(radius);

    }

    static void circleAreaCircum(int radius){
        double pie = 3.14;
        double Circumference = 2*pie*radius;

    }

    //Define a method that returns the product of two numbers entered by user.
//    static int productTwoNumber(int a,int b){
//        return a*b;
//    }
    //Write a program to print the sum of two numbers entered by user by defining your own method.
//    static int sumTwoNumber(int num1,int num2){
//        return num1+num2;
//    }

    //A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.
//    static void ageCheckVote(int age){
//        if (age >= 18){
//            System.out.println("Your Are Eligible For Vote");
//        }
//        else {
//            System.out.println("Your Are Not Eligible For Vote");
//        }
//    }

    //Define a program to find out whether a given number is even or odd.
//    static void checkEvenOdd(int num){
//        if (num%2==0){
//            System.out.println("Even"+" "+a);
//        }else{
//            System.out.println("odd "+" "+a);
//        }
//    }



//Define two methods to print the maximum and the minimum number respectively
// among three numbers entered by the user.
//    static int maximumValue(int a, int b, int c){
//        //let take a is maximum;
//        int maxVal = a;
//        if (b > maxVal) {
//            maxVal = b;
//        }
//        if (c > maxVal) {
//            maxVal = c;
//        }
//        return maxVal;
//    }
//    static int minimumValue(int a,int b,int c){
//        int miniVal = a;
//        if (b<miniVal){
//            miniVal = b;
//        }
//        if (c<miniVal){
//            miniVal = c;
//        }
//        return miniVal;
//    }
}
