package mastercluster;

import java.security.Key;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Criptografia {

    private static final String ALGO = "AES";
    private final byte[] keyValue;

    public Criptografia(String key) {
        keyValue = key.getBytes();

    }

    private Key generateKey() {
        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;

    }

    public String encrypt(String data) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(data.getBytes());
        String encryptedValue = Base64.getEncoder().encodeToString(encVal);

        return encryptedValue;

    }

    public String decrypt(String encryptedData) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedValue = Base64.getDecoder().decode(encryptedData);
        byte[] decValue = c.doFinal(decodedValue);
        String decryptedValue = new String(decValue);

        return decryptedValue;

    }

    public static void main(String args[]) {

        try {

            Criptografia criptografia = new Criptografia("lv39eptlvuhaqqsr");
            String encData = criptografia.encrypt("Eu to eh doido");

            System.out.println("Dado encriptado: " + encData);

            String decData = criptografia.decrypt(encData);
            System.out.println("Dado Descriptado: " + decData);

        } catch (Exception e) {
            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, e);
        }

    }

}
