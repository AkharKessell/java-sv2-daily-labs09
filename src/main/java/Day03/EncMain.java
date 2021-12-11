package Day03;

public class EncMain {
    public static void main(String[] args) {
        Encryption encryption = new Caesar(13);

        String s = encryption.encrypts(encryption.encrypts("APPLE"));

        System.out.println(s);
    }
}