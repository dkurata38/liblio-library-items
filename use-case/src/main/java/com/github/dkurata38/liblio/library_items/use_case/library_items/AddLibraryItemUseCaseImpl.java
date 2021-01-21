package com.github.dkurata38.liblio.library_items.use_case.library_items;

import java.util.Objects;
import java.util.Optional;
import com.github.dkurata38.liblio.library_items.domain.book.Author;
import com.github.dkurata38.liblio.library_items.domain.book.Book;
import com.github.dkurata38.liblio.library_items.domain.book.BookFactory;
import com.github.dkurata38.liblio.library_items.domain.book.BookId;
import com.github.dkurata38.liblio.library_items.domain.book.BookRepository;
import com.github.dkurata38.liblio.library_items.domain.book.Description;
import com.github.dkurata38.liblio.library_items.domain.book.Format;
import com.github.dkurata38.liblio.library_items.domain.book.Isbn13;
import com.github.dkurata38.liblio.library_items.domain.book.Language;
import com.github.dkurata38.liblio.library_items.domain.book.PageCount;
import com.github.dkurata38.liblio.library_items.domain.book.PublishedOn;
import com.github.dkurata38.liblio.library_items.domain.book.Publisher;
import com.github.dkurata38.liblio.library_items.domain.book.Title;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemFactory;
import com.github.dkurata38.liblio.library_items.domain.library_item.LibraryItemId;
import com.github.dkurata38.liblio.library_items.domain.library_item.OwnerId;
import com.github.dkurata38.liblio.library_items.domain.library_item.PublishScope;

public class AddLibraryItemUseCaseImpl implements AddLibraryItemUseCase {
    private final LibraryItemFactory libraryItemFactory;
    private final BookFactory bookFactory;
    private final BookRepository bookRepository;

    public AddLibraryItemUseCaseImpl(LibraryItemFactory libraryItemFactory, BookFactory bookFactory, BookRepository bookRepository) {
        this.libraryItemFactory = libraryItemFactory;
        this.bookFactory = bookFactory;
        this.bookRepository = bookRepository;
    }

    @Override
    public LibraryItemId addLibraryItem(OwnerId ownerId, BookId bookId, PublishScope publishScope) {
        Objects.requireNonNull(ownerId);
        Objects.requireNonNull(bookId);
        Objects.requireNonNull(publishScope);
        Book book = bookRepository.findByBookId(bookId).orElseThrow(RuntimeException::new);
        return libraryItemFactory.create(ownerId, book.getBookId(), publishScope).getLibraryItemId();
    }

    @Override
    public LibraryItemId addLibraryItem(OwnerId ownerId, Title title, Author author, Format format, Description description, Publisher publisher, PublishedOn publishedOn, Language language, PageCount pageCount, Isbn13 isbn13, PublishScope publishScope) {
        Optional<Book> maybeBook = bookRepository.findByIsbn(isbn13);
        Book book = maybeBook.orElseGet(() -> bookFactory.create(title, author, format, description, publisher, publishedOn, language, pageCount, isbn13));
        return libraryItemFactory.create(ownerId, book.getBookId(), publishScope).getLibraryItemId();
    }
}
