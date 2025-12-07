public  abstract  class   Book {
    String title;
    String author;
    int year;


    public  static int totalBook=0;

    public  Book(String title , String author, int year ){
         this.title=title;
         this.author=author;
         this.year=year;

         totalBook ++;
    }

    public static int getTotalBook() {
        return totalBook;
    }

    public  abstract void printDetails();



}
