package X;

/* renamed from: X.Cd7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28262Cd7 {
    public InterfaceC1131459c A00;
    public InterfaceC1131459c A01 = null;
    public final C127055oj A02;

    public C28262Cd7(InterfaceC1131459c interfaceC1131459c, C127055oj c127055oj) {
        this.A02 = c127055oj;
        this.A00 = interfaceC1131459c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r3 > r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r2 > r1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long A00(long r6) {
        /*
            r5 = this;
            X.59c r2 = r5.A01
            if (r2 == 0) goto L3a
            boolean r0 = r2.CQ7()
            if (r0 == 0) goto L3a
            X.59c r1 = r5.A00
            if (r1 == 0) goto L3a
            r0 = 1
            X.5Dh r4 = r1.Chk(r2, r0)
        L13:
            float r3 = X.C119365at.A01(r6)
            float r1 = r4.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L23
            float r1 = r4.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L24
        L23:
            r3 = r1
        L24:
            float r2 = X.C119365at.A02(r6)
            float r1 = r4.A03
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L34
            float r1 = r4.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L35
        L34:
            r2 = r1
        L35:
            long r0 = X.AbstractC119395aw.A00(r3, r2)
            return r0
        L3a:
            X.5Dh r4 = X.C114205Dh.A04
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28262Cd7.A00(long):long");
    }

    public final int A01(long j, boolean z) {
        if (z) {
            j = A00(j);
        }
        return this.A02.A03.A08(A02(j));
    }

    public final long A02(long j) {
        InterfaceC1131459c interfaceC1131459c;
        InterfaceC1131459c interfaceC1131459c2 = this.A01;
        if (interfaceC1131459c2 != null && interfaceC1131459c2.CQ7() && (interfaceC1131459c = this.A00) != null && interfaceC1131459c.CQ7()) {
            return interfaceC1131459c2.Chl(interfaceC1131459c, j);
        }
        return j;
    }

    public final boolean A03(long j) {
        long A02 = A02(A00(j));
        C127055oj c127055oj = this.A02;
        int A05 = c127055oj.A03.A05(C119365at.A02(A02));
        float A01 = C119365at.A01(A02);
        if (A01 >= c127055oj.A00(A05) && A01 <= c127055oj.A01(A05)) {
            return true;
        }
        return false;
    }
}
