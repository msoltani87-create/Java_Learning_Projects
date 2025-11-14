import  java.util.Scanner;
import  java.util.Locale;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //sayHello();

// بررسی اول بودن عدد وارد شده
        //System.out.println("please enter your number?");
        //Scanner inputNumber=new Scanner(System.in);
       // int num= inputNumber.nextInt();
       // System.out.println(primeNumber(num));

// بررسی عددهای 1 تا n توسط کاربر
        //System.out.println("please enter number n ?");
       // Scanner input=new Scanner(System.in);
       // int n = input.nextInt();
       // System.out.println("prime number  between 1 and "+ n + " :");
       // printPrimeNumber(n);


// گرفتن میانگین 3 عدد

       System.out.println("please enter number ?");
       Scanner input=new Scanner(System.in);
       input.useLocale(Locale.US);
        double n = input.nextDouble();
        System.out.println("please enter number1 ?");
        double n1 = input.nextDouble();
        System.out.println("please enter number 2?");
        double n2 = input.nextDouble();
       double result=   average3Number(n,n1,n2);
       System.out.println("your Avarage is "+ result);
    }


    // تابع میانگین 3 عدد
   public  static double average3Number(double n , double n1 , double n2)
   {
       double avg = (n + n1 + n2) / 3  ;
       return avg;
   }













// چاپ اعداد اول بین 1 تا n
public  static void  printPrimeNumber(int n )
{
    for (int i=2 ; i<=n; i++)
    {
        if(isPrime(i))
        {
            System.out.print(i+ "  ");
        }
    }
}


//بررسی اول بودن  تمام اعداد در یک بازه عددی که کاربر وارد می کند

    public  static  boolean isPrime(int number)
    {
        if(number <= 1)
            return false;
        for(int i=2 ;i<=number/2; i++ )
        {
            if(number % i ==0)
                return false;
        }
        return true;
    }




    // بررسی اول بودن یک عدد که توسط کاربر .ارد می شود
   public static String primeNumber(int number)
   {
        if(number <=1)
         return ("This Number is not Primenumber");
        for(int i=2 ;i<=number/2; i++ )
        {
            if(number % i ==0)
                return ("This Number is not  Primenumber");
        }


            return ("This Number is   Primenumber");
   }











    public  static void sayHello(){
        System.out.println("hello world!");

    }

}