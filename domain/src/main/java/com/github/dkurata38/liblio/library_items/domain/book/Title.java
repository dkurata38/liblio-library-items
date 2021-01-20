package com.github.dkurata38.liblio.library_items.domain.book;

/**
 * 書名
 */
public class Title {
    private String value;

    @Deprecated
    Title() {
    }

    public Title(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
