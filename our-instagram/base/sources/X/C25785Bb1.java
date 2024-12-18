package X;

/* renamed from: X.Bb1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25785Bb1 extends AbstractC28843CoD {
    public static C25785Bb1 A01;
    public C127055oj A00;
    public static final BIZ A03 = BIZ.Rtl;
    public static final BIZ A02 = BIZ.Ltr;

    private final int A00(BIZ biz, int i) {
        C127055oj c127055oj = this.A00;
        if (c127055oj != null) {
            int A032 = c127055oj.A03(i);
            C127055oj c127055oj2 = this.A00;
            if (c127055oj2 != null) {
                BIZ A09 = c127055oj2.A09(A032);
                C127055oj c127055oj3 = this.A00;
                if (biz != A09) {
                    if (c127055oj3 != null) {
                        return c127055oj3.A03(i);
                    }
                } else if (c127055oj3 != null) {
                    return c127055oj3.A03.A07(i, false) - 1;
                }
            }
        }
        C14360o3.A0F("layoutResult");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (A00(X.C25785Bb1.A03, r1) == r6) goto L10;
     */
    @Override // X.InterfaceC30987Djj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] AWL(int r6) {
        /*
            r5 = this;
            int r0 = X.AbstractC28843CoD.A01(r5)
            r4 = 0
            if (r0 <= 0) goto L55
            int r0 = X.AbstractC28843CoD.A01(r5)
            if (r6 >= r0) goto L55
            java.lang.String r3 = "layoutResult"
            X.5oj r0 = r5.A00
            if (r6 >= 0) goto L3a
            if (r0 == 0) goto L4d
            r1 = 0
            X.5oh r0 = r0.A03
            int r1 = r0.A06(r1)
        L1c:
            r2 = r1
        L1d:
            X.5oj r0 = r5.A00
            if (r0 == 0) goto L4d
            X.5oh r0 = r0.A03
            int r0 = r0.A02
            if (r2 >= r0) goto L55
            X.BIZ r0 = X.C25785Bb1.A03
            int r1 = r5.A00(r0, r2)
            X.BIZ r0 = X.C25785Bb1.A02
            int r0 = r5.A00(r0, r2)
            int r0 = r0 + 1
            int[] r0 = r5.A03(r1, r0)
            return r0
        L3a:
            if (r0 == 0) goto L4d
            X.5oh r0 = r0.A03
            int r1 = r0.A06(r6)
            X.BIZ r0 = X.C25785Bb1.A03
            int r0 = r5.A00(r0, r1)
            int r2 = r1 + 1
            if (r0 != r6) goto L1d
            goto L1c
        L4d:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L55:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25785Bb1.AWL(int):int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((A00(X.C25785Bb1.A02, r1) + 1) == r5) goto L10;
     */
    @Override // X.InterfaceC30987Djj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] E56(int r5) {
        /*
            r4 = this;
            int r0 = X.AbstractC28843CoD.A01(r4)
            r3 = 0
            if (r0 <= 0) goto L54
            if (r5 <= 0) goto L54
            int r0 = X.AbstractC28843CoD.A01(r4)
            java.lang.String r1 = "layoutResult"
            if (r5 <= r0) goto L35
            X.5oj r0 = r4.A00
            if (r0 == 0) goto L4c
            int r1 = X.AbstractC28843CoD.A01(r4)
            X.5oh r0 = r0.A03
            int r1 = r0.A06(r1)
        L1f:
            r2 = r1
        L20:
            if (r2 < 0) goto L54
            X.BIZ r0 = X.C25785Bb1.A03
            int r1 = r4.A00(r0, r2)
            X.BIZ r0 = X.C25785Bb1.A02
            int r0 = r4.A00(r0, r2)
            int r0 = r0 + 1
            int[] r0 = r4.A03(r1, r0)
            return r0
        L35:
            X.5oj r0 = r4.A00
            if (r0 == 0) goto L4c
            X.5oh r0 = r0.A03
            int r1 = r0.A06(r5)
            X.BIZ r0 = X.C25785Bb1.A02
            int r0 = r4.A00(r0, r1)
            int r0 = r0 + 1
            int r2 = r1 + (-1)
            if (r0 != r5) goto L20
            goto L1f
        L4c:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L54:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25785Bb1.E56(int):int[]");
    }
}
