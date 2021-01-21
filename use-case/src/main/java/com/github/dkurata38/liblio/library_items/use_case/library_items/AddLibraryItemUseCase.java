package com.github.dkurata38.liblio.library_items.use_case.library_items;

import com.github.dkurata38.liblio.library_items.domain.book.Author;
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

public interface AddLibraryItemUseCase {
    /**
     *
     * @param ownerId 所有者 not {@code null}
     * @param bookId 書籍 not {@code null}
     * @param publishScope 公開範囲 not {@code null}
     * @return 蔵書
     */
    LibraryItemId addLibraryItem(OwnerId ownerId, BookId bookId, PublishScope publishScope);

    /**
     *
     * @param ownerId 所有者 not {@code null}
     * @param title 書名 not {@code null}
     * @param author 著者 not {@code null}
     * @param format 形式 not {@code null}
     * @param description 説明 not {@code null}
     * @param publisher 出版社 maybe {@code null}
     * @param publishedOn 出版日 maybe {@code null}
     * @param language 言語 not {@code null}
     * @param pageCount ページ数 not {@code null}
     * @param isbn13 ISBN maybe {@code null}
     * @param publishScope 公開範囲 not {@code null}
     * @return 蔵書
     */
    LibraryItemId addLibraryItem(OwnerId ownerId, Title title, Author author, Format format, Description description,
                                 Publisher publisher, PublishedOn publishedOn, Language language, PageCount pageCount,
                                 Isbn13 isbn13, PublishScope publishScope);
}
