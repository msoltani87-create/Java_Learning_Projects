public class book {
    protected  String title;
    protected  String author;
    protected  int year;
    protected int pageNumber;



    public  book(String title, String author, int year , int pageNumber)
    {
        this.title=title;
        this.author=author;
        this.year=year;
        this.pageNumber=pageNumber;
    }


    public  void printDetails(){
        System.out.println("Book->"+ "title: "+title + ", author: " +author + ", year: "+ year + ", pageNBumber: " +pageNumber);
    }

}
