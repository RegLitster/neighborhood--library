package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedout;
    private String checkedOutTo;

    public Book() {
        this.id = 0;
        this.isbn = "";
        this.title = "";
        this.isCheckedout = false;
        this.checkedOutTo = "";
    }

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

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedout() {
        return isCheckedout;
    }

    public void setCheckedout(boolean checkedout) {
        isCheckedout = checkedout;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}
