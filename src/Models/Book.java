package Models;

import java.math.BigDecimal;

public class Book {
    private String bookCode;
    private String bookName;
    private String author;
    private String category;
    private int pageCount;
    private String publisher;
    private int publishYear;
    private BigDecimal price;
    private int quantity;
	/**
	 * @return the bookCode
	 */
	public String getBookCode() {
		return bookCode;
	}
	/**
	 * @param bookCode the bookCode to set
	 */
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}
	/**
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the publishYear
	 */
	public int getPublishYear() {
		return publishYear;
	}
	/**
	 * @param publishYear the publishYear to set
	 */
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

    // Constructor, getters, setters
    
}
