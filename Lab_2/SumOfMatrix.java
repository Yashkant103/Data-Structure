/*Read 2x2 matrix and perform Addition into third one!*/
import java.util.Scanner;
class Matrix{
    int[][] matrix = new int[2][2];
    Scanner sc = new Scanner(System.in);
    public void printMatrix(){
        System.out.println("Matrix is :");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println("");
        }
    }

    public void storeMatrix(){
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.println("Enter the number ["+(i+1)+"]["+(j+1)+"]:");
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public void addMatrix(Matrix m1){
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                this.matrix[i][j] += m1.matrix[i][j];
            }
        }   
        this.printMatrix();
    }
}
public class SumOfMatrix{
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        m1.storeMatrix();
        Matrix m2 = new Matrix();
        m2.storeMatrix();
        m1.addMatrix(m2);
    }   
}