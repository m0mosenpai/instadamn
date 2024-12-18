package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5Zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118805Zc extends C58J implements C5DW {
    public float A00;
    public Integer A01;

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
        int A01;
        int A02;
        int A00;
        if (Constraints.A07(j) && this.A01 != C05F.A00) {
            int A012 = Constraints.A01(j);
            A03 = C17s.A03(Math.round(A012 * this.A00), Constraints.A03(j), A012);
            A01 = A03;
        } else {
            A03 = Constraints.A03(j);
            A01 = Constraints.A01(j);
        }
        if (Constraints.A06(j) && this.A01 != C05F.A01) {
            int A002 = Constraints.A00(j);
            A02 = C17s.A03(Math.round(A002 * this.A00), Constraints.A02(j), A002);
            A00 = A02;
        } else {
            A02 = Constraints.A02(j);
            A00 = Constraints.A00(j);
        }
        C59W CpF = interfaceC1131559d.CpF(C5AU.A04(A03, A01, A02, A00));
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C206929Dx(CpF, 12), CpF.A01, CpF.A00);
    }
}
