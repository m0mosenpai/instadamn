package X;

/* renamed from: X.BaI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25779BaI extends C5AY implements C5DW, C5DX, C5DY {
    public InterfaceC16820sZ A00;
    public boolean A01;
    public final C6KM A02;

    @Override // X.C5DX
    public final /* synthetic */ boolean COp() {
        return false;
    }

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

    @Override // X.C5DX
    public final boolean Ehx() {
        return true;
    }

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        int EL8 = c59z.EL8(40.0f);
        int EL82 = c59z.EL8(10.0f);
        int i = EL82 * 2;
        int i2 = EL8 * 2;
        C59W CpF = interfaceC1131559d.CpF(C5AU.A06(j, i, i2));
        int i3 = CpF.A00 - i2;
        return AbstractC25229BEm.A0Z(c59z, new DHW(CpF, EL8, EL82, 3), CpF.A01 - i, i3);
    }

    @Override // X.C5DX
    /* renamed from: D1u */
    public final void E0S() {
        this.A02.E0S();
    }

    @Override // X.C5DX
    public final void DZQ(C6KW c6kw, EnumC25334BJd enumC25334BJd, long j) {
        this.A02.DZQ(c6kw, enumC25334BJd, j);
    }

    public C25779BaI(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
        D52 d52 = new D52(this, (InterfaceC23621Ds) null, 14);
        C6KW c6kw = C6KX.A00;
        C6KL c6kl = new C6KL(null, null, d52);
        A0F(c6kl);
        this.A02 = c6kl;
    }

    @Override // X.C5DY
    public final void DHg(InterfaceC118945aB interfaceC118945aB) {
        this.A01 = interfaceC118945aB.CV1();
    }
}
