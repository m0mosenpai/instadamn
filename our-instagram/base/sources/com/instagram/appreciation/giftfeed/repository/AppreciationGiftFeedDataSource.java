package com.instagram.appreciation.giftfeed.repository;

import X.C14360o3;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class AppreciationGiftFeedDataSource {
    public final UserSession A00;

    public AppreciationGiftFeedDataSource(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.Long r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, X.InterfaceC23621Ds r15) {
        /*
            r10 = this;
            r4 = 0
            boolean r0 = X.MAR.A03(r15, r4)
            if (r0 == 0) goto La5
            r3 = r15
            X.MAR r3 = (X.MAR) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r1 = r3.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r3.A00
            r6 = 1
            if (r0 == 0) goto L43
            if (r0 != r6) goto Lb0
            X.AbstractC09560e7.A00(r1)
        L23:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L31
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lab
            X.8jk r1 = X.AbstractC43594JPz.A0m(r1)
        L31:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L3a
            X.3NX r1 = X.AbstractC31181DnP.A0D(r1)
        L39:
            return r1
        L3a:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L39
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L43:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r1 = r10.A00
            java.lang.String r8 = X.AbstractC31180DnO.A0k(r11)
            r0 = 30
            java.lang.Integer r9 = X.AbstractC43592JPx.A0r(r0)
            r2 = 3
            X.AbstractC167007dF.A1G(r12, r2, r13)
            X.1Ms r7 = X.AbstractC31177DnL.A0M(r1)
            r7.A03()
            java.lang.String r0 = "api/v1/creators/content_appreciation/async_get_paginated_gift_feed_transactions/"
            r7.A0B(r0)
            java.lang.Class<X.UyR> r1 = X.C67792UyR.class
            java.lang.Class<X.Vwj> r0 = X.C69858Vwj.class
            r7.A0R(r1, r0)
            java.lang.String r0 = "media_id"
            r7.A9s(r0, r12)
            java.lang.String r0 = X.AbstractC50529MSi.A01()
            r7.A9s(r0, r13)
            if (r8 == 0) goto L7c
            java.lang.String r0 = "filter_gift_id"
            r7.A9s(r0, r8)
        L7c:
            if (r14 == 0) goto L83
            java.lang.String r0 = "after_cursor"
            r7.A9s(r0, r14)
        L83:
            int r1 = r9.intValue()
            r0 = 494(0x1ee, float:6.92E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r7.A0D(r0, r1)
            X.1ON r1 = r7.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ContentAppreciationPaginatedGiftFeedTransactionsResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ContentAppreciationPaginatedGiftFeedTransactionsResponse>>"
            X.C14360o3.A0C(r1, r0)
            r3.A00 = r6
            r0 = 1237485493(0x49c287b5, float:1593590.6)
            java.lang.Object r1 = r1.A02(r3, r0, r2, r4)
            if (r1 != r5) goto L23
            return r5
        La5:
            X.MAR r3 = X.MAR.A01(r10, r15, r4)
            goto L15
        Lab:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb0:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource.A00(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.Long r11, java.lang.String r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r10 = this;
            r4 = 49
            boolean r0 = X.MAQ.A02(r14, r4)
            if (r0 == 0) goto L9c
            r3 = r14
            X.MAQ r3 = (X.MAQ) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r1 = r3.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r3.A00
            r6 = 1
            if (r0 == 0) goto L44
            if (r0 != r6) goto Laa
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L32
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto La5
            X.8jk r1 = X.AbstractC43594JPz.A0m(r1)
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
            com.instagram.common.session.UserSession r1 = r10.A00
            java.lang.String r8 = X.AbstractC31180DnO.A0k(r11)
            r0 = 30
            java.lang.Integer r9 = X.AbstractC43592JPx.A0r(r0)
            r4 = 3
            X.AbstractC167007dF.A1F(r12, r4, r13)
            X.1Ms r7 = X.AbstractC31177DnL.A0M(r1)
            r7.A03()
            java.lang.String r0 = "api/v1/creators/content_appreciation/async_get_gift_feed/"
            r7.A0B(r0)
            java.lang.Class<X.UyX> r1 = X.C67798UyX.class
            java.lang.Class<X.Vwi> r0 = X.C69857Vwi.class
            r2 = 0
            r7.A0R(r1, r0)
            java.lang.String r0 = "media_id"
            r7.A9s(r0, r12)
            java.lang.String r0 = X.AbstractC50529MSi.A01()
            r7.A9s(r0, r13)
            if (r8 == 0) goto L7e
            java.lang.String r0 = "filter_gift_id"
            r7.A9s(r0, r8)
        L7e:
            int r1 = r9.intValue()
            java.lang.String r0 = "initial_page_size"
            r7.A0D(r0, r1)
            X.1ON r1 = r7.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ContentAppreciationGiftFeedResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ContentAppreciationGiftFeedResponse>>"
            X.C14360o3.A0C(r1, r0)
            r3.A00 = r6
            r0 = 1237485493(0x49c287b5, float:1593590.6)
            java.lang.Object r1 = r1.A02(r3, r0, r4, r2)
            if (r1 != r5) goto L24
            return r5
        L9c:
            r0 = 42
            X.MAQ r3 = new X.MAQ
            r3.<init>(r10, r14, r4, r0)
            goto L16
        La5:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Laa:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource.A01(java.lang.Long, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }
}
