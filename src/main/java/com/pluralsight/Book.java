package com.pluralsight;

import javax.xml.namespace.QName;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedout;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedout, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedout = isCheckedout;
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name){
        isCheckedout = true;
        checkedOutTo = name;
    }

    public void checkIn(){
        isCheckedout = false;
        checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedout() {
        return isCheckedout;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

}
