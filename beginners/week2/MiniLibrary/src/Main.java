import  java.util.Scanner;
import  java.util.ArrayList;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Book>library=new ArrayList<>();




       Scanner scaner=new Scanner(System.in);
       int choice;
        do {
            // show menu
            System.out.println("====== library ======");
            System.out.println("1. Add Book ");
            System.out.println("2. Add EBook");
            System.out.println("3. Show all Book ");
            System.out.println("4. Total Book ");
            System.out.println("0. Exit");
            System.out.print("please choice: ");

            // Enter choice
            choice = scaner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("please Enter book...");
                    scaner.nextLine();
                    System.out.println("please enter Title : ");
                    String titleP = scaner.nextLine();

                    System.out.println("please enter Author : ");
                    String authorP = scaner.nextLine();

                    System.out.println("please enter year : ");
                    int yearP = scaner.nextInt();

                    System.out.println("please enter pagenumber : ");
                    int pageNumberP = scaner.nextInt();
                    scaner.nextLine();
                    PrintBook printBook = new PrintBook(titleP, authorP, yearP, pageNumberP);
                    library.add(printBook);
                    System.out.println("successful Book");
                    break;

                case 2:
                    System.out.println("please Enter book...");
                    scaner.nextLine();
                    System.out.println("please enter Title : ");
                    String titleE = scaner.nextLine();

                    System.out.println("please enter Author : ");
                    String authorE = scaner.nextLine();

                    System.out.println("please enter year : ");
                    int yearE = scaner.nextInt();

                    System.out.println("please enter sizeInMB : ");
                    int sizeInMB = scaner.nextInt();
                    scaner.nextLine();

                    EBook eBook = new EBook(titleE, authorE, yearE, sizeInMB);
                    library.add(eBook);
                    System.out.println("successful Ebook");
                    break;
                case 3:
                    System.out.println("show all book :");
                    for(Book book : library)
                    {
                        book.printDetails();
                        System.out.println("-----------");
                    }
                    break;
                case 4:

                    System.out.println("totlaBook is "+Book.getTotalBook() );
                    break;
            }
            }
            while (choice != 0) ;

            scaner.close();


        }
}