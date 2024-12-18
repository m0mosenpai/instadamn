package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.SdJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63115SdJ {
    public static long A00;
    public static boolean A01;
    public static final Object A02 = AbstractC58318PtA.A0b();
    public static final Object A03 = AbstractC58318PtA.A0b();

    public static long A01(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & StringTreeSet.MAX_SYMBOL_COUNT) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & StringTreeSet.MAX_SYMBOL_COUNT) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & StringTreeSet.MAX_SYMBOL_COUNT) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & StringTreeSet.MAX_SYMBOL_COUNT) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static long A00(byte[] bArr, int i) {
        long A012 = A01(bArr, i);
        long A013 = A01(bArr, i + 4);
        if (A012 == 0 && A013 == 0) {
            return 0L;
        }
        return ((A012 - 2208988800L) * 1000) + ((A013 * 1000) / 4294967296L);
    }
}
