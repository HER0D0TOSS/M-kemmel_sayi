public class Main {

    public static void main(String[] args) {

        int sayi=6;
        int hesap=0;
        for(int i=1;i<=sayi;i++){
            if(sayi % i==0){
                hesap+=i;
                if(i==sayi){
                    hesap-=sayi;
                }
            }
        }
        if(hesap ==sayi){
            System.out.println("Bu sayı mükemmel: ");
            System.out.print(hesap);
        }
        else{
            System.out.println("Geçersiz Deger !");
        }
    }
}
