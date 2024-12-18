package com.instagram.direct.reactions.repository;

import X.AbstractC167027dH;
import X.AbstractC48512Ld9;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class DirectEmojiReactionsListRepository extends AbstractC48512Ld9 {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 32
            boolean r0 = X.MAT.A03(r10, r3)
            if (r0 == 0) goto L82
            r4 = r10
            X.MAT r4 = (X.MAT) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A01
            X.1JX r5 = X.C1JX.A02
            int r1 = r4.A00
            r6 = 1
            if (r1 == 0) goto L32
            if (r1 != r6) goto L8c
            X.AbstractC09560e7.A00(r0)
        L24:
            r5 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L87
            X.8jk r5 = X.AbstractC25227BEk.A0h()
        L31:
            return r5
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r2 = r9.A00
            java.lang.String r8 = r9.A03
            java.lang.String r1 = r9.A02
            java.lang.String r7 = r9.A01
            X.0UO r0 = r9.A03
            java.lang.Object r3 = r0.getValue()
            java.lang.String r3 = (java.lang.String) r3
            X.1Ms r2 = X.AbstractC25228BEl.A0q(r2)
            r2.A06()
            r2.A03()
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r1}
            java.lang.String r0 = "api/v1/direct_v2/threads/%s/items/%s/batched_reactions_detail/"
            X.AbstractC31173DnH.A1Q(r2, r0, r1)
            java.lang.Class<X.K81> r1 = X.K81.class
            java.lang.Class<X.LAc> r0 = X.C47820LAc.class
            r2.A0R(r1, r0)
            if (r7 == 0) goto L66
            java.lang.String r0 = "client_context"
            r2.A9s(r0, r7)
        L66:
            if (r3 == 0) goto L6d
            java.lang.String r0 = "cursor"
            r2.A9s(r0, r3)
        L6d:
            X.1ON r1 = r2.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BatchedReactionsDetailResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BatchedReactionsDetailResponse>>"
            X.C14360o3.A0C(r1, r0)
            r4.A00 = r6
            r0 = 1515227636(0x5a5089f4, float:1.4674619E16)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r5) goto L24
            return r5
        L82:
            X.MAT r4 = X.MAT.A00(r9, r10, r3)
            goto L16
        L87:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository.A00(com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository, X.1Ds):java.lang.Object");
    }

    public DirectEmojiReactionsListRepository(UserSession userSession, String str, String str2, String str3) {
        AbstractC167027dH.A13(userSession, str, str2);
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
