package com.hd.project;

import jakarta.json.bind.annotation.JsonbProperty;

import java.time.Instant;

public class Books {
    public String title;
    public String author;
    public String genre;
    public int yearOfPublication;
    @JsonbProperty("isbn_13")
    public  String isbn13;
public Instant creationDate;

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", isbn13='" + isbn13 + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
