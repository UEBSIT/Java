/*
A stack is a data structure that allows data to be inserted (a 'push' operation), and removed (a 'pop' operation). Many stacks also support a read ahead (a 'peek' operation), which reads data without removing it. A stack is a LIFO-queue, meaning that the last data to be inserted will be the first data to be removed.

When we insert data into a stack, it is placed at the head of a queue. This means that when we remove data, it will be in reverse order. Adding 1,2,3,4 will return 4,3,2,1. Stacks aren't the most frequently used data structure, but they are extremely useful for certain tasks.

Java provides a stack implementation, in the form of java.util.Stack. Stack's are a subclass of java.util.Vector, and share some similarities. A Vector, after all, is a queue, and a Stack is an ordered LIFO queue.

Stacks are quite easy to use. Here's a sample application that uses a stack to reverse a list of numbers.
*/
import java.util.Stack;

public class StackDemo
{
        public static void main(String args[])
        {
                // Create a new, empty stack
                Stack lifo = new Stack();

                // Let's add some items to it
                for (int i = 1; i <= 10; i++)
                {
                        lifo.push ( new Integer(i) );
                }

                // Last in first out means reverse order
                while ( !lifo.empty() )
                {
                        System.out.print ( lifo.pop() );
                        System.out.print ( ',' );
                }

                // Empty, let's lift off!
                System.out.println (" LIFT-OFF!");
        }

}
