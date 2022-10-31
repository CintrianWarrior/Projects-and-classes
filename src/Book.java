public class Book {
    private String bookName;
    private Author authorName;
    private int publicationYear;

    public Book (String bookName, Author authorName, int publicationYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }
    public Author getAuthorName() {
        return this.authorName;
    }

    public int getPublicationYear() {
        return  this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
