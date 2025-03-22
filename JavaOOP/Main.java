package JavaOOP;


public class Main {
    public static void main(String[] args) {
        Animal macan = new Animal( "macan",  "mamalia", "rumput", 100);
        Animal gajah = new Animal( "gajah",  "mamalia", "ikan",  50);
        Cat anggora = new Cat ( "Kocheng", " Anggora", "Whiskas", 2,true, 24);
        System.out.println(gajah.name);
        System.out.println(macan.name);
        System.out.println(anggora.name);
    }
}
