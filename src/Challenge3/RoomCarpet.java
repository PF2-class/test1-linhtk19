package Challenge3;

public class RoomCarpet {
	private RoomDimension roomDimensions;
    private double costOfCarpet;

    public RoomCarpet(RoomDimension roomDimensions, double costOfCarpet) {
        super();
        this.roomDimensions = roomDimensions;
        this.costOfCarpet = costOfCarpet;
    }

    public double getTotalCost() {
        return costOfCarpet * roomDimensions.calculateArea();
    }

    @Override
    public String toString() {
        return "RoomCarpet [roomDimensions=" + roomDimensions
                + ", costOfCarpet=" + costOfCarpet + ", "
                        + "total cost=" + getTotalCost() + "]";
    }
}
