package X;

/* loaded from: classes9.dex */
public final class PYf extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public final int A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYf(C54797OJq c54797OJq, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = 3;
        this.A03 = c54797OJq;
        this.A04 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        int i;
        String str;
        int i2;
        switch (this.A02) {
            case 0:
                obj2 = this.A03;
                i = this.A00;
                str = this.A04;
                i2 = 0;
                break;
            case 1:
                obj2 = this.A03;
                str = this.A04;
                i = this.A00;
                i2 = 1;
                break;
            case 2:
                obj2 = this.A03;
                i = this.A00;
                str = this.A04;
                i2 = 2;
                break;
            default:
                return new PYf((C54797OJq) this.A03, this.A04, interfaceC23621Ds);
        }
        return new PYf(obj2, str, interfaceC23621Ds, i, i2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012b  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYf) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYf(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A02 = i2;
        this.A03 = obj;
        this.A00 = i;
        this.A04 = str;
    }
}
