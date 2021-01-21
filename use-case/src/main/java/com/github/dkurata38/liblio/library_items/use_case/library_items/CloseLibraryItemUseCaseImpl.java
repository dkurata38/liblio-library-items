package com.github.dkurata38.liblio.library_items.use_case.library_items;

import java.util.Objects;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItem;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemId;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemRepository;

public class CloseLibraryItemUseCaseImpl implements CloseLibraryItemUseCase {
    private final LibraryItemRepository libraryItemRepository;

    public CloseLibraryItemUseCaseImpl(LibraryItemRepository libraryItemRepository) {
        this.libraryItemRepository = libraryItemRepository;
    }

    @Override
    public void close(LibraryItemId libraryItemId) {
        Objects.requireNonNull(libraryItemId);
        LibraryItem libraryItem = libraryItemRepository.findById(libraryItemId)
            .orElseThrow(RuntimeException::new)
            .close();
        libraryItemRepository.update(libraryItem);
    }
}
