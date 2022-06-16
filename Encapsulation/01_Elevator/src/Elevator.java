public class Elevator {
    private final int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor(){return currentFloor;}

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }
    public void moveUp(){
        //currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        if (currentFloor < maxFloor) {
            currentFloor = currentFloor + 1;
        }
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor || floor == 0) {
            System.out.println("Error");
            return;
        }
        if (currentFloor < floor) {
            for (int i = currentFloor; i <= floor; i++) {
                if (i == 0) {continue;}
                //moveUp();//это не точно
                System.out.println(i);
            }
        }
        if (currentFloor > floor) {
            for (int i = currentFloor; i >= floor; i--) {
                if (i == 0) {continue;}
                System.out.println(i);
            }
        }
    }
}
