
public class Main {
    public static void main(String[] args) {


        String[] comannds = {"Sit", "up"};
        Shelter shelter = new Shelter("Welcome", "Doneskiy");
        Dog dog = new Dog("Bigboi", "Burbul", comannds, ColorEnum.BROWN, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Bigboi");
        dog.makeVoice( 9);
        System.out.println("---------------------------------------------------------------------------");

        Shelter shelter1 = new Shelter("Sweet", "Germany");
        Dog dog2 = new Dog("Chempion", "Bokser", ColorEnum.BLACK, shelter1);
        System.out.println(dog2.getInfo());
        dog2.makeVoice();
        dog2.makeVoice( 4);
        dog2.makeVoice("Chempion");
        System.out.println("---------------------------------------------------------------------------");

    }
}