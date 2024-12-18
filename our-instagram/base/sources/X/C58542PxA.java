package X;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: X.PxA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58542PxA implements InterfaceC65518Tln {
    public final SecretKey A00;

    private byte[] A01(final byte[] plaintext, final byte[] associatedData) {
        int length = plaintext.length;
        if (length <= 2147483619) {
            byte[] bArr = new byte[length + 12 + 16];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.A00);
            cipher.updateAAD(associatedData);
            cipher.doFinal(plaintext, 0, length, bArr, 12);
            System.arraycopy(cipher.getIV(), 0, bArr, 0, 12);
            return bArr;
        }
        throw AbstractC58318PtA.A0x("plaintext too long");
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] AOR(final byte[] ciphertext, final byte[] associatedData) {
        if (ciphertext.length >= 28) {
            try {
                return A00(ciphertext, associatedData);
            } catch (AEADBadTagException e) {
                throw e;
            } catch (GeneralSecurityException | ProviderException e2) {
                android.util.Log.w("AndroidKeystoreAesGcm", "encountered a potentially transient KeyStore error, will wait and retry", e2);
                try {
                    Thread.sleep((int) (Math.random() * 100.0d));
                } catch (InterruptedException unused) {
                }
                return A00(ciphertext, associatedData);
            }
        }
        throw AbstractC58318PtA.A0x("ciphertext too short");
    }

    private byte[] A00(final byte[] ciphertext, final byte[] associatedData) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, ciphertext, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.A00, gCMParameterSpec);
        cipher.updateAAD(associatedData);
        return cipher.doFinal(ciphertext, 12, ciphertext.length - 12);
    }

    public C58542PxA(String keyId) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        SecretKey secretKey = (SecretKey) keyStore.getKey(keyId, null);
        this.A00 = secretKey;
        if (secretKey != null) {
        } else {
            throw new InvalidKeyException(AnonymousClass001.A0R("Keystore cannot load the key with ID: ", keyId));
        }
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] ASM(final byte[] plaintext, final byte[] associatedData) {
        try {
            return A01(plaintext, associatedData);
        } catch (GeneralSecurityException | ProviderException e) {
            android.util.Log.w("AndroidKeystoreAesGcm", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return A01(plaintext, associatedData);
        }
    }
}
