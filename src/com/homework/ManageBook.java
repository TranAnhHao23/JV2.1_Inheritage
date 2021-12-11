package com.homework;

import java.util.Scanner;

public class ManageBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sách nè (bé hơn 9 thôi chứ lớn hơn chưa làm được): ");
        int num = sc.nextInt();
        sc.nextLine();

        Book book1 = new Book("Quyển 1", 10000, 1, "19/03/2020");
        Science science1 = new Science("Học ăn", 25000, 4, "22/03/2020", "ăn");
        Novel novel1 = new Novel("Harry", 40000, 7, "25/03/2020", "JK Rolling");
        Book book2 = new Book("Quyển 2", 15000, 2, "20/03/2020");
        Science science2 = new Science("Học nói", 30000, 5, "23/03/2020", "nói");
        Novel novel2 = new Novel("Sherlock", 45000, 8, "26/03/2020", "Conan Doyle");
        Book book3 = new Book("Quyển 3", 20000, 3, "21/03/2020");
        Science science3 = new Science("Học gói", 35000, 6, "24/03/2020", "gói");
        Novel novel3 = new Novel("Inferno", 50000, 9, "27/03/2020", "Dan Brown");
        Book[] bookStore = new Book[9];
        bookStore[0] = book1;
        bookStore[1] = science1;
        bookStore[2] = novel1;
        bookStore[3] = book2;
        bookStore[4] = science2;
        bookStore[5] = novel2;
        bookStore[6] = book3;
        bookStore[7] = science3;
        bookStore[8] = novel3;


        Book[] bookList = new Book[num];
        System.arraycopy(bookStore, 0, bookList, 0, bookList.length);
        // Tương đương với fori chuyển sang mảng khác

        // In ra danh sách sách
        bookList(bookList);

        // In ra tổng giá trị sách
        System.out.println("Tổng giá trị sách = " + totalPrice(bookList));

        // In ra quyển sách có giá trị đắt nhất
        maxPriceBook(bookList);

        // In ra quyển sách có giá trị thấp nhất
        minPriceBook(bookList);

        // Tìm sách theo thể loại nhập từ bàn phím
        findType(sc, bookList);

        // Tìm sách theo tác giả nhập từ bàn phím
        findAuthor(sc, bookList);

        // Giá trung bình của sách khoa học
        System.out.println("Giá trị trung bình của các sách khoa học = " + averagePriceScienceBook(bookList));
        ;


        // Nâng cao 1 : đã làm ở trên: trả về sách có tác giả theo scanner
        // Nâng cao 2: sách trong khoảng giá
        Book[] bookPrice = searchBookPrice(sc, bookList);
        for (int i = 0; i < bookPrice.length; i++) {
            System.out.println(bookPrice[i]);
        }

        // Nâng cao 3: trả về tất cả sách khoa học
        System.out.println("In ra sách khoa học");
        Book[] scienceBook = bookScience(bookList);
        for (int i = 0; i < scienceBook.length; i++) {
            System.out.println(scienceBook[i]);
        }

        // Nâng cao 4: trả về tất cả sách tiểu thuyết
        System.out.println("In ra sách tiểu thuyết");
        Book[] novelBook = bookNovel(bookList);
        for (int i = 0; i < novelBook.length; i++) {
            System.out.println(novelBook[i]);
        }

        // Nâng cao 5: trả về tất cả sách có giá tiền được nhập từ bàn phím
        Book[] bookPriceList = findPrice(sc, bookList);
        if (bookPriceList.length == 0){
            System.out.println("Không có sách nào giá như thế");
        }else {
            for (int i = 0; i < bookPriceList.length; i++) {
                System.out.println(bookPriceList[i]);
            }
        }

    }

    private static Book[] findPrice(Scanner sc, Book[] bookList) {
        System.out.println("Nhập tiền vào đây: ");
        double price = sc.nextDouble();
        int count = 0;
        int c = 0;

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i].getPrice() == price) {
                count++;
            }
        }
        Book[] bookPrice = new Book[count];
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i].getPrice() == price) {
                bookPrice[c] = bookList[i];
                c++;
            }
        }
        return bookPrice;
    }

    private static Book[] bookNovel(Book[] bookList) {
        int count = 0;
        int c = 0;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] instanceof Science) {
                count++;
            }
        }
        Book[] novelBooks = new Book[count];
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] instanceof Novel) {
                novelBooks[c] = bookList[i];
                c++;
            }
        }
        return novelBooks;
    }

    private static Book[] bookScience(Book[] bookList) {
        int count = 0;
        int c = 0;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] instanceof Science) {
                count++;
            }
        }
        Book[] scienceBooks = new Book[count];
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] instanceof Science) {
                scienceBooks[c] = bookList[i];
                c++;
            }
        }
        return scienceBooks;
    }

    private static Book[] searchBookPrice(Scanner sc, Book[] bookList) {
        System.out.println("Khoảng giá từ giá: ");
        double lowestPrice = sc.nextDouble();
        System.out.println("đến giá: ");
        double highestPrice = sc.nextDouble();
        int count = 0;
        int c = 0;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i].getPrice() >= lowestPrice && bookList[i].getPrice() <= highestPrice) {
                count++;
            }
        }
        Book[] newBook = new Book[count];
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i].getPrice() >= lowestPrice && bookList[i].getPrice() <= highestPrice) {
                newBook[c] = bookList[i];
                c++;
            }
        }
        return newBook;
    }

    private static double averagePriceScienceBook(Book[] bookList) {
        double sum = 0;
        double count = 0;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] instanceof Science) {
                sum += bookList[i].getPrice();
                count++;
            }
        }
        return (sum / count);
    }

    private static void findAuthor(Scanner sc, Book[] bookList) {
        System.out.println("Nhập tác giả sách (trong sách tiểu thuyết): ");
        String author = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] instanceof Novel) {
                Novel novel = (Novel) bookList[i];
                if (novel.getAuthor().equals(author)) {
                    System.out.println("Thông tin sách có tác giả " + author);
                    System.out.println(bookList[i]);
                    check = true;
                }
            }
        }
        if (!check) {
            System.out.println("Không có rồi");
        }
    }

    private static void findType(Scanner sc, Book[] bookList) {
        System.out.println("Nhập thể loại sách (trong sách khoa học): ");
        String type = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] instanceof Science) {
                Science science = (Science) bookList[i];
                if (science.getType().equals(type)) {
                    System.out.println("Thông tin sách có thể loại " + type);
                    System.out.println(bookList[i]);
                    check = true;
                }
            }
        }
        if (!check) {
            System.out.println("Không có rồi");
        }
    }

    private static void minPriceBook(Book[] bookList) {
        double minPrice = bookList[0].getPrice();
        for (int i = 0; i < bookList.length; i++) {
            if (minPrice > bookList[i].getPrice()) {
                minPrice = bookList[i].getPrice();
            }
        }
        for (int i = 0; i < bookList.length; i++) {
            if (minPrice == bookList[i].getPrice()) {
                System.out.println("Sách có giá cao nhất = " + minPrice);
                System.out.println(bookList[i]);
            }
        }
    }

    private static void maxPriceBook(Book[] bookList) {
        double maxPrice = bookList[0].getPrice();
        for (int i = 0; i < bookList.length; i++) {
            if (maxPrice < bookList[i].getPrice()) {
                maxPrice = bookList[i].getPrice();
            }
        }
        for (int i = 0; i < bookList.length; i++) {
            if (maxPrice == bookList[i].getPrice()) {
                System.out.println("Sách có giá cao nhất = " + maxPrice);
                System.out.println(bookList[i]);
            }
        }
    }

    private static double totalPrice(Book[] bookList) {
        double sum = 0;
        for (int i = 0; i < bookList.length; i++) {
            sum += bookList[i].getPrice();
        }
        return sum;
    }

    private static void bookList(Book[] bookList) {
        for (int i = 0; i < bookList.length; i++) {
            System.out.println(i + 1 + ". " + bookList[i]);
        }
    }


}
