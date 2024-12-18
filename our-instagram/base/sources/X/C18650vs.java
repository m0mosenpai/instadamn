package X;

import java.util.Arrays;

/* renamed from: X.0vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18650vs extends C01Y {
    public int A00;

    public static final int A00(C18650vs c18650vs, int i) {
        int i2 = ((C01Y) c18650vs).A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = c18650vs.A03;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & (((-1) ^ j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public static final void A01(C18650vs c18650vs, int i) {
        int i2;
        long[] jArr;
        int i3;
        if (i > 0) {
            C18590vm c18590vm = AbstractC004701m.A01;
            i2 = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            i2 = 0;
        }
        ((C01Y) c18650vs).A00 = i2;
        if (i2 == 0) {
            jArr = AbstractC004701m.A00;
        } else {
            int i4 = ((((i2 + 1) + 7) + 7) & (-8)) >> 3;
            jArr = new long[i4];
            Arrays.fill(jArr, 0, i4, -9187201950435737472L);
        }
        c18650vs.A03 = jArr;
        int i5 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i5] = (jArr[i5] & ((-1) ^ j)) | j;
        int i6 = ((C01Y) c18650vs).A00;
        C18590vm c18590vm2 = AbstractC004701m.A01;
        if (i6 == 7) {
            i3 = 6;
        } else {
            i3 = i6 - (i6 / 8);
        }
        c18650vs.A00 = i3 - c18650vs.A01;
        c18650vs.A02 = new long[i2];
    }

    public C18650vs() {
        C18590vm c18590vm = AbstractC004701m.A01;
        A01(this, 6);
    }
}
