package com.github.dkurata38.liblio.library_items.domain.book;

/**
 * 書籍の形式
 */
public class Format {
    private String value;

    Format() {
    }

    public Format(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
