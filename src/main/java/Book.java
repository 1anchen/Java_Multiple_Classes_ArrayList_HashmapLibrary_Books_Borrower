public class Book {

    private String bookname;
    private String genre;

    public Book(String name, String genre){

      this.bookname = new String(name);
      this.genre = new String(genre);
    }

    public String checkBookName(){

        return this.bookname;
    }

    public String checkGenreType(){
        return this.genre;
    }
}
