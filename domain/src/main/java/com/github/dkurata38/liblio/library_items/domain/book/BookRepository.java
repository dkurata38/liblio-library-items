package com.github.dkurata38.liblio.library_items.domain.book;

import java.util.Optional;

public interface BookRepository {
    /**
     * IDをもとに書籍を検索する
     *
     * @param bookId 書籍ID
     * @return 書籍
     */
    Optional<Book> findByBookId(BookId bookId);

    /**
     * ISBNをもとに書籍を検索する
     *
     * @param isbn13 ISBN
     * @return 書籍
     */
    Optional<Book> findByIsbn(Isbn13 isbn13);
}
