package com.github.dkurata38.liblio.library_items.domain.book;

/**
 * 書籍の説明
 */
public class Description {
    private String value;

    @Deprecated
    Description() {
    }

    public Description(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
