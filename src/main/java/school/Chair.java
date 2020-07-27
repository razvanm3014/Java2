package school;
public class Chair extends Furniture{
//    private static int serialNumber = 1;

    public Chair(School school){
        super(school,30);
        setFurnitureId(this.getFurnitureSerialNumber() + "C");
//        serialNumber++;
    }


    //dictionar sa aleg scaunul, pus cate scaune vreau, facut si pt masa
    public void transferChair(Furniture furniture, ClassRoom from, ClassRoom to){
        to.addChair(from.removeOneChair());
    }
    public Chair brokenChair(){
        return null;
    }
}
