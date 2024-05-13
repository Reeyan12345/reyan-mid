import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int stack[]=new int[5];
    int top;
               public void push(int data)
        {
            stack[top]=data;
            top++;
        }
          public int pop(){
           int data;
                   top--;
           data=stack[top];
           stack[top]=0;
           return data;
               }
    public static void main(String[] args) {

Stack reyan=new Stack();
reyan.push(7);
reyan.push(2);
reyan.push(3);
reyan.push(6);


reyan.pop();

        }

}