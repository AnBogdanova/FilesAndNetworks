public class Book {
    private final String name;
    private final String author;
    private final int pagesCount;
    private final int icbn;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getIcbn() {
        return icbn;
    }

    public Book(String name, String author, int pagesCount, int icbn) {
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
        this.icbn = icbn;
    }


}
