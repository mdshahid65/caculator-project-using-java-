
import java.util.Scanner;
class calculator{
    public static void main(String args[])
    {
        int operator,n1,n2;
    
        System.out.println("1 - ADD \n 2 - subtract \n 3 - multiply \n 4 - divide");
        System.out.println("Choose operator:");
        Scanner sc = new Scanner (System.in);
        operator =  sc.nextInt();
        System.out.println("enter first number :");
        n1 = sc.nextInt();
        System.out.println("enter second number ");
        n2 = sc.nextInt();
         
        int result = 0;
        switch(operator){
            case 1:
               result = n1 + n2;
               break;

            case 2:
               result = n1 - n2;
               break;
            
        
            case 3:
             result = n1 * n2;
             break;
            
            case 4:
            result = n1 / n2;
            break;

             default:
                 System.out.println("enter your operator is not valid");

        }
          System.out.println("result is :"+ result);


        

    }
}