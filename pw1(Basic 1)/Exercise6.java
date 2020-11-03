package pw1;
public class Exercise6 {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6, 7 };
        int twolist[][]={{1,2,3},{4,5,6},{7,8,9}};
        int given = 4;
        System.out.println("Found given number in array at position: "+findonedimensoinal(list,given));
        System.out.print("Found given number in 2 dimensional array : ");
        findtwodimensional(twolist,given);

    }
    public static int findonedimensoinal(int[] array, int given) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == given) {
                return i;
            }
        }
        return -1;
    }
    public static void findtwodimensional(int[][] twolist, int given){
        int flag =0;
        for (int i = 0; i < twolist.length; i++) {
            for (int j = 0;j< twolist[0].length; j++) {
                if (twolist[i][j] == given) {
                    flag = 1;
                    System.out.println(i+" (row) and "+j+" (column)");
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
    }
}
