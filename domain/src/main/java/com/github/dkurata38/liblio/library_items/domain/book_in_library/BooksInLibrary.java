package com.github.dkurata38.liblio.library_items.domain.book_in_library;

import java.util.Iterator;

/**
 * 所蔵している書籍情報一覧
 */
public class BooksInLibrary implements Iterable<BookInLibrary> {
    Iterable<BookInLibrary> values;

    public BooksInLibrary(Iterable<BookInLibrary> values) {
        this.values = values;
    }

    @Override
    public Iterator<BookInLibrary> iterator() {
        return values.iterator();
    }
}
