package Ninja;

import java.util.Optional;

public class LinkedList<T> {
	
	private Items<T> head;
    private Items<T> tail;
    private Items<T>[] items;
    private int size;
    private int maxSize = 1;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.items = new Items[maxSize];
        size = 0;
    }

    private LinkedList<T> growSize() {
        this.maxSize++;
        Items<T>[] temp = new Items[maxSize];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        this.items = temp;

        return this;
    }

    public LinkedList<T> add(T data) {
        if(this.size == this.maxSize)
            this.growSize();
        Items<T> item = new Items<T>(null, 0, data);
        if(tail.equals(null)) {
            this.head = item;
        } else {
            item.setIndex(this.tail.getIndex() + 1);
            item.setPreviousIndex(this.tail.getIndex());
            this.tail.setNextIndex(item.getIndex());
        }
        this.tail = item;
        this.size++;
        this.items[size] = item;

        return this;
    }

    public Optional<Items<T>> get(int index) {
        Optional<Items<T>> item = null;
        for (int i = 0; i <= size; i++) {
            if (items[i].getIndex() == index)
                item = Optional.ofNullable(items[i]);
        }
        return item;
    }

    public LinkedList<T> remove(int index) {
        for (int i = 0; i < size; i++) {
            if(items[i].getIndex() == index) {
                items[i] = null;
            }
        }
        

        return this;
    }

    public static void main(String[] args) {
        // code here
    }

}
