public class Main {
    public static void main(String[] args) {
        int sayac ;

        for (int j=2 ; j <= 100; j++){
            sayac = 0;
            for (int i = 2 ; i <= j / 2 ; i++){
                if (j % i == 0){
                    sayac ++ ;
                    break;

                }
            }
            if (sayac == 0){
                System.out.println(j);
            }
        }
    }
}

