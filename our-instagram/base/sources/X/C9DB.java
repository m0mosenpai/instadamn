package X;

/* renamed from: X.9DB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DB extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DB(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A04 = z;
        this.A02 = obj2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        boolean z;
        int i;
        int i2 = this.A01;
        Object obj3 = this.A03;
        switch (i2) {
            case 0:
                z = this.A04;
                obj2 = this.A02;
                i = 0;
                break;
            case 1:
                obj2 = this.A02;
                z = this.A04;
                i = 1;
                break;
            case 2:
                obj2 = this.A02;
                z = this.A04;
                i = 2;
                break;
            case 3:
                obj2 = this.A02;
                z = this.A04;
                i = 3;
                break;
            default:
                obj2 = this.A02;
                z = this.A04;
                i = 4;
                break;
        }
        return new C9DB(obj3, obj2, interfaceC23621Ds, i, z);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DB) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }
}
