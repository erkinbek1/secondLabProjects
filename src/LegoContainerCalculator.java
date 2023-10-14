public class LegoContainerCalculator {
    public static void main(String[] args) {
        int amountOfBricks = 65;

        int containerCapacity = 6;

        int fullContainers = amountOfBricks / containerCapacity;

        int remainingBlocks = amountOfBricks % containerCapacity;

        int totalContainers = fullContainers + 1;

        System.out.println("Number of Lego bricks: " + amountOfBricks);
        System.out.println("Capacity of one container: " + containerCapacity);
        System.out.println("Number of full containers needed: " + fullContainers);
        System.out.println("Number of blocks in the container that is not completely full: " + remainingBlocks);
        System.out.println("Total number of containers (full and not full): " + totalContainers);
    }
}
