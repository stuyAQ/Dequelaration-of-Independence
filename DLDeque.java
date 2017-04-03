public class DLDeque<T> implements Deque<T> {

    private DLNode<T> _front, _end;
    private int _size;

    public DLDeque<T>() {
	_front = null;
	_end = null;
	_size = 0;
    }

    public void addLast(T e) {
	if (_front == null) {
	    _front = new LLNode<T>(enQVal,null);
	    _end = _front;
	}
	else {
	    _end.setNext(new LLNode<T>(enQVal,null));
	    _end = _end.getNext();
	}
    }
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void addFirst(T e) {
    }

    public T pollLast() {

    }

    public T pollFirst() {
	T retVal = _front.getValue();
	_front = _front.getNext();
	return retVal;
    }

    public T peekLast() {
	
    }
    
    
    public T peekFirst() {
	return _front.getValue();
    }

    public int size() {
	return _size;
    }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String toString(){
	String ret = "";
	DLLNode tmp = _front;
	while ( tmp != null ){
	    ret += tmp.getValue();
	    tmp = tmp.getNext();
	}
	return ret;
    }
    
    public static void main(String[] args){
	DLDeque<String> d = new DLQueue<String>(); // deque-lare variable
	d.addLast("we");
	d.addLast("hold");
	d.addLast("these" );
	d.addLast("truths" );
	d.addLast("to" );
	d.addLast("be" );
	d.addLast("self-evident");
	System.out.println(d); // test toString()
    }
}
