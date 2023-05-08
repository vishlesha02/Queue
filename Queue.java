package Day10;

import java.util.Scanner;

public class Queue {
    public int front=0;
    Scanner sc = new Scanner(System.in);

    int size=sc.nextInt();
    public int rear=-1;
    public int arr[]=new int[size];
    public void enQueue(int n){
        if(rear==size-1){
            System.out.println("Queue is full");
        }
        else{
            rear+=1;
            arr[rear]=n;
        }
    }
    public void deQueue(){
        if(rear==-1){
            System.out.println("Queue is empty");
        }
        else{
            front+=1;

        }
    }
    public void peek(){
        if(rear!=-1){
            System.out.println("top element is " + arr[front]);
        }
    }
    public void show(){
        System.out.println("Elements :");
        for (int i=front;i<=rear;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Queue st = new Queue();
        st.enQueue(70);
        st.enQueue(36);
        st.enQueue(56);
        st.show();
        st.deQueue();
        st.show();
        st.peek();

    }
}

