package com.learn;

import java.util.ArrayList;
import java.util.List;

public class Room {
    int roomNumber;
    String roomType;
    float roomArea;
    String acMachine;

    public Room(int roomNumber, String roomType, float roomArea, String acMachine) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }

    public static void main(String[] args) {
        List<Room> room = new ArrayList<>();
        Room r1 = new Room(101, "single", 78.9F, "Elite");
        room.add(r1);

        for (Room r : room) {
            System.out.println("roomNumber:" + r.roomNumber + "\n " + "roomType:" + r.roomType + "\n " + "roomArea:" + r.roomArea + "\n " + "acMachine:" + r.acMachine);
        }
    }
}
