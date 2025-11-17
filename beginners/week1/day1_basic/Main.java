import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


//System.out.println("please input number");
System.out.println("please input string");
Scanner input = new Scanner(System.in);
// تعییم کردن جداکننده دلخواه
        input.useDelimiter("\\s*d\\s*");

        for (int i = 0; i < 3; i++) {
            System.out.println( input.nextInt() );
        }





// می توانیم رشته ای جملات بدیم
for (int i=0  ; i<5 ; i++)
{
    System.out.println("your string is " + input.nextLine());
}





// از کاربر متن میگیرد ولی فقط کلمه اول را چاپ می کند
String inputStr= input.next();
System.out.println("your String is " + inputStr);




// از کاربر دوتا عدد می گیرد
int inputNumber1= input.nextInt();
int inputNumber2=input.nextInt();
System.out.println(inputNumber1*inputNumber2);
System.out.println(inputNumber1+inputNumber2);
System.out.println(inputNumber1-inputNumber2);





// دوتا عدد دارد و عملیات را انجام می دهد
int number1=14;
int number2=15;
System.out.println(number2 * number1);
System.out.println(number1 + number2);
System.out.println(number1 - number2 );



    }
}