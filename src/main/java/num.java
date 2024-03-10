import java.util.Scanner;

public class num {
    public static void main(String args[]){
        //How to Read and Print an Integer value in Java
        // Declare the variables
        int num;
        // Input the integer
        System.out.println("Enter the integer:");
        // Create Scanner object
        Scanner sc=new Scanner(System.in);
        // Read the next integer from the screen
        num=sc.nextInt();
        System.out.println("Entered number is ="
                +num);

    }
}
