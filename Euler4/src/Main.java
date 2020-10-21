public class Main {
    public static void main(String[] args) {
        int max = 0;
        for(int i = 999; i > 100; i--){
            for(int j = 999; j >= i; j--){
                if(max < j*i){
                    if(isPandrome(j*i)){
                        max = j*i;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static boolean isPandrome(int x){
        String sLiczba = Integer.toString(x);
        StringBuilder sbX = new StringBuilder();
        String sRLiczba = sbX.append(sLiczba).reverse().toString();

        if(sRLiczba.equals(sLiczba)){
            return true;
        } else {
            return false;
        }
    }
}