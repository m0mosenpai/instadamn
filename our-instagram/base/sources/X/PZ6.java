package X;

/* loaded from: classes9.dex */
public final class PZ6 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;
    public final Object A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ6(C51027Mga c51027Mga, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A04 = c51027Mga;
        this.A05 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C51027Mga c51027Mga;
        boolean z;
        int i;
        boolean z2;
        Object obj2;
        boolean z3;
        int i2;
        Object obj3;
        Object obj4;
        boolean z4;
        boolean z5;
        int i3;
        switch (this.A03) {
            case 0:
                obj3 = this.A04;
                z5 = this.A02;
                z4 = this.A05;
                obj4 = this.A01;
                i3 = 0;
                return new PZ6(obj3, obj4, interfaceC23621Ds, i3, z5, z4);
            case 1:
                obj3 = this.A04;
                obj4 = this.A01;
                z5 = this.A02;
                z4 = this.A05;
                i3 = 1;
                return new PZ6(obj3, obj4, interfaceC23621Ds, i3, z5, z4);
            case 2:
                obj3 = this.A04;
                obj4 = this.A01;
                z5 = this.A02;
                z4 = this.A05;
                i3 = 2;
                return new PZ6(obj3, obj4, interfaceC23621Ds, i3, z5, z4);
            case 3:
                z2 = this.A05;
                obj2 = this.A04;
                z3 = this.A02;
                i2 = 3;
                return new PZ6(obj2, interfaceC23621Ds, i2, z2, z3);
            case 4:
                z2 = this.A05;
                obj2 = this.A04;
                z3 = this.A02;
                i2 = 4;
                return new PZ6(obj2, interfaceC23621Ds, i2, z2, z3);
            case 5:
                PZ6 pz6 = new PZ6(this.A04, interfaceC23621Ds, 5, this.A05, this.A02);
                pz6.A01 = obj;
                return pz6;
            case 6:
                c51027Mga = (C51027Mga) this.A04;
                z = this.A05;
                i = 6;
                return new PZ6(c51027Mga, interfaceC23621Ds, i, z);
            case 7:
                c51027Mga = (C51027Mga) this.A04;
                z = this.A05;
                i = 7;
                return new PZ6(c51027Mga, interfaceC23621Ds, i, z);
            case 8:
                obj3 = this.A04;
                obj4 = this.A01;
                z4 = this.A05;
                z5 = this.A02;
                i3 = 8;
                return new PZ6(obj3, obj4, interfaceC23621Ds, i3, z5, z4);
            default:
                obj3 = this.A04;
                z4 = this.A05;
                obj4 = this.A01;
                z5 = this.A02;
                i3 = 9;
                return new PZ6(obj3, obj4, interfaceC23621Ds, i3, z5, z4);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PZ6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PZ6) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ6(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
        this.A05 = z;
        this.A02 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ6(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
        this.A02 = z;
        this.A05 = z2;
        this.A01 = obj2;
    }
}
