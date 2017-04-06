# Dequelaration-of-Independence
Roster:
Eric Zhang, Andrew Qu, Bryan Chan

Period 5


LAB#02

## Methods Chosen
1. `addLast(T e)`

Inserts an element "e" to the end of the deque.
2. `addFirst(T e)`

Inserts an element "e" to the front of the deque.
In
3. `pollLast()`

Returns and removes the last element of the deque, returns null if deque is empty.
4. `pollFirst()`

Returns and removes the first element of the deque, returns null if deque is empty.
5. `peekLast()`

Returnsthe last element of the deque, returns null if deque is empty.
6. `peekFirst()`

Returns the first element of the deque, returns null if deque is empty.
7.  `size()`

returns the number of elements in the deque.

## Justification
Deque is a queue, but in this case you are allowed to remove and add from BOTH sides.  The methods we chose are implementations of that idea.  addLast() and
addFirst() are methods to add an element to the deque from each side.  pollFirst() and pollLast() allows us to remove and return elements from both side.
We also decided to use a doubly linked node to implement deque because this allows our methods to be done in constant run time.  However, in an arrayList, some methods had to be done in linear time.
