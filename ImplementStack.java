//Implement Stack using Arrays only which supports 
//push, pop, peek, size operations on Generic datatypes 
public class Stack<T> {
private int stackSize;
private T [] stackArr;
private int top;
private int intialSize;
private int limit;


public Stack() throws Exception{
 intialSize = 50;
 limit =10;
 stacksize = initialSize;
 stackArr = new T [stackSize];
 top = -1;
}

public Stack(int size) throws Exception{
if (size<0){
throw new Exception("Negative Stack Size");
}
 stacksize = size;
 stackArr = new T [size];
 top = -1;
 initialSize = size;
 limit =10;
}

pulic void push(<T> entry){
if(isStackFull()){
ensureCapacity();
}
stackArr[++top] = entry;
}

public <T> pop() throws Exception{
if(isStackEmpty()){
throw new Exception("Stack is Empty");
}
<T> entry = stackArr[top--];
return entry;
}


public <T> peek() throws Exception
{
if(isStackEmpty()){
throw new Exception("Stack is Empty");
}
<T> entry = stackArr[top];
return entry;
}

public int size(){

return (top+1);

}


public boolean isStackEmpty(){
return(top == -1);
}

public boolean isStackFull(){

return (top == stackSize -1);
}

private void ensureCapacity(){
int newSize = stackSize +limit;
stackArr = Arrays.copy(stackArr, newSize);
}


}
