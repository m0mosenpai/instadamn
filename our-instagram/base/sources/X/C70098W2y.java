package X;

/* renamed from: X.W2y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70098W2y {
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C69793VvZ A07 = new C69793VvZ();
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;
    public final WFa A06 = new WFa();

    public static long A00(WFa wFa) {
        int i = wFa.A01;
        if (wFa.A00 - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        wFa.A0R(bArr, 0, 9);
        wFa.A0O(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        return (((j & 56) >> 3) << 30) | ((j & 3) << 28) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }
}
