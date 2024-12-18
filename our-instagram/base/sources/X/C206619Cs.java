package X;

/* renamed from: X.9Cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206619Cs extends AbstractC23611Dp implements InterfaceC16570sA {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206619Cs(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(6, interfaceC23621Ds);
        this.A05 = i;
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        int i2 = this.A05;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        boolean booleanValue4 = ((Boolean) obj4).booleanValue();
        boolean booleanValue5 = ((Boolean) obj5).booleanValue();
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj6;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C206619Cs c206619Cs = new C206619Cs(i, interfaceC23621Ds);
        c206619Cs.A00 = booleanValue;
        c206619Cs.A01 = booleanValue2;
        c206619Cs.A02 = booleanValue3;
        c206619Cs.A03 = booleanValue4;
        c206619Cs.A04 = booleanValue5;
        return c206619Cs.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r0 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r0 = true;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A05
            X.AbstractC09560e7.A00(r6)
            if (r0 == 0) goto L21
            boolean r4 = r5.A00
            boolean r3 = r5.A01
            boolean r2 = r5.A02
            boolean r1 = r5.A03
            boolean r0 = r5.A04
            if (r4 == 0) goto L36
            if (r3 != 0) goto L36
            if (r2 != 0) goto L36
            if (r1 == 0) goto L36
            if (r0 != 0) goto L36
        L1b:
            r0 = 1
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L21:
            boolean r4 = r5.A00
            boolean r3 = r5.A01
            boolean r2 = r5.A02
            boolean r1 = r5.A03
            boolean r0 = r5.A04
            if (r4 == 0) goto L36
            if (r3 != 0) goto L36
            if (r2 != 0) goto L36
            if (r1 == 0) goto L36
            if (r0 == 0) goto L36
            goto L1b
        L36:
            r0 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206619Cs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
