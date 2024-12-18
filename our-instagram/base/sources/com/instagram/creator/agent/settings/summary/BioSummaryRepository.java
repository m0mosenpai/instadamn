package com.instagram.creator.agent.settings.summary;

import X.AbstractC167017dG;
import X.AbstractC40691uc;
import X.C14360o3;
import X.C40701ud;
import X.C4A7;
import X.C4A8;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BioSummaryRepository extends C4A7 {
    public String A00;
    public final UserSession A01;
    public final C40701ud A02;
    public final String A03;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            r18 = this;
            r3 = r19
            r6 = 15
            r7 = r20
            boolean r0 = X.MAF.A01(r7, r6)
            r4 = r18
            if (r0 == 0) goto Lb9
            r2 = r7
            X.MAF r2 = (X.MAF) r2
            int r5 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto Lb9
            int r5 = r5 - r1
            r2.A00 = r5
        L1c:
            java.lang.Object r5 = r2.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r12 = 1
            if (r0 == 0) goto L75
            if (r0 != r12) goto Lc5
            java.lang.Object r3 = r2.A01
            X.AbstractC09560e7.A00(r5)
        L2c:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 == 0) goto L38
            r0 = 0
        L33:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L38:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto Lc0
            X.2JS r4 = X.AbstractC25232BEp.A18(r5)
            if (r4 == 0) goto L6e
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl$XigUpdateBioCreatorAgentPersona> r2 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl.XigUpdateBioCreatorAgentPersona.class
            X.4OF r0 = X.C2JS.Companion
            r1 = -1931866927(0xffffffff8cda0cd1, float:-3.3595932E-31)
            r0 = 1107(0x453, float:1.551E-42)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            X.2JS r4 = r4.A03(r2, r0, r1)
            if (r4 == 0) goto L6e
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl$XigUpdateBioCreatorAgentPersona$CreatorAgentPersona> r2 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl.XigUpdateBioCreatorAgentPersona.CreatorAgentPersona.class
            r1 = 260253895(0xf8328c7, float:1.2933304E-29)
            r0 = 749(0x2ed, float:1.05E-42)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            X.2JS r1 = r4.A03(r2, r0, r1)
            if (r1 == 0) goto L6e
            java.lang.String r0 = "bio"
            java.lang.String r0 = r1.getOptionalStringField(r12, r0)
            if (r0 != 0) goto L70
        L6e:
            java.lang.String r0 = ""
        L70:
            boolean r0 = r0.equals(r3)
            goto L33
        L75:
            X.AbstractC09560e7.A00(r5)
            X.0Jx r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r13 = 0
            java.lang.String r0 = "bio"
            X.0CA r7 = X.AbstractC25227BEk.A0T(r5, r3, r0)
            java.lang.String r5 = r4.A00
            java.lang.String r0 = "creator_agent_persona_id"
            X.C0CA.A00(r7, r5, r0)
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "data"
            X.1uJ r7 = X.AbstractC25233BEq.A0H(r7, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl> r11 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "IGCreatorAISummaryViewMutation"
            r14 = 64
            java.lang.String r16 = "xig_update_bio_creator_agent_persona"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ud r0 = r4.A02
            java.lang.Object r5 = X.AbstractC25235BEs.A0m(r6, r0, r3, r2)
            if (r5 != r1) goto L2c
            return r1
        Lb9:
            X.MAF r2 = new X.MAF
            r2.<init>(r4, r7, r6)
            goto L1c
        Lc0:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.summary.BioSummaryRepository.A00(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r20) {
        /*
            r19 = this;
            r5 = 14
            r6 = r20
            boolean r0 = X.MAF.A01(r6, r5)
            r4 = r19
            if (r0 == 0) goto L76
            r3 = r6
            X.MAF r3 = (X.MAF) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r6 = r3.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 != r2) goto Ld8
            java.lang.Object r5 = r3.A01
            com.instagram.creator.agent.settings.summary.BioSummaryRepository r5 = (com.instagram.creator.agent.settings.summary.BioSummaryRepository) r5
            X.AbstractC09560e7.A00(r6)
        L2c:
            X.3NY r6 = (X.C3NY) r6
            boolean r0 = r6 instanceof X.C194848jk
            if (r0 == 0) goto L7c
            java.lang.String r0 = "network failure"
            X.8jk r1 = new X.8jk
            r1.<init>(r0)
        L39:
            return r1
        L3a:
            X.AbstractC09560e7.A00(r6)
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            java.lang.String r5 = r4.A03
            r13 = 0
            java.lang.String r0 = "igid"
            r7.A04(r0, r5)
            X.1uJ r8 = X.AbstractC25225BEi.A0c()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl> r12 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl.class
            java.util.ArrayList r18 = X.AbstractC166987dD.A1E()
            java.lang.String r9 = "IGCreatorAISummaryQuery"
            r14 = 0
            java.lang.String r17 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1ud r0 = r4.A02
            java.lang.Object r6 = X.AbstractC25235BEs.A0m(r7, r0, r4, r3)
            if (r6 == r1) goto L39
            r5 = r4
            goto L2c
        L76:
            X.MAF r3 = new X.MAF
            r3.<init>(r4, r6, r5)
            goto L1a
        L7c:
            boolean r0 = r6 instanceof X.C3NX
            if (r0 == 0) goto Ld3
            X.2JS r4 = X.AbstractC25232BEp.A18(r6)
            if (r4 == 0) goto Lcc
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl$FetchIGUser> r3 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl.FetchIGUser.class
            X.4OF r0 = X.C2JS.Companion
            r1 = 254180558(0xf267cce, float:8.2084684E-30)
            java.lang.String r0 = "fetch__IGUser(igid:$igid)"
            X.2JS r4 = r4.A03(r3, r0, r1)
            if (r4 == 0) goto Lcc
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl$FetchIGUser$CreatorAi> r3 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl.FetchIGUser.CreatorAi.class
            r1 = 1928901240(0x72f8b278, float:9.851909E30)
            java.lang.String r0 = "creator_ai"
            X.2JS r4 = r4.A03(r3, r0, r1)
            if (r4 == 0) goto Lcc
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl$FetchIGUser$CreatorAi$Ai> r3 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl.FetchIGUser.CreatorAi.Ai.class
            r1 = 1573602634(0x5dcb454a, float:1.8308993E18)
            java.lang.String r0 = "ai"
            X.2JS r4 = r4.A03(r3, r0, r1)
            if (r4 == 0) goto Lcc
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl$FetchIGUser$CreatorAi$Ai$Persona> r3 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl.FetchIGUser.CreatorAi.Ai.Persona.class
            r1 = -1584022921(0xffffffffa195ba77, float:-1.014599E-18)
            java.lang.String r0 = "persona"
            X.2JS r1 = r4.A03(r3, r0, r1)
            if (r1 == 0) goto Lcc
            java.lang.String r0 = "strong_id__"
            java.lang.String r0 = r1.A07(r0)
            r5.A00 = r0
            java.lang.String r0 = "bio"
            java.lang.String r0 = r1.getOptionalStringField(r2, r0)
            if (r0 != 0) goto Lce
        Lcc:
            java.lang.String r0 = ""
        Lce:
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
            return r1
        Ld3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.summary.BioSummaryRepository.A01(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r20) {
        /*
            r19 = this;
            r3 = 27
            r6 = r20
            boolean r0 = X.C29630D3l.A03(r6, r3)
            r5 = r19
            if (r0 == 0) goto Lb7
            r4 = r6
            X.D3l r4 = (X.C29630D3l) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb7
            int r2 = r2 - r1
            r4.A00 = r2
        L1a:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L7a
            if (r0 != r2) goto Lc2
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C194848jk
            r3 = 0
            if (r0 != 0) goto L79
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto Lbd
            X.2JS r5 = X.AbstractC25232BEp.A18(r1)
            if (r5 == 0) goto L79
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl$FetchIGUser> r4 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl.FetchIGUser.class
            X.4OF r0 = X.C2JS.Companion
            r1 = 383887332(0x16e1a7e4, float:3.6456664E-25)
            java.lang.String r0 = "fetch__IGUser(igid:$igid)"
            X.2JS r5 = r5.A03(r4, r0, r1)
            if (r5 == 0) goto L79
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl$FetchIGUser$CreatorAi> r4 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl.FetchIGUser.CreatorAi.class
            r1 = -10673103(0xffffffffff5d2431, float:-2.939473E38)
            java.lang.String r0 = "creator_ai"
            X.2JS r5 = r5.getOptionalTreeField(r2, r0, r4, r1)
            if (r5 == 0) goto L79
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl$FetchIGUser$CreatorAi$Ai> r4 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl.FetchIGUser.CreatorAi.Ai.class
            r1 = 938486414(0x37f02a8e, float:2.8630046E-5)
            java.lang.String r0 = "ai"
            X.2JS r5 = r5.A03(r4, r0, r1)
            if (r5 == 0) goto L79
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl$FetchIGUser$CreatorAi$Ai$Persona> r4 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl.FetchIGUser.CreatorAi.Ai.Persona.class
            r1 = 1211462083(0x483571c3, float:185799.05)
            java.lang.String r0 = "persona"
            X.2JS r1 = r5.A03(r4, r0, r1)
            if (r1 == 0) goto L79
            r0 = 940(0x3ac, float:1.317E-42)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            java.lang.String r3 = r1.getOptionalStringField(r2, r0)
        L79:
            return r3
        L7a:
            X.AbstractC09560e7.A00(r1)
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            java.lang.String r1 = r5.A03
            r13 = 0
            java.lang.String r0 = "igid"
            r7.A04(r0, r1)
            X.1uJ r8 = X.AbstractC25225BEi.A0c()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl> r12 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl.class
            java.util.ArrayList r18 = X.AbstractC166987dD.A1E()
            java.lang.String r9 = "IGCreatorAISummaryViewRegenerateQuery"
            r14 = 0
            java.lang.String r17 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1ud r0 = r5.A02
            r4.A00 = r2
            java.lang.Object r1 = r0.A04(r7, r4)
            if (r1 != r3) goto L28
            return r3
        Lb7:
            X.D3l r4 = X.C29630D3l.A01(r5, r6, r3)
            goto L1a
        Lbd:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc2:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.summary.BioSummaryRepository.A02(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BioSummaryRepository(UserSession userSession, String str) {
        super("creator_ai_bio_repo", C4A8.A01(245403032, 3));
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        AbstractC167017dG.A1P(str, userSession);
        C14360o3.A0B(A01, 3);
        this.A03 = str;
        this.A01 = userSession;
        this.A02 = A01;
    }
}
