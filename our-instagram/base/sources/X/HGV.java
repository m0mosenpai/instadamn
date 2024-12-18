package X;

import android.content.Context;

/* loaded from: classes7.dex */
public final class HGV extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C54809OKh A03;
    public final /* synthetic */ C145176gc A04;

    public HGV(Context context, AbstractC59962oe abstractC59962oe, C38321qM c38321qM, C54809OKh c54809OKh, C145176gc c145176gc) {
        this.A03 = c54809OKh;
        this.A02 = c38321qM;
        this.A04 = c145176gc;
        this.A01 = abstractC59962oe;
        this.A00 = context;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1961052799);
        C9GR.A0F(this.A00, "archive_story_failed", 2131953181);
        C0f9.A0A(362238802, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1272674204);
        this.A03.A00();
        C0f9.A0A(-1308602817, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-142493439);
        this.A03.A01();
        C0f9.A0A(566640971, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        if (r1 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r0 == false) goto L19;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = -2108429913(0xffffffff8253e9a7, float:-1.5568887E-37)
            int r3 = X.C0f9.A03(r0)
            r0 = -1715849338(0xffffffff99ba3786, float:-1.9254375E-23)
            int r4 = X.C0f9.A03(r0)
            X.1qM r13 = r14.A02
            X.3YU r2 = X.C3YU.A04
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            X.1rF r1 = r13.A0C
            java.lang.String r0 = r2.A00
            r1.EhC(r0)
            X.6gc r11 = r14.A04
            com.instagram.common.session.UserSession r1 = r11.A09
            java.lang.String r0 = "userSession"
            if (r1 == 0) goto L3f
            r13.AEH(r1)
            X.53a r5 = r11.A18
            r6 = r5
            instagram.features.stories.fragment.ReelViewerFragment r6 = (instagram.features.stories.fragment.ReelViewerFragment) r6
            X.1w4 r12 = r6.A0a
            if (r12 == 0) goto L67
            X.2oe r2 = r14.A01
            android.content.Context r10 = r14.A00
            com.instagram.common.session.UserSession r1 = r11.A09
            if (r1 == 0) goto L3f
            X.3G2 r0 = r11.A0G
            if (r0 != 0) goto L6b
            java.lang.String r0 = "reelViewerSource"
        L3f:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L47:
            r8 = 47
            X.MEB r7 = new X.MEB
            r7.<init>(r8, r9, r10, r11, r12, r13)
            boolean r1 = r5.Cgw()
            if (r1 == 0) goto L64
            android.view.View r6 = r2.mView
            if (r6 == 0) goto L62
            X.J5d r5 = new X.J5d
            r5.<init>(r13, r11, r0)
            r1 = 500(0x1f4, double:2.47E-321)
            r6.postDelayed(r5, r1)
        L62:
            if (r0 != 0) goto L67
        L64:
            r7.invoke()
        L67:
            r0 = -779728792(0xffffffffd1864868, float:-7.209255E10)
            goto L80
        L6b:
            boolean r1 = X.AbstractC84863qa.A0E(r1, r12, r0)
            boolean r0 = r6.A2R
            if (r0 == 0) goto L76
            r0 = 1
            if (r1 != 0) goto L77
        L76:
            r0 = 0
        L77:
            androidx.fragment.app.FragmentActivity r9 = r2.getActivity()
            if (r9 != 0) goto L47
            r0 = -1601715332(0xffffffffa087c37c, float:-2.299925E-19)
        L80:
            X.C0f9.A0A(r0, r4)
            r0 = 1744803020(0x67ff94cc, float:2.4138965E24)
            X.C0f9.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HGV.onSuccess(java.lang.Object):void");
    }
}
