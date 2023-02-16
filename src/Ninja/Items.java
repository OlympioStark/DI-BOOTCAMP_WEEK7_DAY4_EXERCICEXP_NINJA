package Ninja;

public class Items<T> {
	
	private int previousIndex;
    private int nextIndex;
    private int index;
    private T data;

    public Items(Integer previousIndex, int index, T data) {
        this.previousIndex = previousIndex;
        this.index = index;
        this.data = data;
    }

    public int getPreviousIndex() {
        return previousIndex;
    }

    public void setPreviousIndex(int previousIndex) {
        this.previousIndex = previousIndex;
    }

    public int getNextIndex() {
        return nextIndex;
    }

    public void setNextIndex(int nextIndex) {
        this.nextIndex = nextIndex;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
