
enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

public class EnumExample {
    public static void main(String[] args) {
        Direction direction = Direction.NORTH;

        // Switch statement using enum
        switch (direction) {
            case NORTH:
                System.out.println("Heading North");
                break;
            case SOUTH:
                System.out.println("Heading South");
                break;
            case EAST:
                System.out.println("Heading East");
                break;
            case WEST:
                System.out.println("Heading West");
                break;
        }

        // Iterate over enum values
        System.out.println("All directions:");
        for (Direction dir : Direction.values()) {
            System.out.println(dir);
        }
    }
}