package X;

/* loaded from: classes8.dex */
public final class MCB extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCB(C14090nZ c14090nZ, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, C17u c17u, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = 5;
        this.A02 = c17u;
        this.A00 = i;
        this.A06 = c14090nZ;
        this.A05 = interfaceC16660sJ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        MCB mcb;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        int i2;
        switch (this.A04) {
            case 0:
                i = this.A00;
                obj4 = this.A03;
                obj5 = this.A02;
                obj3 = this.A05;
                obj2 = this.A06;
                i2 = 0;
                return new MCB(obj4, obj5, obj3, obj2, interfaceC23621Ds, i, i2);
            case 1:
                obj4 = this.A03;
                obj5 = this.A02;
                obj3 = this.A05;
                i = this.A00;
                obj2 = this.A06;
                i2 = 1;
                return new MCB(obj4, obj5, obj3, obj2, interfaceC23621Ds, i, i2);
            case 2:
                C194388iy c194388iy = (C194388iy) this.A02;
                mcb = new MCB((InterfaceC11380iw) this.A05, (C9V6) this.A06, c194388iy, interfaceC23621Ds);
                break;
            case 3:
                MCB mcb2 = new MCB((C26070Bfy) this.A05, (C25870BcR) this.A03, interfaceC23621Ds, (InterfaceC16660sJ) this.A06, this.A00);
                mcb2.A02 = obj;
                return mcb2;
            case 4:
                obj2 = this.A06;
                i = this.A00;
                obj3 = this.A05;
                obj4 = this.A03;
                obj5 = this.A02;
                i2 = 4;
                return new MCB(obj4, obj5, obj3, obj2, interfaceC23621Ds, i, i2);
            case 5:
                mcb = new MCB((C14090nZ) this.A06, interfaceC23621Ds, (InterfaceC16660sJ) this.A05, (C17u) this.A02, this.A00);
                break;
            default:
                obj4 = this.A03;
                obj5 = this.A02;
                i = this.A00;
                obj2 = this.A06;
                obj3 = this.A05;
                i2 = 6;
                return new MCB(obj4, obj5, obj3, obj2, interfaceC23621Ds, i, i2);
        }
        mcb.A03 = obj;
        return mcb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0342, code lost:
    
        if (r7 == r14) goto L117;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02d7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MCB) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCB(InterfaceC11380iw interfaceC11380iw, C9V6 c9v6, C194388iy c194388iy, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = 2;
        this.A02 = c194388iy;
        this.A06 = c9v6;
        this.A05 = interfaceC11380iw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCB(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A04 = i2;
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A06 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCB(C26070Bfy c26070Bfy, C25870BcR c25870BcR, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = 3;
        this.A03 = c25870BcR;
        this.A05 = c26070Bfy;
        this.A06 = interfaceC16660sJ;
        this.A00 = i;
    }
}
