import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaristCampus {
    public static void main(String[] args) {

        //Courses
        Course advanceSoftwareEnginnering = new Course(101, "Advanced Software Engineering","Robert");
        Course softwareEnginnering = new Course(103, "Software Engineering","John");
        Course dataScience = new Course(113, "DataScience","Lenin");
        Course mathematics = new Course(123, "Mathematics","Joseph");
        Course appliedSciences = new Course(143, "Applied Sciences","Henry");

        //ClassRooms
        ClassRoom classRoom = new ClassRoom(1,10, Arrays.asList(new Course[]{advanceSoftwareEnginnering, softwareEnginnering}));
        ClassRoom classRoom1 = new ClassRoom(2,20, Arrays.asList(new Course[]{dataScience, mathematics}));
        ClassRoom classRoom2 = new ClassRoom(3,30,Arrays.asList(new Course[]{mathematics, advanceSoftwareEnginnering}) );
        ClassRoom classRoom3 = new ClassRoom(4,12,Arrays.asList(new Course[]{appliedSciences, softwareEnginnering}));


        //Offices
        Office office = new Office(2,20, "Justin");
        Office office1 = new Office(3, 30, "Friedrich");
        Office office2 = new Office(4, 1, "Nietzsche");

        List<Room> rooms = new ArrayList<>();
        rooms.add(classRoom);
        rooms.add(office);
        rooms.add(classRoom2);

        List<Room> building2Rooms = new ArrayList<>();
        building2Rooms.add(classRoom1);
        building2Rooms.add(classRoom3);
        building2Rooms.add(office1);
        building2Rooms.add(office2);

        //Buildings
        Building building = new Building(1,"Block - 1", rooms);
        Building building1 = new Building(2, "Block - 2", building2Rooms);

        List<Building> buildingList = new ArrayList<>();
        buildingList.add(building);
        buildingList.add(building1);

        //Campus
        Campus campus1 = new Campus(1,"main_campus", buildingList);

        System.out.println("Campus Id :" +campus1.getId());
        System.out.println("Campus Buildings "+"\n");
        System.out.println("----------------"+"\n");
        for(Building building2 : campus1.getBuildingList()){
            System.out.println("Building Id : "+ building2.getId());
            System.out.println("Building Name : "+building2.getName()+"\n");
            System.out.println("Office Rooms");
            System.out.println("-------------"+"\n");
            for(Office office3 : building2.getAllOfficeRooms()){
                System.out.println(" Office  Id : " + office3.getRoomId());
                System.out.println(" Office Capacity : "+office3.getCapacity());
                System.out.println(" Office Employee : "+office3.getEmployee()+"\n");
            }

            System.out.println("Class Rooms");
            System.out.println("-------------"+"\n");
            for(ClassRoom classRoom4 : building2.getAllClassRooms()){
                System.out.println(" Class Room Id : " + classRoom4.getRoomId());
                System.out.println(" Class Room Capacity : "+classRoom4.getCapacity()+"\n");
                System.out.println("Courses Taught in classroom : ");
                System.out.println("-----------------------------"+"\n");
                for(Course course : classRoom4.getCourse()){
                    System.out.println(" Course ID : "+course.getCourseId());
                    System.out.println(" Course Name : "+course.getCourseName());
                    System.out.println(" Professor Name : "+course.getProfessorName()+"\n");
                }
            }
        }




    }
}