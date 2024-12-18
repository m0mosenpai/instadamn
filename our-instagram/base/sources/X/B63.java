package X;

/* loaded from: classes4.dex */
public final class B63 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B63(long j, Object obj, Object obj2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
        this.A03 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r4 != null) goto L14;
     */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L20;
                case 1: goto L56;
                case 2: goto Lce;
                default: goto L5;
            }
        L5:
            java.lang.Object r5 = r14.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r14.A02
            android.content.Context r4 = (android.content.Context) r4
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            long r0 = r14.A01
            long r2 = r2.toMillis(r0)
            X.L23 r1 = new X.L23
            r1.<init>(r2)
            X.HYI r0 = new X.HYI
            r0.<init>(r4, r5, r1)
            return r0
        L20:
            java.lang.Object r0 = r14.A03
            X.5AZ r0 = (X.C5AZ) r0
            X.599 r0 = r0.A0I
            boolean r2 = X.AbstractC119095aR.A00(r0)
            X.59S r0 = r0.A0W
            X.59U r1 = r0.A04
            X.59U r0 = r1.A07
            if (r2 != 0) goto L38
            if (r0 == 0) goto L3e
            X.6Lg r0 = r0.A0V()
        L38:
            if (r0 == 0) goto L3e
            X.5AW r4 = r0.A05
            if (r4 != 0) goto L47
        L3e:
            java.lang.Object r0 = r14.A02
            X.57r r0 = (X.InterfaceC1128457r) r0
            X.5ae r4 = new X.5ae
            r4.<init>(r0)
        L47:
            long r2 = r14.A01
            X.6Lg r1 = r1.A0V()
            X.C14360o3.A0A(r1)
            r0 = 0
            r4.A06(r1, r0, r2)
            goto Ldb
        L56:
            long r1 = r14.A01
            java.lang.Object r6 = r14.A02
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r12 = r14.A03
            X.0ll r12 = (X.AbstractC12990ll) r12
            java.lang.String r13 = "TextPostAppPostTransparencyLabel"
            r11 = 0
            boolean r3 = X.AbstractC167007dF.A1R(r11, r6, r12)
            r5 = 0
            java.util.HashMap r10 = X.AbstractC166987dD.A1G()
            java.util.HashMap r9 = X.AbstractC166987dD.A1G()
            java.util.HashMap r4 = X.AbstractC166987dD.A1G()
            r8 = 2
            java.util.BitSet r7 = new java.util.BitSet
            r7.<init>(r8)
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            r10.put(r0, r13)
            r7.set(r11)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r0 = "target_user_id"
            r10.put(r0, r1)
            r7.set(r3)
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r3.<init>(r12)
            java.lang.String r1 = "com.bloks.www.text_post_app.about_this_profile_bottom_sheet"
            r3.A0R = r1
            int r0 = r7.nextClearBit(r11)
            if (r0 < r8) goto Lc3
            java.util.HashMap r0 = X.AbstractC191768eY.A01(r10)
            X.U6x r2 = X.C66277U6x.A02(r1, r0, r9)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            r2.A00 = r0
            r2.A05 = r5
            r0 = 0
            r2.A01 = r0
            r2.A06 = r5
            r2.A03 = r5
            r2.A02 = r5
            r2.A04 = r5
            r2.A08(r4)
            r2.A05(r6, r3)
            goto Ldb
        Lc3:
            r0 = 13
            java.lang.String r0 = X.MSV.A00(r0)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        Lce:
            java.lang.Object r3 = r14.A02
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Object r2 = r14.A03
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            long r0 = r14.A01
            r3.postDelayed(r2, r0)
        Ldb:
            X.0eB r0 = X.C0eB.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B63.invoke():java.lang.Object");
    }
}
