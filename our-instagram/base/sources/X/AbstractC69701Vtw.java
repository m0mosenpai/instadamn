package X;

/* renamed from: X.Vtw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69701Vtw {
    public C70097W2x A00;
    public final C70342WRw A01;
    public final InterfaceC71938XBn A02;
    public final int A03;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0027, code lost:
    
        if (r2 == r23.BeZ()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r24.A00 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00(X.XGj r23, X.VZk r24) {
        /*
            r22 = this;
        L0:
            r9 = r22
            X.W2x r4 = r9.A00
            X.WDn.A00(r4)
            long r2 = r4.A02
            long r7 = r4.A00
            long r5 = r4.A04
            long r7 = r7 - r2
            int r0 = r9.A03
            long r0 = (long) r0
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r8 = r23
            r7 = r24
            if (r10 > 0) goto L2d
            r0 = 0
            r9.A00 = r0
            X.XBn r0 = r9.A02
            r0.Djt()
        L21:
            long r0 = r8.BeZ()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto Lbd
            r7.A00 = r2
        L2b:
            r0 = 1
            return r0
        L2d:
            long r2 = r8.BeZ()
            long r0 = r5 - r2
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 < 0) goto Lb1
            r10 = 262144(0x40000, double:1.295163E-318)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto Lb1
            int r2 = (int) r0
            r8.Em8(r2)
            r8.EJn()
            X.XBn r1 = r9.A02
            long r10 = r4.A07
            X.W2N r2 = r1.EMY(r8, r10)
            int r3 = r2.A00
            r0 = -3
            if (r3 == r0) goto Lab
            r0 = -2
            if (r3 == r0) goto L7a
            r0 = -1
            if (r3 == r0) goto L8f
            long r2 = r2.A01
            long r10 = r8.BeZ()
            long r4 = r2 - r10
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L73
            r10 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 > 0) goto L73
            int r0 = (int) r4
            r8.Em8(r0)
        L73:
            r0 = 0
            r9.A00 = r0
            r1.Djt()
            goto L21
        L7a:
            long r12 = r2.A02
            long r2 = r2.A01
            r4.A03 = r12
            r4.A02 = r2
            long r14 = r4.A01
            long r5 = r4.A00
            long r0 = r4.A05
            r20 = r0
            r16 = r2
            r18 = r5
            goto La3
        L8f:
            long r14 = r2.A02
            long r2 = r2.A01
            r4.A01 = r14
            r4.A00 = r2
            long r12 = r4.A03
            long r5 = r4.A02
            long r0 = r4.A05
            r20 = r0
            r16 = r5
            r18 = r2
        La3:
            long r0 = X.C70097W2x.A00(r10, r12, r14, r16, r18, r20)
            r4.A04 = r0
            goto L0
        Lab:
            r0 = 0
            r9.A00 = r0
            r1.Djt()
        Lb1:
            long r1 = r8.BeZ()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto Lbd
            r7.A00 = r5
            goto L2b
        Lbd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC69701Vtw.A00(X.XGj, X.VZk):int");
    }

    public final void A01(long j) {
        C70097W2x c70097W2x = this.A00;
        if (c70097W2x != null && c70097W2x.A06 == j) {
            return;
        }
        C70342WRw c70342WRw = this.A01;
        this.A00 = new C70097W2x(j, c70342WRw.A04.Eq8(j), c70342WRw.A02, c70342WRw.A03, c70342WRw.A01, c70342WRw.A00);
    }

    public AbstractC69701Vtw(InterfaceC71876X8j interfaceC71876X8j, InterfaceC71938XBn interfaceC71938XBn, int i, long j, long j2, long j3, long j4, long j5) {
        this.A02 = interfaceC71938XBn;
        this.A03 = i;
        this.A01 = new C70342WRw(interfaceC71876X8j, j, j2, j3, j4, j5);
    }
}
