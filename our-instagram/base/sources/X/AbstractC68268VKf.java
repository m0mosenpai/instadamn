package X;

/* renamed from: X.VKf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68268VKf {
    public static long A00(WFa wFa, int i, int i2) {
        wFa.A0O(i);
        int i3 = wFa.A00;
        if (i3 - wFa.A01 < 5) {
            return -9223372036854775807L;
        }
        int A01 = wFa.A01();
        if ((8388608 & A01) != 0 || ((2096896 & A01) >> 8) != i2 || (A01 & 32) == 0 || wFa.A05() < 7 || i3 - wFa.A01 < 7 || (wFa.A05() & 16) != 16) {
            return -9223372036854775807L;
        }
        wFa.A0R(new byte[6], 0, 6);
        return ((r7[0] & 255) << 25) | ((r7[1] & 255) << 17) | ((r7[2] & 255) << 9) | ((r7[3] & 255) << 1) | ((255 & r7[4]) >> 7);
    }
}
