
package coulibrary.project;

public class Book {
    
    String isbn, title, author, dept;
    int copies;

    public Book(String isbn, String title, String author, String dept, int copies) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.dept = dept;
        this.copies = copies;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDept() {
        return dept;
    }

    public int getCopies() {
        return copies;
    }

    @Override
    public String toString() {


   return new String(isbn+ title  + author + dept + Integer.toString(copies) );
    
    }    
    
}
