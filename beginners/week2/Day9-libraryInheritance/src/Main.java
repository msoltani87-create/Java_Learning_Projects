//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       book book1=new book("java " , "Mahdiye", 1390);
       book1.printDetails();


       eBook book2=new eBook("python " , "noora", 1490, 500);

        book2.printDetails();

    }
}