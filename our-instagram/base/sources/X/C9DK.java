package X;

/* renamed from: X.9DK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DK extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DK(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = z;
        this.A06 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        boolean z;
        boolean z2;
        int i;
        int i2 = this.A01;
        Object obj4 = this.A04;
        switch (i2) {
            case 0:
                obj2 = this.A02;
                obj3 = this.A03;
                z = this.A05;
                z2 = this.A06;
                i = 0;
                break;
            case 1:
                obj2 = this.A02;
                obj3 = this.A03;
                z = this.A05;
                z2 = this.A06;
                i = 1;
                break;
            default:
                z = this.A05;
                obj2 = this.A02;
                obj3 = this.A03;
                z2 = this.A06;
                i = 2;
                break;
        }
        return new C9DK(obj4, obj2, obj3, interfaceC23621Ds, i, z, z2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DK) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DK.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
