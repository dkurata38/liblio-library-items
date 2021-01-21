package com.github.dkurata38.liblio.library_items.use_case.library_items;

import java.util.Objects;
import java.util.Optional;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItem;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemId;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemRepository;

public class OpenLibraryItemUseCaseImpl implements OpenLibraryItemUseCase {
    private final LibraryItemRepository libraryItemRepository;

    public OpenLibraryItemUseCaseImpl(LibraryItemRepository libraryItemRepository) {
        this.libraryItemRepository = libraryItemRepository;
    }

    @Override
    public void open(LibraryItemId libraryItemId) {
        Objects.requireNonNull(libraryItemId);
        Optional<LibraryItem> maybeLibraryItem = libraryItemRepository.findById(libraryItemId);
        LibraryItem libraryItem = maybeLibraryItem
            .orElseThrow(RuntimeException::new)
            .open();
        libraryItemRepository.update(libraryItem);
    }
}
