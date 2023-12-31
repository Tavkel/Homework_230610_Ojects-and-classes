public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Ivan", "Ivanov");
        Author author2 = new Author("Maksim", "Maksimov");

        Book book1 = new Book("More zovet", author1, 1984);
        Book book2 = new Book("Is Finland real?", author2, 2022);
        Book book3 = new Book("Is Australia real?", author2, 2021);

        book2.setPublicationYear(1999);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(book1.equals(book2));
        Book book4 = new Book("More zovet", author1, 1984);
        System.out.println(book1.equals(book4));
    }
}