public class myBook {
    private  String title;
    private String  author;
    private int year;
    private  int price;

    //constractor
    public myBook(String title , String author , int year, int price){
        setTitle(title);
        this.author=author;
        setYear(year);
        setPrice(price);
    }

    //getter and setter


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price / 10 ;
        System.out.println(price +" " +"Rial");
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
       if (title==null  ||  title.trim().isEmpty())
       {
           System.err.println("title is not null");
       }
       else {
           this.title = title;
       }

    }



    public int getYear() {

        return year;

    }

    public void setYear(int year) {
        if(year < 0)
        {

            System.err.println("year is invalid");
        }
        else {
            this.year = year;
        }

    }

    //method to print
    public void printDetailsBook() {
        System.out.println("title :" + getTitle() + ", " +  "author : " + author + " ," + "year : " + getYear() +" , " +"price : " + getPrice());
    }






}

