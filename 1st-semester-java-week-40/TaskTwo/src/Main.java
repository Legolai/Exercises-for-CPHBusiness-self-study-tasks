public class Main {
    public static void main(String[] args) {
        Room r1 = new Room(4, 3, 2, 2);
        Room r2 = new Room(3, 6, 7, 2);
        Room r3 = new Room(10, 6, 4, 10);

        Room[] rooms = { r1, r2, r3 };

        Building b1 = new Building(rooms, rooms.length, 2, false);

        int totalNumberOfLamps = 0;

        for (Room room : b1.getRooms()) {
            totalNumberOfLamps += room.getNumberOfLamps();
        }

        System.out.println("Total number of lamps in the building: " + totalNumberOfLamps);

        if (b1.getNumberOfFloors() > b1.getRooms().length) {
            System.out.println("This is an odd building");
        }
    }
}
