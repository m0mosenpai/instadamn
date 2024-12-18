package X;

/* loaded from: classes5.dex */
public final class D5C extends AbstractC23611Dp implements InterfaceC16600sD {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5C(C25878Bcd c25878Bcd, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(4, interfaceC23621Ds);
        this.A03 = i;
        this.A04 = c25878Bcd;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.A03;
        boolean A1a = AbstractC166987dD.A1a(obj2);
        int A0H = AbstractC166987dD.A0H(obj3);
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj4;
        C25878Bcd c25878Bcd = (C25878Bcd) this.A04;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        D5C d5c = new D5C(c25878Bcd, interfaceC23621Ds, i);
        d5c.A01 = obj;
        d5c.A02 = A1a;
        d5c.A00 = A0H;
        return d5c.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r9 != false) goto L10;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r1 = r13.A03
            X.AbstractC09560e7.A00(r14)
            java.lang.Object r0 = r13.A01
            if (r1 == 0) goto L45
            X.Bew r0 = (X.C26008Bew) r0
            boolean r9 = r13.A02
            int r5 = r13.A00
            if (r0 == 0) goto L83
            boolean r1 = r0.A04
            if (r1 == 0) goto L18
            r6 = 1
            if (r9 == 0) goto L19
        L18:
            r6 = 0
        L19:
            java.lang.Object r1 = r13.A04
            X.Bcd r1 = (X.C25878Bcd) r1
            com.instagram.common.session.UserSession r4 = r1.A01
            X.0Tz r3 = X.AbstractC166997dE.A0U(r4)
            r1 = 36605486574605592(0x820c7f001c1518, double:3.212795336019433E-306)
            int r1 = X.AbstractC25225BEi.A07(r3, r4, r1)
            boolean r11 = X.AbstractC167007dF.A1Q(r5, r1)
            int r5 = r0.A00
            java.lang.String r3 = r0.A02
            java.lang.String r4 = r0.A01
            boolean r7 = r0.A08
            boolean r8 = r0.A05
            boolean r10 = r0.A06
            X.AbstractC167017dG.A1P(r3, r4)
            X.Bew r2 = new X.Bew
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L45:
            X.Bf0 r0 = (X.C26012Bf0) r0
            boolean r9 = r13.A02
            int r5 = r13.A00
            if (r0 == 0) goto L83
            boolean r1 = r0.A04
            if (r1 == 0) goto L54
            r6 = 1
            if (r9 == 0) goto L55
        L54:
            r6 = 0
        L55:
            java.lang.Object r1 = r13.A04
            X.Bcd r1 = (X.C25878Bcd) r1
            com.instagram.common.session.UserSession r4 = r1.A01
            X.0Tz r3 = X.AbstractC166997dE.A0U(r4)
            r1 = 36605486574540055(0x820c7f001b1517, double:3.212795335977987E-306)
            int r1 = X.AbstractC25225BEi.A07(r3, r4, r1)
            boolean r11 = X.AbstractC167007dF.A1Q(r5, r1)
            int r5 = r0.A00
            X.MYx r3 = r0.A02
            X.MYx r4 = r0.A01
            boolean r7 = r0.A08
            boolean r8 = r0.A05
            boolean r10 = r0.A06
            boolean r12 = r0.A09
            X.AbstractC167017dG.A1P(r3, r4)
            X.Bf0 r2 = new X.Bf0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        L83:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D5C.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
