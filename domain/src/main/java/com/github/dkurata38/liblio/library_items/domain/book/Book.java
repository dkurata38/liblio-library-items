package com.github.dkurata38.liblio.library_items.domain.book;

import java.util.Optional;

/**
 * 書籍
 */
public class Book {
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
    Book() {
    }

    /**
     * @param bookId      書籍ID not {@code null}
     * @param title       書名 not {@code null}
     * @param format      形式 not {@code null}
     * @param description 説明 not {@code null}
     * @param publisher   出版社 maybe {@code null}
     * @param publishedOn 出版日 maybe {@code null}
     * @param language    言語 not {@code null}
     * @param pageCount   ページ数 not {@code null}
     * @param isbn13      ISBN maybe {@code null}
     */
    public Book(BookId bookId, Title title, Format format, Description description, Publisher publisher,
                PublishedOn publishedOn, Language language, PageCount pageCount, Isbn13 isbn13) {
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

    /**
     * @return 書籍ID
     */
    public BookId getBookId() {
        return bookId;
    }

    /**
     * @return 書名
     */
    public Title getTitle() {
        return title;
    }

    /**
     * @return 形式
     */
    public Format getFormat() {
        return format;
    }

    /**
     * @return 説明
     */
    public Description getDescription() {
        return description;
    }

    /**
     * @return 出版社
     */
    public Optional<Publisher> getPublisher() {
        return Optional.ofNullable(publisher);
    }

    /**
     * @return 出版日
     */
    public Optional<PublishedOn> getPublishedOn() {
        return Optional.ofNullable(publishedOn);
    }

    /**
     * @return 言語
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * @return ページ数
     */
    public PageCount getPageCount() {
        return pageCount;
    }

    /**
     * @return ISBN
     */
    public Optional<Isbn13> getIsbn() {
        return Optional.ofNullable(isbn13);
    }
}
