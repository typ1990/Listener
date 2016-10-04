package test;

/**
 * Created by typ on 2016/10/3.
 */
public class Aa implements Runnable {
    public void run() {
        System.out.println(TestSingleton.getInstance());
    }

    public static void main(String[] args) {
        Aa test1 = new Aa();
        Aa test2 = new Aa();
        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test2);

        thread1.start();
        thread2.start();
    }
}

class TestSingleton {
    private static TestSingleton testSingleton;

    private TestSingleton() {
        System.out.println("建新的对象");
    }

    public static TestSingleton getInstance() {
        if (testSingleton == null) {
            testSingleton = new TestSingleton();
        }
        return testSingleton;
    }
}
