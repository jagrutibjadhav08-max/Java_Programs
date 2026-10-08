import java.util.Scanner;
public class numberbreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<10;i++){
            System.out.println("enter the numbers:");
            int number =sc.nextInt();
            if(number==30){
                System.out.println("you entered 60");
                break;
            }
        }
        sc.close();
    }

     
    
}
