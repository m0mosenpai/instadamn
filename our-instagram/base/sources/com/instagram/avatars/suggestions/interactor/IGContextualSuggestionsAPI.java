package com.instagram.avatars.suggestions.interactor;

import X.AbstractC40691uc;
import X.C40701ud;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class IGContextualSuggestionsAPI {
    public final long A00;
    public final UserSession A01;
    public final C40701ud A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.EnumC143276dS r19, X.EnumC143286dT r20, java.lang.Integer r21, java.lang.String r22, java.util.List r23, X.InterfaceC23621Ds r24, boolean r25, boolean r26) {
        /*
            r18 = this;
            r12 = 0
            r3 = 34
            r6 = r24
            boolean r0 = X.MAR.A03(r6, r3)
            r5 = r18
            if (r0 == 0) goto Ldb
            r4 = r6
            X.MAR r4 = (X.MAR) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ldb
            int r2 = r2 - r1
            r4.A00 = r2
        L1b:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L42
            if (r0 != r2) goto Le1
            X.AbstractC09560e7.A00(r1)
        L29:
            r3 = r1
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L39
            java.lang.Object r0 = X.AbstractC43593JPy.A0v(r3)
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L38:
            return r3
        L39:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L38
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L42:
            X.AbstractC09560e7.A00(r1)
            X.6oQ r1 = X.EnumC143276dS.A01
            com.instagram.common.session.UserSession r0 = r5.A01
            r13 = 0
            r6 = r19
            r8 = r20
            java.lang.String r6 = r1.A00(r6, r8, r0, r12)
            X.2JO r7 = new X.2JO
            r7.<init>()
            java.lang.String r0 = "intents"
            r1 = r23
            r7.A05(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "is_armadillo"
            r7.A08(r0, r1)
            java.lang.String r0 = "default_sticker_pack"
            r7.A09(r6, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r25)
            java.lang.String r0 = "only_hints"
            r7.A08(r0, r1)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "surface"
            r7.A09(r1, r0)
            java.lang.String r1 = X.AbstractC31180DnO.A0k(r21)
            java.lang.String r0 = "lexicon_version"
            r7.A09(r1, r0)
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r1 = X.AbstractC25225BEi.A0b()
            r8 = r22
            X.C14360o3.A0B(r8, r12)
            java.lang.String r0 = "avatar_config_hash"
            r6.A04(r0, r8)
            java.lang.String r0 = "query_params"
            r6.A00(r7, r0)
            X.1uJ r7 = X.AbstractC25225BEi.A0c()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r1.getParamsCopy()
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl> r11 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "IGContextualSuggestionsQuery"
            java.lang.String r16 = "xig_contextual_suggestions_data"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r26 == 0) goto Lce
            r0 = 0
            r6.setMaxToleratedCacheAgeMs(r0)
            r6.setEnsureCacheWrite(r2)
        Lc3:
            X.1ud r0 = r5.A02
            r4.A00 = r2
            java.lang.Object r1 = r0.A04(r6, r4)
            if (r1 != r3) goto L29
            return r3
        Lce:
            long r0 = r5.A00
            r6.setFreshCacheAgeMs(r0)
            X.1Dk r0 = r6.setMaxToleratedCacheAgeMs(r0)
            X.C14360o3.A0A(r0)
            goto Lc3
        Ldb:
            X.MAR r4 = X.MAR.A01(r5, r6, r3)
            goto L1b
        Le1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.interactor.IGContextualSuggestionsAPI.A00(X.6dS, X.6dT, java.lang.Integer, java.lang.String, java.util.List, X.1Ds, boolean, boolean):java.lang.Object");
    }

    public IGContextualSuggestionsAPI(UserSession userSession, long j) {
        this.A01 = userSession;
        this.A00 = j;
        this.A02 = AbstractC40691uc.A01(userSession);
    }
}
