// Q1

import java.util.Scanner;

public class Q1{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        //String Concatenation

        String fname,mname,lname;

        System.out.println("enter your first name:"); //prompting the suer to enter the first name 
        fname=input.nextLine();

        System.out.println("enter your middle name:"); //prompting the suer to enter the middle name
        mname=input.nextLine();

        System.out.println("enter your last name:"); //prompting the suer to enter the last name
        lname=input.nextLine();

        StringBuilder sb= new StringBuilder(); // using stringBuilder to concatenate ths strings

        sb.append(fname);
        sb.append(" ");
        sb.append(mname);
        sb.append(" ");
        sb.append(lname);

        String name =sb.toString(); // saving the concatenated string in the variable "name"

        System.out.println("the name is "+name); // displaying the concatenated string 

        // String Comparison

        System.out.println("enter tour full name: "); // prompting the user to enter the full name
        String name1 = input.nextLine();

        //checking the similarity betweeen the names
        if(name.equalsIgnoreCase(name1)){ 
            System.out.println("both are the same names");
        }
        else{
            System.out.println("the names are not matching");
        }


        // String Modification

        String rname= name.replace("a","@"); // replacing the characters 
        String rrname=rname.replace("e","3"); // replacing the characters 

        String urrname=rrname.toUpperCase(); // converting the modified nmse to upper case

        System.out.println("the modified name is:"+urrname);

        
        // String Splitting

        String[] parts=name.split("");
        System.out.println("The parts are:");
        for (String part : parts) {
            System.out.print(part + " ");
        }
        System.out.println();

    }
}
