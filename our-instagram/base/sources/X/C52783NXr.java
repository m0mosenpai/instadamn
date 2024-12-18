package X;

import com.instagram.music.search.MusicOverlayResultsListController;

/* renamed from: X.NXr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52783NXr extends AnonymousClass772 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52783NXr(N5N n5n, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = n5n;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L2b;
                case 1: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r5.A01
            com.instagram.music.search.MusicOverlayResultsListController r1 = (com.instagram.music.search.MusicOverlayResultsListController) r1
            X.2oe r0 = r1.A09
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            com.instagram.common.session.UserSession r3 = r1.A0A
            X.2Fb r2 = X.C2Fb.A2a
            java.lang.String r1 = r1.A0J
            java.lang.String r0 = "https://www.facebook.com/help/instagram/402084904469945?ref=audio_browser"
            X.AbstractC41776Ies.A09(r4, r3, r2, r0, r1)
            return
        L1b:
            java.lang.Object r4 = r5.A01
            X.N5N r4 = (X.N5N) r4
            X.OGw r1 = r4.A01
            if (r1 == 0) goto L7d
            java.lang.Integer r0 = X.C05F.A0u
            r1.A00(r0)
            java.lang.String r3 = "https://help.instagram.com/192435014247952?ref=igapp"
            goto L3a
        L2b:
            java.lang.Object r4 = r5.A01
            X.N5N r4 = (X.N5N) r4
            X.OGw r1 = r4.A01
            if (r1 == 0) goto L7d
            java.lang.Integer r0 = X.C05F.A15
            r1.A00(r0)
            java.lang.String r3 = "https://i.instagram.com/legal/privacy/"
        L3a:
            X.0vv r2 = r4.getSession()
            boolean r0 = r2 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L56
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2Fb r0 = X.C2Fb.A0k
            X.SjR r1 = X.AbstractC25228BEl.A0y(r1, r2, r0, r3)
            java.lang.String r0 = "gdpr_consent_for_rageshake"
            r1.A0S = r0
            r1.A0A()
            return
        L56:
            android.net.Uri r2 = X.AbstractC08820cl.A03(r3)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            r0 = 4
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            android.content.Intent r2 = r1.addCategory(r0)
            X.C14360o3.A07(r2)
            X.0b3 r0 = X.C0b3.A00()
            X.0Qg r1 = r0.A04()
            android.content.Context r0 = r4.getContext()
            r1.A0G(r0, r2)
            return
        L7d:
            java.lang.String r0 = "bugReportLogger"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52783NXr.onClick(android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52783NXr(MusicOverlayResultsListController musicOverlayResultsListController, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = musicOverlayResultsListController;
    }
}
