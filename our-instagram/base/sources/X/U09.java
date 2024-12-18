package X;

/* loaded from: classes11.dex */
public final class U09 implements Runnable {
    public final /* synthetic */ ViewOnTouchListenerC60632pm A00;
    public final /* synthetic */ XAp A01;
    public final /* synthetic */ C65867TvU A02;

    public U09(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, XAp xAp, C65867TvU c65867TvU) {
        this.A02 = c65867TvU;
        this.A01 = xAp;
        this.A00 = viewOnTouchListenerC60632pm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (X.AbstractC65702TsY.A1Y(r6.A0R) != false) goto L6;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            X.TvU r6 = r9.A02
            android.content.Context r3 = r6.A0N
            r0 = 6
            float r0 = X.AbstractC13880nE.A04(r3, r0)
            int r2 = (int) r0
            com.instagram.explore.intf.ExploreFragmentConfig r0 = r6.A0W
            int r1 = r0.A00
            r0 = 4
            if (r1 == r0) goto L1a
            com.instagram.common.session.UserSession r0 = r6.A0R
            boolean r0 = X.AbstractC65702TsY.A1Y(r0)
            r7 = 0
            if (r0 == 0) goto L1b
        L1a:
            r7 = 1
        L1b:
            int r8 = X.C3HB.A00(r3)
            int r8 = r8 - r2
            boolean r0 = r6.A0b
            if (r0 == 0) goto L6e
            r0 = 2130970381(0x7f04070d, float:1.754947E38)
            int r1 = X.AbstractC53242c7.A0G(r3, r0)
            r0 = 2130970384(0x7f040710, float:1.7549477E38)
            int r0 = X.AbstractC53242c7.A0G(r3, r0)
            int r1 = r1 - r0
        L33:
            int r8 = r8 + r1
            com.instagram.common.session.UserSession r0 = r6.A0R
            boolean r0 = X.AbstractC65702TsY.A1Y(r0)
            if (r0 == 0) goto L6c
            int r0 = r6.A02
        L3e:
            int r8 = r8 + r0
            X.XAp r5 = r9.A01
            float r0 = r6.A00
            r5.DKL(r0)
            if (r7 == 0) goto L54
            X.2pm r1 = r9.A00
            android.view.ViewGroup r0 = r6.A07
            if (r0 == 0) goto L62
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)
            r1.A0A = r0
        L54:
            X.2pm r4 = r9.A00
            float r3 = (float) r8
            X.U0A r2 = new X.U0A
            r2.<init>(r5, r6, r8, r7)
            if (r7 == 0) goto L70
            android.view.ViewGroup r0 = r6.A07
            if (r0 != 0) goto L7a
        L62:
            java.lang.String r0 = "headerView"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L6c:
            r0 = 0
            goto L3e
        L6e:
            r1 = 0
            goto L33
        L70:
            X.2iS r1 = X.C56352iT.A0t
            androidx.fragment.app.FragmentActivity r0 = r6.A0P
            X.2iT r0 = r1.A03(r0)
            android.view.ViewGroup r0 = r0.A0P
        L7a:
            r4.A04(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U09.run():void");
    }
}
