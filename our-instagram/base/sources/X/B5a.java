package X;

/* loaded from: classes4.dex */
public final class B5a extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5a(C07S c07s, C07T c07t, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        super(2, interfaceC23621Ds);
        this.A02 = 4;
        this.A05 = c07t;
        this.A04 = c07s;
        this.A03 = interfaceC16620sF;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        switch (this.A02) {
            case 0:
                obj2 = this.A05;
                obj5 = this.A03;
                obj3 = this.A04;
                obj4 = this.A01;
                i = 0;
                return new B5a(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
            case 1:
                obj2 = this.A05;
                obj5 = this.A03;
                obj3 = this.A04;
                obj4 = this.A01;
                i = 1;
                return new B5a(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
            case 2:
                obj4 = this.A01;
                obj5 = this.A03;
                obj2 = this.A05;
                obj3 = this.A04;
                i = 2;
                return new B5a(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
            case 3:
                obj3 = this.A04;
                obj2 = this.A05;
                obj4 = this.A01;
                obj5 = this.A03;
                i = 3;
                return new B5a(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
            case 4:
                B5a b5a = new B5a((C07S) this.A04, (C07T) this.A05, interfaceC23621Ds, (InterfaceC16620sF) this.A03);
                b5a.A01 = obj;
                return b5a;
            case 5:
                obj2 = this.A05;
                obj3 = this.A04;
                obj4 = this.A01;
                obj5 = this.A03;
                i = 5;
                return new B5a(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
            default:
                obj4 = this.A01;
                obj3 = this.A04;
                obj2 = this.A05;
                obj5 = this.A03;
                i = 6;
                return new B5a(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0228  */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, X.8zj] */
    /* JADX WARN: Type inference failed for: r4v44, types: [X.BEQ] */
    /* JADX WARN: Type inference failed for: r5v10, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B5a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((B5a) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5a(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A05 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = obj4;
    }
}
