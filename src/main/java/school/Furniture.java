package school;

public abstract class Furniture {
    private int furnitureSerialNumber;
    private int furnitureCost;
    private int lifeTime = 50; //sa scada dupa schedule?
    static public int furnitureNumber= 0;
    private String furnitureId;



    public Furniture(School school,int furnitureCost){
        this.furnitureCost = furnitureCost;
        this.furnitureSerialNumber = furnitureNumber++;
        school.payForExpenses(50);
    }

    public int getFurnitureNumber() {
        return furnitureNumber;
    }

    public int getFurnitureSerialNumber(){
        return furnitureSerialNumber;
    }

    public String getFurnitureId() {
        return furnitureId;
    }

    public void setFurnitureId(String furnitureId) {
        this.furnitureId = furnitureId;
    }

    //transfer?



}
