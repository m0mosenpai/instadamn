package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5Zu, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Zu extends C58J implements C5DW, InterfaceC113445Ag {
    public float A00;
    public Alignment A01;
    public C5YV A02;
    public C2DC A03;
    public C5YL A04;
    public boolean A05;

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    private final boolean A01() {
        if (this.A05 && this.A03.A03() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        float A02;
        long j;
        long A03 = this.A03.A03();
        if (A03(A03)) {
            A02 = C5YC.A02(A03);
        } else {
            A02 = C5YC.A02(interfaceC1129057z.Bxc());
        }
        if (!A02(A03)) {
            A03 = interfaceC1129057z.Bxc();
        }
        long A00 = C5YB.A00(A02, C5YC.A00(A03));
        long Bxc = interfaceC1129057z.Bxc();
        if (C5YC.A02(Bxc) != 0.0f && C5YC.A00(Bxc) != 0.0f) {
            long AIx = this.A04.AIx(A00, Bxc);
            j = C5YB.A00(C5YC.A02(A00) * AbstractC119175aZ.A00(AIx), C5YC.A00(A00) * AbstractC119175aZ.A01(AIx));
        } else {
            j = 0;
        }
        long AB9 = this.A01.AB9(interfaceC1129057z.getLayoutDirection(), AbstractC119215ad.A00(Math.round(C5YC.A02(j)), Math.round(C5YC.A00(j))), AbstractC119215ad.A00(Math.round(C5YC.A02(Bxc)), Math.round(C5YC.A00(Bxc))));
        float f = (int) (AB9 >> 32);
        float f2 = (int) (AB9 & 4294967295L);
        C58A c58a = ((AnonymousClass587) interfaceC1129057z.AzL()).A01;
        c58a.F8X(f, f2);
        try {
            this.A03.A01(this.A02, interfaceC1129057z, this.A00, j);
            c58a.F8X(-f, -f2);
            interfaceC1129057z.AQf();
        } catch (Throwable th) {
            c58a.F8X(-f, -f2);
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PainterModifier(painter=");
        sb.append(this.A03);
        sb.append(", sizeToIntrinsics=");
        sb.append(this.A05);
        sb.append(", alignment=");
        sb.append(this.A01);
        sb.append(", alpha=");
        sb.append(this.A00);
        sb.append(", colorFilter=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (androidx.compose.ui.unit.Constraints.A06(r9) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long A00(long r9) {
        /*
            r8 = this;
            boolean r0 = androidx.compose.ui.unit.Constraints.A07(r9)
            r2 = 1
            if (r0 == 0) goto Le
            boolean r0 = androidx.compose.ui.unit.Constraints.A06(r9)
            r1 = 1
            if (r0 != 0) goto Lf
        Le:
            r1 = 0
        Lf:
            boolean r0 = androidx.compose.ui.unit.Constraints.A09(r9)
            if (r0 == 0) goto Lff
            boolean r0 = androidx.compose.ui.unit.Constraints.A08(r9)
            if (r0 == 0) goto Lff
        L1b:
            boolean r0 = r8.A01()
            if (r0 != 0) goto L23
            if (r1 != 0) goto Lf6
        L23:
            if (r2 != 0) goto Lf6
            X.2DC r0 = r8.A03
            long r2 = r0.A03()
            boolean r0 = A03(r2)
            if (r0 == 0) goto Lf0
            float r0 = X.C5YC.A02(r2)
            int r1 = java.lang.Math.round(r0)
        L39:
            boolean r0 = A02(r2)
            if (r0 == 0) goto Lea
            float r0 = X.C5YC.A00(r2)
            int r0 = java.lang.Math.round(r0)
        L47:
            int r1 = X.C5AU.A03(r9, r1)
            int r0 = X.C5AU.A02(r9, r0)
            float r1 = (float) r1
            float r0 = (float) r0
            long r2 = X.C5YB.A00(r1, r0)
            boolean r0 = r8.A01()
            if (r0 == 0) goto Lac
            X.2DC r0 = r8.A03
            long r0 = r0.A03()
            boolean r0 = A03(r0)
            if (r0 != 0) goto Ldf
            float r4 = X.C5YC.A02(r2)
        L6b:
            X.2DC r0 = r8.A03
            long r0 = r0.A03()
            boolean r0 = A02(r0)
            if (r0 != 0) goto Ld4
            float r0 = X.C5YC.A00(r2)
        L7b:
            long r4 = X.C5YB.A00(r4, r0)
            float r0 = X.C5YC.A02(r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Ld1
            float r0 = X.C5YC.A00(r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Ld1
            X.5YL r0 = r8.A04
            long r6 = r0.AIx(r4, r2)
            float r2 = X.C5YC.A02(r4)
            float r0 = X.AbstractC119175aZ.A00(r6)
            float r2 = r2 * r0
            float r1 = X.C5YC.A00(r4)
            float r0 = X.AbstractC119175aZ.A01(r6)
            float r1 = r1 * r0
            long r2 = X.C5YB.A00(r2, r1)
        Lac:
            float r0 = X.C5YC.A02(r2)
            int r0 = java.lang.Math.round(r0)
            int r4 = X.C5AU.A03(r9, r0)
            float r0 = X.C5YC.A00(r2)
            int r0 = java.lang.Math.round(r0)
            int r2 = X.C5AU.A02(r9, r0)
        Lc4:
            int r1 = androidx.compose.ui.unit.Constraints.A01(r9)
            int r0 = androidx.compose.ui.unit.Constraints.A00(r9)
            long r0 = androidx.compose.ui.unit.Constraints.A04(r4, r1, r2, r0)
            return r0
        Ld1:
            r2 = 0
            goto Lac
        Ld4:
            X.2DC r0 = r8.A03
            long r0 = r0.A03()
            float r0 = X.C5YC.A00(r0)
            goto L7b
        Ldf:
            X.2DC r0 = r8.A03
            long r0 = r0.A03()
            float r4 = X.C5YC.A02(r0)
            goto L6b
        Lea:
            int r0 = androidx.compose.ui.unit.Constraints.A02(r9)
            goto L47
        Lf0:
            int r1 = androidx.compose.ui.unit.Constraints.A03(r9)
            goto L39
        Lf6:
            int r4 = androidx.compose.ui.unit.Constraints.A01(r9)
            int r2 = androidx.compose.ui.unit.Constraints.A00(r9)
            goto Lc4
        Lff:
            r2 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Zu.A00(long):long");
    }

    @Override // X.C5DW
    public final int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (A01()) {
            long A00 = A00(C5AU.A04(0, i, 0, Integer.MAX_VALUE));
            return Math.max(Constraints.A02(A00), interfaceC1131659e.Cnj(i));
        }
        return interfaceC1131659e.Cnj(i);
    }

    @Override // X.C5DW
    public final int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (A01()) {
            long A00 = A00(C5AU.A04(0, Integer.MAX_VALUE, 0, i));
            return Math.max(Constraints.A03(A00), interfaceC1131659e.Cnm(i));
        }
        return interfaceC1131659e.Cnm(i);
    }

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        C59W CpF = interfaceC1131559d.CpF(A00(j));
        int i = CpF.A01;
        int i2 = CpF.A00;
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C206929Dx(CpF, 42), i, i2);
    }

    @Override // X.C5DW
    public final int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (A01()) {
            long A00 = A00(C5AU.A04(0, i, 0, Integer.MAX_VALUE));
            return Math.max(Constraints.A02(A00), interfaceC1131659e.Cpe(i));
        }
        return interfaceC1131659e.Cpe(i);
    }

    @Override // X.C5DW
    public final int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (A01()) {
            long A00 = A00(C5AU.A04(0, Integer.MAX_VALUE, 0, i));
            return Math.max(Constraints.A03(A00), interfaceC1131659e.Cph(i));
        }
        return interfaceC1131659e.Cph(i);
    }

    public static final boolean A02(long j) {
        if (j != 9205357640488583168L) {
            float A00 = C5YC.A00(j);
            if (!Float.isInfinite(A00) && !Float.isNaN(A00)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A03(long j) {
        if (j != 9205357640488583168L) {
            float A02 = C5YC.A02(j);
            if (!Float.isInfinite(A02) && !Float.isNaN(A02)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
