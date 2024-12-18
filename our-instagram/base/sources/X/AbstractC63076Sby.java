package X;

/* renamed from: X.Sby, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63076Sby {
    public static void A00(char[] cArr, byte b, byte b2, byte b3, byte b4, int i) {
        if (b2 <= -65 && AbstractC58322PtE.A04(b, b2) == 0 && b3 <= -65 && b4 <= -65) {
            AbstractC58323PtF.A10(AbstractC58323PtF.A04(b, b2, b3), b4 & 63, cArr, i);
            return;
        }
        throw AbstractC58320PtC.A0e("Protocol message had invalid UTF-8.");
    }

    public static void A01(char[] cArr, byte b, byte b2, byte b3, int i) {
        if (b2 <= -65 && (b != -32 ? b != -19 || b2 < -96 : b2 >= -96) && b3 <= -65) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw AbstractC58320PtC.A0e("Protocol message had invalid UTF-8.");
    }

    public static void A02(char[] cArr, byte b, byte b2, int i) {
        if (b >= -62 && b2 <= -65) {
            AbstractC58322PtE.A16(b, b2, cArr, i);
            return;
        }
        throw AbstractC58320PtC.A0e("Protocol message had invalid UTF-8.");
    }
}
