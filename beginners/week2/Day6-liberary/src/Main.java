//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       book book1 =new book();
       book book2=new book();

       book1.title="java learning";
       book1.author="mahdiye";
       book1.year=1390;

        book2.title="python learning";
        book2.author="noora";
        book2.year=1389;

        book.printDetailsBook(book1.title, book1.author,book1.year);
        book.printDetailsBook(book2.title, book2.author, book2.year);
    }
}