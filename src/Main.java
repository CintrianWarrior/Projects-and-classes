public class Main {
    public static void printSeparator() {
        String separator = ".................................";
        System.out.println(separator);
    }
    public static void main(String[] args) {
        Author firstAuthor = new Author("Джек", "Лондон");
        Book firstBook = new Book("Мартин Иден", firstAuthor, 1909);
        System.out.println("Название книги - " + firstBook.getBookName());
        System.out.println("Имя автора - " + firstBook.getAuthorName().getFirstName() + " " + firstBook.getAuthorName().getSecondName());
        System.out.println("Год публикации - " + firstBook.getPublicationYear());
        printSeparator();
        Author secondAuthor = new Author("Джордж", "Оруэлл");
        Book secondBook = new Book("Дни в Бирме", secondAuthor, 1934);
        System.out.println("Название книги - " + secondBook.getBookName());
        System.out.println("Имя автора - " + secondBook.getAuthorName().getFirstName() + " " + secondBook.getAuthorName().getSecondName());
        System.out.println("Год публикации - " + secondBook.getPublicationYear());
        printSeparator();
        Author thirdAuthor = new Author("Эрнест", "Хемингуэй");
        Book thirdBook = new Book("Острова в океане", secondAuthor, 2022);
        System.out.println("Название книги - " + thirdBook.getBookName());
        System.out.println("Имя автора - " + thirdBook.getAuthorName().getFirstName() + " " + thirdBook.getAuthorName().getSecondName());
        System.out.println("Год публикации - " + thirdBook.getPublicationYear());
        thirdBook.setPublicationYear(1970);
        System.out.println("Настоящий год публикации - " + thirdBook.getPublicationYear());
    }
}