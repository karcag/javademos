public class Main {
    public static void main(String[] args) {
        //For
        for (int i=0; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngü bitti");
        //While
        int i=0;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngü bitti");
        //do while
        int j=0;
        do{
            System.out.println(j);
            j+=2;
        } while(j<10);
        System.out.println("Do While Döngü bitti");
    }
}