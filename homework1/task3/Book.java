package homework1.task3;

public class Book {
    public static void main(String[] args) {
        Title name = new Title();
        Author avtor = new Author();
        Content con = new Content();

        name.setTitle("Называние  книги");
        avtor.setAuthor("Автор книги");
        con.setContent("Содержание книги ");

        name.show();
        avtor.show();
        con.show();
    }

}
