# Dequelaration-of-Independence
Roster:
Eric Zhang, Andrew Qu, Bryan Chan

Period 5


LAB#02

## Methods Chosen
1. `addLast(T e)`
2. `pollLast()`
3. `pollFirst()`
4. `peekLast()`
5. `peekFirst()`
6.  `size()`

## Justification
Deque is a queue, but in this case you are allowed to remove and add from BOTH sides.  The methods we chose are implementations of that idea.  addLast() and
addFirst() are methods to add an element to the deque from each side.  pollFirst() and pollLast() allows us to remove and return elements from both side.
We also decided to use a doubly linked node to implement deque because this allows our methods to be done in constant run time.  Whereas in an arrayList for
example, some methods had to be done in linear time.
