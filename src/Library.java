public class Library {

    public String name;
    public static int totalBooks;

    public void addBooks(int numBooks){
       totalBooks+=numBooks;
        System.out.println(name + " added " + numBooks + " books.");

    }

    public static int getTotalBooks(){
        return totalBooks;
    }


}