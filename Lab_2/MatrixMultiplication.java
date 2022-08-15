/*Read matrix and perform multiplication into third one!*/

import java.util.Scanner;

class MatrixMul{
    Scanner sc2 = new Scanner(System.in);
    int i;
    int j;
    int[][] matrixValues;

    public MatrixMul(){
        System.out.println("Enter the number of rows : ");
        this.i = sc2.nextInt();
        System.out.println("Enter the number of columns : ");
        this.j = sc2.nextInt();
    }
    public MatrixMul(int i,int j){
        this.i = i;
        this.j = j;
    }
    public void createMatrix(){
        matrixValues = new int[i][j];
    }    
    public void setElementsValues(){
        for(int m = 0;m<this.i;m++){
            for(int n = 0; n<this.j ; n++){
                System.out.println("Enter the number["+(m+1)+"]["+(n+1)+"]");
                matrixValues[m][n] = sc2.nextInt();
            }
        }
    }
    public  void createMatrixSetValues(){    
        matrixValues = new int[i][j];
        this.setElementsValues();
    }

    public void printElements(){
        System.out.println("Matrix is:");
        for(int m = 0; m<i;m++){
            for(int n = 0; n<j;n++){
                System.out.print(matrixValues[m][n]+"       ");
            }
            System.out.println("");
        }
    }
    //Main Class
    public MatrixMul multiplyMatrix(MatrixMul getM){
        MatrixMul m = new MatrixMul(this.i,getM.j);
        if(getM.i != this.j){
            System.out.println("your matrix can't be multiplied.The Answer you may get will be wrong");
        }
        else{
            m.createMatrix();
            for(int x = 0; x<this.i ; x++){
                for(int y = 0; y<getM.j ; y++){
                    for(int z = 0; z < getM.i ;z++){
                        m.matrixValues[x][y] += this.matrixValues[x][z]*getM.matrixValues[z][y]; 
                    }
                }
            }
        }
        return m;
    }
}

public class MatrixMultiplication {
    public static void main(String[] args) {
        MatrixMul m1 = new MatrixMul();
        m1.createMatrixSetValues();
        m1.printElements();
        MatrixMul m2 = new MatrixMul();
        m2.createMatrixSetValues();
        m2.printElements();
        MatrixMul m3 = m1.multiplyMatrix(m2);
        System.out.println("================RESULT================");
        m3.printElements();
    }
}