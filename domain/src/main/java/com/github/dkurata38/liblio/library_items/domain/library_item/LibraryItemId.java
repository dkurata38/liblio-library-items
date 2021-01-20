package com.github.dkurata38.liblio.library_items.domain.library_item;

/**
 * 蔵書ID
 */
public class LibraryItemId {
    private String value;

    @Deprecated
    public LibraryItemId() {
    }

    public LibraryItemId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
