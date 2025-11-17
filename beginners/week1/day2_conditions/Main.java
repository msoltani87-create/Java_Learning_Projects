
import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /* عدد را از کاربر میگیرد و می گوید فرد است یا زوج
        Scanner input=new Scanner(System.in);

        System.out.println("please input your number :");
        int intNumber= input.nextInt();
        if(intNumber % 2 ==0)
            System.out.println("your number is even");
        else
            System.out.println("your number is odd");

*/


        // نمره دانش اموز را می گیرد و می گوید قبول شده است یا نه

        Scanner input = new Scanner(System.in);
        System.out.println("please input your name :");
        String nameStr=input.nextLine();
        System.out.println("please input your grade :");
        Float grade = input.nextFloat();
            if (grade >= 10) {
                System.out.println(nameStr + " :  pass");
            } else
                System.out.println(nameStr + " :  fail");

    }
}