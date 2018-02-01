package task3;

/*
Given the following class;
                  public class IncrementSynchronize {
                                    private int value = 0;
                                    //getNextValue()
                  }
Write three different method options for getNextValue() that will return 'value++', each method needs to be synchronized in a different way.
*/

public class IncrementSynchronize {
    private final Object lock = new Object();

    private int value = 0;

    public synchronized int getNextValueOne() {
        return value++;
    }

    public int getNextValueTwo(){
        synchronized (this) {
            return value++;
        }
    }

    public int getNextValueThree(){
        synchronized (lock) {
            return value++;
        }
    }
}