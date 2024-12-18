package X;

/* loaded from: classes9.dex */
public final class MWS extends C1P1 {
    public final /* synthetic */ O5U A00;
    public final /* synthetic */ O5V A01;

    public MWS(O5U o5u, O5V o5v) {
        this.A00 = o5u;
        this.A01 = o5v;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C0f9.A0A(-203053261, C0f9.A03(-1328099569));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (r9.A00(X.C152436tW.class, "fbpay_account_extended").A00(X.C152446tX.class, "fbpay_account").A06("is_connected") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (((X.AbstractC907342m) r9).A06("fbpay_experience_enabled") == false) goto L6;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = -1443749439(0xffffffffa9f221c1, float:-1.0752814E-13)
            int r3 = X.C0f9.A03(r0)
            X.435 r11 = (X.AnonymousClass435) r11
            r0 = 1946161605(0x740011c5, float:4.0586817E31)
            int r4 = X.C0f9.A03(r0)
            java.lang.Object r9 = r11.A01
            r7 = 1
            if (r9 == 0) goto L21
            r1 = r9
            X.42m r1 = (X.AbstractC907342m) r1
            java.lang.String r0 = "fbpay_experience_enabled"
            boolean r0 = r1.A06(r0)
            r5 = 1
            if (r0 != 0) goto L22
        L21:
            r5 = 0
        L22:
            if (r9 == 0) goto L9e
            X.42m r9 = (X.AbstractC907342m) r9
            java.lang.Class<X.6tW> r8 = X.C152436tW.class
            java.lang.String r6 = "fbpay_account_extended"
            X.42m r0 = r9.A00(r8, r6)
            if (r0 == 0) goto L9e
            X.42m r0 = r9.A00(r8, r6)
            java.lang.Class<X.6tX> r2 = X.C152446tX.class
            java.lang.String r1 = "fbpay_account"
            X.42m r0 = r0.A00(r2, r1)
            if (r0 == 0) goto L9e
            X.42m r0 = r9.A00(r8, r6)
            X.42m r1 = r0.A00(r2, r1)
            java.lang.String r0 = "is_connected"
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L9e
        L4e:
            X.O5V r0 = r10.A01
            X.MWN r6 = r0.A00
            boolean r0 = r6.A0F
            if (r5 != r0) goto L5a
            boolean r0 = r6.A0E
            if (r7 == r0) goto La0
        L5a:
            r6.A0F = r5
            r6.A0E = r7
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1AU r1 = X.C1AT.A01(r0)
            X.1AV r0 = X.C1AV.A1P
            X.0xq r5 = r1.A03(r0)
            X.0xo r2 = r5.ARD()
            boolean r1 = r6.A0F
            java.lang.String r0 = "fbpay_enabled"
            r2.E77(r0, r1)
            r2.apply()
            X.0xo r2 = r5.ARD()
            boolean r1 = r6.A0E
            java.lang.String r0 = "fbpay_connected"
            r2.E77(r0, r1)
            r2.apply()
            java.util.List r0 = r6.A0B
            java.util.Iterator r1 = r0.iterator()
        L8c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r1.next()
            X.O3w r0 = (X.C54442O3w) r0
            X.53I r0 = r0.A00
            X.C53I.A00(r0)
            goto L8c
        L9e:
            r7 = 0
            goto L4e
        La0:
            r0 = 1330253540(0x4f4a0ee4, float:3.3899735E9)
            X.C0f9.A0A(r0, r4)
            r0 = 1309686803(0x4e103c13, float:6.0496403E8)
            X.C0f9.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MWS.onSuccess(java.lang.Object):void");
    }
}
