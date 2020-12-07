package Lession5;

public class Main{
    private static final int SIZE = 10000000;
    private static final int H = SIZE/2;

    public static void main(String[] args) {
        testNonThread();
        testThread();
    }

    public static void testNonThread(){
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i]=1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 5));
        }
        System.out.println(System.currentTimeMillis()-a);
    }

    public static void testThread(){
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        TestThread testThread1 = new TestThread(H);
        TestThread testThread2 = new TestThread(H);
        long a = System.currentTimeMillis();
        System.arraycopy(arr,0,testThread1.arr, 0, H);
        System.arraycopy(arr,H,testThread2.arr, 0, H);
        new Thread(testThread1).start();
        new Thread(testThread2).start();
        System.arraycopy(testThread1.arr, 0, arr,0,H);
        System.arraycopy(testThread2.arr,0,arr,H,H);
        System.out.println(System.currentTimeMillis()-a);
    }
}
