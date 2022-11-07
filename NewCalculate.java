import java.util.Scanner;
class NewCalculate
{
    public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first number");
     int num1 = sc.nextInt();
     System.out.println("Enter the number");
     int num2 = sc.nextInt();
     int num3;
     System.out.println("Enter the choice +,-,*,%,/");
     char choice = sc.next().charAt(0) ;
     switch(choice)
     {
         case '+':
         num3 = num1+num2;
         System.out.println(num3);
         break; 
         case '-':
         num3 = num1-num2;
         System.out.println(num3);
         break; 
         case '*':
         num3 = num1*num2;
         System.out.println(num3);
         break; 
         case '%':
         num3 = num1%num2;
         System.out.println(num3);
         break; 
         case '/':
         num3 = num1/num2;
         System.out.println(num3);
         break; 
         default:System.out.println("Invalid Input");
    }
  }

}