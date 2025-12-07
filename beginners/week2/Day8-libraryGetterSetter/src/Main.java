//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        myBook book1=new myBook("python", "noora", 1398, 8000);
        myBook book2=new myBook("java", "Mahdiye", 1390, 9500);
        book1.setYear(-9);
        book2.setTitle(" ");


        book1.printDetailsBook();
        book2.printDetailsBook();
    }
}