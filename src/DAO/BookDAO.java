package DAO;

import Database.DatabaseConnection;
import Models.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public void addBook(Book book) {
        String query = "INSERT INTO Books (BookCode, BookName, Author, Category, PageCount, Publisher, PublishYear, Price, Quantity) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, book.getBookCode());
            stmt.setString(2, book.getBookName());
            stmt.setString(3, book.getAuthor());
            stmt.setString(4, book.getCategory());
            stmt.setInt(5, book.getPageCount());
            stmt.setString(6, book.getPublisher());
            stmt.setInt(7, book.getPublishYear());
            stmt.setBigDecimal(8, book.getPrice());
            stmt.setInt(9, book.getQuantity());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isBookCodeExists(String bookCode) {
        String query = "SELECT COUNT(*) FROM Books WHERE BookCode = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, bookCode);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Các phương thức khác như updateBook, deleteBook, getBookByCode, getAllBooks, v.v.
}
