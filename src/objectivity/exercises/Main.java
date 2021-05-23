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
        Time t1 = new Time(10, 56);
        Time t2 = new Time(0, 123);
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t1 + t2 = " + t1.addTime(t2));
        System.out.println("t1 - t2 = " + t1.subtractTime(t2));
        Time [] tab = { t1, t2, t2 };
        System.out.println("Czas.sumuj dla t1 + t2 + t2 = " + Time.addTimes(tab));
        System.out.println("t1 * 2 = " + t1.multiplyTime(2));
        Time t3 = new Time("3 h 17 min");
        System.out.println("Konstruktor z łańcuchem: " + t3);
    }
}
