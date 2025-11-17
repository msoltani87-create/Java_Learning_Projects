import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;
import  java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Scanner input=new Scanner(System.in);
        input.useLocale(Locale.US);
        ArrayList<Double> myList=new ArrayList<>();
        int choice;





        do {
            // نمایش منو
            System.out.println("====== منوی اصلی ======");
            System.out.println("1. Enter Grade  ");
            System.out.println("2. Average Grade ");
            System.out.println("3. Delete Grade ");
            System.out.println("4. Add Grade  ");
            System.out.println("5  Max Grade  ");
            System.out.println("0. Exit");
            System.out.print("please choice: ");

            // دریافت ورودی کاربر
            choice = scanner.nextInt();




            // پردازش انتخاب کاربر
            switch (choice) {
                case 1:
                    System.out.println("how many number do you want to inter?");
                    double n=input.nextDouble();
                    System.out.println("please enter your numbers");

                    for (int i=0; i< n ; i++)
                    {
                        double number=input.nextDouble();
                        myList.add(number);

                    }
                    System.out.println("your list is : " + myList);
                    break;
                case 2:
                    if(myList.isEmpty()){

                        System.out.println("list is Empty");
                    }
                    else {
                        double sum = 0;
                        double avg = 0;
                        for (double grade:myList)
                        {

                            sum += grade;
                        }
                            avg = sum / myList.size();


                        System.out.println("your Avarage is : " + avg);
                    }

                    break;
                case 3:
                    if(myList.isEmpty()){

                        System.out.println("list is Empty");
                    }
                    else
                    {
                        System.out.println("your list is : " + myList);
                        System.out.println("which number do you want to delete?");
                        double deleteNumber=input.nextDouble();
                        if(myList.remove(Double.valueOf(deleteNumber))){
                            System.out.println("Grade deleted");
                        }
                        else {
                            System.out.println("grade is not in your list ");

                        }
                        System.out.println("You new yourlist is "+ myList);
                    }

                    break;
                case 4:
                    System.out.println("please Enter your Grade");
                    double newNumber=input.nextDouble();
                    myList.add(newNumber);
                    System.out.println("your new list is "+ myList);

                case 5:
                    if(myList.isEmpty()){

                        System.out.println("list is Empty");
                    }
                    else {
                        double max=myList.get(0);
                        for (double grade : myList){
                            if(grade>max)
                                max=grade;
                        }
                        System.out.println("max number is  " + max);
                    }
                        break;
                case 0:
                    System.out.println("خروج از برنامه. خداحافظ!");
                    break;
                default:
                    System.out.println("گزینه نامعتبر! لطفاً دوباره تلاش کنید.");
            }
            System.out.println(); // خط خالی برای زیبایی
        } while (choice != 0);

        scanner.close();
    }
}
