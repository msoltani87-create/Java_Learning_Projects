//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      myBook book1=new myBook("python", "noora", 1400);
      myBook book2=new myBook("java", "Mahdiye", 1390);


      book1.printDetailsBook();
      book2.printDetailsBook();
    }
}