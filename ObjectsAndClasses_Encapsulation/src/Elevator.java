public class Elevator {
    private final int minFloor;
    private final int maxFloor;
    private int currentFloor = 1;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor + 1;
        System.out.println("Этаж - " + currentFloor);
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
        System.out.println("Этаж - " + currentFloor);
    }

    public void move(int floor) {
        if (currentFloor == floor) {
            System.out.println(" ");
        } else if (floor < minFloor || floor > maxFloor){
            System.out.println("Лифт не поедет");
        } else if (currentFloor != floor) {
            for (int i = minFloor; i < maxFloor; i++) {
                if (floor < minFloor || floor > maxFloor) {
                    continue;
                }
                if (currentFloor > floor) {
                    moveDown();
                }
                if (currentFloor < floor) {
                    moveUp();
                }
            }
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
