public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Matrix m1 = new Matrix(2, 3);
        m1.setElement(1, 1, 2);
        m1.setElement(1, 2, 2);
        m1.setElement(1, 0, 3);
        m1.setElement(0, 1, 1);
        m1.setElement(0, 2, 5);
        m1.setElement(0, 0, 6);
        m1.displayMatrix();
        Matrix m2 = m1.transp(); // транспонированная матрица
        m2.displayMatrix();


        Matrix m3 = new Matrix(2, 2);
        m3.setElement(0, 1, 1);
        m3.setElement(0, 0, 6);
        m3.setElement(1, 0, 3);
        m3.setElement(1, 1, 2);
        m3.displayMatrix();
        Matrix m4 = m3.step(3); // возведение в степень (с применением mult - умножение)
        m4.displayMatrix();

        Matrix m5 = new Matrix(2,2);
        m5.setElement(0, 1, 5);
        m5.setElement(0, 0, 5);
        m5.setElement(1, 0, 5);
        m5.setElement(1, 1, 5);

        Matrix m6 = m5.minus(m3).plus(m5).plus(m5);
        m6.displayMatrix(); // сложение и вычитание

        Matrix m7 = m5.multByCifer(88);
        m7.displayMatrix();
    }

}