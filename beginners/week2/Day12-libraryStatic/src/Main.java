import  java.util.ArrayList;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    ArrayList<Book> library=new ArrayList<>();

        Book b1=new PrintedBook("java", "Mahdiye" , 1390, 52);
        Book b2=new PrintedBook("python", "Noora" , 1376, 68);
        Book b3=new PrintedBook("Html", "Amir" , 1380, 92);
        Book b4=new PrintedBook("Css", "Mehran" , 1370, 192);

        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);

        for (Book item:library)
        {
            item.printDetails();
        }

        System.out.println("----------------------");
        System.out.println("totalBook  is : " + Book.getTotalBook());
    }



}