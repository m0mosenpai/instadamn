package X;

/* renamed from: X.Pa8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57179Pa8 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public Object A01;
    public final int A02 = 1;

    public C57179Pa8(InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C57179Pa8 c57179Pa8;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        if (this.A02 != 0) {
            c57179Pa8 = new C57179Pa8(interfaceC23621Ds);
            c57179Pa8.A01 = obj;
        } else {
            c57179Pa8 = new C57179Pa8((O9Z) this.A01, interfaceC23621Ds);
        }
        return c57179Pa8.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.A02 != 0) {
            C1JX c1jx = C1JX.A02;
            if (this.A00 == 0) {
                AbstractC09560e7.A00(obj);
                InterfaceC19960yQ interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
                C51761Mtk c51761Mtk = new C51761Mtk(2, C05F.A00);
                this.A00 = 1;
                if (interfaceC19960yQ.emit(c51761Mtk, this) == c1jx) {
                    return c1jx;
                }
                return C0eB.A00;
            }
        }
        AbstractC09560e7.A00(obj);
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57179Pa8(O9Z o9z, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A01 = o9z;
    }
}
