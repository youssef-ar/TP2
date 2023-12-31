public abstract class Book {
    private String Title;
    private String Author;
    private int YearOfPublication;
    public String getTitle() {
        return Title;
    }
    public String getAuthor() {
        return Author;
    }
    public int getYearOfPublication() {
        return YearOfPublication;
    }
    public abstract void displayInformation();
    public void setTitle(String T) {
        Title=T;
    }
    public void setAuthor(String A) {
        Author=A;
    }
    public void setYearOfPublication(int Y) {
        YearOfPublication=Y;
    }
}
