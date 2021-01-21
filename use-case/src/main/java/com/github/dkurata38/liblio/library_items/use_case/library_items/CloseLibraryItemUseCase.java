package com.github.dkurata38.liblio.library_items.use_case.library_items;

import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemId;

public interface CloseLibraryItemUseCase {
    /**
     * 指定した蔵書を非公開にする
     * @param libraryItemId 蔵書ID
     */
    void close(LibraryItemId libraryItemId);
}
