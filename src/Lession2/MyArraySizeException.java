package Lession2;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException(String s) {
        super(": Не верный размер массива. " + s);
    }

    @Override
    public String toString() {
        String s = this.getClass().getName() + this.getMessage();
        StackTraceElement[] str = this.getStackTrace();
        for (int i = 0; i < str.length; i++) {
            s+= "\n" + str[i].toString();
        }
        return s;
    }
}
