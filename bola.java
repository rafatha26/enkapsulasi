public class bola {
    private double jarijari;

    public bola(){
        this.jarijari = 0.0;
    }
    public void setjarijari(double jarijari){
        if (jarijari > 0){
            this.jarijari = jarijari;
        }else {
            System.out.println("jari-jari harus lebih dari 0.");
        }
    }
    public double showDiameter(){
        return 2 * jarijari;
    }
    public double showluaspermukaan(){
        return 4 * Math.PI * Math.pow(2, jarijari);
    }
    public double showVolume(){
        return (4/3) * Math.PI * Math.pow(3, jarijari);
    }
    public static void main(String[] args) {
        //langkah 1: Membuat variable jarijari
        double jarijarivariable = 5.0;
        //langkah 2 : Menciptakan objek Bola
        bola bolaObjek = new bola();
        //langkah 3: Memanggil method showDiameter(),showluaspermukaan(),dan showvolume()
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("luas permukaan : " + bolaObjek.showluaspermukaan());
        System.out.println("volume: " + bolaObjek.showVolume());

        //langkah 4: Memanipulasi objek dengan memanggil method setjarijari()
        bolaObjek.setjarijari(jarijarivariable);

        //langkah 5:  Menampilkan hasil setelah manipuulasi
        System.out.println("\n Setelah manipulasi:");
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("luas permukaan: " + bolaObjek.showluaspermukaan());
        System.out.println("Volume: " + bolaObjek.showVolume());
    }
}
