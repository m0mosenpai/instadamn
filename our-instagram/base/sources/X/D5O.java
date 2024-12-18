package X;

/* loaded from: classes5.dex */
public final class D5O extends AbstractC23611Dp implements InterfaceC16570sA {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5O(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(6, interfaceC23621Ds);
        this.A05 = i;
        this.A06 = obj;
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a;
        D5O d5o;
        boolean A1a2;
        InterfaceC23621Ds interfaceC23621Ds;
        Object obj7;
        int i;
        switch (this.A05) {
            case 0:
                A1a2 = AbstractC166987dD.A1a(obj4);
                A1a = AbstractC166987dD.A1a(obj5);
                interfaceC23621Ds = (InterfaceC23621Ds) obj6;
                obj7 = this.A06;
                i = 0;
                d5o = new D5O(obj7, interfaceC23621Ds, i);
                d5o.A00 = obj;
                d5o.A01 = obj2;
                d5o.A02 = obj3;
                d5o.A03 = A1a2;
                d5o.A04 = A1a;
                break;
            case 1:
                boolean A1a3 = AbstractC166987dD.A1a(obj);
                boolean A1a4 = AbstractC166987dD.A1a(obj2);
                d5o = new D5O(this.A06, (InterfaceC23621Ds) obj6, 1);
                d5o.A03 = A1a3;
                d5o.A04 = A1a4;
                d5o.A00 = obj3;
                d5o.A01 = obj4;
                d5o.A02 = obj5;
                break;
            case 2:
                boolean A1a5 = AbstractC166987dD.A1a(obj);
                A1a = AbstractC166987dD.A1a(obj5);
                d5o = new D5O(this.A06, (InterfaceC23621Ds) obj6, 2);
                d5o.A03 = A1a5;
                d5o.A00 = obj2;
                d5o.A01 = obj3;
                d5o.A02 = obj4;
                d5o.A04 = A1a;
                break;
            default:
                A1a2 = AbstractC166987dD.A1a(obj4);
                A1a = AbstractC166987dD.A1a(obj5);
                interfaceC23621Ds = (InterfaceC23621Ds) obj6;
                obj7 = this.A06;
                i = 3;
                d5o = new D5O(obj7, interfaceC23621Ds, i);
                d5o.A00 = obj;
                d5o.A01 = obj2;
                d5o.A02 = obj3;
                d5o.A03 = A1a2;
                d5o.A04 = A1a;
                break;
        }
        return d5o.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0249, code lost:
    
        if (r1 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        if (r6.length() > X.AbstractC28459ChB.A01(r7)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        if (X.AbstractC001900j.A0T(r5) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
    
        r6 = r5.length();
        r7 = ((X.C25879Bce) r36.A06).A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        if (r6 > X.AbstractC28459ChB.A00(r7)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        if ((r2 instanceof X.C26116Bh0) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
    
        r6 = ((X.C26116Bh0) r2).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0100, code lost:
    
        if (X.AbstractC25225BEi.A1Y(r6) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
    
        if (r6.length() > X.AbstractC28459ChB.A02(r7)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010e, code lost:
    
        if ((r3 instanceof X.C26114Bgy) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0110, code lost:
    
        r6 = ((X.C26114Bgy) r3).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
    
        if (X.AbstractC25225BEi.A1Y(r6) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        r28 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0125, code lost:
    
        if (r6.length() <= X.AbstractC28459ChB.A01(r7)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016c, code lost:
    
        if (X.AbstractC28459ChB.A04(r7) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00db, code lost:
    
        if (r5 != null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00db  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D5O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
