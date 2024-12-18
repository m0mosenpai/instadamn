package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.BZr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25752BZr extends C58J implements C5DW {
    public InterfaceC16610sE A00;

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
        return (InterfaceC119205ac) this.A00.invoke(c59z, interfaceC1131559d, new Constraints(j));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LayoutModifierImpl(measureBlock=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
