import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator");
        System.out.print("Enter the marks of subject 1:");
        double sub1 = sc.nextDouble();
        System.out.print("Enter the marks of subject 2:");
        double sub2 = sc.nextDouble();
        System.out.print("Enter the marks of subject 3:");
        double sub3 = sc.nextDouble();
        System.out.print("Enter the marks of subject 4:");
        double sub4 = sc.nextDouble();
        System.out.print("Enter the marks of subject 5:");
        double sub5 = sc.nextDouble();
        double sum = sub1+sub2+sub3+sub4+sub5;
        System.out.println("your total marks out off 500 is:");
        System.out.println(sum);
        double percentage = sum/5;
        System.out.println("your Percentage is:");
        System.out.print(percentage );

        if(percentage>=90){
            System.out.print("\nThe grade of student is: A");
        }
        else if(percentage>=80 && percentage<=89){
            System.out.print("\nThe grade of student is: B");
        }
        else if(percentage>=70 && percentage<=79){
            System.out.print("\nThe grade of student is: C");
        }
        else if(percentage>=60 && percentage<=69){
            System.out.print("\nThe grade of student is: D");
        }
        else{
            System.out.print("\nThe grade of student is: F");
        }

        
    }
}


