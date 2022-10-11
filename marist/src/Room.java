public abstract class Room{
    public int capacity;
    public int roomId;

    public int noOfDoors;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public boolean isThisClassRoom(){
        if(this instanceof  ClassRoom){
            return true;
        }
        return false;
    }
    public boolean isThisOffice(){
        if(this instanceof  Office){
            return true;
        }
        return false;
    }
    public void changeRoomNumber(int roomNumber){
        this.roomId = roomNumber;
    }

}
