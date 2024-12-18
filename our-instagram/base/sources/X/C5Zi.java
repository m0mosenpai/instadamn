package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5Zi, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Zi extends C58J implements C5DW {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r2 != Integer.MAX_VALUE) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r0 != Integer.MAX_VALUE) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long A00(X.InterfaceC1128957x r9) {
        /*
            r8 = this;
            float r1 = r8.A01
            r7 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = X.C119145aW.A01(r1, r7)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            if (r0 != 0) goto L59
            int r4 = r9.EL8(r1)
            if (r4 >= r5) goto L15
            r4 = 0
        L15:
            float r1 = r8.A00
            boolean r0 = X.C119145aW.A01(r1, r7)
            if (r0 != 0) goto L55
            int r3 = r9.EL8(r1)
            if (r3 >= r5) goto L24
            r3 = 0
        L24:
            float r1 = r8.A03
            boolean r0 = X.C119145aW.A01(r1, r7)
            if (r0 != 0) goto L53
            int r2 = r9.EL8(r1)
            if (r2 <= r4) goto L33
            r2 = r4
        L33:
            if (r2 >= r5) goto L36
            r2 = 0
        L36:
            if (r2 == r6) goto L53
        L38:
            float r1 = r8.A02
            boolean r0 = X.C119145aW.A01(r1, r7)
            if (r0 != 0) goto L4b
            int r0 = r9.EL8(r1)
            if (r0 <= r3) goto L47
            r0 = r3
        L47:
            if (r0 >= r5) goto L50
            r0 = 0
        L4a:
            r5 = r0
        L4b:
            long r0 = X.C5AU.A04(r2, r4, r5, r3)
            return r0
        L50:
            if (r0 == r6) goto L4b
            goto L4a
        L53:
            r2 = 0
            goto L38
        L55:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L24
        L59:
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Zi.A00(X.57x):long");
    }

    @Override // X.C5DW
    public final int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        long A00 = A00(interfaceC1131259a);
        if (Constraints.A08(A00)) {
            return Constraints.A00(A00);
        }
        return C5AU.A02(A00, interfaceC1131659e.Cnj(i));
    }

    @Override // X.C5DW
    public final int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        long A00 = A00(interfaceC1131259a);
        if (Constraints.A09(A00)) {
            return Constraints.A01(A00);
        }
        return C5AU.A03(A00, interfaceC1131659e.Cnm(i));
    }

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        int A03;
        int A01;
        int A02;
        int A00;
        long A04;
        long A002 = A00(c59z);
        if (this.A04) {
            A04 = C5AU.A08(j, A002);
        } else {
            if (!C119145aW.A01(this.A03, Float.NaN)) {
                A03 = Constraints.A03(A002);
            } else {
                A03 = Constraints.A03(j);
                int A012 = Constraints.A01(A002);
                if (A03 > A012) {
                    A03 = A012;
                }
            }
            if (!C119145aW.A01(this.A01, Float.NaN)) {
                A01 = Constraints.A01(A002);
            } else {
                A01 = Constraints.A01(j);
                int A032 = Constraints.A03(A002);
                if (A01 < A032) {
                    A01 = A032;
                }
            }
            if (!C119145aW.A01(this.A02, Float.NaN)) {
                A02 = Constraints.A02(A002);
            } else {
                A02 = Constraints.A02(j);
                int A003 = Constraints.A00(A002);
                if (A02 > A003) {
                    A02 = A003;
                }
            }
            if (!C119145aW.A01(this.A00, Float.NaN)) {
                A00 = Constraints.A00(A002);
            } else {
                A00 = Constraints.A00(j);
                int A022 = Constraints.A02(A002);
                if (A00 < A022) {
                    A00 = A022;
                }
            }
            A04 = C5AU.A04(A03, A01, A02, A00);
        }
        C59W CpF = interfaceC1131559d.CpF(A04);
        int i = CpF.A01;
        int i2 = CpF.A00;
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C206929Dx(CpF, 14), i, i2);
    }

    @Override // X.C5DW
    public final int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        long A00 = A00(interfaceC1131259a);
        if (Constraints.A08(A00)) {
            return Constraints.A00(A00);
        }
        return C5AU.A02(A00, interfaceC1131659e.Cpe(i));
    }

    @Override // X.C5DW
    public final int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        long A00 = A00(interfaceC1131259a);
        if (Constraints.A09(A00)) {
            return Constraints.A01(A00);
        }
        return C5AU.A03(A00, interfaceC1131659e.Cph(i));
    }
}
