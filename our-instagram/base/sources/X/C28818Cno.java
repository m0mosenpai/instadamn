package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Cno, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28818Cno implements InterfaceC118865a3 {
    public final InterfaceC74963Ym A00;
    public final CU1 A01;
    public final /* synthetic */ C28712Cm4 A02;

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    public C28818Cno(C28712Cm4 c28712Cm4, CU1 cu1, InterfaceC74963Ym interfaceC74963Ym) {
        this.A02 = c28712Cm4;
        this.A01 = cu1;
        this.A00 = interfaceC74963Ym;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // X.InterfaceC118865a3
    public final int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return interfaceC1131659e.Cnj(i);
    }

    @Override // X.InterfaceC118865a3
    public final int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return interfaceC1131659e.Cnm(i);
    }

    @Override // X.InterfaceC118865a3
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        long j2;
        C59W CpF = interfaceC1131559d.CpF(j);
        CU1 cu1 = this.A01;
        C28712Cm4 c28712Cm4 = this.A02;
        C28793CnP A00 = cu1.A00(new DRZ(1, c28712Cm4, this), DRS.A00(c28712Cm4, 1));
        c28712Cm4.A00 = A00;
        if (c59z.CXp()) {
            j2 = AbstractC119215ad.A00(CpF.A01, CpF.A00);
        } else {
            j2 = ((C119055aN) A00.getValue()).A00;
        }
        return AbstractC25229BEm.A0Z(c59z, new C65021Tc7(j2, c28712Cm4, CpF, 0), AbstractC25225BEi.A06(j2), C119055aN.A00(j2));
    }

    @Override // X.InterfaceC118865a3
    public final int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return interfaceC1131659e.Cpe(i);
    }

    @Override // X.InterfaceC118865a3
    public final int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return interfaceC1131659e.Cph(i);
    }

    public C28818Cno() {
    }
}
