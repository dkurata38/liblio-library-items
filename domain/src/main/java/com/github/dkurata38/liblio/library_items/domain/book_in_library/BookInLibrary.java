package com.github.dkurata38.liblio.library_items.domain.book_in_library;

import com.github.dkurata38.liblio.library_items.domain.book.BookId;
import com.github.dkurata38.liblio.library_items.domain.book.Description;
import com.github.dkurata38.liblio.library_items.domain.book.Format;
import com.github.dkurata38.liblio.library_items.domain.book.Isbn13;
import com.github.dkurata38.liblio.library_items.domain.book.Language;
import com.github.dkurata38.liblio.library_items.domain.book.PageCount;
import com.github.dkurata38.liblio.library_items.domain.book.PublishedOn;
import com.github.dkurata38.liblio.library_items.domain.book.Publisher;
import com.github.dkurata38.liblio.library_items.domain.book.Title;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemId;
import com.github.dkurata38.liblio.library_items.domain.library_item.OwnerId;
import com.github.dkurata38.liblio.library_items.domain.library_item.PublishScope;

/**
 * 図書館にある本
 */
public class BookInLibrary {
    private LibraryItemId libraryItemId;
    private OwnerId ownerId;
    private PublishScope publishScope;
    private BookId bookId;
    private Title title;
    private Format format;
    private Description description;
    private Publisher publisher;
    private PublishedOn publishedOn;
    private Language language;
    private PageCount pageCount;
    private Isbn13 isbn13;

    @Deprecated
    public BookInLibrary() {
    }

    public BookInLibrary(LibraryItemId libraryItemId, OwnerId ownerId, PublishScope publishScope, BookId bookId,
                         Title title, Format format, Description description, Publisher publisher,
                         PublishedOn publishedOn, Language language, PageCount pageCount, Isbn13 isbn13) {
        this.libraryItemId = libraryItemId;
        this.ownerId = ownerId;
        this.publishScope = publishScope;
        this.bookId = bookId;
        this.title = title;
        this.format = format;
        this.description = description;
        this.publisher = publisher;
        this.publishedOn = publishedOn;
        this.language = language;
        this.pageCount = pageCount;
        this.isbn13 = isbn13;
    }

    public LibraryItemId getLibraryItemId() {
        return libraryItemId;
    }

    public OwnerId getOwnerId() {
        return ownerId;
    }

    public PublishScope getPublishScope() {
        return publishScope;
    }

    public BookId getBookId() {
        return bookId;
    }

    public Title getTitle() {
        return title;
    }

    public Format getFormat() {
        return format;
    }

    public Description getDescription() {
        return description;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public PublishedOn getPublishedOn() {
        return publishedOn;
    }

    public Language getLanguage() {
        return language;
    }

    public PageCount getPageCount() {
        return pageCount;
    }

    public Isbn13 getIsbn13() {
        return isbn13;
    }
}
