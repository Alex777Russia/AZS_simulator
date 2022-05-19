package com.company;

public class Column{
    boolean isBusy;

    public Column () {
        this.isBusy = false;
    }

    public Column createNewColumn() {
        return new Column();
    }

}
