package com.github.dkurata38.liblio.library_items.domain.library_item;

import java.util.Optional;

public interface LibraryItemRepository {
    /**
     * 蔵書を検索する
     * @param ownerId 所有者
     * @return 指定した所有者の蔵書一覧
     */
    LibraryItems findByOwnerId(OwnerId ownerId);

    /**
     * 蔵書を検索する
     * @param id 蔵書ID
     * @return 蔵書
     */
    Optional<LibraryItem> findById(LibraryItemId id);

    /**
     * 蔵書を更新する
     * @param libraryItem 蔵書
     */
    void update(LibraryItem libraryItem);
}
