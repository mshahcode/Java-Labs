package pw1;
public class Exercise5 {
    public static void main(String[] args) {
        float fm [][] = new float [][] {{1,3,2},{3,1,1},{1,2,2}};
        float sm [][] = new float [][] {{2,1,1},{1,0,1},{1,3,1}};
        float[][] prod = mult(fm,sm);
        for(int i = 0 ;i < prod.length;i++){
            for(int j = 0 ; j<prod[0].length;j++){
                System.out.print(" "+prod[i][j]);
            }
              System.out.println();
        }

    }
    public static float[][] mult(float[][] fm,float[][] sm){
        int row1 = fm.length;
        int col1 = fm[0].length;
        int row2 = sm.length;
        int col2 = sm[0].length;
        if(col1!=row2){
            return null;
        }
        float x [][] = new float [row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<row2;k++){
                    x[i][j]+= fm[i][k]*sm[k][j];
                }
            }
        }
        return x;
    }

}
