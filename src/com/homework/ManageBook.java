package com.homework;

import java.util.Scanner;

public class ManageBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sách nè (bé hơn 9 thôi chứ lớn hơn chưa làm được): ");
        int num = sc.nextInt();

        Book book1 = new Book();
        Science science1 = new Science();
        Novel novel1 = new Novel();
        Book book2 = new Book();
        Science science2 = new Science();
        Novel novel2 = new Novel();
        Book book3 = new Book();
        Science science3 = new Science();
        Novel novel3 = new Novel();
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
        for (int i = 0; i < bookList.length; i++) {
            bookList[i] = bookStore[i];
        }
    }


}
