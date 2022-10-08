import java.util.List;

public class Campus {
    private long id;
    private String name;
    private List<Building> buildingList;

    public Campus(long id, String name, List<Building> buildingList) {
        this.id = id;
        this.name = name;
        this.buildingList = buildingList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public int getTotalNumberOfBuildings(){
        return this.buildingList.size();
    }

    public Building findBuildingById(int id){
        for(Building building : buildingList){
            if(building.getId() == id){
                return building;
            }
        }
        return null;
    }


    public Building findBuildingByName(String buildingName){
        for(Building building : buildingList){
            if(building.getName().equals(buildingName)){
                return building;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Campus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", buildingList=" + buildingList +
                '}';
    }
}
