public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Ebook ebook = new Ebook("The Great Gatsby", "F. Scott Fitzgerald", "1234567890", "PDF");

        book.getBookInfo();
        ebook.getBookInfo();
    }
}