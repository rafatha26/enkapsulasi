public class Buspraktikum {
   private double penumpang,maxpenumpang,counter, penumpangBaru;
   
// konstruktor
public Buspraktikum(double maxpenumpang){
    this.maxpenumpang =maxpenumpang;
    penumpang = 0;
    counter = 0;
    penumpangBaru = 0;
}   
// method mutator
public void addPenumpang (double penumpang){
    double temp;
    temp = this.penumpang + penumpang;
    if (temp >= maxpenumpang){
        System.out.println("Overload penumpang");
    }else {
        this.penumpang = temp;
        counter++;
        penumpangBaru += penumpang;
    }
}
public void getPenumpang (double penumpang){
    double temp;
    temp = (double) this.penumpang - penumpang;
    if (temp < 0){
        System.out.println("Jumlah penumpang tidak bisa kurang dari 0");
    }else{
        this.penumpang = temp ;
    counter--;
    penumpangBaru -= penumpang;
    }
}
public double getAverage(){
    if(counter == 0){
        return 0 ;
    }else{
        return penumpangBaru / counter;
    }
}
public void cetak(){
    System.out.println("Penumpang sekarang = " + penumpang);
    System.out.println("penumpang seharusnya adalah = " + maxpenumpang);
    System.out.println(" Rata-Rata berat penumpang = " + getAverage());
}
}
