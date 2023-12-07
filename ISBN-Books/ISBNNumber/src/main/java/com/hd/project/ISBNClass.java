package com.hd.project;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;

import java.time.Instant;

public class ISBNClass {
    @JsonbProperty("ISBN_10")
    public String isbn10;
    @JsonbProperty("isbn_13")
    public  String isbn13;
    @JsonbTransient
    public Instant generationDate;

    @Override
    public String toString() {
        return "ISBNClass{" +
                "isbn10='" + isbn10 + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", generationDate=" + generationDate +
                '}';
    }
}
