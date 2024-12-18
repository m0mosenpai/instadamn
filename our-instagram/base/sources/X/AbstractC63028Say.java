package X;

/* renamed from: X.Say, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63028Say {
    public static final char[] A00 = "0123456789abcdef".toCharArray();

    public abstract int A00();

    public abstract int A01();

    public abstract boolean A02(AbstractC63028Say abstractC63028Say);

    public abstract byte[] A03();

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC63028Say)) {
            return false;
        }
        AbstractC63028Say abstractC63028Say = (AbstractC63028Say) obj;
        if (A01() != abstractC63028Say.A01() || !A02(abstractC63028Say)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (A01() >= 32) {
            return A00();
        }
        byte[] A03 = A03();
        int i = A03[0] & 255;
        for (int i2 = 1; i2 < A03.length; i2++) {
            i |= (A03[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] A03 = A03();
        int length = A03.length;
        StringBuilder A0q = AbstractC58318PtA.A0q(length + length);
        for (byte b : A03) {
            char[] cArr = A00;
            A0q.append(cArr[(b >> 4) & 15]);
            A0q.append(cArr[b & 15]);
        }
        return A0q.toString();
    }
}
