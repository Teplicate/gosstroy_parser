package entity;

public class BuildingData {

    private String cadNum;
    private String objectStatus;
    private String cadNumDate;
    private String floors;
    private String square;
    private String unit;
    private String cadCost;
    private String costReg;
    private String costAffirmation;
    private String costDefinition;
    private String address;
    private String type;
    private String updateDate;

    public String getCadNum() {
        return cadNum;
    }

    public void setCadNum(String cadNum) {
        this.cadNum = cadNum;
    }

    public String getObjectStatus() {
        return objectStatus;
    }

    public void setObjectStatus(String objectStatus) {
        this.objectStatus = objectStatus;
    }

    public String getCadNumDate() {
        return cadNumDate;
    }

    public void setCadNumDate(String cadNumDate) {
        this.cadNumDate = cadNumDate;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCadCost() {
        return cadCost;
    }

    public void setCadCost(String cadCost) {
        this.cadCost = cadCost;
    }

    public String getCostReg() {
        return costReg;
    }

    public void setCostReg(String costReg) {
        this.costReg = costReg;
    }

    public String getCostAffirmation() {
        return costAffirmation;
    }

    public void setCostAffirmation(String costAffirmation) {
        this.costAffirmation = costAffirmation;
    }

    public String getCostDefinition() {
        return costDefinition;
    }

    public void setCostDefinition(String costDefinition) {
        this.costDefinition = costDefinition;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "BuildingData{" +
                "cadNum='" + cadNum + '\'' +
                ", objectStatus='" + objectStatus + '\'' +
                ", cadNumDate='" + cadNumDate + '\'' +
                ", floors='" + floors + '\'' +
                ", square='" + square + '\'' +
                ", unit='" + unit + '\'' +
                ", cadCost='" + cadCost + '\'' +
                ", costReg='" + costReg + '\'' +
                ", costAffirmation='" + costAffirmation + '\'' +
                ", costDefinition='" + costDefinition + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}
