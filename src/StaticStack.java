import javax.transaction.xa.XAException;

public class StaticStack<T> {
    private int top = 0;
    private T[] data;
    public StaticStack (int size){
        this.data = (T[]) new Object[size];
    }

    public void push(T data){
        try{
            isFull();
            this.data[this.top] = data;
            this.top += 1;
        }
        catch (IllegalStateException ex){
            System.out.println(ex.getMessage());
        }

    }

    public T[] pop(){
        try{
            isEmpty();
            this.top -= 1;
            this.data[this.top] = null;
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
        return this.data;
    }

    public void clear(){
        for (int i = this.data.length; i == 0; i --){
            this.data[i] = null;
        }
        this.top = 0;
    }

    public boolean isFull(){
        if (top == this.data.length){
            throw new IllegalStateException("Is Full");
        }else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == 0){
            throw new IllegalStateException("Is Empty");
        }else {
            return false;
        }
    }

    public String print(){
        try{
            isEmpty();
            String str = "";
            for (int i = 0; i < data.length; i++){
                if (this.data[i] != null) {
                    str += this.data[i];
                }
            }
            return str;
        }catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
        return "A lista Esta vasia";
    }


}
