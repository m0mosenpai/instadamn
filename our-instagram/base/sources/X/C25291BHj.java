package X;

/* renamed from: X.BHj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25291BHj extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25291BHj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25291BHj(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A03 = obj4;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        if (this.A02 != 0) {
            obj4 = this.A05;
            obj3 = this.A04;
            obj5 = this.A06;
            obj2 = this.A03;
            i = 1;
        } else {
            obj2 = this.A03;
            obj3 = this.A04;
            obj4 = this.A05;
            obj5 = this.A06;
            i = 0;
        }
        C25291BHj c25291BHj = new C25291BHj(obj4, obj3, obj5, obj2, interfaceC23621Ds, i);
        c25291BHj.A01 = obj;
        return c25291BHj;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C25291BHj) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
