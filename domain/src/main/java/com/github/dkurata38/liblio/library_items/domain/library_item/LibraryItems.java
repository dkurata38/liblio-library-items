package com.github.dkurata38.liblio.library_items.domain.library_item;

import java.util.Iterator;

/**
 * 蔵書一覧
 */
public class LibraryItems implements Iterable<LibraryItem> {
    private Iterable<LibraryItem> values;

    public LibraryItems(Iterable<LibraryItem> values) {
        this.values = values;
    }

    @Override
    public Iterator<LibraryItem> iterator() {
        return values.iterator();
    }
}
