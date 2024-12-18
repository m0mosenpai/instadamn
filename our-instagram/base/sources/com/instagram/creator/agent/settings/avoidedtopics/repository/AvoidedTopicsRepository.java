package com.instagram.creator.agent.settings.avoidedtopics.repository;

import X.C14360o3;
import X.C19L;
import X.C40701ud;
import X.C4A7;

/* loaded from: classes5.dex */
public final class AvoidedTopicsRepository extends C4A7 {
    public final C40701ud A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvoidedTopicsRepository(C40701ud c40701ud, String str, C19L c19l) {
        super("avoided_topics", c19l);
        C14360o3.A0B(c40701ud, 1);
        this.A00 = c40701ud;
        this.A01 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository.A02(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C45116Jxl r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, X.InterfaceC23621Ds r22) {
        /*
            r17 = this;
            r3 = 20
            r6 = r22
            boolean r0 = X.C29630D3l.A03(r6, r3)
            r5 = r17
            if (r0 == 0) goto La5
            r4 = r6
            X.D3l r4 = (X.C29630D3l) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r4.A00 = r2
        L1a:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r11 = 1
            if (r0 == 0) goto L31
            if (r0 != r11) goto Lb9
            X.AbstractC09560e7.A00(r1)
        L28:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto Lab
            X.3NX r3 = X.AbstractC25227BEk.A0i()
            return r3
        L31:
            X.AbstractC09560e7.A00(r1)
            X.0Jx r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "creator_id"
            X.0CA r6 = X.AbstractC25227BEk.A0T(r2, r1, r0)
            java.lang.String r0 = "topic_id"
            r1 = r21
            X.C0CA.A00(r6, r1, r0)
            java.lang.String r0 = "strategy"
            r1 = r19
            X.C0CA.A00(r6, r1, r0)
            java.lang.String r0 = "topic"
            r1 = r20
            X.C0CA.A00(r6, r1, r0)
            r7 = r18
            if (r18 == 0) goto L73
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "corrected_bot_message_igid"
            X.0CA r2 = X.AbstractC25227BEk.A0T(r2, r1, r0)
            java.lang.String r1 = r7.A01
            java.lang.String r0 = "otid"
            X.C0CA.A00(r2, r1, r0)
            java.lang.String r1 = r7.A02
            java.lang.String r0 = "thread_igid"
            X.C0CA.A00(r2, r1, r0)
            java.lang.String r0 = "thread_feedback_message_data"
            r6.A0E(r2, r0)
        L73:
            X.1ud r2 = r5.A00
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.2JM r1 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "request"
            X.1uJ r6 = X.AbstractC25233BEq.A0H(r6, r5, r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r1.getParamsCopy()
            java.lang.Class<X.Qc6> r10 = X.C59296Qc6.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "IGCreatorAITopicAvoidanceItemAddOrEditMutation"
            r13 = 0
            java.lang.String r15 = "xig_ig_creator_ai_topic_avoidance_item_add_or_edit_mutation"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A00 = r11
            java.lang.Object r1 = r2.A04(r5, r4)
            if (r1 != r3) goto L28
            return r3
        La5:
            X.D3l r4 = X.C29630D3l.A01(r5, r6, r3)
            goto L1a
        Lab:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lb4
            X.8jk r3 = X.AbstractC25227BEk.A0h()
            return r3
        Lb4:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository.A00(X.Jxl, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r19, java.lang.String r20, java.util.List r21, X.InterfaceC23621Ds r22) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository.A01(java.lang.String, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }
}
