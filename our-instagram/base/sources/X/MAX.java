package X;

/* loaded from: classes8.dex */
public final class MAX extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAX(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(1, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        Object obj;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A03;
        switch (i2) {
            case 0:
                obj = this.A02;
                str = this.A04;
                i = 0;
                break;
            case 1:
                str = this.A04;
                obj = this.A02;
                i = 1;
                break;
            default:
                str = this.A04;
                obj = this.A02;
                i = 2;
                break;
        }
        return new MAX(obj2, obj, str, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MAX) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAX.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
