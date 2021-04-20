package com.exempel.fridalabb2;

import java.util.ArrayList;
public class FriendList {

    private ArrayList<Friend> myFriends;
    private ArrayList<Friend> myFavoriteFriends;

    public FriendList() {
        this.myFriends = new ArrayList<>();
        this.myFavoriteFriends = new ArrayList<>();
    }

    public boolean addNewFriend(Friend friend) {
        if (findFriend(friend.getName()) >= 0) {
            System.out.println("Friend already saved");
            return false;
        }
        myFriends.add(friend);
        return true;
    }

    private int findFriend(String friendName) {
        for (int i = 0; i < this.myFriends.size(); i++) {
            Friend friend = this.myFriends.get(i);
            if (friend.getName().equals(friendName)) {
                return i;

            }
        }
        return -1;
    }

    public boolean onList(String serchFriendName) {
        int position = findFriend(serchFriendName);
        if (position >= 0) {
            return true;
        }
        return false;
    }

    public void printFriends(){
        System.out.println("My friends -->");
        for (int i = 0; i < myFriends.size(); i++) {
            System.out.println((i + 1) + "." + this.myFriends.get(i).getName() +
                    ":" + "\n\tMobile number: " + this.myFriends.get(i).getTelephoneNumber() +
                    "\n\tAge: " + this.myFriends.get(i).getAge() +
                    "\n\tBecame friends: " + this.myFriends.get(i).getBecameFriends() +
                    "\n\tPets: " + this.myFriends.get(i).getPets() +
                    "\n\tFavorite music: " + this.myFriends.get(i).getFavoriteMusic() +
                    "\n\tSpare time activity: " + this.myFriends.get(i).getSpareTime());

        }

    }
    public void addToFavorite(String favoriteName){
        for (int i = 0; i < this.myFriends.size(); i++) {
            Friend newFavoriteFriend = this.myFriends.get(i);

            if(newFavoriteFriend.getName().equals(favoriteName)) {
                myFavoriteFriends.add(newFavoriteFriend);
                System.out.println("Friend "
                        + newFavoriteFriend.getName()
                        + " added in favorites");
            }

        }
    }

    public void printFavoriteFriend(){
        System.out.println("My favorite friends -->");
        for(int i = 0; i < myFavoriteFriends.size(); i++){
            System.out.println((i + 1) + "." + this.myFavoriteFriends.get(i).getName() +
                    ":" + "\n\tMobile number: " + this.myFavoriteFriends.get(i).getTelephoneNumber() +
                    "\n\tAge: " + this.myFavoriteFriends.get(i).getAge() +
                    "\n\tBecame friends: " + this.myFavoriteFriends.get(i).getBecameFriends() +
                    "\n\tPets: " + this.myFavoriteFriends.get(i).getPets() +
                    "\n\tFavorite music: " + this.myFavoriteFriends.get(i).getFavoriteMusic() +
                    "\n\tSpare time activity: " + this.myFavoriteFriends.get(i).getSpareTime());
            }

        }
    }
