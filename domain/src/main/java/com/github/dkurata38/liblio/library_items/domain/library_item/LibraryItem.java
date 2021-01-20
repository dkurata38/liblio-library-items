package com.github.dkurata38.liblio.library_items.domain.library_item;

import com.github.dkurata38.liblio.library_items.domain.book.BookId;

/**
 * 蔵書
 */
public class LibraryItem {
    private LibraryItemId libraryItemId;
    private OwnerId ownerId;
    private BookId bookId;
    private PublishScope publishScope;

    @Deprecated
    LibraryItem() {
    }

    /**
     * @param libraryItemId 蔵書ID
     * @param ownerId       所有者
     * @param bookId        書籍
     * @param publishScope  公開範囲
     */
    public LibraryItem(LibraryItemId libraryItemId, OwnerId ownerId, BookId bookId, PublishScope publishScope) {
        this.libraryItemId = libraryItemId;
        this.ownerId = ownerId;
        this.bookId = bookId;
        this.publishScope = publishScope;
    }

    public LibraryItemId getLibraryItemId() {
        return libraryItemId;
    }

    public OwnerId getOwnerId() {
        return ownerId;
    }

    public BookId getBookId() {
        return bookId;
    }

    /**
     * 蔵書を公開する
     *
     * @return 公開後の蔵書
     */
    public LibraryItem open() {
        return new LibraryItem(libraryItemId, ownerId, bookId, PublishScope.OPENED);
    }

    /**
     * 叢書を非公開にする
     *
     * @return 非公開後の蔵書
     */
    public LibraryItem close() {
        return new LibraryItem(libraryItemId, ownerId, bookId, PublishScope.CLOSED);
    }

    /**
     * @return 公開中ならtrue
     */
    public boolean isOpened() {
        return publishScope == PublishScope.OPENED;
    }

    /**
     * @return 非公開ならtrue
     */
    public boolean isClosed() {
        return publishScope == PublishScope.CLOSED;
    }
}
