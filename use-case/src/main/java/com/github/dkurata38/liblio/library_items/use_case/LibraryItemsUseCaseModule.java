package com.github.dkurata38.liblio.library_items.use_case;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.github.dkurata38.liblio.library_items.domain.book.BookFactory;
import com.github.dkurata38.liblio.library_items.domain.book.BookRepository;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemFactory;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemRepository;
import com.github.dkurata38.liblio.library_items.use_case.library_items.AddLibraryItemUseCase;
import com.github.dkurata38.liblio.library_items.use_case.library_items.AddLibraryItemUseCaseImpl;
import com.github.dkurata38.liblio.library_items.use_case.library_items.CloseLibraryItemUseCase;
import com.github.dkurata38.liblio.library_items.use_case.library_items.CloseLibraryItemUseCaseImpl;
import com.github.dkurata38.liblio.library_items.use_case.library_items.OpenLibraryItemUseCase;
import com.github.dkurata38.liblio.library_items.use_case.library_items.OpenLibraryItemUseCaseImpl;

@Configuration
public class LibraryItemsUseCaseModule {
    @Bean
    AddLibraryItemUseCase addLibraryItemUseCase(
        LibraryItemFactory libraryItemFactory,
        BookFactory bookFactory,
        BookRepository bookRepository
    ) {
        return new AddLibraryItemUseCaseImpl(libraryItemFactory, bookFactory, bookRepository);
    }

    @Bean
    OpenLibraryItemUseCase openLibraryItemUseCase(
        LibraryItemRepository libraryItemRepository
    ) {
        return new OpenLibraryItemUseCaseImpl(libraryItemRepository);
    }

    @Bean
    CloseLibraryItemUseCase closeLibraryItemUseCase(
        LibraryItemRepository libraryItemRepository
    ) {
        return new CloseLibraryItemUseCaseImpl(libraryItemRepository);
    }
}
