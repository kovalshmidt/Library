package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


/**
 *
 */
@Getter
@Setter
@AllArgsConstructor
public class Book {

    private String author;
    private String name;
    private String genre;
    private String edition;
    private int year;
}
