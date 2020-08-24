package Lombok.Lombok;

public class Book {

	private String bookName;
	private String writer;
	private String description;
	private int numberOfPage;
	
	public Book(String bookName, String writer, String description, int numberOfPage) {
		super();
		this.bookName = bookName;
		this.writer = writer;
		this.description = description;
		this.numberOfPage = numberOfPage;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}
	
	
	
	
}
