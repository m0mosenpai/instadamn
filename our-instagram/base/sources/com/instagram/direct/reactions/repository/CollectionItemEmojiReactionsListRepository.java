package com.instagram.direct.reactions.repository;

import X.AbstractC167027dH;
import X.AbstractC48512Ld9;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class CollectionItemEmojiReactionsListRepository extends AbstractC48512Ld9 {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public CollectionItemEmojiReactionsListRepository(UserSession userSession, String str, String str2, String str3, String str4) {
        AbstractC167027dH.A0a(1, userSession, str, str2, str3);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository r9, X.InterfaceC23621Ds r10, int r11) {
        /*
            r4 = 31
            boolean r0 = X.MAT.A03(r10, r4)
            if (r0 == 0) goto L85
            r2 = r10
            X.MAT r2 = (X.MAT) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L85
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r0 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L8f
            X.AbstractC09560e7.A00(r0)
        L24:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L8a
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L31:
            return r3
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r9.A00
            java.lang.String r8 = r9.A02
            java.lang.String r7 = r9.A03
            X.0UO r0 = r9.A03
            java.lang.Object r6 = r0.getValue()
            java.lang.String r6 = (java.lang.String) r6
            X.1Ms r5 = X.AbstractC31177DnL.A0M(r1)
            r5.A03()
            java.lang.String r0 = "api/v1/direct_v2/collection_item/get_reaction_details/"
            r5.A0B(r0)
            java.lang.Class<X.K82> r1 = X.K82.class
            java.lang.Class<X.LAd> r0 = X.C47821LAd.class
            r5.A0R(r1, r0)
            r0 = 1974(0x7b6, float:2.766E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r5.A0D(r0, r11)
            java.lang.String r0 = "collection_item_id"
            r5.A9s(r0, r8)
            java.lang.String r0 = "collection_type"
            r5.A9s(r0, r7)
            if (r6 == 0) goto L70
            java.lang.String r0 = "cursor"
            r5.A9s(r0, r6)
        L70:
            X.1ON r1 = r5.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.CollectionItemReactionDetailsResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.CollectionItemReactionDetailsResponse>>"
            X.C14360o3.A0C(r1, r0)
            r2.A00 = r4
            r0 = 2008445766(0x77b67346, float:7.401063E33)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L24
            return r3
        L85:
            X.MAT r2 = X.MAT.A00(r9, r10, r4)
            goto L16
        L8a:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository.A00(com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository, X.1Ds, int):java.lang.Object");
    }
}
