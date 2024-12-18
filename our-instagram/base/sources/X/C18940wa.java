package X;

import java.util.Arrays;

/* renamed from: X.0wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18940wa extends C01B {
    public C18940wa() {
        long[] jArr;
        C18590vm c18590vm = AbstractC004701m.A01;
        int max = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(6));
        this.A00 = max;
        if (max == 0) {
            jArr = AbstractC004701m.A00;
        } else {
            int i = ((((max + 1) + 7) + 7) & (-8)) >> 3;
            jArr = new long[i];
            Arrays.fill(jArr, 0, i, -9187201950435737472L);
        }
        this.A02 = jArr;
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & ((-1) ^ j)) | j;
        this.A01 = new float[max];
    }
}
