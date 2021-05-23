package objectivity.exercises;

import java.io.FileWriter;
import java.io.IOException;

public class List {
    private int[] numbers;
    private int capacity;
    private int size;

    public List(int capacity) {
        this.capacity = capacity;
        this.numbers = new int[capacity];
        this.size = 0;
    }
    public void addElement(int number){
        if(this.size == this.capacity){
            System.out.println("List is already full");
        }else{
            this.numbers[size++] = number;
        }
    }
    public int find(int number){
        for (int i = 0; i < this.numbers.length; i++) {
            if (this.numbers[i] == number) return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("List{");
        sb.append("numbers=");
        if (this.numbers == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < this.size; ++i)
                sb.append(i == 0 ? "" : ", ").append(this.numbers[i]);
            sb.append(']');
        }
        sb.append(", capacity=").append(this.capacity);
        sb.append(", size=").append(this.size);
        sb.append('}');
        return sb.toString();
    }
    public void removeFirst(int number){
        if(this.size >= 1) {
            for (int j = 0; j < this.size; j++) {
                if (this.numbers[j] == number) {
                    for (int i = j; i < this.size-1; i++) {
                        this.numbers[i] = this.numbers[i+1];
                    }
                    this.numbers[--this.size] = 0;
                    return;
                }
            }
        }else{
            System.out.println("List is empty");
        }
    }
    public void removeDuplicates(){
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if(this.numbers[i] == this.numbers[j] && i != j){
                    for (int k = j; k < this.size-1; k++) {
                        this.numbers[k] = this.numbers[k-1];
                    }
                    this.numbers[--this.size] = 0;
                }
            }
        }
    }
    public void reverse(){
        int tempValue;
        for (int i = 0; i < this.size/2; i++) {
            tempValue = this.numbers[i];
            this.numbers[i] = this.numbers[size-1-i];
            this.numbers[size-1-i] = tempValue;
        }
    }
    public void saveToFile(String FileName) throws IOException {
        FileWriter fw = new FileWriter(FileName);
        fw.append(this.toString());
        fw.flush();
        fw.close();
    }
}
