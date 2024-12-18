package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class Wc1 implements InterfaceC126735oD {
    public final long[] A00;
    public final C4WQ[] A01;

    @Override // X.InterfaceC126735oD
    public final long B2n(int i) {
        C4B8.A03(MSY.A1R(i));
        long[] jArr = this.A00;
        C4B8.A03(i < jArr.length);
        return jArr[i];
    }

    @Override // X.InterfaceC126735oD
    public final List Au4(long j) {
        C4WQ c4wq;
        int A04 = Util.A04(this.A00, j, false);
        if (A04 != -1 && (c4wq = this.A01[A04]) != C4WQ.A0D) {
            return Collections.singletonList(c4wq);
        }
        return Collections.emptyList();
    }

    @Override // X.InterfaceC126735oD
    public final int B2o() {
        return this.A00.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC126735oD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int BWs(long r6) {
        /*
            r5 = this;
            long[] r4 = r5.A00
            int r3 = java.util.Arrays.binarySearch(r4, r6)
            if (r3 >= 0) goto Lf
            r3 = r3 ^ (-1)
        La:
            int r0 = r4.length
            if (r3 < r0) goto Le
            r3 = -1
        Le:
            return r3
        Lf:
            int r3 = r3 + 1
            int r0 = r4.length
            if (r3 >= r0) goto La
            r1 = r4[r3]
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto La
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Wc1.BWs(long):int");
    }

    public Wc1(long[] jArr, C4WQ[] c4wqArr) {
        this.A01 = c4wqArr;
        this.A00 = jArr;
    }
}
