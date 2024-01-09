public class testbuspratikum {
    public static void main(String[] args) {
        Buspraktikum busMini= new Buspraktikum(10);
        busMini.addPenumpang(5);
        busMini.addPenumpang(6);
        busMini.addPenumpang(10);
        busMini.addPenumpang(15);
        busMini.cetak();

        busMini.getAverage();
        busMini.cetak();
    }
}
