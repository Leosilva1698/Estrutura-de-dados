import java.nio.file.NoSuchFileException;

public class StaticQueue<T> {
    private int sPos = 0;
    private int rPos = 0;
    private T[] data;
    public StaticQueue (int size) {
        this.data = (T[]) new Object[size];
    }

    public void push(T data){
        try{
            isFull();
            this.data[this.sPos] = data;
            this.sPos += 1;
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }

    public T[] pop(){
        try{
            if (isEmpty()){
                System.out.println("A lista esta vasia");
            }
            this.data[this.rPos] = null;
            this.rPos += 1;
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
        return this.data;
    }

    public void clear(){
        try {
            if (isEmpty()){
                System.out.println("A lista esta vasia");
            }
            for(int i = 0; i < this.data.length; i ++){
                this.data[i] = null;
            }
            this.rPos = 0;
            this.sPos = 0;
        } catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }


    public boolean isFull(){
        if (this.sPos == this.data.length){
//            return true;
            throw new IllegalStateException("Is Full");
        } else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (this.sPos == this.rPos){
            return true;
//            throw new IllegalStateException("Is Empty");
        } else {
            return false;
        }
    }

    public String print(){
        String str = "";
        try{
            isEmpty();
            for (int i = 0; i < this.data.length; i++){
                if (this.data[i] != null) {
                    str += this.data[i];
                }
            }

        }catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
        return str;
    }



}
