package X;

/* renamed from: X.J6i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43168J6i extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final Object A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43168J6i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A0D = obj;
        this.A0A = obj2;
        this.A05 = obj3;
        this.A0B = obj4;
        this.A07 = obj5;
        this.A04 = obj6;
        this.A08 = obj7;
        this.A09 = obj8;
        this.A06 = obj9;
        this.A0C = obj10;
        this.A03 = obj11;
        this.A02 = obj12;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        int i;
        if (this.A01 != 0) {
            obj9 = this.A09;
            obj4 = this.A05;
            obj3 = this.A0A;
            obj12 = this.A03;
            obj7 = this.A04;
            obj5 = this.A0B;
            obj6 = this.A07;
            obj2 = this.A0D;
            obj13 = this.A02;
            obj10 = this.A06;
            obj8 = this.A08;
            obj11 = this.A0C;
            i = 1;
        } else {
            obj2 = this.A0D;
            obj3 = this.A0A;
            obj4 = this.A05;
            obj5 = this.A0B;
            obj6 = this.A07;
            obj7 = this.A04;
            obj8 = this.A08;
            obj9 = this.A09;
            obj10 = this.A06;
            obj11 = this.A0C;
            obj12 = this.A03;
            obj13 = this.A02;
            i = 0;
        }
        return new C43168J6i(obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, interfaceC23621Ds, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43168J6i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C43168J6i) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
