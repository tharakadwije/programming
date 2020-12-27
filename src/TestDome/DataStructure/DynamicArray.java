package TestDome.DataStructure;

import java.util.Arrays;

public class DynamicArray<T> {

    private int size;
    private Object[] data;

    public DynamicArray(){
        size=0;
        data = new Object[0];
    }

    public int size() {
        return data.length;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void add(Object value){
        increaseArraySize(size+1);
        data[size++] = value;

    }

    private void increaseArraySize(int value){
        data = Arrays.copyOf(data, value);
    }

    public T getLastIndex(){
      return (T) data[data.length-1];
    }
}
