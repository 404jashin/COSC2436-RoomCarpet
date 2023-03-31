/**
 *  RoomCarpet.java
 *  This class takes a RoomDimension object and the carpet's cost to calculate the cost to carpet the whole room.
 *  COSC-2436.902
 *  02/01/2023
 *  @author Joshua Williams
 */

public class RoomCarpet
{
    private RoomDimension size; // the length and width of the room.
    private double carpetCost;  // the cost per square foot of the carpet.
    
    /**
     * Constructor. Initializes the dimensions of the room and the cost of the carpet.
     * @param dim   the length and width of the room.
     * @param cost  the cost per square foot.
     */
    public RoomCarpet(RoomDimension dim, double cost)
    {
        size = dim;
        carpetCost = cost;
    }

    /**
     * Copy Constructor
     * @param obj   the RoomCarpet object to copy.
     */
    public RoomCarpet(RoomCarpet obj)
    {
        size = obj.size;
        carpetCost = obj.carpetCost;
    }

    /**
     * Calculates the total cost to carpet the whole room.
     * @return      the total cost.
     */
    public double getTotalCost()
    {
        double area = size.getArea();
        return (area * carpetCost);
    }

    /**
     * toString method.
     * @return      the properties of the object displayed as a String.
     */
    public String toString()
    {
        return size.toString() + "Price per Square Foot: $" + carpetCost + "\nTotal Cost: $" + this.getTotalCost() + "\n";
    }

    /**
     * Clone method.
     * @return      the cloned RoomCarpet object.
     */
    public RoomCarpet clone()
    {
        return new RoomCarpet(this.size, this.carpetCost);
    }

    /**
     * Generates the hash value of a RoomCarpet object.
     * @return      the hash value.
     */
    public int hashCode()
    {
        String cost = String.valueOf(this.carpetCost);
        int result = 17;
        result = 37 * result + size.hashCode();
        result = 37 * result + cost.hashCode();
        return result;
    }

    /**
     * Tests to see whether 2 RoomCarpet objects are the same.
     * @param obj   the RoomCarpet object to test.
     * @return      whether or not the 2 RoomCarpet objects are the same.
     */
    public boolean equals(RoomCarpet obj)
    {
        boolean result;
        if((this.size.equals(obj.size)) && (carpetCost == obj.carpetCost))
            result = true;
        else
            result = false;
        return result;
    }

    /**
     * Tests to see whether or not one RoomCarpet object is more/less expensive than the other.
     * If they both cost the same, this method will compare the 2 objects by size.
     * @param obj   the RoomCarpet object to test.
     * @return      the result of which RoomCarpet is more/less expensive or larger/smaller.
     */
    public int compareTo(RoomCarpet obj)
    {
        int result = 0;
        if(this.getTotalCost() == obj.getTotalCost())
            if(this.size.getArea() < obj.size.getArea())
                result = -1;
            else if(this.size.getArea() > obj.size.getArea())
                result = 1;
            else
                result = 0;
        else if(this.getTotalCost() < obj.getTotalCost())
            result = -1;
        else
            result = 1;
        return result;
    }

    /**
     * Finalizes the RoomCarpet object.
     */
    public void finalize()
    {
        System.out.println("RoomCarpet object has been destroyed.");
    }
}
