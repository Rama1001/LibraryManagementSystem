package com.library;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> books;

	public Library() {
		books = new ArrayList<>();
	}

	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added successfully.");
	}

	public void showAllBooks() {
		if (books.isEmpty()) {
			System.out.println("No books in the library.");
		} else {
			for (Book book : books) {
				System.out.println(book);
			}
		}
	}

	public void issueBook(int bookId) {
		for (Book book : books) {
			if (book.getId() == bookId) {
				if (!book.isIssued()) {
					book.issue();
					System.out.println("Book issued successfully.");
				} else {
					System.out.println("Book is already issued.");
				}
				return;
			}
		}
		System.out.println("Book not found.");
	}

	public void returnBook(int bookId) {
		for (Book book : books) {
			if (book.getId() == bookId) {
				if (book.isIssued()) {
					book.returnBook();
					System.out.println("Book returned successfully.");
				} else {
					System.out.println("Book was not issued.");
				}
				return;
			}
		}
		System.out.println("Book not found.");
	}
}
