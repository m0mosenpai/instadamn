package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: X.SSx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62825SSx {
    public static final C64530TIk A00(C64530TIk c64530TIk) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-1").digest(c64530TIk.A00());
            return S5W.A00(Arrays.copyOf(digest, digest.length));
        } catch (NoSuchAlgorithmException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    public static final C64530TIk A01(X509Certificate x509Certificate) {
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        if (encoded != null) {
            return A00(S5W.A00(Arrays.copyOf(encoded, encoded.length)));
        }
        throw AbstractC166987dD.A12("public key doesn't support encoding");
    }
}
