package X;

/* loaded from: classes5.dex */
public final class D44 extends AbstractC23611Dp implements InterfaceC16620sF {
    public boolean A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D44(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A01 != 0) {
            D44 d44 = new D44(1, interfaceC23621Ds);
            d44.A00 = AbstractC166987dD.A1a(obj);
            return d44;
        }
        D44 d442 = new D44(0, interfaceC23621Ds);
        d442.A00 = AbstractC166987dD.A1a(obj);
        return d442;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A01;
        AbstractC09560e7.A00(obj);
        if (i != 0) {
            return Boolean.valueOf(!this.A00);
        }
        if (this.A00) {
            return C27117Bxg.A00;
        }
        return C27116Bxf.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((D44) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
