import java.util.Random;

public class Cat extends Animal {

    private String breed;
    private String name;

    public Cat(String breed, String name, ColorEnum colorEnum, Shelter shelter) {
        this.breed = breed;
        this.name = name;
        super.setColor(colorEnum);
        super.setShelter(shelter);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String eatCat() {
        return "Кошка покушала ";
    }

    public final String eatCat(String food) {
        return "Кошка пакушал:" + food;
    }

    public String eatCat(int foodNumber) {
        int food = foodNumber;
        food = 5;

        return "Кошка покушала сегодня  :" + food;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "breed: " + breed + " Name: " + name;
    }
}
