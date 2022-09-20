public class Main {
    public static void main(String[] args) {
        char harf = 'ı';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın Harf");
                break;
            default:
                System.out.println("İnce Harf");
        }
    }
}