package com.instagram.barcelonaig.getapp.api;

import X.AbstractC167017dG;
import X.AbstractC31172DnG;
import X.C14360o3;
import X.C1ON;
import X.C25621Ms;
import X.C32125E9y;
import X.FS6;
import X.MSV;
import com.instagram.api.schemas.TextPostAppBadgeStatus;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class GetAppApi {
    public static final GetAppApi A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r7, java.lang.String r8, java.lang.String r9, X.InterfaceC23621Ds r10, boolean r11) {
        /*
            r6 = this;
            r4 = 39
            boolean r0 = X.MAR.A03(r10, r4)
            if (r0 == 0) goto L96
            r2 = r10
            X.MAR r2 = (X.MAR) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L96
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r1 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto La1
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L32
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L9c
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L32:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L3b
            X.3NX r1 = X.AbstractC31181DnP.A0D(r1)
        L3a:
            return r1
        L3b:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L3a
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L44:
            X.AbstractC09560e7.A00(r1)
            X.1Ms r5 = X.AbstractC25228BEl.A0q(r7)
            if (r11 == 0) goto L63
            java.lang.String r1 = "text_feed/ig_bottom_sheet_info/"
            if (r9 != 0) goto L94
            java.lang.String r0 = ""
        L53:
            java.lang.String r0 = X.AnonymousClass001.A0g(r1, r8, r0)
            r5.A0A = r0
            java.lang.Integer r0 = X.C05F.A0N
            r5.A08(r0)
            r0 = 900000(0xdbba0, double:4.44659E-318)
            r5.A01 = r0
        L63:
            X.C14360o3.A0B(r8, r4)
            r5.A06()
            r5.A03()
            java.lang.String r0 = "api/v1/text_feed/ig_bottom_sheet_info/"
            r5.A0B(r0)
            java.lang.Class<X.H9X> r1 = X.H9X.class
            java.lang.Class<X.IPO> r0 = X.IPO.class
            r5.A0R(r1, r0)
            java.lang.String r0 = "entrypoint"
            r5.A9s(r0, r8)
            java.lang.String r0 = "injected_actor_ids"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r5, r0, r9)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.TextPostAppBottomSheetInfoResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.TextPostAppBottomSheetInfoResponse>>"
            X.C14360o3.A0C(r1, r0)
            r2.A00 = r4
            r0 = 2060189895(0x7acc00c7, float:5.2962216E35)
            java.lang.Object r1 = r1.A00(r0, r2)
            if (r1 != r3) goto L24
            return r3
        L94:
            r0 = r9
            goto L53
        L96:
            X.MAR r2 = X.MAR.A01(r6, r10, r4)
            goto L16
        L9c:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelonaig.getapp.api.GetAppApi.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    public static final C1ON A00(TextPostAppBadgeStatus textPostAppBadgeStatus, UserSession userSession) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A03();
        A0c.A0B("api/v1/text_feed/toggle_text_post_app_badge/");
        A0c.A0R(C32125E9y.class, FS6.class);
        C1ON A0T = AbstractC31172DnG.A0T(A0c, "text_post_app_badge_status", textPostAppBadgeStatus.A00);
        C14360o3.A0C(A0T, MSV.A00(5));
        return A0T;
    }
}
