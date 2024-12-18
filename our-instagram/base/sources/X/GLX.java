package X;

/* loaded from: classes6.dex */
public final class GLX implements Runnable {
    public final /* synthetic */ AbstractC35025Fby A00;

    public GLX(AbstractC35025Fby abstractC35025Fby) {
        this.A00 = abstractC35025Fby;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (X.FVN.A01(r7.A07, true) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            X.Fby r5 = r8.A00
            boolean r0 = r5 instanceof X.Ef3
            if (r0 == 0) goto La0
            r7 = r5
            X.Ef3 r7 = (X.Ef3) r7
            java.lang.String r1 = r7.A05
            java.lang.String r0 = "ig_interop"
            boolean r0 = r0.equals(r1)
            r6 = 1
            if (r0 != 0) goto L1d
            X.0ll r0 = r7.A07
            boolean r0 = X.FVN.A01(r0, r6)
            r4 = 1
            if (r0 != 0) goto L1e
        L1d:
            r4 = 0
        L1e:
            android.content.Context r3 = r7.A01
            if (r3 == 0) goto L35
            X.02i r2 = r7.A00
            r1 = 444800256(0x1a831d00, float:5.422718E-23)
            java.lang.String r0 = "show_loading_state"
            r2.markerPoint(r1, r0)
            X.1Z0 r1 = X.AbstractC34209F7h.A00()
            android.view.Window r0 = r7.A03
            r1.A00(r3, r0, r6, r4)
        L35:
            java.lang.String r0 = "fx_cds_flow"
            X.0xB r6 = X.AbstractC31171DnF.A0D(r0)
            androidx.fragment.app.Fragment r3 = r5.A04
            boolean r0 = r3 instanceof X.C38K
            r2 = 0
            if (r0 == 0) goto L79
            android.util.SparseArray r1 = r5.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.fragment.IgListFragment"
            X.0ll r4 = r5.A07
            X.C14360o3.A0C(r3, r0)
            X.38K r3 = (X.C38K) r3
        L4d:
            if (r1 != 0) goto L72
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            X.2tP r3 = X.C62862tP.A02(r3, r6, r4, r2)
        L55:
            X.1GL r2 = r3.A07
            if (r2 == 0) goto L6e
            boolean r0 = r5 instanceof X.Ef2
            if (r0 == 0) goto L6f
            java.lang.String r1 = "com.bloks.www.fxim.native.launcher.async"
        L5f:
            java.util.Map r0 = r5.A02()
            X.8gL r1 = X.C192108fB.A05(r4, r1, r0)
            r0 = 3
            X.C32394EOv.A00(r1, r3, r5, r0)
            r2.schedule(r1)
        L6e:
            return
        L6f:
            java.lang.String r1 = "com.bloks.www.fxcal.link.async"
            goto L5f
        L72:
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            X.2tP r3 = X.C62862tP.A00(r1, r3, r6, r4, r2)
            goto L55
        L79:
            boolean r0 = r3 instanceof X.AbstractC59962oe
            if (r0 == 0) goto L8c
            android.util.SparseArray r1 = r5.A02
            r0 = 0
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.0ll r4 = r5.A07
            X.C14360o3.A0C(r3, r0)
            X.2oe r3 = (X.AbstractC59962oe) r3
            goto L4d
        L8c:
            android.app.Activity r1 = r5.A00
            boolean r0 = r1 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L6e
            X.0ll r4 = r5.A07
            X.AbstractC31171DnF.A1P(r1)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            android.util.SparseArray r0 = r5.A02
            X.2tP r3 = X.C62862tP.A01(r0, r1, r6, r4)
            goto L55
        La0:
            X.0ll r1 = r5.A07
            r0 = 0
            boolean r4 = X.FVN.A01(r1, r0)
            android.content.Context r3 = r5.A01
            if (r3 == 0) goto L35
            X.1Z0 r2 = X.AbstractC34209F7h.A00()
            android.view.Window r1 = r5.A03
            r0 = 1
            r2.A00(r3, r1, r0, r4)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLX.run():void");
    }
}
