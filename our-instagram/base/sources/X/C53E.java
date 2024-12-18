package X;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Locale;

/* renamed from: X.53E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C53E {
    public static C53E A02;
    public final C53F A00 = new C53F();
    public final boolean A01;

    public C53E(boolean z) {
        this.A01 = z;
    }

    public final String A00() {
        KeyStore.Entry A01 = this.A00.A01(MSV.A00(1716));
        try {
            if (A01 instanceof KeyStore.PrivateKeyEntry) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(((KeyStore.PrivateKeyEntry) A01).getCertificate().getPublicKey().getEncoded());
                byte[] digest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(String.format(Locale.US, "%02x", Byte.valueOf(b)));
                }
                return sb.toString();
            }
            throw new IllegalStateException("Attestation key is not PrivateKeyEntry in keystore");
        } catch (IllegalArgumentException | IllegalStateException | GeneralSecurityException e) {
            throw new Exception("Unable to get key hash", e);
        }
    }

    public final byte[] A01(C53G c53g, String str, byte[] bArr) {
        KeyStore.Entry A01 = this.A00.A01(str);
        try {
            if (A01 instanceof KeyStore.PrivateKeyEntry) {
                Signature signature = Signature.getInstance(c53g.A00);
                signature.initSign(((KeyStore.PrivateKeyEntry) A01).getPrivateKey());
                signature.update(bArr);
                return signature.sign();
            }
            throw new IllegalStateException("Attestation key is not PrivateKeyEntry in keystore");
        } catch (IllegalArgumentException | IllegalStateException | GeneralSecurityException e) {
            throw new Exception("Unable to sign data", e);
        }
    }
}
