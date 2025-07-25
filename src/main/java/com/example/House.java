package com.example;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        // create a room with a carpet and a couch
        var roomWithCarpetAndCouch = new RoomWithCouch(room);
        roomWithCarpetAndCouch.printFurniture();

        System.out.println();

        // create a room with a carpet, a couch and a table
        var roomWithCarpetAndCouchAndTable = new RoomWithTable(roomWithCarpetAndCouch);
        roomWithCarpetAndCouchAndTable.printFurniture();
    }

}
