package com.github.dkurata38.liblio.library_items.domain.book;

/**
 * 言語
 */
public class Language {
    private String value;

    @Deprecated
    Language() {
    }

    public Language(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
