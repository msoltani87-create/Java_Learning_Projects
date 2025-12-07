public abstract  class book {

    protected String title;
    protected String author;
    protected int year;

    public  book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }


    public  abstract  void printDetails();

    public  void open(){
        System.out.println("opening the book....");
    }
}
