public class PrintBook extends  Book{

    private int pageNumber;

    public  PrintBook(String title, String author , int year, int pageNumber) {
        super(title, author, year);
        this.pageNumber=pageNumber;
    }
    public  void printDetails(){
        System.out.println("print Book->"+ "title: "+title + ", author: " +author + ", year: "+ year + ", pageNBumber: " +pageNumber);
    }

}
