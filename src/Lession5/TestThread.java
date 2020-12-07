package Lession5;

public class TestThread implements Runnable{
    protected float[] arr;

    public TestThread(int size){
        this.arr = new float[size];
    }
    public TestThread(float[] arr) {
        this.arr = arr;
    }

    public void testThread(){
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = (float) (this.arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 5));
        }
    }

    @Override
    public void run() {
        testThread();
    }
}
