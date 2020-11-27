package Lession2;

public class Main {

    public static void main(String[] args) {

        String[][] s = new String[5][4];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s[i][j]=String.valueOf(i+j);
            }
        }
        s[3][2] = "sadf"+5;
        exceptionTest(s);


    }
    protected static void exceptionTest(String[][] arr) throws RuntimeException{
        try {
            if (arr.length!=4 &arr[0].length!=4 & arr.equals(null)) throw new MyArraySizeException();
            int counter = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    counter += Integer.parseInt(arr[i][j]);
                }
            }
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (NumberFormatException b){
            throw new MyArrayDateException();
        }
    }
}
