package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.BGl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25271BGl extends C58J implements C5DW {
    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        int Cnm;
        long A01;
        boolean z;
        int Cnj;
        boolean z2 = this instanceof BZZ;
        if (z2) {
            Integer num = ((BZZ) this).A00;
            Integer num2 = C05F.A00;
            int A012 = Constraints.A01(j);
            if (num == num2) {
                Cnj = interfaceC1131559d.Cpe(A012);
            } else {
                Cnj = interfaceC1131559d.Cnj(A012);
            }
            if (Cnj < 0) {
                Cnj = 0;
            }
            A01 = AbstractC119035aK.A00(Cnj);
        } else {
            Integer num3 = ((C25739BZa) this).A00;
            Integer num4 = C05F.A00;
            int A00 = Constraints.A00(j);
            if (num3 == num4) {
                Cnm = interfaceC1131559d.Cph(A00);
            } else {
                Cnm = interfaceC1131559d.Cnm(A00);
            }
            if (Cnm < 0) {
                Cnm = 0;
            }
            A01 = AbstractC119035aK.A01(Cnm);
        }
        if (z2) {
            z = ((BZZ) this).A01;
        } else {
            z = ((C25739BZa) this).A01;
        }
        if (z) {
            A01 = C5AU.A08(j, A01);
        }
        C59W CpF = interfaceC1131559d.CpF(A01);
        int i = CpF.A01;
        int i2 = CpF.A00;
        return c59z.Cgx(AbstractC06930Yk.A0E(), new DRS(CpF, 32), i, i2);
    }

    @Override // X.C5DW
    public final int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if ((this instanceof BZZ) && ((BZZ) this).A00 == C05F.A00) {
            return interfaceC1131659e.Cpe(i);
        }
        return interfaceC1131659e.Cnj(i);
    }

    @Override // X.C5DW
    public final int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if ((this instanceof C25739BZa) && ((C25739BZa) this).A00 == C05F.A00) {
            return interfaceC1131659e.Cph(i);
        }
        return interfaceC1131659e.Cnm(i);
    }

    @Override // X.C5DW
    public final int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if ((this instanceof BZZ) && ((BZZ) this).A00 != C05F.A00) {
            return interfaceC1131659e.Cnj(i);
        }
        return interfaceC1131659e.Cpe(i);
    }

    @Override // X.C5DW
    public final int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        if ((this instanceof C25739BZa) && ((C25739BZa) this).A00 != C05F.A00) {
            return interfaceC1131659e.Cnm(i);
        }
        return interfaceC1131659e.Cph(i);
    }
}
