public class myBook {


    private  String title;
    private String  author;
    private int year;

    //constractor
    public myBook(String title , String author , int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    //method to print
    public void printDetailsBook() {
        System.out.println("title :" + title + ", " +  "author : " + author + " ," + "year : " + year);
    }

}
