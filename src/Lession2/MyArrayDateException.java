package Lession2;

public class MyArrayDateException extends RuntimeException{

    public MyArrayDateException(String message) {
        super(": Не совместимые данные в ячейке:" + message);
    }

    public MyArrayDateException(String message, Throwable cause) {
        super(": Не совместимые данные в ячейке:" + message, cause);
    }

    @Override
    public String toString() {
        String s = this.getClass().getName() + this.getMessage();
        StackTraceElement[] str = this.getCause().getStackTrace();
        for (int i = 0; i < str.length; i++) {
            s+= "\n" + str[i].toString();
        }
        return s;
    }
}
