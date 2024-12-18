package X;

/* renamed from: X.PaU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57189PaU extends AbstractC23611Dp implements InterfaceC16570sA {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57189PaU(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(6, interfaceC23621Ds);
        this.A05 = i;
        this.A06 = obj;
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object obj7;
        int i;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj6;
        switch (this.A05) {
            case 0:
                obj7 = this.A06;
                i = 0;
                break;
            case 1:
                obj7 = this.A06;
                i = 1;
                break;
            default:
                obj7 = this.A06;
                i = 2;
                break;
        }
        C57189PaU c57189PaU = new C57189PaU(obj7, interfaceC23621Ds, i);
        c57189PaU.A00 = obj;
        c57189PaU.A01 = obj2;
        c57189PaU.A02 = obj3;
        c57189PaU.A03 = obj4;
        c57189PaU.A04 = obj5;
        return c57189PaU.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x026e, code lost:
    
        if (r3 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0304, code lost:
    
        if (r2.A01.A07 != false) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c3  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57189PaU.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
