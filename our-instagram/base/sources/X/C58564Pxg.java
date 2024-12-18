package X;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* renamed from: X.Pxg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58564Pxg {
    public static final Object A00 = AbstractC58318PtA.A0b();

    public static boolean A00(String keyUri) {
        String str;
        boolean containsAlias;
        boolean z;
        synchronized (A00) {
            String A002 = AbstractC58563Pxf.A00(keyUri);
            try {
                try {
                    str = "AndroidKeyStore";
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    containsAlias = keyStore.containsAlias(A002);
                    if (!containsAlias) {
                        String A003 = AbstractC58563Pxf.A00(keyUri);
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", str);
                        keyGenerator.init(new KeyGenParameterSpec.Builder(A003, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                        keyGenerator.generateKey();
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (IOException e) {
                    throw new GeneralSecurityException(e);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (NullPointerException unused) {
                    android.util.Log.w("AndroidKeystoreKmsClient", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
                    try {
                        Thread.sleep((int) (Math.random() * 40.0d));
                    } catch (InterruptedException unused2) {
                    }
                    try {
                        str = "AndroidKeyStore";
                        KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
                        keyStore2.load(null);
                        containsAlias = keyStore2.containsAlias(A002);
                    } catch (IOException e2) {
                        throw new GeneralSecurityException(e2);
                    }
                }
            }
        }
        return z;
    }

    public final C58542PxA A01(String uri) {
        C58542PxA c58542PxA;
        try {
            synchronized (A00) {
                c58542PxA = new C58542PxA(AbstractC58563Pxf.A00(uri));
                byte[] A002 = AbstractC58567Pxj.A00(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(A002, c58542PxA.AOR(c58542PxA.ASM(A002, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return c58542PxA;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
