package Book;

public class Book {

    private int pages;
    private String autor;
    private String name;

    public Book() {
        this.autor = "Ivanov";
        this.pages = 100;
        this.name = "Book";
    }

    public Book(String name) {
        this.name = name;
        this.autor = "Ivanov";
        this.pages = 100;
    }

    public Book(int pages, String autor, String name) {
        this.pages = pages;
        this.autor = autor;
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " by " + autor + ", " + pages + " pages";
    }
}
