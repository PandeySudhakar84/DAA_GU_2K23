package Lec18;

import java.util.ArrayList;
import java.util.List;

public class Build_Heap {
    List<Integer> ll=new ArrayList<>();
    public void Add(int item){
        ll.add(item);
        UpHeapify(ll.size()-1);
    }
    public void UpHeapify(int ci){
        int pi=(ci-1)/2;
        if(ll.get(pi)>ll.get(ci)){
            swap(pi,ci);
            UpHeapify(pi);
        }
    }
    public int get(){
        return ll.get(0);
    }
    public int size(){
        return ll.size();
    }
    public void Display(){
        System.out.println(ll);
    }
    public void swap(int pi,int ci){
        int pith=ll.get(pi);
        int cith=ll.get(ci);
        ll.set(pi,cith);
        ll.set(ci,pith);
    }
    public int remove(){
        int rv=ll.get(0);
        int size=ll.size()-1;
        swap(0,ll.size()-1);
        ll.remove(ll.size()-1);
        DownHeapify(0);
        return rv;
    }
    public void DownHeapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int min=pi;
        if(lci<ll.size() && ll.get(lci)<ll.get(min)){
            min=lci;
        }
        if(rci<ll.size() && ll.get(rci)<ll.get(min)){
            min=rci;
        }
       if(min!=pi){
        swap(pi,min);
        DownHeapify(min);
       }
    }
    public static void main(String[] args){
        Build_Heap pq=new Build_Heap();
        List<Integer> list=new ArrayList<>();
        pq.Add(3);
        pq.Add(7);
        pq.Add(10);
        pq.Add(2);
        pq.Add(4);
        pq.Add(6);
        pq.Add(1);
        pq.Add(-8);
        pq.Display();
//        //System.out.println(pq.get());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
        while(pq.size()>0){
            list.add(pq.remove());
        }
        System.out.println(list);
    }
}
