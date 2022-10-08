import java.util.ArrayList;
import java.util.List;

public class Building {
    private int id;
    private String name;
    private List<Room> rooms;

    public Building() {
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rooms=" + rooms +
                '}';
    }

    public Building(int id, String name, List<Room> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfClassRooms(){
        int count = 0;
        for(Room r : rooms){
            if(r instanceof ClassRoom){
                count++;
            }
        }
        return count;
    }

    public int getNumberOfOfficeRooms(){
        int count = 0;
        for(Room r : rooms){
            if(r instanceof Office){
                count++;
            }
        }
        return count;
    }

    public int getTotalCapacity(){
        return getTotalOfficeCapacity() + getTotalClassRoomCapacity();
    }

    public int getTotalClassRoomCapacity(){
        int count = 0;
        for(Room r : rooms){
            if(r instanceof ClassRoom){
                count += r.capacity;
            }
        }
        return count;
    }

    public int getTotalOfficeCapacity(){
        int count = 0;
        for(Room r : rooms){
            if(r instanceof Office){
                count += r.capacity;
            }
        }
        return count;
    }

    public List<ClassRoom> getAllClassRooms(){
        List<ClassRoom>classRooms = new ArrayList<>();
        for(Room r : rooms){
            if(r instanceof ClassRoom){
                classRooms.add((ClassRoom) r);
            }
        }
        return classRooms;
    }

    public List<Office> getAllOfficeRooms(){
        List<Office>offices = new ArrayList<>();
        for(Room r : rooms){
            if(r instanceof Office){
                offices.add((Office) r);
            }
        }
        return offices;
    }

}
