package com.example.courseworksocks.model;

public enum Size {
    S("38"),
            M("40"),
            L("42"),
            XL("46");

    private final String size;

    Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
