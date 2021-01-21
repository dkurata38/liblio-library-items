package com.github.dkurata38.liblio.library_items.domain.book;

public interface BookFactory {
    /**
     * @param title       書名 not {@code null}
     * @param author      著者 not {@code null}
     * @param format      フォーマット not {@code null}
     * @param description 説明 not {@code null}
     * @param publisher   出版社 maybe {@code null}
     * @param publishedOn 出版日 maybe {@code null}
     * @param language    言語 not {@code null}
     * @param pageCount   ページ数 not {@code null}
     * @param isbn13      ISBN maybe {@code null}
     * @return 作成した書籍情報
     */
    Book create(Title title, Author author, Format format, Description description, Publisher publisher,
                PublishedOn publishedOn, Language language, PageCount pageCount, Isbn13 isbn13);
}
