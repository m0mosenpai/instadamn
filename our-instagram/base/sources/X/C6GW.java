package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6GW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GW extends C58J implements C5DW {
    public float A00;
    public float A01;

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        int A03;
        int A02;
        float f = this.A01;
        if (!C119145aW.A01(f, Float.NaN) && Constraints.A03(j) == 0) {
            A03 = c59z.EL8(f);
            int A01 = Constraints.A01(j);
            if (A03 > A01) {
                A03 = A01;
            }
            if (A03 < 0) {
                A03 = 0;
            }
        } else {
            A03 = Constraints.A03(j);
        }
        int A012 = Constraints.A01(j);
        float f2 = this.A00;
        if (!C119145aW.A01(f2, Float.NaN) && Constraints.A02(j) == 0) {
            A02 = c59z.EL8(f2);
            int A00 = Constraints.A00(j);
            if (A02 > A00) {
                A02 = A00;
            }
            if (A02 < 0) {
                A02 = 0;
            }
        } else {
            A02 = Constraints.A02(j);
        }
        C59W CpF = interfaceC1131559d.CpF(C5AU.A04(A03, A012, A02, Constraints.A00(j)));
        int i = CpF.A01;
        int i2 = CpF.A00;
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C206929Dx(CpF, 15), i, i2);
    }

    @Override // X.C5DW
    public final int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        int i2;
        int Cnj = interfaceC1131659e.Cnj(i);
        float f = this.A00;
        if (!C119145aW.A01(f, Float.NaN)) {
            i2 = interfaceC1131259a.EL8(f);
        } else {
            i2 = 0;
        }
        if (Cnj < i2) {
            return i2;
        }
        return Cnj;
    }

    @Override // X.C5DW
    public final int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        int i2;
        int Cnm = interfaceC1131659e.Cnm(i);
        float f = this.A01;
        if (!C119145aW.A01(f, Float.NaN)) {
            i2 = interfaceC1131259a.EL8(f);
        } else {
            i2 = 0;
        }
        if (Cnm < i2) {
            return i2;
        }
        return Cnm;
    }

    @Override // X.C5DW
    public final int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        int i2;
        int Cpe = interfaceC1131659e.Cpe(i);
        float f = this.A00;
        if (!C119145aW.A01(f, Float.NaN)) {
            i2 = interfaceC1131259a.EL8(f);
        } else {
            i2 = 0;
        }
        if (Cpe < i2) {
            return i2;
        }
        return Cpe;
    }

    @Override // X.C5DW
    public final int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        int i2;
        int Cph = interfaceC1131659e.Cph(i);
        float f = this.A01;
        if (!C119145aW.A01(f, Float.NaN)) {
            i2 = interfaceC1131259a.EL8(f);
        } else {
            i2 = 0;
        }
        if (Cph < i2) {
            return i2;
        }
        return Cph;
    }
}
