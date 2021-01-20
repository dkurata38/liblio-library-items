package com.github.dkurata38.liblio.library_items.domain.book;

public interface BookFactory {
    /**
     * @param title       書名
     * @param author      著者
     * @param format      フォーマット
     * @param description 説明
     * @param publisher   出版社
     * @param publishedOn 出版日
     * @param language    言語
     * @param pageCount   ページ数
     * @param isbn13      ISBN
     * @return 作成した書籍情報
     */
    Book create(Title title, Author author, Format format, Description description, Publisher publisher,
                PublishedOn publishedOn, Language language, PageCount pageCount, Isbn13 isbn13);
}
