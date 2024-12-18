package X;

/* loaded from: classes5.dex */
public final class D5K extends AbstractC23611Dp implements InterfaceC16590sC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5K(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(5, interfaceC23621Ds);
        this.A04 = i;
        this.A05 = obj;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6;
        int i;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj5;
        switch (this.A04) {
            case 0:
                obj6 = this.A05;
                i = 0;
                break;
            case 1:
                obj6 = this.A05;
                i = 1;
                break;
            default:
                obj6 = this.A05;
                i = 2;
                break;
        }
        D5K d5k = new D5K(obj6, interfaceC23621Ds, i);
        d5k.A00 = obj;
        d5k.A01 = obj2;
        d5k.A02 = obj3;
        d5k.A03 = obj4;
        return d5k.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x01bb, code lost:
    
        if (r1 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01c7, code lost:
    
        if (r1 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        if (X.AbstractC166987dD.A1b(r2) == true) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ae, code lost:
    
        if (r3.A0C != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0100, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cf  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D5K.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
