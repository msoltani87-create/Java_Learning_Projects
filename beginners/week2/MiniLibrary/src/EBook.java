public class EBook extends  Book{


    private  int sizeInMB;

    public EBook(String title, String author , int year, int sizeInMB) {
        super(title, author, year);
        this.sizeInMB=sizeInMB;
    }
    public int getSizeInMB() {
        return sizeInMB;
    }

    public void setSizeInMB(int sizeInMB) {
        if(sizeInMB >= 0)
            this.sizeInMB=sizeInMB;
        else
            System.err.println("size of file is not true");
    }

    @Override
    public  void printDetails(){

        System.out.println("EBook->"+ "title: "+title + ", author: " +author + ", year: "+ year + ", sizeInMB: " +sizeInMB +"MB");

    }

}
