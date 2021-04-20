package com.exempel.fridalabb2;

public class Friend extends Person{

    private String becameFriends;
    private String pets;
    private String favoriteMusic;
    private String spareTime;

    public Friend(String name, String age, String telephoneNumber, String becameFriends, String pets,
                  String favoriteMusic, String spareTime) {
        super(name, age, telephoneNumber);
        this.becameFriends = becameFriends;
        this.pets = pets;
        this.favoriteMusic = favoriteMusic;
        this.spareTime = spareTime;
    }

    public String getBecameFriends() {
        return becameFriends;
    }
    public String getPets() {
        return pets;
    }
    public String getFavoriteMusic() {
        return favoriteMusic;
    }
    public String getSpareTime(){
        return spareTime;
    }

}
