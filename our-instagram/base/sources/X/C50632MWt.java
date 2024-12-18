package X;

/* renamed from: X.MWt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50632MWt extends AbstractC23611Dp implements InterfaceC16600sD {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50632MWt(InterfaceC23621Ds interfaceC23621Ds, C0s8 c0s8, int i) {
        super(4, interfaceC23621Ds);
        this.A04 = i;
        this.A05 = c0s8;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.A04;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj4;
        C0s8 c0s8 = (C0s8) this.A05;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C50632MWt c50632MWt = new C50632MWt(interfaceC23621Ds, c0s8, i);
        c50632MWt.A01 = obj;
        c50632MWt.A02 = obj2;
        c50632MWt.A03 = obj3;
        return c50632MWt.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
            return obj;
        }
        AbstractC09560e7.A00(obj);
        C51u c51u = (C51u) this.A01;
        C51u c51u2 = (C51u) this.A02;
        Object obj2 = this.A03;
        C0s8 c0s8 = (C0s8) this.A05;
        Object obj3 = c51u.A00;
        Object obj4 = c51u.A01;
        Object obj5 = c51u.A02;
        Object obj6 = c51u2.A00;
        Object obj7 = c51u2.A01;
        Object obj8 = c51u2.A02;
        this.A01 = null;
        this.A02 = null;
        this.A00 = 1;
        Object invoke = c0s8.invoke(obj3, obj4, obj5, obj6, obj7, obj8, obj2, this);
        if (invoke != c1jx) {
            return invoke;
        }
        return c1jx;
    }
}
