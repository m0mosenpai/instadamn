package X;

/* loaded from: classes8.dex */
public final class MCS extends AbstractC23611Dp implements InterfaceC16610sE {
    public boolean A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCS(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A01 = i;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A01;
        boolean A1a = AbstractC166987dD.A1a(obj2);
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        MCS mcs = new MCS(i, interfaceC23621Ds);
        mcs.A00 = A1a;
        return mcs.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        if (this.A00) {
            return EnumC46138Kbc.A03;
        }
        return EnumC46138Kbc.A02;
    }
}
