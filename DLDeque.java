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
	    _end = new DLLNode<T>(e,null,null);
	    _front = _end;
	}
	else {
	    _end.setNext(new DLLNode<T>(e,_end,null));
	    _end = _end.getNext();
	}
	_size += 1;
    }

    public void addFirst(T e) {
	if (_front == null) {
	    _front = new DLLNode<T>(e,null,null);
	    _end = _front;
	}
	else {
	    _front.setPrev(new DLLNode<T>(e,null,_front));
	    _front = _front.getPrev();
	    }
	_size += 1;
    }

    public T pollLast() {
	if ( _size == 0 )
	    return null;
	T retVal = _end.getCargo();
	_end = _end.getPrev();
	_size -= 1;
	return retVal;
    }

    public T pollFirst() {
	if ( _size == 0 )
	    return null;
	T retVal = _front.getCargo();
	_front = _front.getNext();
	_size -= 1;
	return retVal;
    }

    public T peekLast() {
	if( _size == 0 )
	    return null;
	return _end.getCargo();
    }
    
    
    public T peekFirst() {
	if( _size == 0 )
	    return null;
	return _front.getCargo();
    }

    public int size() {
	return _size;
    }

    public String toString(){
	String ret = "";
	DLLNode tmp = _front;
	for(int i = 0;i < size();i ++){
	    ret += tmp.getCargo() + " ";
	    tmp = tmp.getNext();
	}
	return ret;
    }
    
    public static void main(String[] args){
	DLDeque<String> d = new DLDeque<String>(); // deque-lare variable
	System.out.println("testing addLast()...");	
	d.addLast("we");
	d.addLast("hold");
	d.addLast("these" );
	d.addLast("truths" );
	d.addLast("to" );
	d.addLast("be" );
	d.addLast("self-evident");
	System.out.println(d); // test toString()
	
	//testing pollFirst() removal
	while( d.size() > 0 )
	    System.out.println( d.pollFirst() );
	System.out.println( d.pollFirst() );

	System.out.println("testing addFirst()...");
	d.addFirst("self-evident");
	d.addFirst("be" );
	d.addFirst("to" );
	d.addFirst("truths" );
	d.addFirst("these" );
	d.addFirst("hold");
	d.addFirst("we");
	System.out.println(d);
	while( d.size() > 0 )
	System.out.println( d.pollLast() );


    }
}
