package com.instagram.creator.agent.settings.repository;

import X.AbstractC167017dG;
import X.C40701ud;
import X.C4A7;
import X.C4A8;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class CreatorAiSettingsRepository extends C4A7 {
    public final UserSession A00;
    public final C40701ud A01;

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b2, code lost:
    
        if (r21 != null) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r32, X.InterfaceC23621Ds r33, int r34) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository.A00(java.lang.String, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r1.getCoercedBooleanField(0, "is_auto_reply_enabled") == r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r19, X.InterfaceC23621Ds r20, boolean r21) {
        /*
            r18 = this;
            r3 = r21
            r6 = r20
            boolean r0 = r6 instanceof X.PWL
            r4 = r18
            if (r0 == 0) goto Lb2
            r2 = r6
            X.PWL r2 = (X.PWL) r2
            int r5 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto Lb2
            int r5 = r5 - r1
            r2.A00 = r5
        L18:
            java.lang.Object r5 = r2.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r12 = 1
            if (r0 == 0) goto L66
            if (r0 != r12) goto Lbe
            boolean r3 = r2.A01
            X.AbstractC09560e7.A00(r5)
        L28:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto L64
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto Lb9
            X.2JS r4 = X.AbstractC25232BEp.A18(r5)
            if (r4 == 0) goto L64
            java.lang.Class<X.Qd6> r2 = X.Qd6.class
            r5 = 0
            java.lang.String r1 = "xig_set_is_auto_reply_enabled_creator_ai_audience_control(data:$data)"
            r0 = 2069742900(0x7b5dc534, float:1.15149736E36)
            X.2JS r4 = r4.getOptionalTreeField(r5, r1, r2, r0)
            if (r4 == 0) goto L64
            java.lang.Class<X.Qd5> r2 = X.Qd5.class
            r0 = 750(0x2ee, float:1.051E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 1162206276(0x4545dc44, float:3165.7666)
            X.2JS r1 = r4.getOptionalTreeField(r5, r1, r2, r0)
            if (r1 == 0) goto L64
            java.lang.String r0 = "is_auto_reply_enabled"
            boolean r0 = r1.getCoercedBooleanField(r5, r0)
            if (r0 != r3) goto L64
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            return r0
        L64:
            r12 = 0
            goto L5f
        L66:
            X.AbstractC09560e7.A00(r5)
            X.0Jx r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r13 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "is_enabled"
            X.0CA r7 = X.AbstractC25227BEk.A0T(r6, r5, r0)
            java.lang.String r0 = "creator_ai_audience_control_id"
            r5 = r19
            X.C0CA.A00(r7, r5, r0)
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "data"
            X.1uJ r7 = X.AbstractC25233BEq.A0H(r7, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Qd7> r11 = X.Qd7.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "IGCreatorAISetAutoReplyEnabledMutation"
            r14 = 64
            java.lang.String r16 = "xig_set_is_auto_reply_enabled_creator_ai_audience_control"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ud r0 = r4.A01
            r2.A01 = r3
            r2.A00 = r12
            java.lang.Object r5 = r0.A04(r6, r2)
            if (r5 != r1) goto L28
            return r1
        Lb2:
            X.PWL r2 = new X.PWL
            r2.<init>(r4, r6)
            goto L18
        Lb9:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lbe:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository.A01(java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r3.getCoercedBooleanField(0, "xig_creator_ai_agent_delete") == true) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r16) {
        /*
            r15 = this;
            r4 = 13
            r5 = r16
            boolean r0 = X.MAF.A01(r5, r4)
            if (r0 == 0) goto L8c
            r2 = r5
            X.MAF r2 = (X.MAF) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L8c
            int r3 = r3 - r1
            r2.A00 = r3
        L18:
            java.lang.Object r3 = r2.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L55
            if (r0 != r9) goto L97
            java.lang.Object r4 = r2.A01
            com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository r4 = (com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository) r4
            X.AbstractC09560e7.A00(r3)
        L2a:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L53
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L92
            X.2JS r3 = X.AbstractC25232BEp.A18(r3)
            if (r3 == 0) goto L53
            r2 = 0
            java.lang.String r1 = "xig_creator_ai_agent_delete"
            boolean r0 = r3.getCoercedBooleanField(r2, r1)
            if (r0 != r9) goto L48
            com.instagram.common.session.UserSession r0 = r4.A00
            X.AbstractC35051FcO.A00(r0, r2)
        L48:
            boolean r0 = r3.getCoercedBooleanField(r2, r1)
            if (r0 != r9) goto L53
        L4e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
        L52:
            return r1
        L53:
            r9 = 0
            goto L4e
        L55:
            X.AbstractC09560e7.A00(r3)
            r10 = 0
            X.2JM r3 = X.AbstractC25225BEi.A0b()
            X.2JM r0 = X.AbstractC25225BEi.A0b()
            X.1uJ r4 = X.AbstractC25225BEi.A0c()
            java.util.Map r6 = r3.getParamsCopy()
            java.util.Map r7 = r0.getParamsCopy()
            java.lang.Class<X.Qcv> r8 = X.C59347Qcv.class
            java.util.ArrayList r14 = X.AbstractC166987dD.A1E()
            java.lang.String r5 = "IGCreatorAIAgentDeleteMutation"
            r11 = 0
            java.lang.String r13 = "xig_creator_ai_agent_delete"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.1ud r0 = r15.A01
            r2.A01 = r15
            r2.A00 = r9
            java.lang.Object r3 = r0.A04(r3, r2)
            if (r3 == r1) goto L52
            r4 = r15
            goto L2a
        L8c:
            X.MAF r2 = new X.MAF
            r2.<init>(r15, r5, r4)
            goto L18
        L92:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L97:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository.A02(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorAiSettingsRepository(UserSession userSession, C40701ud c40701ud) {
        super("settings_repository", C4A8.A00(245403032));
        AbstractC167017dG.A1P(userSession, c40701ud);
        this.A00 = userSession;
        this.A01 = c40701ud;
    }
}
