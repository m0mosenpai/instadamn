package X;

/* loaded from: classes9.dex */
public final class P68 implements InterfaceC58056Poh {
    public final /* synthetic */ NQJ A00;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    @Override // X.InterfaceC58056Poh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DVe(X.OKv r13) {
        /*
            r12 = this;
            r6 = 0
            X.NQJ r4 = r12.A00
            X.0do r0 = r4.A0F
            X.24U r0 = X.MSZ.A0V(r0)
            java.lang.String r9 = r13.A01
            r0.A0C(r9)
            X.P64 r0 = r4.A02
            java.lang.String r3 = "musicSearchResultsView"
            r2 = 0
            if (r0 == 0) goto L37
            com.instagram.music.search.MusicOverlayResultsListController r0 = r0.A02
            X.Mfm r1 = r0.A0F
            java.lang.String r0 = r1.A03
            boolean r0 = X.C14360o3.A0K(r0, r9)
            if (r0 != 0) goto L26
            r1.A03 = r9
            r1.A00()
        L26:
            boolean r0 = r13.A03
            if (r0 == 0) goto L3f
            X.P64 r0 = r4.A02
            if (r0 == 0) goto L37
            r0.A00()
        L31:
            X.MYm r1 = r4.A04
            if (r1 != 0) goto L6d
            java.lang.String r3 = "entityFeedResultsLoader"
        L37:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3f:
            int r0 = r13.A00
            if (r0 <= 0) goto L31
            X.OEW r5 = r4.A01
            if (r5 != 0) goto L4a
            java.lang.String r3 = "keywordSearchResultsLoader"
            goto L37
        L4a:
            X.C14360o3.A0B(r9, r6)
            com.instagram.common.session.UserSession r7 = r5.A03
            int r11 = r5.A00
            com.instagram.api.schemas.MusicProduct r6 = r5.A01
            java.lang.String r10 = r5.A05
            java.lang.Integer r8 = X.C05F.A0Y
            X.1ON r3 = X.C50675MYt.A01(r6, r7, r8, r9, r10, r11)
            X.NQJ r0 = r5.A04
            X.OKv r0 = X.NQJ.A00(r0)
            java.lang.String r1 = r0.A01
            r0 = 7
            X.MWM.A00(r3, r1, r5, r0)
            X.2oe r0 = r5.A02
            r0.schedule(r3)
            goto L31
        L6d:
            r0 = 1
            r1.A00(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P68.DVe(X.OKv):void");
    }

    public P68(NQJ nqj) {
        this.A00 = nqj;
    }

    @Override // X.InterfaceC58056Poh
    public final void DDP() {
        P64 p64 = this.A00.A02;
        if (p64 == null) {
            C14360o3.A0F("musicSearchResultsView");
            throw C00O.createAndThrow();
        }
        C50979Mfm c50979Mfm = p64.A02.A0F;
        c50979Mfm.A00 = null;
        c50979Mfm.A09.clear();
        c50979Mfm.A00();
    }
}
