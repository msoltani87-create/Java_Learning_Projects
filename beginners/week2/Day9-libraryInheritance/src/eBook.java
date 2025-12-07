public class eBook extends book{
    private int sizeInMB;


    public  eBook(String title, String author, int year,  int sizeInMB){
        super(title,author,year);
        this.sizeInMB=sizeInMB;
    }

    public int getSizeInMB() {
        return sizeInMB;
    }

    public void setSizeInMB(int sizeInMB) {
        if(sizeInMB >= 0)
            this.sizeInMB=sizeInMB;
        else
            System.out.println("size of file is not true");
    }

   @Override
    public  void printDetails(){
super.printDetails();
        System.out.println( "," + "size : "+ sizeInMB + "MB");

    }
}
