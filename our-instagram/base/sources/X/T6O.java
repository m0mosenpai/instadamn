package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes10.dex */
public final class T6O implements InterfaceC65419Tjq, Serializable {
    public final int A00;
    public final MessageDigest A01;
    public final boolean A02;

    public T6O() {
    }

    public final String toString() {
        return "Hashing.sha256()";
    }

    public T6O(String str, String str2) {
        this();
        MessageDigest A00 = A00("SHA-256");
        this.A01 = A00;
        this.A00 = A00.getDigestLength();
        this.A02 = A01(A00);
    }

    public final RO6 A02() {
        if (this.A02) {
            try {
                return new RO6((MessageDigest) this.A01.clone(), this.A00);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new RO6(A00(this.A01.getAlgorithm()), this.A00);
    }

    public static MessageDigest A00(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    public static boolean A01(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // X.InterfaceC65419Tjq
    public final RO7 FFY(CharSequence charSequence) {
        int length = charSequence.length();
        int i = length + length;
        if (i >= 0) {
            RO6 A02 = A02();
            int length2 = charSequence.length();
            for (int i2 = 0; i2 < length2; i2++) {
                A02.A02(charSequence.charAt(i2));
            }
            return A02.A01();
        }
        throw AbstractC166987dD.A12(AbstractC62215S2k.A00(AbstractC43591JPw.A00(969), AbstractC25228BEl.A1Y(i)));
    }
}
