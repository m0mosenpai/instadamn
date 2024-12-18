package X;

/* renamed from: X.5ZK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ZK extends C58J implements C5DW {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04;

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
        int EL8 = c59z.EL8(this.A02) + c59z.EL8(this.A01);
        int EL82 = c59z.EL8(this.A03) + c59z.EL8(this.A00);
        C59W CpF = interfaceC1131559d.CpF(C5AU.A06(j, -EL8, -EL82));
        int A03 = C5AU.A03(j, CpF.A01 + EL8);
        int A02 = C5AU.A02(j, CpF.A00 + EL82);
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C9FO(1, this, CpF, c59z), A03, A02);
    }
}
