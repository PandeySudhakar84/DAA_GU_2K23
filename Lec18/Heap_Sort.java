package Lec18;

import java.util.ArrayList;
import java.util.List;

public class Heap_Sort {
    class Solution {
        // Function to sort an array using Heap Sort.
        public void heapSort(int arr[]) {
            // code here
            Build_Heap pq=new Build_Heap();
            for(int num:arr){
                pq.Add(num);
            }
            int i=0;
            while(pq.size()>0){
                arr[i]=pq.remove();
                i++;
            }
        }
    }

    class Build_Heap {
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
    }
}
