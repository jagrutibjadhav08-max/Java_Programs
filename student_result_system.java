import java.util.Scanner;
public class student_result_system{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks for java:");
        int m1 = sc.nextInt();
         System.out.println("Enter your marks for python:");
        int m2 = sc.nextInt();
         System.out.println("Enter your marks for Os:");
        int m3 = sc.nextInt();
         System.out.println("Enter your marks for DELD:");
        int m4 = sc.nextInt();
         System.out.println("Enter your marks for CEP:");
        int m5 = sc.nextInt();
        int total = m1+m2+m3+m4+m5;
        double percentage = total/5;
        System.out.println("Your percentage is:"+percentage);
        if(percentage>=90){
            System.out.println("Your grade is A+");
        }else if(percentage>=80){
             System.out.println("Your grade is A");
        }else if(percentage>=70){
             System.out.println("Your grade is B");
        }else if(percentage>=60){
             System.out.println("Your grade is C");
        }else if(percentage>=40){
             System.out.println("Your grade is D");
        }else{
             System.out.println("You are Failed");
        }
        sc.close();
    }

}