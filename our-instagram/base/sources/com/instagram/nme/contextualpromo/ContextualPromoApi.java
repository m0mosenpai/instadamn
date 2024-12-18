package com.instagram.nme.contextualpromo;

import X.C14360o3;
import X.C40701ud;

/* loaded from: classes9.dex */
public final class ContextualPromoApi {
    public final int A00;
    public final C40701ud A01;

    public ContextualPromoApi(C40701ud c40701ud, int i) {
        C14360o3.A0B(c40701ud, 1);
        this.A01 = c40701ud;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r2.getCoercedBooleanField(0, "success") != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.EnumC53294NhW r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, X.InterfaceC23621Ds r24) {
        /*
            r19 = this;
            r5 = 10
            r6 = r24
            boolean r0 = X.PXA.A03(r6, r5)
            r4 = r19
            if (r0 == 0) goto Lbd
            r1 = r6
            X.PXA r1 = (X.PXA) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto Lbd
            int r3 = r3 - r2
            r1.A00 = r3
        L1a:
            java.lang.Object r3 = r1.A03
            X.1JX r0 = X.C1JX.A02
            int r2 = r1.A00
            r14 = 0
            r13 = 1
            if (r2 == 0) goto L61
            if (r2 != r13) goto Lc3
            X.AbstractC09560e7.A00(r3)
        L29:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L56
            X.2JS r4 = X.AbstractC25232BEp.A18(r3)
            if (r4 == 0) goto L5f
            java.lang.Class<X.QsW> r2 = X.C60010QsW.class
            r3 = 0
            java.lang.String r1 = "ig_nme_benefit_contextual_promo_interaction_log_mutation(input:$input)"
            r0 = -1667822682(0xffffffff9c970ba6, float:-9.995353E-22)
            X.2JS r2 = r4.getOptionalTreeField(r3, r1, r2, r0)
            if (r2 == 0) goto L5f
            java.lang.String r1 = "success"
            boolean r0 = r2.hasFieldValue(r1)
            if (r0 == 0) goto L5f
            boolean r0 = r2.getCoercedBooleanField(r3, r1)
            if (r0 == 0) goto L5f
        L51:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            return r0
        L56:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L5f
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L5f:
            r13 = 0
            goto L51
        L61:
            X.AbstractC09560e7.A00(r3)
            X.0Jx r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r3 = "event"
            r2 = r22
            X.0CA r8 = X.AbstractC25227BEk.A0T(r5, r2, r3)
            java.lang.String r5 = "promo_id"
            r3 = r21
            X.C0CA.A00(r8, r3, r5)
            java.lang.String r5 = "viewed_profile_id"
            r6 = r23
            X.C0CA.A00(r8, r6, r5)
            if (r20 == 0) goto Lbb
            java.lang.String r6 = r20.toString()
        L82:
            java.lang.String r5 = "entry_flow"
            X.C0CA.A00(r8, r6, r5)
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            java.lang.String r5 = "input"
            X.1uJ r8 = X.AbstractC25233BEq.A0H(r8, r7, r5)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.QsX> r12 = X.C60011QsX.class
            java.util.ArrayList r18 = X.AbstractC166987dD.A1E()
            java.lang.String r9 = "IGNMEBenefitContextualPromoInteractionLogMutation"
            r15 = 0
            java.lang.String r17 = "ig_nme_benefit_contextual_promo_interaction_log_mutation"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1ud r4 = r4.A01
            X.PXA.A01(r3, r2, r1, r13)
            java.lang.Object r3 = r4.A04(r7, r1)
            if (r3 != r0) goto L29
            return r0
        Lbb:
            r6 = r14
            goto L82
        Lbd:
            X.PXA r1 = X.PXA.A00(r4, r6, r5)
            goto L1a
        Lc3:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ContextualPromoApi.A00(X.NhW, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r21, java.lang.String r22, java.lang.String r23, X.InterfaceC23621Ds r24) {
        /*
            r20 = this;
            r2 = r21
            r6 = 15
            r7 = r24
            boolean r1 = X.C57145PWx.A02(r7, r6)
            r0 = r20
            if (r1 == 0) goto L9f
            r5 = r7
            X.PWx r5 = (X.C57145PWx) r5
            int r4 = r5.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r3
            if (r1 == 0) goto L9f
            int r4 = r4 - r3
            r5.A00 = r4
        L1c:
            java.lang.Object r7 = r5.A02
            X.1JX r1 = X.C1JX.A02
            int r6 = r5.A00
            r4 = 1
            java.lang.String r3 = "ContextualPromoApi"
            if (r6 == 0) goto L49
            if (r6 != r4) goto Lc0
            java.lang.Object r2 = r5.A01
            java.lang.String r2 = (java.lang.String) r2
            X.AbstractC09560e7.A00(r7)
        L30:
            X.3NY r7 = (X.C3NY) r7
            boolean r0 = r7 instanceof X.C3NX
            r1 = 0
            if (r0 == 0) goto La5
            X.2JS r3 = X.AbstractC25232BEp.A18(r7)
            if (r3 == 0) goto L48
            java.lang.Class<X.R1K> r2 = X.R1K.class
            java.lang.String r1 = "ig_nme_benefit_contextual_promo_ui_configs_query(input:$input)"
            r0 = 457405051(0x1b43727b, float:1.6167013E-22)
            com.google.common.collect.ImmutableList r1 = r3.A06(r2, r1, r0)
        L48:
            return r1
        L49:
            X.AbstractC09560e7.A00(r7)
            X.0Jx r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r15 = 0
            java.lang.String r6 = "surface"
            X.0CA r9 = X.AbstractC25227BEk.A0T(r7, r2, r6)
            java.lang.String r6 = "viewed_profile_id"
            r7 = r22
            X.C0CA.A00(r9, r7, r6)
            java.lang.String r6 = "entry_flow"
            r7 = r23
            X.C0CA.A00(r9, r7, r6)
            X.2JM r8 = X.AbstractC25225BEi.A0b()
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            java.lang.String r6 = "input"
            X.1uJ r9 = X.AbstractC25233BEq.A0H(r9, r8, r6)
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.QsV> r13 = X.C60009QsV.class
            java.util.ArrayList r19 = X.AbstractC166987dD.A1E()
            java.lang.String r10 = "IGNMEBenefitContextualPromoConfigsQuery"
            r14 = 0
            java.lang.String r18 = "ig_nme_benefit_contextual_promo_ui_configs_query"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r6 = r0.A00
            r8.setNetworkTimeoutSeconds(r6)
            X.1ud r0 = r0.A01
            r5.A01 = r2
            r5.A00 = r4
            java.lang.Object r7 = r0.A04(r8, r5)
            if (r7 != r1) goto L30
            return r1
        L9f:
            X.PWx r5 = X.C57145PWx.A00(r0, r7, r6)
            goto L1c
        La5:
            boolean r0 = r7 instanceof X.C194848jk
            if (r0 == 0) goto Lbb
            X.5If r0 = X.MSX.A0E(r7)
            java.lang.Throwable r4 = r0.A01()
            java.lang.String r0 = "Failed to fetch promo configs for "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r2)
            X.C0K8.A0I(r3, r0, r4)
            return r1
        Lbb:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc0:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ContextualPromoApi.A01(java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }
}
