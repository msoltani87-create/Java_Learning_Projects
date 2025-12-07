public class book {
   public String title;
   public String auther;
   public int year;



  public  book(String title, String author , int year)
  {
      this.title=title;
      this.auther=author;
      this.year=year;
  }

  public  void printDetails(){

      System.out.println("title:"+title + " ,"+ "author:"+auther +" ,"+ "year:"+year);

  }

}
