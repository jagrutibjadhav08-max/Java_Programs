import java.util.Scanner;
public class positive{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++){
        System.out.println("enter the number:");
        int number=sc.nextInt();
        if(number<=0){
            continue;

        }
        System.out.println("positive number:"+number);

    }
    sc.close();
    
}  
}

    

