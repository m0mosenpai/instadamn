package X;

/* loaded from: classes9.dex */
public final class PYe extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYe(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
        this.A02 = z;
        this.A01 = z2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        boolean z;
        boolean z2;
        int i;
        switch (this.A03) {
            case 0:
                obj2 = this.A04;
                z2 = this.A02;
                z = this.A01;
                i = 0;
                return new PYe(obj2, interfaceC23621Ds, i, z2, z);
            case 1:
                obj2 = this.A04;
                z = this.A01;
                z2 = this.A02;
                i = 1;
                return new PYe(obj2, interfaceC23621Ds, i, z2, z);
            case 2:
                return new PYe((C44532Jmc) this.A04, interfaceC23621Ds);
            case 3:
                obj2 = this.A04;
                z = this.A01;
                z2 = this.A02;
                i = 3;
                return new PYe(obj2, interfaceC23621Ds, i, z2, z);
            default:
                obj2 = this.A04;
                z = this.A01;
                z2 = this.A02;
                i = 4;
                return new PYe(obj2, interfaceC23621Ds, i, z2, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        if (r0 == r1) goto L13;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYe) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYe(C44532Jmc c44532Jmc, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = 2;
        this.A04 = c44532Jmc;
    }
}
