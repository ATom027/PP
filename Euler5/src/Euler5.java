class Euler5 {
    public static void main(String[] args){

        int nLiczba = 0;

        boolean bznalezione = false;

        for(;;){
            nLiczba++;
            for(int i = 1; i <= 20; i++){
                if(nLiczba % i != 0){
                    i = 20;
                    bznalezione = false;
                }else {
                    bznalezione = true;
                }
                if(i == 20 && bznalezione == true){
                    break;
                }
            }
            if(bznalezione){
                break;
            }
        }
        System.out.println(nLiczba);
    }
}