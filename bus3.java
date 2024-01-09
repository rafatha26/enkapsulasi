public class bus3 {
    private int penumpang,maxpenumpang;

    // konstruktor
    public bus3(int maxpenumpang ){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }

    // method mutator
    public void pluspenumpang(int penumpang){
        int temp ;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else{
            this.penumpang=temp;
        }
    }
        public void getPassword(int password){
            if(password==90){
                System.out.println("password benar ");
            }
            else{
                System.out.println("pass salah");
            }
        }
        public void cetak(){
            System.out.println("penumpang sekarang = " +penumpang);
            System.out.println("penumpang seharusnya adalah = " +maxpenumpang);
        }
    }
