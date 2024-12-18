package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5Zh, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Zh extends C58J implements C5DW {
    public Integer A00;
    public InterfaceC16620sF A01;

    @Override // X.C5DW
    public final /* synthetic */ int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A00(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A01(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A02(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A03(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        int A03;
        Integer num = this.A00;
        int i = 0;
        if (num != C05F.A00) {
            A03 = 0;
        } else {
            A03 = Constraints.A03(j);
        }
        if (num == C05F.A01) {
            i = Constraints.A02(j);
        }
        int A01 = Constraints.A01(j);
        int A00 = Constraints.A00(j);
        C59W CpF = interfaceC1131559d.CpF(C5AU.A04(A03, A01, i, A00));
        int A032 = C17s.A03(CpF.A01, Constraints.A03(j), A01);
        int A033 = C17s.A03(CpF.A00, Constraints.A02(j), A00);
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C9FU(A032, A033, 1, this, CpF, c59z), A032, A033);
    }
}
