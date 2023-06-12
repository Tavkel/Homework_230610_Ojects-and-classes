import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    //region getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    //endregion

    //region setters
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    //endregion

    //region methods
    @Override
    public String toString() {
        return String.format("Название: %s\nАвтор: %s\nГод издания: %s", this.name, this.author, this.publicationYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }
    //endregion
}
