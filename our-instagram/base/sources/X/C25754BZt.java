package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.BZt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25754BZt extends C58J implements C5DW {
    public float A00;
    public boolean A01;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r7 != r5) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    @Override // X.C5DW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC119205ac CpE(X.InterfaceC1131559d r10, X.C59Z r11, long r12) {
        /*
            r9 = this;
            boolean r0 = r9.A01
            r4 = 0
            if (r0 != 0) goto L5b
            r1 = 1
            long r7 = r9.A01(r12, r1)
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A00(r12, r1)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A03(r12, r1)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A02(r12, r1)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A01(r12, r4)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A00(r12, r4)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A03(r12, r4)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A02(r12, r4)
        L44:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L9d
        L48:
            X.59W r3 = r10.CpF(r12)
            int r2 = r3.A01
            int r1 = r3.A00
            r0 = 25
            X.DRS r0 = X.DRS.A00(r3, r0)
            X.5ac r0 = X.AbstractC25229BEm.A0Z(r11, r0, r2, r1)
            return r0
        L5b:
            r3 = 1
            long r7 = r9.A00(r12, r3)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A01(r12, r3)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A02(r12, r3)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A03(r12, r3)
            r5 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A00(r12, r4)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A01(r12, r4)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A02(r12, r4)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L9d
            long r7 = r9.A03(r12, r4)
            goto L44
        L9d:
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L48
            int r1 = X.AbstractC25225BEi.A06(r7)
            int r0 = X.C119055aN.A00(r7)
            long r12 = X.AbstractC119035aK.A02(r1, r0)
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25754BZt.CpE(X.59d, X.59Z, long):X.5ac");
    }

    private final long A00(long j, boolean z) {
        int round;
        int A00 = Constraints.A00(j);
        if (A00 != Integer.MAX_VALUE && (round = Math.round(A00 * this.A00)) > 0) {
            long A002 = AbstractC119215ad.A00(round, A00);
            if (!z || C5AU.A09(j, A002)) {
                return A002;
            }
            return 0L;
        }
        return 0L;
    }

    private final long A01(long j, boolean z) {
        int round;
        int A01 = Constraints.A01(j);
        if (A01 != Integer.MAX_VALUE && (round = Math.round(A01 / this.A00)) > 0) {
            long A00 = AbstractC119215ad.A00(A01, round);
            if (!z || C5AU.A09(j, A00)) {
                return A00;
            }
            return 0L;
        }
        return 0L;
    }

    private final long A02(long j, boolean z) {
        int A02 = Constraints.A02(j);
        int round = Math.round(A02 * this.A00);
        if (round > 0) {
            long A00 = AbstractC119215ad.A00(round, A02);
            if (!z || C5AU.A09(j, A00)) {
                return A00;
            }
            return 0L;
        }
        return 0L;
    }

    private final long A03(long j, boolean z) {
        int A03 = Constraints.A03(j);
        int round = Math.round(A03 / this.A00);
        if (round > 0) {
            long A00 = AbstractC119215ad.A00(A03, round);
            if (!z || C5AU.A09(j, A00)) {
                return A00;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // X.C5DW
    public final int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.A00);
        }
        return interfaceC1131659e.Cnj(i);
    }

    @Override // X.C5DW
    public final int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.A00);
        }
        return interfaceC1131659e.Cnm(i);
    }

    @Override // X.C5DW
    public final int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.A00);
        }
        return interfaceC1131659e.Cpe(i);
    }

    @Override // X.C5DW
    public final int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.A00);
        }
        return interfaceC1131659e.Cph(i);
    }
}
