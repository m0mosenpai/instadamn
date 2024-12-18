package X;

/* renamed from: X.TcA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65024TcA extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C2GT A03;
    public final /* synthetic */ Q8D A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65024TcA(C2GT c2gt, Q8D q8d, long j, long j2, long j3) {
        super(1);
        this.A04 = q8d;
        this.A03 = c2gt;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[LOOP:0: B:19:0x0078->B:21:0x007e, LOOP_END] */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r7 = r20
            X.SLr r7 = (X.C62678SLr) r7
            if (r7 == 0) goto L42
            r5 = r19
            X.Q8D r3 = r5.A04
            X.2li r4 = r3.A07
            X.2GT r0 = r5.A03
            r4.A0D(r0)
            java.lang.Throwable r6 = r7.A02
            boolean r0 = X.AbstractC25229BEm.A1Z(r6)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L45
            X.2GS r2 = r3.A08
            java.lang.Object r0 = r7.A01
            if (r0 == 0) goto La5
            com.fbpay.w3c.W3CCardDetail r0 = (com.fbpay.w3c.W3CCardDetail) r0
            com.fbpay.w3c.CardDetails r6 = r0.A00
            r7 = 0
            X.0JM r0 = r3.A0D
            long r9 = r0.now()
            long r0 = r5.A02
            long r9 = r9 - r0
            long r11 = r5.A01
            long r13 = r5.A00
            X.0JO r0 = X.C63021Sam.A02
            long r15 = r0.now()
            X.QIk r5 = new X.QIk
            r8 = r7
            r5.<init>(r6, r7, r8, r9, r11, r13, r15)
            r2.A0B(r5)
        L42:
            X.0eB r0 = X.C0eB.A00
            return r0
        L45:
            java.util.List r0 = r3.A05
            if (r6 == 0) goto Laa
            r0.add(r6)
            long r1 = r5.A02
            java.util.HashSet r0 = X.W39.A0C
            android.app.Application r0 = r3.A0D()
            X.W39 r9 = new X.W39
            r9.<init>(r0, r6)
            X.0do r0 = r9.A07
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto L8a
            X.2GS r6 = r3.A09
            java.lang.Object r5 = r6.A02()
            X.Rep r0 = X.EnumC61075Rep.A02
            if (r5 != r0) goto L8a
            X.Rep r7 = X.EnumC61075Rep.A03
        L6d:
            r6.A0B(r7)
            java.util.List r0 = X.Q8D.A00(r3)
            java.util.Iterator r2 = r0.iterator()
        L78:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r1 = r2.next()
            X.2GT r1 = (X.C2GT) r1
            X.2lv r0 = r3.A0C
            r4.A0E(r1, r0)
            goto L78
        L8a:
            X.Rfb r0 = X.EnumC61121Rfb.A02
            r4.A0B(r0)
            X.2GS r6 = r3.A08
            r8 = 0
            X.0JM r0 = r3.A0D
            long r11 = r0.now()
            long r11 = r11 - r1
            r13 = -1
            X.QIk r7 = new X.QIk
            r10 = r8
            r15 = r13
            r17 = r13
            r7.<init>(r8, r9, r10, r11, r13, r15, r17)
            goto L6d
        La5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        Laa:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65024TcA.invoke(java.lang.Object):java.lang.Object");
    }
}
