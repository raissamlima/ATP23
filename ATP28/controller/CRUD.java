package ATP28.controller;

import java.util.ArrayList;

public class CRUD<T> {
    
        private ArrayList<T> aspectos;
    
        public CRUD(){
            this.aspectos = new ArrayList<T>();
        }
        public void create(T obj){
            this.aspectos.add(obj);
        }
        public ArrayList<T> read(){
            return this.aspectos;
        }
        public void update(T obj){
            if(existe(obj)){
                this.delete(obj);
                this.create(obj);
            }
        }
        public void delete(T obj){
           this.aspectos.remove(obj);
        }
    
        public boolean existe(T obj){
            return this.aspectos.contains(obj);
    }
}
