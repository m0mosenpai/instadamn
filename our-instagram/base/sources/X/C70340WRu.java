package X;

import androidx.media3.common.util.Util;

/* renamed from: X.WRu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70340WRu implements InterfaceC71878X8l {
    public final long A00;
    public final boolean A01;
    public final long[] A02;
    public final long[] A03;

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        W5N w5n;
        if (!this.A01) {
            w5n = W5N.A02;
        } else {
            long[] jArr = this.A03;
            int A02 = Util.A02(jArr, j, true);
            long j2 = jArr[A02];
            long[] jArr2 = this.A02;
            w5n = new W5N(j2, jArr2[A02]);
            if (w5n.A01 != j && A02 != jArr.length - 1) {
                int i = A02 + 1;
                return new C69736VuW(w5n, new W5N(jArr[i], jArr2[i]));
            }
        }
        return new C69736VuW(w5n, w5n);
    }

    public C70340WRu(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        WDn.A01(AbstractC167007dF.A1P(length, length2));
        boolean A1O = AbstractC167007dF.A1O(length2);
        this.A01 = A1O;
        if (A1O && jArr2[0] > 0) {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.A02 = jArr3;
            long[] jArr4 = new long[i];
            this.A03 = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        } else {
            this.A02 = jArr;
            this.A03 = jArr2;
        }
        this.A00 = j;
    }
}
