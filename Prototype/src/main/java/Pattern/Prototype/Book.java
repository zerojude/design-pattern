package Pattern.Prototype;

public class Book {

	private int BookId ;
	private String BookName ;
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getBookId() {
		return BookId;
	}
	public String getBookName() {
		return BookName;
	}
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", BookName=" + BookName + "]";
	}
		
	
}
