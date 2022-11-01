public class Main {
    public static void printSeparator() {
        String separator = ".................................";
        System.out.println(separator);
    }

    public static void main(String[] args) {
        Author firstAuthor = new Author("Джек", "Лондон");
        Book firstBook = new Book("Мартин Иден", firstAuthor, 1909);
        System.out.println(firstBook);
        printSeparator();
        Author secondAuthor = new Author("Джордж", "Оруэлл");
        Book secondBook = new Book("Дни в Бирме", secondAuthor, 1934);
        System.out.println(secondBook);
        printSeparator();
        Author thirdAuthor = new Author("Эрнест", "Хемингуэй");
        Book thirdBook = new Book("Острова в океане", secondAuthor, 2022);
        System.out.println(thirdBook);
        thirdBook.setPublicationYear(1970);
        System.out.println("Настоящий год публикации - " + thirdBook.getPublicationYear());
    }
}