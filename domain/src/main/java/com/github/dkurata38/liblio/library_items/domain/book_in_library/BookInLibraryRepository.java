package com.github.dkurata38.liblio.library_items.domain.book_in_library;

import java.util.Optional;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemId;
import com.github.dkurata38.liblio.library_items.domain.library_item.OwnerId;

public interface BookInLibraryRepository {
    /**
     *
     * @param ownerId 所有者
     * @return 指定した所有者が所有する蔵書・書籍情報の一覧
     */
    BooksInLibrary findByOwnerId(OwnerId ownerId);

    /**
     *
     * @param ownerId 所有者
     * @return 指定した所有者が公開している蔵書・書籍情報の一覧
     */
    BooksInLibrary findPublicByOwnerId(OwnerId ownerId);

    /**
     *
     * @param libraryItemId 蔵書
     * @return 指定した蔵書・書籍の情報
     */
    Optional<BookInLibrary> findByLibraryItemId(LibraryItemId libraryItemId);
}
