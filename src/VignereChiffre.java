public class VignereChiffre {
    public static char[] crypt(char[] plain, char[] key, int richtung) {

        char[] output = new char[plain.length];

        for (int i = 0; i < plain.length; i++) {

            if (richtung == 1) {
                int result = (plain[i] + key[i % key.length]) % 128;
                output[i] = (char) result;
            } else if (richtung == 0) {
                int result;
                if (plain[i] - key[i % key.length] < 0) result = (plain[i] - key[i % key.length]) + 128;
                else result = (plain[i] - key[i % key.length]) % 128;
                output[i] = (char) result;

            }
        }

        return output;

    }
}