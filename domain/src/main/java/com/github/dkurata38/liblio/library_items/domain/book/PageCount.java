package com.github.dkurata38.liblio.library_items.domain.book;

/**
 * ページ数
 */
public class PageCount {
    private int value;

    @Deprecated
    public PageCount() {
    }

    public PageCount(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
