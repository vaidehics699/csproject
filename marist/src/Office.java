public class Office extends Room{

    private String employee;

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Office{" +
                "employee='" + employee + '\'' +
                ", capacity=" + capacity +
                ", roomId=" + roomId +
                '}';
    }

    public Office(int roomId, int capacity, String employee){
        this.roomId = roomId;
        this.capacity = capacity;
        this.employee = employee;
    }

    public Office(int roomId, int capacity, String employee, int doors){
        this.roomId = roomId;
        this.capacity = capacity;
        this.employee = employee;
        this.noOfDoors = doors;
    }



    public boolean checkIfEmployeeIsAssigned(){
        if(this.employee == null){
            return true;
        }
        return false;
    }
    public int maximumCapacityOfOffice(){
        return this.capacity;
    }
    public void removeEmployee(){
        this.employee = null;
    }
    public void addEmployee(String employee){
        this.employee = employee;
    }

}
