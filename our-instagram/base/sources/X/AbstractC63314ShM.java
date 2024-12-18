package X;

/* renamed from: X.ShM */
/* loaded from: classes10.dex */
public abstract class AbstractC63314ShM {
    public static /* bridge */ /* synthetic */ void A02(char[] cArr, byte b, byte b2, int i) {
        if (b >= -62 && !A03(b2)) {
            AbstractC58322PtE.A16(b, b2, cArr, i);
            return;
        }
        throw C61035Re7.A02();
    }

    public static boolean A03(byte b) {
        return AbstractC25230BEn.A1S(b, -65);
    }

    public static /* bridge */ /* synthetic */ void A00(char[] cArr, byte b, byte b2, byte b3, byte b4, int i) {
        if (!A03(b2) && AbstractC58322PtE.A04(b, b2) == 0 && !A03(b3) && !A03(b4)) {
            AbstractC58323PtF.A10(((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6), b4 & 63, cArr, i);
            return;
        }
        throw C61035Re7.A02();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void A01(char[] r3, byte r4, byte r5, byte r6, int r7) {
        /*
            boolean r0 = A03(r5)
            if (r0 != 0) goto L2f
            r1 = -96
            r0 = -32
            if (r4 != r0) goto L26
            if (r5 < r1) goto L2f
            r4 = -32
        L10:
            boolean r0 = A03(r6)
            if (r0 != 0) goto L2f
            r1 = r4 & 15
            r0 = r5 & 63
            r2 = r6 & 63
            int r1 = r1 << 12
            int r0 = r0 << 6
            r1 = r1 | r0
            r1 = r1 | r2
            char r0 = (char) r1
            r3[r7] = r0
            return
        L26:
            r0 = -19
            if (r4 != r0) goto L10
            if (r5 >= r1) goto L2f
            r4 = -19
            goto L10
        L2f:
            X.Re7 r0 = X.C61035Re7.A02()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63314ShM.A01(char[], byte, byte, byte, int):void");
    }
}
