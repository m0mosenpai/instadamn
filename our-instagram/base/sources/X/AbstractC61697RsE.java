package X;

/* renamed from: X.RsE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61697RsE {
    public static void A00(char[] cArr, byte b, byte b2, byte b3, int i) {
        if (b2 <= -65 && (b != -32 ? b != -19 || b2 < -96 : b2 >= -96) && b3 <= -65) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw AbstractC166987dD.A12("Invalid UTF-8");
    }
}
