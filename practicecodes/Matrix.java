package com.wipro.practicecodes;
public class Matrix {
    private int rows;       // Number of rows in the matrix
    private int cols;       // Number of columns in the matrix
    private int[][] data;   // Array to store matrix data

 
    public Matrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Matrix dimensions must be greater than zero.");
        }
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }


    public void fillMatrix(int[][] values) {
        if (values == null || values.length != rows || values[0].length != cols) {
            throw new IllegalArgumentException("Input array dimensions must match the matrix dimensions.");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = values[i][j];
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // Example usage
    public static void main(String[] args) {
        try {
            Matrix myMatrix = new Matrix(3, 2);
            int[][] values = {
                {1, 2},
                {3, 4},
                {5, 6}
            };
            myMatrix.fillMatrix(values);
            System.out.println(myMatrix);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
