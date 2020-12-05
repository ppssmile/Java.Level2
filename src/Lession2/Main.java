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
        System.out.println("Максим, я услышал Ваше замечание на последнем вебинаре и принял к сведению.\n" +
                "Мной прилагаются максимальные усилия, чтобы ретироваться.\n" +
                "Примите мои извинения, как ученика к преподователю...");


    }
    protected static void exceptionTest(String[][] arr){
        int counter = 0;
        try {
            if (arr.length!=4 || arr[0].length!=4 || arr.equals(null)) throw new MyArraySizeException("\n                               " +
                    "Подайте массив размером 4х4, вместо поданного: " + arr.length+"x"+arr[0].length);
        }catch (MyArraySizeException e){
            System.out.println(e.toString()+"\n\n");
        }
        int a = 0;
        int b = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    a=i;
                    b=j;
                    counter += Integer.parseInt(arr[i][j]);
                }
            }
        }catch (NumberFormatException e){
            try {
                throw new MyArrayDateException("\n                               " +
                        "arr["+a+"]"+"["+b+"] = " + arr[a][b], e);
            }catch (MyArrayDateException d){
                System.out.println(d.toString()+"\ncounter = "+ counter +  "\n");
            }
        }
    }
}
