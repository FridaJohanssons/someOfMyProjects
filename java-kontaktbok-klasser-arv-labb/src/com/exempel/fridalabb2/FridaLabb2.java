package com.exempel.fridalabb2;

import java.util.Scanner;
public class FridaLabb2 {
    private static Scanner sc = new Scanner(System.in);
    private static FriendList friendList =new FriendList();

    private static Friend friend1 = new Friend("Moa", "25", "0739876574",
            "2018", "Dog, Wilma and cat, Ernst", "The weekend", "" +
            "spending time with family and friends");
    private static Friend friend2 = new Friend("Iva", "26", "0702335493",
            "2011", "No", "F.o.o.L", "Practice kickboxing");


    public static void main(String[] args) {
        friendList.addNewFriend(friend1);
        friendList.addNewFriend(friend2);

        boolean quit = false;

        System.out.println("Welcome to my friendbook! ");
        printMenu();

        while (!quit){
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu){
                case 0:
                    printMenu();
                    break;
                case 1:
                    friendList.printFriends();
                    break;
                case 2:
                    addNewFriend();

                    break;
                case 3:
                    searchFriend();
                    break;
                case 4:
                    addFavorite();
                      break;
                case 5:
                    friendList.printFavoriteFriend();
                    break;
                case 6:
                    System.out.println("Closing my friend book..");
                    quit = true;
                    break;

            }
            System.out.println("");
            System.out.println("Press 0 to see menu. ");
        }
    }

    private static void addNewFriend(){
        System.out.println("Hello! Write about yourself in my friend book!");
        System.out.println("");
        System.out.println("Enter your name: ");
        String name =sc.nextLine();
        System.out.println("Enter your age: ");
        String age = sc.nextLine();
        System.out.println("Enter your mobile number: ");
        String telephoneNumber = sc.nextLine();
        System.out.println("Which year did you and I become friends?: ");
        String becameFriends = sc.nextLine();
        System.out.println("Do you have a pet? If so enter what kind of animal your pet is and it's name: ");
        String pet = sc.nextLine();
        System.out.println("What is your favorite band/musician?: ");
        String favoriteMusic = sc.nextLine();
        System.out.println("What you do on your spare time?: ");
        String spareTime = sc.nextLine();

        Friend newFriend = new Friend(name, age, telephoneNumber, becameFriends, pet, favoriteMusic, spareTime);

        if(friendList.addNewFriend(newFriend)){
            System.out.println("<3 <3 Thank you " + name + " for writing in my friend book! <3 <3");
        }
        else{
            System.out.println("Hello friend " + name + ". You can't write in my friend book two times!");
        }
    }

    private static void printMenu(){
        System.out.println("\nWhat do you want to do?:\n");
        System.out.println("\t0 - Menu \n" +
                "\t1 - Show my friends\n" +
                "\t2 - Add new friend\n" +
                "\t3 - Find friend\n" +
                "\t4 - Add friend to favorites\n" +
                "\t5 - Show favorite friends\n" +
                "\t6 - Close my friend book");
    }
    private static void searchFriend(){
       System.out.println("Who are you looking for?: ");
       String searchName = sc.nextLine();
       if(friendList.onList(searchName)){
           System.out.println(searchName + " is in my friend book.");
       }
       else {
           System.out.println(searchName + " is not in my friend book. You can add her/him if you like!");
       }

    }
    private static void addFavorite(){
        System.out.println("Who do you want to add?");
        String favoriteName = sc.nextLine();
        friendList.addToFavorite(favoriteName);

    }

}
