package X;

import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import kotlin.Deprecated;

@Deprecated(message = "Use CryptographyUtil")
/* renamed from: X.SBp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62436SBp {
    public KeyStore A00;

    public C62436SBp() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        this.A00 = keyStore;
        if (keyStore.containsAlias("alias")) {
            try {
                Cipher.getInstance("RSA/ECB/PKCS1Padding").init(2, this.A00.getKey("alias", null));
                return;
            } catch (Exception e) {
                if (!(e instanceof KeyStoreException) && !(e instanceof NoSuchAlgorithmException) && !(e instanceof UnrecoverableKeyException) && !(e instanceof NoSuchPaddingException) && !(e instanceof InvalidKeyException)) {
                    throw e;
                }
            }
        }
        keyStore.deleteEntry("alias");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        C14360o3.A07(keyPairGenerator);
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("alias", 3).setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").build();
        C14360o3.A07(build);
        keyPairGenerator.initialize(build);
        keyPairGenerator.generateKeyPair();
    }
}
