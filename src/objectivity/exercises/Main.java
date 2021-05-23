package objectivity.exercises;

public class Main {
    public static void exercise_1(){
        Item item = new Item("Cukier", 999, 4.00);
        Item item2 = new Item("Cukier droższy", 1, 6.00);
        Order or = new Order();
        or.addItem(item);
        or.addItem(item2);
        System.out.println(or);
    }
    public static void exercise_2(){
        final int N = 10;
        List l = new List(N);
        for (int i = 0; i < N/2; ++i) {
            l.addElement( (1 << i) );
        }
        l.addElement(2);
        l.addElement(8);
        System.out.println(l);
        l.removeFirst(2);
        System.out.println(l);
        for (int i = 0; i < N/2; ++i) {
            l.addElement( (1 << i) );
        }
        System.out.println(l);
        System.out.println("Po usunięciu powtórzeń:");
        l.removeDuplicates();
        System.out.println(l);
    }
    public static void main(String[] args) {


    }
}
