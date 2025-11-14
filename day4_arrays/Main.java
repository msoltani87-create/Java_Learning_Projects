
import java.util.ArrayList;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      // ذخیره نمرات و نمایش بیشترین نمره
        Scanner input=new Scanner(System.in);
        System.out.println("how many number do you want to inter?");
        int n=input.nextInt();

        ArrayList<Integer> myList=new ArrayList<>();
        System.out.println("please enter your numbers");
        for (int i=0; i< n ; i++)
        {
            int number=input.nextInt();
            myList.add(number);

        }
        System.out.println("your list is : " + myList);
        int max=myList.get(0);
        for(int num: myList)
        {
            if(num>max) {
                max = num;

            }
        }

        System.out.println("your maximum number is :" + max);



















        /* دریافت نمرات از کاربر و محاسبه میانگین
        System.out.println("how many number do you want to inter?");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] myNumber=new int[n];
        int sum=0;
        System.out.println(" please inter your number");
        for (int i=0;i<n; i++)
        {
          myNumber[i]=input.nextInt();
           sum +=myNumber[i];
        }
        float Avg= (float)sum / n;
        System.out.println("your Avarage is : " + Avg);
*/
    }
}