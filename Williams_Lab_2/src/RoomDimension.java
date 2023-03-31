/**
 *  RoomDimension.java
 *  This class stores the length and width of a room.
 *  COSC-2436.902
 *  02/01/2023
 *  @author Joshua Williams
 */

public class RoomDimension
{
    private double length = 0;  // the length of the room
    private double width = 0;   // the width of the room

    /**
     * Constructor. Initializes the dimensions of the room.
     * @param len   the length of the room.
     * @param w     the width of the room.
     */
    public RoomDimension(double len, double w)
    {
        length = len;
        width = w;
    }
    
    /**
     * Copy Constructor
     * @param obj   the RoomDimension object to copy.
     */
    public RoomDimension(RoomDimension obj)
    {
        length = obj.length;
        width = obj.width;
    }

    /**
     * Calculates the area of the room.
     * @return      the area of the room.
     */
    public double getArea()
    {
        return (length * width);
    }

    /**
     * toString method.
     * @return      the properties of the object displayed as a String.
     */
    public String toString()
    {
        return "Room Length: " + length + " ft.\nRoom Width: " + width + " ft.\n";
    }

    /**
     * Clone method.
     * @return      the cloned RoomDimension object.
     */
    public RoomDimension clone()
    {
        return new RoomDimension(this.length, this.width);
    }

    /**
     * Generates the hash value of a RoomDimension object.
     * @return      the hash value.
     */
    public int hashCode()
    {
        String len = String.valueOf(this.length);
        String w = String.valueOf(this.width);
        int result = 17;
        result = 37 * result + len.hashCode();
        result = 37 * result + w.hashCode();
        return result;
    }

    /**
     * Tests to see whether 2 RoomDimension objects are the same.
     * @param obj   the RoomDimension object to test.
     * @return      whether or not the 2 RoomDimension objects are the same.
     */
    public boolean equals(RoomDimension obj)
    {
        boolean result;
        if((length == obj.length) && (width == obj.width))
            result = true;
        else
            result = false;
        return result;
    }

    /**
     * Tests to see whether or not one RoomDimension object is larger/smaller than the other.
     * @param obj   the RoomDimension object to test.
     * @return      the result of which RoomDimension is larger/smaller.
     */
    public int compareTo(RoomDimension obj)
    {
        int result = 0;
        if(this.getArea() == obj.getArea())
            result = 0;
        else if(this.getArea() < obj.getArea())
            result = -1;
        else
            result = 1;
        return result;
    }

    /**
     * Finalizes the RoomDimension object.
     */
    public void finalize()
    {
        System.out.println("RoomDimension object has been destroyed.");
    }
}
