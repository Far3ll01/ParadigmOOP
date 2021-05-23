package Abstraction;

public class Main {
    public static void exercise_1(){
        Smartphone[] array = new Smartphone[3];
        array[0] = new MobilePhone(6, 128, 11.4, 2000, true);
        array[1] = new MobilePhone(8, 256, 11.4, 2400, true);
        array[2] = new Tablet(4, 64, 10.4, 1400);
    }
    public static void exercise_2(){
        Population[] array = new Population[2];
        array[0] = new Animals();
        array[1] = new People();
    }
    public static void main(String[] args) {

    }
}
