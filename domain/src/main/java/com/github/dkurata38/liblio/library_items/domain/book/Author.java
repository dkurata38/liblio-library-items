package com.github.dkurata38.liblio.library_items.domain.book;

/**
 * 著者
 */
public class Author {
    private String name;

    @Deprecated
    Author() {
    }

    /**
     * @param name 著者名 not {@code null}
     */
    public Author(String name) {
        this.name = name;
    }

    /**
     * 著者名
     */
    public String getName() {
        return name;
    }
}
