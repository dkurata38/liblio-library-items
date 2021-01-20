package com.github.dkurata38.liblio.library_items.domain.book;

/**
 * 書籍ID
 */
public class BookId {
    private String value;

    @Deprecated
    BookId() {
    }

    public BookId(String value) {
        this.value = value;
    }
}
