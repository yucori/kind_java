public class Book {
    protected String title;
    protected String author;
    protected String isbn;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void getBookInfo(){
        System.out.printf("Title: %s, Author: %s, ISBN: %s\n", title, author, isbn);
    }
}

class Ebook extends Book{
    protected String fileFormat;

    public Ebook(String title, String author, String isbn, String fileFormat) {
        super(title, author, isbn);// 부모클래스를 호출. 이미 초기화되어있는 것들.
        this.fileFormat = fileFormat; // eBook의 멤버변수이기 때문에 따로 초기화 해주어야 함.
    }

    @Override
     void getBookInfo(){
        System.out.printf("Title: %s, Author: %s, ISBN: %s, Format:%s\n", title, author, isbn, fileFormat);
    }
}