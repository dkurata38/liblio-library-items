package com.github.dkurata38.liblio.library_items.domain.book;

/**
 * ISBN13
 */
public class Isbn13 {
    private String value;

    Isbn13() {
    }

    public Isbn13(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
