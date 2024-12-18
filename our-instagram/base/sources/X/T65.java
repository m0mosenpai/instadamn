package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes10.dex */
public final class T65 implements InterfaceC65257Tgn, Serializable {
    public final int A00;
    public final MessageDigest A01;
    public final boolean A02;

    public T65() {
    }

    public final String toString() {
        return "Hashing.sha256()";
    }

    public T65(String str, String str2) {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.A01 = messageDigest;
            this.A00 = messageDigest.getDigestLength();
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.A02 = z;
        } catch (NoSuchAlgorithmException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }
}
