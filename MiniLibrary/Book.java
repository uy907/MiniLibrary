public class Book {
    private int id;
    private String title;
    private String author;
    private int pageCount;

    public Book(int id, String title, String author, int pageCount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author + " | Pages: " + pageCount;
    }
}
