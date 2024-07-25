import java.util.Scanner;

public class Marks{
    public static void main (String [] args){
        Scanner input =new Scanner(System.in);

        System.out.println("enter the numebrof students in the class:");
        int nos=input.nextInt();

        int data[][]= new int[nos][3];

        for(int i=0;i<nos;i++){
            System.out.println("Marks of the student "+(i+1));
            for(int k=0 ;k<3;k++){
                System.out.println("enter the marks of subject "+(k+1));
                data[i][k]=input.nextInt();
            }
        }
        input.nextLine();
        
        System.out.println("SELECT ANY OPTION \n a.Average marks of student \n b.Average marks of each subject \n c.Total marks of student");
        String option= input.nextLine();

        switch (option){
            case "a":
                System.out.println("Enter the student ID:");
                int stuID=input.nextInt() -1;
                int sum=0;
                for(int i=0;i<3;i++){
                    sum+=data[stuID][i];
                }
                int avg=sum/3;
                System.out.println("The avergae marks of student "+stuID+" is "+avg);
            break;
            
            case "b":
                System.out.println("Enter the subject  code:");
                int subCode=input.nextInt()-1;
                int sub=0;
                for(int i=0;i<nos;i++){
                    sub=data[i][subCode];
                }
                int avgSub=sub/3;
                System.out.println("the average of this subject is "+avgSub);
                break;

            case "c":
                System.out.println("enter the student code");
                int stuCode=input.nextInt() -1;
                int sumMarks=0;
                for(int i=0;i<3;i++){
                    sumMarks+=data[stuCode][i];
                }
                System.out.println("the sum of the marks: "+sumMarks);
                break;

            default:
            System.out.println("Invalid option");
            break;
            }
                
            }
    
}
