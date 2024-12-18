package X;

/* loaded from: classes9.dex */
public final class PXx extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXx(Object obj, Object obj2, Object obj3, String str, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, long j) {
        super(2, interfaceC23621Ds);
        this.A01 = i2;
        this.A03 = j;
        this.A06 = obj;
        this.A04 = obj2;
        this.A02 = i;
        this.A07 = str;
        this.A05 = obj3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        long j;
        int i;
        String str;
        Object obj3;
        Object obj4;
        int i2;
        switch (this.A01) {
            case 0:
                obj2 = this.A06;
                j = this.A03;
                i = this.A02;
                str = this.A07;
                obj3 = this.A05;
                obj4 = this.A04;
                i2 = 0;
                break;
            case 1:
                obj2 = this.A06;
                j = this.A03;
                i = this.A02;
                str = this.A07;
                obj3 = this.A05;
                obj4 = this.A04;
                i2 = 1;
                break;
            default:
                j = this.A03;
                obj2 = this.A06;
                obj4 = this.A04;
                i = this.A02;
                str = this.A07;
                obj3 = this.A05;
                i2 = 2;
                break;
        }
        return new PXx(obj2, obj4, obj3, str, interfaceC23621Ds, i, i2, j);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PXx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PXx) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
