package X;

/* renamed from: X.PXn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57149PXn extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57149PXn(Object obj, Object obj2, Object obj3, String str, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A05 = str;
        this.A06 = z;
        this.A03 = obj3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        Object obj3;
        Object obj4;
        boolean z;
        int i;
        switch (this.A01) {
            case 0:
                obj2 = this.A04;
                obj4 = this.A02;
                str = this.A05;
                z = this.A06;
                obj3 = this.A03;
                i = 0;
                break;
            case 1:
                obj2 = this.A04;
                str = this.A05;
                obj3 = this.A03;
                obj4 = this.A02;
                z = this.A06;
                i = 1;
                break;
            default:
                obj3 = this.A03;
                z = this.A06;
                obj2 = this.A04;
                str = this.A05;
                obj4 = this.A02;
                i = 2;
                break;
        }
        return new C57149PXn(obj2, obj4, obj3, str, interfaceC23621Ds, i, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
    
        if (r9.length() <= 0) goto L36;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57149PXn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57149PXn) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
