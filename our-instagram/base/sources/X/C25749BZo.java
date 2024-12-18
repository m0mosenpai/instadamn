package X;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.BZo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25749BZo extends C58J implements C5DW {
    public C28729CmL A00;
    public boolean A01;

    @Override // X.C5DW
    public final int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (!this.A01) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1131659e.Cnj(i);
    }

    @Override // X.C5DW
    public final int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (this.A01) {
            return interfaceC1131659e.Cnm(Integer.MAX_VALUE);
        }
        return interfaceC1131659e.Cnm(i);
    }

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        C6M3 c6m3;
        int A00;
        int i;
        InterfaceC16660sJ interfaceC16660sJ;
        boolean z = this.A01;
        if (z) {
            c6m3 = C6M3.Vertical;
        } else {
            c6m3 = C6M3.Horizontal;
        }
        C6O3.A00(c6m3, j);
        if (z) {
            A00 = Integer.MAX_VALUE;
            i = Constraints.A01(j);
        } else {
            A00 = Constraints.A00(j);
            i = Integer.MAX_VALUE;
        }
        C59W CpF = interfaceC1131559d.CpF(Constraints.A04(Constraints.A03(j), i, Constraints.A02(j), A00));
        int i2 = CpF.A01;
        int A01 = Constraints.A01(j);
        if (i2 > A01) {
            i2 = A01;
        }
        int i3 = CpF.A00;
        int A002 = Constraints.A00(j);
        if (i3 > A002) {
            i3 = A002;
        }
        int i4 = i3 - i3;
        int i5 = i2 - i2;
        if (!this.A01) {
            i4 = i5;
        }
        C28729CmL c28729CmL = this.A00;
        c28729CmL.A01.EWE(i4);
        Snapshot A02 = C3Z5.A02();
        if (A02 != null) {
            interfaceC16660sJ = A02.A03();
        } else {
            interfaceC16660sJ = null;
        }
        Snapshot A03 = C3Z5.A03(A02);
        try {
            InterfaceC119545bC interfaceC119545bC = c28729CmL.A03;
            if (interfaceC119545bC.BIi() > i4) {
                interfaceC119545bC.EWE(i4);
            }
            C3Z5.A06(A02, A03, interfaceC16660sJ);
            C28729CmL c28729CmL2 = this.A00;
            int i6 = i2;
            if (this.A01) {
                i6 = i3;
            }
            c28729CmL2.A04.EWE(i6);
            return AbstractC25229BEm.A0Z(c59z, new C30171DRb(i4, 0, CpF, this), i2, i3);
        } catch (Throwable th) {
            C3Z5.A06(A02, A03, interfaceC16660sJ);
            throw th;
        }
    }

    @Override // X.C5DW
    public final int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (!this.A01) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1131659e.Cpe(i);
    }

    @Override // X.C5DW
    public final int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if (this.A01) {
            return interfaceC1131659e.Cph(Integer.MAX_VALUE);
        }
        return interfaceC1131659e.Cph(i);
    }
}
