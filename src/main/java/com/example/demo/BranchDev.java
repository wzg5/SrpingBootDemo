package com.example.demo;

/**
 * Created by zhaoxuan
 * 2018/7/18 10:54
 */
public class BranchDev {
    private String id;
    private String name;

    public BranchDev(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
