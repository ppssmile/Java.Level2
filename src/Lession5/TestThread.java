package Lession5;

public class TestThread implements Runnable{
    protected float[] arr;
    Thread t;

    public TestThread(int size, String nameThread){
        this.arr = new float[size];
        this.t = new Thread(this);
        t.setName(nameThread);
    }
    public TestThread(float[] arr) {
        this.arr = arr;
    }

    public void testThread(){
        System.out.println("enter to testThread for Thread"+Thread.currentThread().getName());
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = (float) (this.arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 5));
            if (i==this.arr.length/2){
                System.out.println("Dot to half "+ Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Dot to exit "+ Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        testThread();
    }
}
