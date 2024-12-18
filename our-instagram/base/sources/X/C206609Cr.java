package X;

/* renamed from: X.9Cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206609Cr extends AbstractC23611Dp implements InterfaceC16600sD {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206609Cr(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A03 = i;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.A03;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj4;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C206609Cr c206609Cr = new C206609Cr(i, interfaceC23621Ds);
        c206609Cr.A00 = booleanValue;
        c206609Cr.A01 = booleanValue2;
        c206609Cr.A02 = booleanValue3;
        return c206609Cr.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r1 == false) goto L11;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A03
            X.AbstractC09560e7.A00(r6)
            if (r0 == 0) goto L14
            boolean r4 = r5.A00
            boolean r3 = r5.A01
            boolean r2 = r5.A02
            r1 = 1
            X.MWv r0 = new X.MWv
            r0.<init>(r4, r3, r2, r1)
            return r0
        L14:
            boolean r2 = r5.A00
            boolean r0 = r5.A01
            boolean r1 = r5.A02
            if (r2 == 0) goto L21
            if (r0 == 0) goto L21
            r0 = 1
            if (r1 != 0) goto L22
        L21:
            r0 = 0
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206609Cr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
