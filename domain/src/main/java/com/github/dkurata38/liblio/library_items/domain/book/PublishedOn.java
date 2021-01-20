package com.github.dkurata38.liblio.library_items.domain.book;

import java.time.LocalDate;

/**
 * 出版日
 */
public class PublishedOn {
    private LocalDate value;

    @Deprecated
    PublishedOn() {
    }

    public PublishedOn(LocalDate value) {
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }
}
