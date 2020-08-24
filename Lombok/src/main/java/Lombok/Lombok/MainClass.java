package Lombok.Lombok;

import Lombok.Lombok.Book;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("Nutuk", "Mustafa Kemal Atatürk", "Biyografi", 543);
		System.out.println(book.getBookName() + " " + book.getWriter() + " " + book.getDescription() + " "
				+ book.getNumberOfPage());
	}
}
