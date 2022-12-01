public class Main {
    public static void main(String[] args) {
        char[] key = "0123456789".toCharArray();
        char[] plain = "Hallo dies ist ein langer Test".toCharArray();
        char[] secret = "".toCharArray();
        System.out.println(plain);
        secret = VignereChiffre.crypt(plain, key, 0);
        System.out.println(secret);
        plain = VignereChiffre.crypt(secret, key, 1);
        System.out.println(plain);
    }
}
