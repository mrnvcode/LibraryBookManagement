import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add 20 more real books to the library
        library.addBook(new Book("1984", "George Orwell", 1949, 8.99, "Dystopian Fiction"));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", 1813, 7.99, "Romance"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99, "Fiction"));
        library.addBook(new Book("Moby Dick", "Herman Melville", 1851, 12.99, "Adventure"));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 6.99, "Coming-of-age Fiction"));
        library.addBook(new Book("War and Peace", "Leo Tolstoy", 1869, 11.99, "Historical Fiction"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 1937, 9.99, "Fantasy"));
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, 19.99, "Fantasy"));
        library.addBook(new Book("Jane Eyre", "Charlotte Brontë", 1847, 8.99, "Gothic Fiction"));
        library.addBook(new Book("The Odyssey", "Homer", 1800, 8.99, "Epic Poetry"));
        library.addBook(new Book("Frankenstein", "Mary Shelley", 1818, 7.99, "Gothic Fiction"));
        library.addBook(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 1967, 10.99, "Magical Realism"));
        library.addBook(new Book("The Divine Comedy", "Dante Alighieri", 1320, 9.99, "Epic Poetry"));
        library.addBook(new Book("Brave New World", "Aldous Huxley", 1932, 8.99, "Dystopian Fiction"));
        library.addBook(new Book("The Alchemist", "Paulo Coelho", 1988, 7.99, "Fiction"));
        library.addBook(new Book("The Adventures of Huckleberry Finn", "Mark Twain", 1884, 7.99, "Adventure"));
        library.addBook(new Book("Crime and Punishment", "Fyodor Dostoevsky", 1866, 9.99, "Psychological Fiction"));
        library.addBook(new Book("The Picture of Dorian Gray", "Oscar Wilde", 1890, 6.99, "Gothic Fiction"));
        library.addBook(new Book("Wuthering Heights", "Emily Brontë", 1847, 7.99, "Gothic Fiction"));
        library.addBook(new Book("The Adventures of Sherlock Holmes", "Arthur Conan Doyle", 1892, 8.99, "Mystery"));
        library.addBook(new Book("The Chronicles of Narnia", "C.S. Lewis", 1950, 14.99, "Fantasy"));

        // Perform searches
        List<Book> booksByAuthor = library.searchByAuthor("J.K. Rowling");
        List<Book> booksByYear = library.searchByYear(1890);
        List<Book> booksByTitle = library.searchByTitle("Hamlet");
        List<Book> booksByGenre = library.searchByGenre("Fantasy");

        // Perform aggregation operations
        double averagePrice = library.averageBookPrice();
        Book mostExpensive = library.mostExpensiveBook();
        Book cheapest = library.cheapestBook();
        Book oldest = library.oldestBook();
        List<Book> recentBooks = library.recentBooks(5);

        // Print sorted books
        System.out.println("Books sorted by title:");
        printBooks(library.sortBooksByTitle());

        System.out.println("Books sorted by author:");
        printBooks(library.sortBooksByAuthor());

        System.out.println("Books sorted by publication year:");
        printBooks(library.sortBooksByPublicationYear());

        // Perform advanced queries
        String authorWithMostBooks = library.authorWithMostBooks();
        String mostPopularGenre = library.mostPopularGenre();
        int yearWithMostPublishedBooks = library.yearWithMostPublishedBooks();

        // Print the results with borders
        printBorder();
        System.out.println("Books by author: " + booksByAuthor);
        printBorder();
        System.out.println("Books by year: " + booksByYear);
        printBorder();
        System.out.println("Books by title: " + booksByTitle);
        printBorder();
        System.out.println("Books by genre: " + booksByGenre);
        printBorder();
        System.out.println("Average book price: $" + String.format("%.2f", averagePrice));
        printBorder();
        System.out.println("Most expensive book: " + mostExpensive);
        printBorder();
        System.out.println("Cheapest book: " + cheapest);
        printBorder();
        System.out.println("Oldest book: " + oldest);
        printBorder();
        System.out.println("Recent books: " + recentBooks);
        printBorder();
        System.out.println("Author with most books: " + authorWithMostBooks);
        printBorder();
        System.out.println("Most popular genre: " + mostPopularGenre);
        printBorder();
        System.out.println("Year with most published books: " + yearWithMostPublishedBooks);
        printBorder();
    }

    // Utility method to print books in a formatted manner
    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
        printBorder();
    }

    // Utility method to print a border
    private static void printBorder() {
        System.out.println("--------------------------------------");
    }
}