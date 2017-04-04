public interface Deque<T> {

    void addLast(T e);
    void addFirst(T e);
    T pollLast();
    T pollFirst();
    T peekLast();
    T peekFirst();
    int size();

}
