package ru.mirea.pr8;

public class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() {
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        content.add(content.remove());
    }
}
