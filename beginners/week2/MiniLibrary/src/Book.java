public  abstract class Book {

    protected String title;
    protected String author;
    protected int year;
protected  static  int totalBook=0;

    public  Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
        totalBook ++;
    }


    //getter
    public static int getTotalBook() {
        return totalBook;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }



    //method
    public  abstract  void printDetails();

    public  void open(){
        System.out.println("opening the book....");
    }
}


