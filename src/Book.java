import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    private int publicationYear;

    public Book(String bookName, Author authorName, int publicationYear) {
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
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Название книги - " + bookName + "." + " Имя автора - " + authorName + "." + " Года публикации - " + publicationYear + ".";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publicationYear);
    }
}
