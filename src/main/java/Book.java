public class Book implements Comparable<Book>{

    private String title;
    private String author;
    private int pages;

    //region getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
    //endregion

    public Book(BookBuilder bookBuilder){
        this.title = bookBuilder.title;
        this.author = bookBuilder.author;
        this.pages = bookBuilder.pages;
    }

    @Override
    public int compareTo(Book o) {
        if (!this.title.equals(o.title))
            return (int)this.title.charAt(0) - (int)o.title.charAt(0);
        if (this.author == null | o.author == null)
            return (this.author == null ? 0 : 1) - (o.author == null ? 0 : 1);
        else if (!this.author.equals(o.author))
            return (int) this.author.charAt(0) - (int)o.author.charAt(0);
        return this.pages - o.pages;
    }

    @Override
    public String toString() {
        return "\n" + "Book{" +
                "title = " + title  +
                ", author = " + author +
                ", pages = " + pages +
                '}';
    }

    public static class BookBuilder{

        private String title;
        private String author;
        private int pages;

        public BookBuilder(String title){
            this.title = title;
        }

        public BookBuilder setAuthor(String author){
            this.author = author;
            return this;
        }

        public BookBuilder setPages(int pages){
            this.pages = pages;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
