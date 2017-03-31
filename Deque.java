public interface Deque<T> {

    void addLast(T e);
    void addFirst(T e);
    T removeFirst();
    T pollFirst();
    T getFirst();
    T peekFirst();

}
