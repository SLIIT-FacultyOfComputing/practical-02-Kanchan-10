import java.util.Scanner;

public class Grades{
    public static void main (String [] args){
        Scanner input =new Scanner(System.in);

        int marks;

        System.out.println("Enter your marks:");
        marks =input.nextInt();

        if(marks>=90){
            System.out.println("Grade A");
        }
        else if (marks>=80 && marks<=89){
            System.out.println("Grade B");
        }
        else if (marks>=70 && marks<=79){
            System.out.println("Grade C");
        }
        else if (marks>=60 && marks<=69){
            System.out.println("Grade D");
        }
        else if (marks<=60){
            System.out.println("FAIL");
        }
    }
}
