package X;

/* renamed from: X.AbT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23513AbT implements InterfaceC25205BDd {
    public final C178577wV A00;

    public C23513AbT(C178577wV c178577wV) {
        C14360o3.A0B(c178577wV, 1);
        this.A00 = c178577wV;
    }

    @Override // X.InterfaceC25205BDd
    public final InterfaceC178817wt BQp() {
        AbstractC179687yI abstractC179687yI = (AbstractC179687yI) ((C9PF) this.A00.A01(C9PF.A00));
        InterfaceC178067vf Aq0 = abstractC179687yI.A00.Aq0(InterfaceC178817wt.A01);
        C14360o3.A07(Aq0);
        return (InterfaceC178817wt) Aq0;
    }

    @Override // X.InterfaceC25205BDd
    public final /* synthetic */ boolean CU6() {
        return false;
    }

    @Override // X.InterfaceC25205BDd
    public final void EKd() {
        this.A00.A03();
    }

    @Override // X.InterfaceC25205BDd
    public final void destroy() {
        this.A00.A04();
    }
}
