import java.util.Arrays;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] comannds;

    public Dog() {

    }

    public Dog(String name, String breed, String[] comannds, ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.comannds = comannds;
        super.setColor(colorEnum);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(colorEnum);
        super.setShelter(shelter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getComannds() {
        return comannds;
    }

    public void setComannds(String[] comannds) {

        if (comannds == null) {
            System.out.println("Nooooooooo");
        } else {
            this.comannds = comannds;


        }
    }


    public void makeVoice() {
        System.out.println("Животный издает звук");
    }

    public void makeVoice(String voice) {
        System.out.println(voice + "   издает звук");
    }

    public void makeVoice( int number) {
        System.out.println(getName() + "  издает звук за день : " + number + "  раз");
    }


    @Override
    public final String getInfo() {
        StringBuilder stringBuilder = new StringBuilder(super.getInfo());
        stringBuilder.append("\n name: ").append(name).append("\n");
        stringBuilder.append("Breed:").append(breed).append("\n");
        if (comannds != null) {
            stringBuilder.append("Comannds").append(Arrays.toString(comannds)).append("\n");

        } else {
            stringBuilder.append("Нету команды");
        }
        return stringBuilder.toString();

    }
}
