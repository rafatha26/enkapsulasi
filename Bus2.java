public class Bus2 {
    private int penumpang,maxpenumpang;

    //konstruktor,membuat sebuah attribute yang hanya bisa diakses pada class yang sama. 

    public Bus2 (int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    //method mutator,membuat sebuah attribute yang hanya bisa diakses pada class yang sama. 

    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if(temp>=maxpenumpang){
            System.out.println("Overload penumpang");

        }
        else{
            this.penumpang=temp;
        }
    }
    // membuat sebuah method mutator yang berfungsi untuk memanggil attribute dari penumpang sehingga dapat diakses pada class yang berbeda, menambahkan nilai dari attribute dan parameter penumpang dan dimasukkan ke dalam variable temp, dan melakukan pengkondisian yaitu : jika temp lebih besar daripada maxpenumpang, cetak String “Overload penumpang”, jika lebih kecil dari max penumpang maka tetapkan nilai penumpang = temp. 

    public void cetak (){
        System.out.println("penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+ maxpenumpang);
    }
    // membuat sebuah method Bernama cetak untuk mencetak nilai dari attribute  penumpang dan juga max penumpang.
}

