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
}
