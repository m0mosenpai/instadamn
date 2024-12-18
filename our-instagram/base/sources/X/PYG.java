package X;

/* loaded from: classes9.dex */
public final class PYG extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYG(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A09 = obj;
        this.A06 = obj2;
        this.A04 = obj3;
        this.A0B = obj4;
        this.A07 = obj5;
        this.A08 = obj6;
        this.A05 = obj7;
        this.A0A = obj8;
        this.A03 = obj9;
        this.A02 = obj10;
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
        int i;
        if (this.A01 != 0) {
            obj3 = this.A09;
            obj4 = this.A06;
            obj2 = this.A04;
            obj5 = this.A0B;
            obj6 = this.A07;
            obj7 = this.A08;
            obj8 = this.A05;
            obj9 = this.A0A;
            obj10 = this.A03;
            obj11 = this.A02;
            i = 1;
        } else {
            obj2 = this.A04;
            obj3 = this.A09;
            obj4 = this.A06;
            obj5 = this.A0B;
            obj6 = this.A07;
            obj7 = this.A08;
            obj8 = this.A05;
            obj9 = this.A0A;
            obj10 = this.A03;
            obj11 = this.A02;
            i = 0;
        }
        PYG pyg = new PYG(obj3, obj4, obj2, obj5, obj6, obj7, obj8, obj9, obj10, obj11, interfaceC23621Ds, i);
        pyg.A00 = obj;
        return pyg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0234, code lost:
    
        if (r11 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0262, code lost:
    
        if (X.C18U.A06(r8, X.AbstractC25230BEn.A0k(r9, 0), 36315846863359601L) != false) goto L51;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYG) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
