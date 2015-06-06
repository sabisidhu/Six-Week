package algorithm;
class MyLinkedList
{
 private int count;
 ListNode header;
 ListNode temp;
 public MyLinkedList()
 {
 header = new ListNode(null);
	count = 0;
 }
 public boolean isEmpty()
 {
 return header.next == null;
 }
 public void makeEmpty()
 {
 count = 0;
 header.next = null;
 }
 public void add(Object o)
 {
 ListNode node = new ListNode(o);
 if (isEmpty()==true)
 {
 header.next = node;
	count++;
 }
 else
 {
 temp = header;
while (temp.getnext() != null)
{
	 temp = temp.getnext();
}
 temp.next = node;
 count++;
 }
 }
 public boolean add(int index, Object o)
 {
 if (index>count || index<1)
 {
return false;
 }
 else
 {
ListNode node = new ListNode(o);
count++;
temp = header;
for(int i=1; i<index; i++)
{
temp = temp.getnext();
}
node.next = temp.next;
temp.next = node;
return true;
 }
 }
 public void addFirst(Object o)
 {
 count++;
 ListNode node = new ListNode(o);
 temp = header;
 temp = temp.getnext();
 header.next = node;
 node.next = temp;
 }
 public boolean set(int index,Object o)
 {
 if (index>count || index<1)
 {
return false;
 }
 else
 {
temp = header;
for(int i=1; i<index; i++)
{
temp = temp.getnext();
}
temp.next.element = o;
return true;
 }
 }
 public Object get(int index)
 {
 if (index>count || index<1)
 {
return null;
 }
 else
 {
temp = header;
for(int i=0; i<index;i++)
{
temp = temp.getnext();
}
return temp.element;
 }
 }
 public Object getFirst()
 {
 temp = header;
 return temp.next.element;
 }
 public Object getLast()
 {
 temp = header;
 while (temp.getnext() != null)
 {
temp = temp.getnext();
 }
 return temp.element;
 }
 public int size()
 {
 return count;
 }
 public Object [] toArray()
 {
 Object [] ret = new Object[count];
 temp = header;
 for (int i=0; i<count; i++)
 {
 ret[i] = temp.next.element;
 temp = temp.getnext();
 }
 return ret;
 }
 public boolean remove(int index)
 {
 if (index>count || index<1)
 {
return false;
 }
 else
 {
count--;
temp = header;
for(int i=1; i<index; i++)
{
temp = temp.getnext();
}
temp.next = temp.next.next;
return true;
 }
 }
 public boolean removeFirst()
 {
 if (isEmpty()==false)
 {
count--;
temp = header;
header.next = temp.next.next;
return true;
 }
 else
 {
return false;
 }
 }
 public boolean removeLast()
 {
 if (isEmpty()==false)
 {
count--;
temp = header;
while (temp.next.getnext() != null)
{
temp = temp.getnext();
}
temp.next = null;
return true;
 }
 else
 {
return false;
 }
 }
}
class ListNode
{
 Object element;
 ListNode next;
 ListNode(Object theElement)
 {
 this(theElement,null);
 }
 ListNode(Object theElement,ListNode n)
 {
 element = theElement;
 next = n;
 }
 public ListNode getnext()
 {
 return this.next;
 }
}


