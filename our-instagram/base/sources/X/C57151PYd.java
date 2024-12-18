package X;

/* renamed from: X.PYd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57151PYd extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57151PYd(C50868Mdz c50868Mdz, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, int i3) {
        super(2, interfaceC23621Ds);
        this.A01 = i3;
        this.A04 = c50868Mdz;
        switch (i3) {
            case 1:
            case 2:
                this.A03 = i;
                this.A02 = i2;
                break;
            default:
                this.A02 = i;
                this.A03 = i2;
                break;
        }
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C50868Mdz c50868Mdz;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.A01;
        Object obj2 = this.A04;
        switch (i7) {
            case 0:
                i4 = this.A02;
                i5 = this.A03;
                i6 = 0;
                return new C57151PYd(obj2, interfaceC23621Ds, i5, i4, i6);
            case 1:
                c50868Mdz = (C50868Mdz) obj2;
                i = this.A03;
                i2 = this.A02;
                i3 = 1;
                break;
            case 2:
                c50868Mdz = (C50868Mdz) obj2;
                i = this.A03;
                i2 = this.A02;
                i3 = 2;
                break;
            case 3:
                c50868Mdz = (C50868Mdz) obj2;
                i = this.A02;
                i2 = this.A03;
                i3 = 3;
                break;
            case 4:
                c50868Mdz = (C50868Mdz) obj2;
                i = this.A02;
                i2 = this.A03;
                i3 = 4;
                break;
            default:
                i5 = this.A03;
                i4 = this.A02;
                i6 = 5;
                return new C57151PYd(obj2, interfaceC23621Ds, i5, i4, i6);
        }
        return new C57151PYd(c50868Mdz, interfaceC23621Ds, i, i2, i3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57151PYd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57151PYd) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57151PYd(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, int i3) {
        super(2, interfaceC23621Ds);
        this.A01 = i3;
        this.A04 = obj;
        this.A03 = i;
        this.A02 = i2;
    }
}
