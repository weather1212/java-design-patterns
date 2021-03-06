package practice.p01_encapsulation.after;

import java.util.ArrayList;

// 캡슐화를 위한 ArrayStack 예제 수정
public class ArrayStack {

    // private으로 변경 : 외부에서 접근할 수 없도록
    private ArrayList<Integer> items; // ArrayList 클래스 사용
    private int stackSize;

    public ArrayStack(int stackSize) {
        items = new ArrayList<>(stackSize);
        this.stackSize = stackSize;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean isFull() {
        return (items.size() >= this.stackSize);
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Inserting fail! ArrayStack is full.");
        } else {
            items.add(new Integer(item));
            System.out.println("Inserted Item : " + item);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Deleting fail! ArrayStack is empty.");
            return -1;
        } else {
            return items.remove(items.size() - 1);
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Peeking fail! ArrayStack is empty.");
            return -1;
        } else {
            return items.get(items.size() - 1);
        }
    }

}
