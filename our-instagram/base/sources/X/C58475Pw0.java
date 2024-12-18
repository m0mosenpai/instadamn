package X;

import java.util.Arrays;

/* renamed from: X.Pw0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58475Pw0 {
    public int A00;
    public long[] A01 = new long[2];

    public final void A00(long j) {
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A01[i2] == j) {
                return;
            }
        }
        long[] jArr = this.A01;
        int length = jArr.length;
        if (i >= length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, length * 2));
            C14360o3.A07(jArr);
            this.A01 = jArr;
        }
        jArr[i] = j;
        if (i >= this.A00) {
            this.A00 = i + 1;
        }
    }

    public final void A01(long j) {
        int i = this.A00;
        int i2 = 0;
        while (i2 < i) {
            long[] jArr = this.A01;
            if (j == jArr[i2]) {
                if (i2 < i) {
                    int i3 = i - 1;
                    while (i2 < i3) {
                        int i4 = i2 + 1;
                        jArr[i2] = jArr[i4];
                        i2 = i4;
                    }
                    this.A00 = i - 1;
                    return;
                }
                return;
            }
            i2++;
        }
    }
}
