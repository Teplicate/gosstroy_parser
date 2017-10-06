package entity;
// Совсем не шаблонный билдер, но это временно
public class EntityBuilder {

    public static BuildingData build(String[] data)
    {
        BuildingData buildingData = new BuildingData();
        buildingData.setCadNum(data[0]);
        buildingData.setObjectStatus(data[1]);
        buildingData.setCadNumDate(data[2]);
        buildingData.setFloors(data[3]);
        buildingData.setSquare(data[4]);
        buildingData.setUnit(data[5]);
        buildingData.setCadCost(data[6]);
        buildingData.setCostReg(data[7]);
        buildingData.setCostAffirmation(data[8]);
        buildingData.setCostDefinition(data[9]);
        buildingData.setAddress(data[10]);
        buildingData.setType(data[11]);
        buildingData.setUpdateDate(data[12]);

        return buildingData;
    }
}
