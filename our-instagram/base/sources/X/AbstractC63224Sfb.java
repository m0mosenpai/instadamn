package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.Sfb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63224Sfb {
    public static BiometricPrompt.CryptoObject A00(C63291Sgr c63291Sgr) {
        IdentityCredential A00;
        if (c63291Sgr == null) {
            return null;
        }
        Cipher cipher = c63291Sgr.A01;
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = c63291Sgr.A00;
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = c63291Sgr.A02;
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (A00 = c63291Sgr.A00()) == null) {
            return null;
        }
        return SQN.A00(A00);
    }

    public static C63291Sgr A02(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential A01;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new C63291Sgr(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new C63291Sgr(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new C63291Sgr(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (A01 = SQN.A01(cryptoObject)) == null) {
            return null;
        }
        return new C63291Sgr(A01);
    }

    public static C63141Sdn A03(C63291Sgr c63291Sgr) {
        if (c63291Sgr == null) {
            return null;
        }
        Cipher cipher = c63291Sgr.A01;
        if (cipher != null) {
            return new C63141Sdn(cipher);
        }
        Signature signature = c63291Sgr.A00;
        if (signature != null) {
            return new C63141Sdn(signature);
        }
        Mac mac = c63291Sgr.A02;
        if (mac != null) {
            return new C63141Sdn(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || c63291Sgr.A00() == null) {
            return null;
        }
        android.util.Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
        return null;
    }

    public static C63291Sgr A01() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("androidxBiometric", 3);
            builder.setBlockModes("CBC");
            builder.setEncryptionPaddings("PKCS7Padding");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(builder.build());
            keyGenerator.generateKey();
            java.security.Key key = keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, key);
            return new C63291Sgr(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            android.util.Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }
}
