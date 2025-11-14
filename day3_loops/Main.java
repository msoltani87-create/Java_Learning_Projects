import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        /* مجموع اعداد 1 تا n
        System.out.println("please inter your number : ");
Scanner input= new Scanner(System.in);
int inputNumber= input.nextInt();
int  i =1;
        int sum=0;
        while (i<=inputNumber)
        {
            sum +=i;
            i++;


        }
        System.out.println("total number is : " + sum );
*/







        // مجموع اعداد 1 تا n  با for

        System.out.println("please inter your number : ");
        Scanner input= new Scanner(System.in);
        int inputNumber= input.nextInt();
        int sum=0;
        for(int i = 1 ; i <=inputNumber ; i++)
        {
            sum +=i;

        }
        System.out.println("total number is : " + sum );









/* چاپ جذول ضرب
        for (int i = 1; i <= 10; i++) {
            for ( int j = 1; j <=  10; j++) {

System.out.print( i*j + "\t");
            }
            System.out.println();
        }*/




    }
}