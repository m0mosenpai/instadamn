package X;

/* renamed from: X.Sbr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63070Sbr {
    public static Object A01(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        throw AbstractC166987dD.A12(AbstractC58320PtC.A12("must be power of 2 between 2^1 and 2^30: ", AbstractC58318PtA.A0q(52), i));
    }

    public static int A00(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static void A02(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
