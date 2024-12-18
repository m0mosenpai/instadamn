package X;

import androidx.media3.common.util.Util;

/* loaded from: classes11.dex */
public final class WRF implements InterfaceC71938XBn {
    public final int A00;
    public final C69793VvZ A01;
    public final WFa A02 = new WFa();

    @Override // X.InterfaceC71938XBn
    public final void Djt() {
        this.A02.A0Q(Util.A07, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        return new X.W2N(-9223372036854775807L, r15 + r4, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (r13 == (-9223372036854775807L)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        return new X.W2N(r13, r15 + r0, -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        return X.W2N.A03;
     */
    @Override // X.InterfaceC71938XBn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.W2N EMY(X.XGj r26, long r27) {
        /*
            r25 = this;
            r4 = r26
            long r15 = r4.BeZ()
            r2 = 112800(0x1b8a0, double:5.57306E-319)
            long r0 = r4.getLength()
            long r0 = r0 - r15
            long r2 = java.lang.Math.min(r2, r0)
            int r1 = (int) r2
            r8 = r25
            X.WFa r3 = r8.A02
            r3.A0M(r1)
            byte[] r0 = r3.A02
            r11 = 0
            r4.E3s(r0, r11, r1)
            int r7 = r3.A00
            r0 = -1
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = -1
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L30:
            int r6 = r3.A00
            int r2 = r3.A01
            int r6 = r6 - r2
            r9 = 188(0xbc, float:2.63E-43)
            if (r6 < r9) goto L8c
            byte[] r10 = r3.A02
        L3b:
            if (r2 >= r7) goto L46
            r9 = r10[r2]
            r6 = 71
            if (r9 == r6) goto L46
            int r2 = r2 + 1
            goto L3b
        L46:
            int r6 = r2 + 188
            if (r6 > r7) goto L8c
            int r0 = r8.A00
            long r0 = X.AbstractC68268VKf.A00(r3, r2, r0)
            int r9 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r9 == 0) goto L7a
            X.VvZ r9 = r8.A01
            long r18 = r9.A02(r0)
            int r0 = (r18 > r27 ? 1 : (r18 == r27 ? 0 : -1))
            if (r0 <= 0) goto L6e
            int r0 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r0 != 0) goto L7f
            r22 = -1
            X.W2N r12 = new X.W2N
            r17 = r12
            r20 = r15
            r17.<init>(r18, r20, r22)
            return r12
        L6e:
            r4 = 100000(0x186a0, double:4.94066E-319)
            long r4 = r4 + r18
            int r0 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            long r4 = (long) r2
            if (r0 > 0) goto L7f
            r13 = r18
        L7a:
            r3.A0O(r6)
            long r0 = (long) r6
            goto L30
        L7f:
            long r15 = r15 + r4
            X.W2N r12 = new X.W2N
            r19 = r12
            r22 = r15
            r24 = r11
            r19.<init>(r20, r22, r24)
            return r12
        L8c:
            int r2 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r2 == 0) goto L99
            long r15 = r15 + r0
            r17 = -2
            X.W2N r12 = new X.W2N
            r12.<init>(r13, r15, r17)
            return r12
        L99:
            X.W2N r12 = X.W2N.A03
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRF.EMY(X.XGj, long):X.W2N");
    }

    public WRF(C69793VvZ c69793VvZ, int i) {
        this.A00 = i;
        this.A01 = c69793VvZ;
    }
}
