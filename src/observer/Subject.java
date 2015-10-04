package observer;

/**
 * Created by root on 04.10.15.
 */
public interface Subject {
    //One to many relationships!!!!!

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
