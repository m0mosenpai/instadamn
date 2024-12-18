package X;

/* renamed from: X.CWl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28013CWl {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r5 != X.AbstractC25228BEl.A02(r3)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C27982CVe A01(X.C27963CUj r13, X.C27982CVe r14, X.InterfaceC30910DiN r15) {
        /*
            r12 = r15
            r0 = r12
            X.CnJ r0 = (X.C28787CnJ) r0
            boolean r2 = r0.A02
            r11 = r13
            if (r2 == 0) goto L34
            int r8 = r13.A02
        Lb:
            X.0dv r1 = X.EnumC09460dv.A02
            r10 = 0
            X.PbX r0 = new X.PbX
            r0.<init>(r8, r10, r13)
            X.0do r13 = X.AbstractC09440dt.A00(r1, r0)
            if (r2 == 0) goto L31
            int r9 = r11.A00
        L1b:
            X.D8m r7 = new X.D8m
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.0do r7 = X.AbstractC09440dt.A00(r1, r7)
            r4 = 1
            long r0 = r14.A01
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 != 0) goto L6d
            int r6 = r11.A01
            if (r8 != r6) goto L37
            return r14
        L31:
            int r9 = r11.A02
            goto L1b
        L34:
            int r8 = r13.A00
            goto Lb
        L37:
            X.5oj r3 = r11.A03
            X.5oh r0 = r3.A03
            int r1 = r0.A06(r6)
            int r0 = X.AbstractC167027dH.A01(r13)
            if (r0 != r1) goto L6d
            int r5 = r14.A00
            long r3 = r3.A04(r5)
            r0 = -1
            if (r6 == r0) goto L61
            int r1 = r11.A02
            int r0 = r11.A00
            if (r1 >= r0) goto L77
            java.lang.Integer r1 = X.C05F.A01
        L56:
            java.lang.Integer r0 = X.C05F.A00
            boolean r0 = X.AbstractC167007dF.A1X(r1, r0)
            r2 = r2 ^ r0
            if (r2 == 0) goto L74
            if (r8 >= r6) goto L7f
        L61:
            int r0 = X.AbstractC25225BEi.A06(r3)
            if (r5 == r0) goto L6d
            int r0 = X.AbstractC25228BEl.A02(r3)
            if (r5 != r0) goto L7f
        L6d:
            java.lang.Object r0 = r7.getValue()
            X.CVe r0 = (X.C27982CVe) r0
            return r0
        L74:
            if (r8 <= r6) goto L7f
            goto L61
        L77:
            if (r1 <= r0) goto L7c
            java.lang.Integer r1 = X.C05F.A00
            goto L56
        L7c:
            java.lang.Integer r1 = X.C05F.A0C
            goto L56
        L7f:
            X.CVe r0 = r11.A00(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28013CWl.A01(X.CUj, X.CVe, X.DiN):X.CVe");
    }

    public static final C27982CVe A00(C27963CUj c27963CUj, C27982CVe c27982CVe, int i) {
        return new C27982CVe(c27963CUj.A03.A08(i), i, c27982CVe.A01);
    }
}
