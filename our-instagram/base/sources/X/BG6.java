package X;

/* loaded from: classes5.dex */
public final class BG6 extends AbstractC23611Dp implements InterfaceC16610sE {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BG6(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A00 = i;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        switch (this.A00) {
            case 0:
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                i = 0;
                break;
            case 1:
                ((Number) obj2).floatValue();
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                i = 1;
                break;
            case 2:
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                i = 2;
                break;
            case 3:
                AbstractC25225BEi.A1R(obj);
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                i = 3;
                break;
            default:
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                i = 4;
                break;
        }
        return new BG6(i, interfaceC23621Ds).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (3 - this.A00 != 0) {
            AbstractC09560e7.A00(obj);
            return C0eB.A00;
        }
        AbstractC09560e7.A00(obj);
        return AbstractC166997dE.A0a();
    }
}
