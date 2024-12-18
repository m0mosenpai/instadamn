package X;

import java.util.Arrays;

/* renamed from: X.0vr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18640vr extends AbstractC003901e {
    public int A00;

    public final void A04() {
        this.A01 = 0;
        long[] jArr = this.A03;
        if (jArr != AbstractC004701m.A00) {
            Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
            long[] jArr2 = this.A03;
            int i = super.A00;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & ((-1) ^ j)) | j;
        }
        AbstractC06960Yn.A0V(this.A04, 0, super.A00);
        A01(this);
    }

    public static final int A00(C18640vr c18640vr, int i) {
        int i2 = ((AbstractC003901e) c18640vr).A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = c18640vr.A03;
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

    public static final void A01(C18640vr c18640vr) {
        int i;
        int i2 = ((AbstractC003901e) c18640vr).A00;
        C18590vm c18590vm = AbstractC004701m.A01;
        if (i2 == 7) {
            i = 6;
        } else {
            i = i2 - (i2 / 8);
        }
        c18640vr.A00 = i - c18640vr.A01;
    }

    public static final void A02(C18640vr c18640vr, int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            C18590vm c18590vm = AbstractC004701m.A01;
            i2 = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            i2 = 0;
        }
        ((AbstractC003901e) c18640vr).A00 = i2;
        if (i2 == 0) {
            jArr = AbstractC004701m.A00;
        } else {
            int i3 = ((((i2 + 1) + 7) + 7) & (-8)) >> 3;
            jArr = new long[i3];
            Arrays.fill(jArr, 0, i3, -9187201950435737472L);
        }
        c18640vr.A03 = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & ((-1) ^ j)) | j;
        A01(c18640vr);
        c18640vr.A04 = new Object[i2];
        c18640vr.A02 = new float[i2];
    }

    public C18640vr() {
        C18590vm c18590vm = AbstractC004701m.A01;
        A02(this, 6);
    }
}
