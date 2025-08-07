package com.library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Library library = new Library();

		while (true) {
			System.out.println("=== Library Menu ===");
			System.out.println("1. Add Book");
			System.out.println("2. View All Books");
			System.out.println("3. Issue Book");
			System.out.println("4. Return Book");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Book ID: ");
				int id = sc.nextInt();
				sc.nextLine(); // consume newline
				System.out.print("Enter Title: ");
				String title = sc.nextLine();
				System.out.print("Enter Author: ");
				String author = sc.nextLine();
				Book book = new Book(id, title, author);
				library.addBook(book);
				break;

			case 2:
				library.showAllBooks();
				break;

			case 3:
				System.out.print("Enter Book ID to Issue: ");
				int issueId = sc.nextInt();
				library.issueBook(issueId);
				break;

			case 4:
				System.out.print("Enter Book ID to Return: ");
				int returnId = sc.nextInt();
				library.returnBook(returnId);
				break;

			case 5:
				System.out.println("Exiting Library System...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}

}
