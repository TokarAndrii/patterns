package singletone;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    //variable to save a single instance
    //volatile means conditional blocking
    //other ways - synhronize get instance()
    //or create object  - private volatile static ChocolateBoiler uniqueinstance = new ChocolateBoiler();
    private volatile static ChocolateBoiler uniqueinstance;

    public ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getUniqueinstance(){
        if (uniqueinstance==null){
            synchronized (ChocolateBoiler.class){
                if (uniqueinstance==null){
                    uniqueinstance = new ChocolateBoiler();
                }
            }

        }
        return uniqueinstance;
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

    public void fill(){
        if (isEmpty()){
            empty=false;
            boiled=false;
        }
    }

    public void drain(){
        if(!isEmpty()&&isBoiled()){
            empty=true;
        }
    }

    public void boil(){
        if (!isEmpty()&&!isBoiled()){
            boiled=true;
        }
    }
}
