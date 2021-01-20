package com.github.dkurata38.liblio.library_items.domain.book;

/**
 * 出版社
 */
public class Publisher {
    private String name;

    @Deprecated
    Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    /**
     *
     * @return 出版社名
     */
    public String getName() {
        return name;
    }
}
