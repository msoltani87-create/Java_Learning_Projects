import java.util.ArrayList;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<book>library=new ArrayList<>();
        book b1=new book("java " , "Mahdiye", 1390 , 15);
        book b2=new book("python " , "noora", 1290 , 20);


        eBook b3=new eBook("Android", "Amir", 1958, 300);
        eBook b4=new eBook("php", "mehran", 1980, 500);

        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);

        for(book item : library){
            item.printDetails();
        }
    }
}