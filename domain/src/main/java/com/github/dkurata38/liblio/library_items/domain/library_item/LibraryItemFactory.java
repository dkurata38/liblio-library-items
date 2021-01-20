package com.github.dkurata38.liblio.library_items.domain.library_item;

import com.github.dkurata38.liblio.library_items.domain.book.BookId;

public interface LibraryItemFactory {
    /**
     * 蔵書を保存する
     *
     * @param ownerId      所有者
     * @param bookId       書籍
     * @param publishScope 公開範囲
     * @return 保存した蔵書
     */
    LibraryItem create(OwnerId ownerId, BookId bookId, PublishScope publishScope);
}
