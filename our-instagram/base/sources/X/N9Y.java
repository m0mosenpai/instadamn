package X;

/* loaded from: classes9.dex */
public final class N9Y extends C1P1 {
    public final /* synthetic */ InterfaceC1116050z A00;
    public final /* synthetic */ C111364zz A01;

    public N9Y(InterfaceC1116050z interfaceC1116050z, C111364zz c111364zz) {
        this.A01 = c111364zz;
        this.A00 = interfaceC1116050z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -2113932739);
        C111364zz c111364zz = this.A01;
        c111364zz.A05.remove(EnumC2045493n.A0D);
        C111364zz.A02(this.A00, c111364zz);
        C111364zz.A04(c111364zz, "REST", abstractC115105If.A01());
        C0f9.A0A(505554712, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-2077109086);
        int A032 = C0f9.A03(-878497428);
        C111364zz c111364zz = this.A01;
        AbstractC50522MSa.A0p(c111364zz).remove(EnumC2045493n.A0D);
        C111364zz.A02(this.A00, c111364zz);
        C0f9.A0A(666227919, A032);
        C0f9.A0A(-1232029575, A03);
    }
}
