package com.github.dkurata38.liblio.library_items.use_case.library_items;

import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemId;

public interface OpenLibraryItemUseCase {
    void open(LibraryItemId libraryItemId);
}
