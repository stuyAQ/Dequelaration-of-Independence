public class DLDeque<T> implements Deque<T> {

    private DLLNode<T> _front, _end;
    private int _size;

    public DLDeque() {
	_front = null;
	_end = null;
	_size = 0;
    }

    public void addLast(T e) {
	if (_front == null) {
	    _front = new DLLNode<T>(e,null,null);
	    _end = _front;
	}
	else {
	    _end.setNext(new DLLNode<T>(e,null,null));
	    _end = _end.getNext();
	}
	_size += 1;
    }
    //*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void addFirst(T e) {
	if (_end == null) {
	    _end = new DLLNode<T>(e,null,null);
	    _front = _end;
	}
	else {
	    _front.setPrev(new DLLNode<T>(e,null,null));
	    _front = _front.getPrev();
	}
	_size += 1;
    }

    public T pollLast() {
	T retVal = _end.getCargo();
	_end = _end.getPrev();
	_size -= 1;
	return retVal;
    }

    public T pollFirst() {
	T retVal = _front.getCargo();
	_front = _front.getNext();
	_size -= 1;
	return retVal;
    }

    public T peekLast() {
	return _end.getCargo();
    }
    
    
    public T peekFirst() {
	return _front.getCargo();
    }

    public int size() {
	return _size;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String toString(){
	String ret = "";
	DLLNode tmp = _front;
	while ( tmp != null ){
	    ret += tmp.getCargo() + " ";
	    tmp = tmp.getNext();
	}
	return ret;
    }
    
    public static void main(String[] args){
	DLDeque<String> d = new DLDeque<String>(); // deque-lare variable
	d.addLast("we");
	d.addLast("hold");
	d.addLast("these" );
	d.addLast("truths" );
	d.addLast("to" );
	d.addLast("be" );
	d.addLast("self-evident");
	System.out.println(d); // test toString()
	while( d.size() > 0 )
	    System.out.println( d.pollFirst() );
    }
}
