package Lombok.Lombok;

import lombok.*;


@AllArgsConstructor
@Data

public class Book {

	 private String bookName;
	 private String writer;
	 @NonNull private String description;
	 private int numberOfPage;
	
}