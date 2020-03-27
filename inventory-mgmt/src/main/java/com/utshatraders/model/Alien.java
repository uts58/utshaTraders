package com.utshatraders.model;

public class Alien {
    private String aid, aname;

    public Alien(String aid, String aname) {
        this.aid = aid;
        this.aname = aname;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid='" + aid + '\'' +
                ", aname='" + aname + '\'' +
                '}';
    }
}
