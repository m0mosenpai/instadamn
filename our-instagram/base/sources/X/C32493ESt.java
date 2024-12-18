package X;

/* renamed from: X.ESt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32493ESt extends C1P1 {
    public final /* synthetic */ C61252qn A00;

    public C32493ESt(C61252qn c61252qn) {
        this.A00 = c61252qn;
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-727936908);
        this.A00.A0F = false;
        C0f9.A0A(-1521883221, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (r1 != false) goto L29;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1062647126(0x3f56b556, float:0.83870447)
            int r5 = X.C0f9.A03(r0)
            X.EAh r11 = (X.C32134EAh) r11
            r0 = 1721938517(0x66a2b255, float:3.841565E23)
            int r6 = X.C0f9.A03(r0)
            r8 = 0
            X.C14360o3.A0B(r11, r8)
            X.2qn r7 = r10.A00
            java.util.ArrayList r0 = r7.A0B
            if (r0 != 0) goto L20
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r7.A0B = r0
        L20:
            r0.clear()
            X.Gb5 r0 = r11.A00
            if (r0 == 0) goto Lcb
            X.E89 r0 = (X.E89) r0
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L34
            java.util.ArrayList r0 = r7.A0B
            if (r0 == 0) goto L34
            r0.addAll(r1)
        L34:
            X.Gb5 r0 = r11.A00
            if (r0 == 0) goto Lcb
            X.E89 r0 = (X.E89) r0
            java.util.List r0 = r0.A01
            if (r0 == 0) goto La8
            com.instagram.common.session.UserSession r9 = r7.A07
            X.1DU r3 = X.C1DS.A00(r9)
            r4 = 1
            X.C14360o3.A0B(r3, r4)
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        L50:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r1.next()
            X.1pH r0 = (X.InterfaceC37791pH) r0
            X.1pE r0 = r0.F5S(r3)
            r2.add(r0)
            goto L50
        L64:
            com.instagram.reels.store.ReelStore r9 = X.C1OU.A04(r9)
            X.1N6 r3 = new X.1N6
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L71:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r1 = r2.next()
            X.1pE r1 = (X.C37771pE) r1
            java.util.List r0 = java.util.Collections.emptyList()
            com.instagram.model.reels.Reel r0 = com.instagram.reels.store.ReelStore.A01(r1, r9, r0, r8)
            r0.A1O = r4
            r3.A01(r0)
            goto L71
        L8b:
            X.1N6 r1 = r9.A03
            java.util.ArrayList r0 = r3.A00()
            r1.A03(r0)
            com.instagram.common.session.UserSession r0 = r9.A09
            X.1My r4 = X.AbstractC25651Mw.A00(r0)
            r3 = 0
            java.util.List r2 = r9.A0U(r8)
            r1 = -1
            X.3DH r0 = new X.3DH
            r0.<init>(r3, r2, r1, r8)
            r4.A05(r0)
        La8:
            r0 = 1
            r7.A0D = r0
            X.2qs r2 = r7.A0P
            java.util.ArrayList r0 = r7.A0B
            if (r0 == 0) goto Lb8
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto Lb9
        Lb8:
            r0 = 1
        Lb9:
            r0 = r0 ^ 1
            r2.DKn(r0)
            r0 = 550158468(0x20cac084, float:3.4347527E-19)
            X.C0f9.A0A(r0, r6)
            r0 = -1878644553(0xffffffff900628b7, float:-2.6458206E-29)
            X.C0f9.A0A(r0, r5)
            return
        Lcb:
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32493ESt.onSuccess(java.lang.Object):void");
    }
}
