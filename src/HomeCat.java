public class HomeCat extends Cat{
    private String cloth;

    public HomeCat(String breed, String name, ColorEnum colorEnum, Shelter shelter, String cloth) {
        super(breed, name, colorEnum, shelter);
        this.cloth = cloth;
    }

    public String getCloth() {
        return cloth;
    }




    @Override
    public String eatCat(int foodNumber){
     return " Количество еды "+foodNumber;
    }
}
