package Book;

public class TestBook {
    public static void main(String[] args) {

        Book book1 = new Book();
        System.out.println(book1.toString());

        Book book2 = new Book("Revisor");
        book2.setAutor("Gogol");
        book2.setPages(192);
        System.out.println(book2.toString());

        Book book3 = new Book(1000, "Tolstoy", "Detstvo");
        System.out.println("Book: " + book3.getName() + " by " + book3.getAutor() + ", pages: " + book3.getPages());
    }
}
