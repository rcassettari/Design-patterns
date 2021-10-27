package br.com.patterns.singleton;

public class SingletonTester {

    public static void main(String[] args) {

        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking = ThreadSafeDoubleCheckLocking.getInstance();

        System.out.println(threadSafeDoubleCheckLocking.toString());

        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLockingTwo = ThreadSafeDoubleCheckLocking.getInstance();

        System.out.println(threadSafeDoubleCheckLockingTwo.toString());
    }
}
