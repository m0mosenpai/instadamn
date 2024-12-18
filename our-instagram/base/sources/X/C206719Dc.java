package X;

/* renamed from: X.9Dc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206719Dc extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206719Dc(Object obj, Object obj2, Object obj3, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A05 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        int i;
        if (this.A01 != 0) {
            obj4 = this.A04;
            str = this.A05;
            obj2 = this.A03;
            obj3 = this.A02;
            i = 1;
        } else {
            obj2 = this.A03;
            obj3 = this.A02;
            obj4 = this.A04;
            str = this.A05;
            i = 0;
        }
        return new C206719Dc(obj2, obj3, obj4, str, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C206719Dc) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC16660sJ interfaceC16660sJ;
        Object obj2;
        if (this.A01 != 0) {
            C1JX c1jx = C1JX.A02;
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                C129885ts c129885ts = (C129885ts) this.A04;
                String str = this.A05;
                this.A00 = 1;
                obj = c129885ts.A07(str, this);
                if (obj == c1jx) {
                    return c1jx;
                }
            }
            C3NY c3ny = (C3NY) obj;
            if (c3ny instanceof C3NX) {
                interfaceC16660sJ = (InterfaceC16660sJ) this.A03;
                if (interfaceC16660sJ != null) {
                    obj2 = ((C3NX) c3ny).A00;
                    interfaceC16660sJ.invoke(obj2);
                }
            } else if (c3ny instanceof C194848jk) {
                interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                if (interfaceC16660sJ != null) {
                    obj2 = ((C194848jk) c3ny).A00;
                    interfaceC16660sJ.invoke(obj2);
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            C1JX c1jx2 = C1JX.A02;
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                C07T lifecycle = ((C07X) this.A03).getLifecycle();
                C07S c07s = (C07S) this.A02;
                MC9 mc9 = new MC9(this.A04, this.A05, (InterfaceC23621Ds) null, 33);
                this.A00 = 1;
                if (C3HN.A00(c07s, lifecycle, this, mc9) == c1jx2) {
                    return c1jx2;
                }
            }
        }
        return C0eB.A00;
    }
}
