import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<book> library=new ArrayList<>();
        book b1=new printBook("java " , "Mahdiye", 1390 , 15);
        book b2=new printBook("python " , "noora", 1290 , 20);


        book b3=new ebook("Android", "Amir", 1958, 300);
        book b4=new ebook("php", "mehran", 1980, 500);

        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);

        for(book item : library){
            item.printDetails();
            item.open();
            System.out.println("-----------------------");
        }
    }
}