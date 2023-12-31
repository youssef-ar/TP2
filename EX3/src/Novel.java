public class Novel extends Book {
    public void displayInformation() {
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear of Publication: " + getYearOfPublication());
    }
}
