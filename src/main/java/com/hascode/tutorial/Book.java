package com.hascode.tutorial;

import java.time.LocalDate;

public class Book {
	private String title;
	private LocalDate published;
	private Author author;

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public LocalDate getPublished() {
		return published;
	}

	public void setPublished(final LocalDate published) {
		this.published = published;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(final Author author) {
		this.author = author;
	}
}
