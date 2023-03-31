/**
 *  CarpetCalculatorApp.java
 *  This program demonstrates the RoomCarpet class.
 *  COSC-2436.902
 *  02/01/2023
 *  @author Joshua Williams
 */

import java.util.ArrayList;

public class CarpetCalculatorApp {
    public static void main(String[] args) throws Exception
    {
        // Create an ArrayList to hold RoomCarpet objects.
        ArrayList<RoomCarpet> rooms = new ArrayList<RoomCarpet>();

        // Create 3 RoomDimension objects.
        RoomDimension size1 = new RoomDimension(12, 10);
        RoomDimension size2 = new RoomDimension(17, 14);
        RoomDimension size3 = new RoomDimension(15, 20);

        // Create 3 RoomCarpet objects.
        RoomCarpet room1 = new RoomCarpet(size1, 8);
        RoomCarpet room2 = new RoomCarpet(size2, 9);
        RoomCarpet room3 = new RoomCarpet(size3, 7);

        // Create a RoomCarpet object using its copy constructor.
        RoomCarpet roomCopy = new RoomCarpet(room1);

        // Create a RoomCarpet object using its clone method.
        RoomCarpet roomClone = room3.clone();

        // Populate the RoomCarpet ArrayList.
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(roomCopy);
        rooms.add(roomClone);

        // Display the RoomCarpet information of each object in the ArrayList.
        int count = 0;
        System.out.println("My Rooms:\n");
        for(RoomCarpet i : rooms)
        {
            count++;
            if(count < 4)
                System.out.println("Room " + count + ":");
            else if(count == 4)
                System.out.println("Room 1 Copy:");
            else
                System.out.println("Room 3 Clone:");
            System.out.println("Hash Code: " + i.hashCode());
            System.out.println(i);
        }

        // Testing equals method.
        if(room1.equals(roomCopy))
            System.out.println("'Room 1' is equal to 'Room 1 Copy'");
        if(room3.equals(roomClone))
            System.out.println("'Room 3' is equal to 'Room 3 Clone'");

        // Testing compareTo method.
        if(room1.compareTo(room2) == 0)
            System.out.println("'Room 1' is the same as 'Room 2'");
        else if(room1.compareTo(room2) < 0)
            System.out.println("'Room 1' is cheaper/smaller than 'Room 2'");
        else
            System.out.println("'Room 1' is more expensive/larger than 'Room 2'");

        // Testing compareTo method.
        if(room2.compareTo(room3) == 0)
            System.out.println("'Room 2' is the same as 'Room 3'");
        else if(room2.compareTo(room3) < 0)
            System.out.println("'Room 2' is cheaper/smaller than 'Room 3'");
        else
            System.out.println("'Room 2' is more expensive/larger than 'Room 3'");

    }
}
