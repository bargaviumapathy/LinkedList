
class LinkedList {
  
  Node head =null;
  
   class Node{
    
    int value;
    Node next;
    
    Node(int val){
      value = val;
      next = null;
    }
  }
  
  
  public void add(int value){
    
   Node n = head;
    
   if(n == null){
     head = new Node(value);
   }
   else{
     insertValue(value);
   }
  
  }
    
  public void insertValue(int value){
    Node n = head;
     
     while(n.next!=null){
       n = n.next;
     }
    
     n.next = new Node(value);
  }
  
  
  public void println(){
    
    
    Node n = head;
    
    System.out.println("");
    
    while(n!=null){
     
       System.out.print( n.value+ "-->");
      
       n = n.next;
     }
  }
    
  
  public void insertNextTo(int nextTo, int val){
    
    Node n = head;
    
    while(n != null && n.value != nextTo ){
      n= n.next;
    }
    
    Node temp = n.next;
    n.next = new Node(val);
    n.next.next = temp;
    
    System.out.println();
    
    
  }
  
  public void remove(int val){
    Node n = head;
    
    if(n!=null && n.value == val){
        head = n.next;
    }
    else{
      removeElement(val);
      
    }
    
    
  }
  
  
  public void removeElement(int val){
    
     Node n = head;
    
     while(n != null && n.next.value != val){
       n = n.next;
     }
    
     n.next = n.next.next;   
  }
 
  public static void main(String[] args) {
    
    LinkedList l = new LinkedList();
    
    l.println();
    
    l.add(1); // insert head
    l.add(2);
    l.add(3);
    l.add(5);
    l.insertNextTo(3,4);
    l.println();
    l.remove(4); //remove from middle
    l.remove(1);
    l.println();
    
  }
}
