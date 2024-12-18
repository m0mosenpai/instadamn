package com.instagram.creator.agent.suggestedreplies.settings.repository;

import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.AbstractC40691uc;
import X.AnonymousClass195;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C40701ud;
import X.C4A7;
import X.C4A8;
import X.InterfaceC13000lm;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class CreatorAgentSuggestedRepliesSettingsRepository extends C4A7 implements InterfaceC13000lm {
    public AnonymousClass195 A00;
    public final C0UO A01;
    public final C40701ud A02;
    public final C05A A03;

    public CreatorAgentSuggestedRepliesSettingsRepository(UserSession userSession) {
        super("AISuggestedReplies", C4A8.A00(1216442747));
        this.A02 = AbstractC40691uc.A01(userSession);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A03 = A1A;
        this.A01 = A1A;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository r15, X.InterfaceC23621Ds r16) {
        /*
            r1 = r15
            r5 = 17
            r6 = r16
            boolean r0 = X.MAF.A01(r6, r5)
            if (r0 == 0) goto Lac
            r4 = r6
            X.MAF r4 = (X.MAF) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto Lac
            int r3 = r3 - r2
            r4.A00 = r3
        L19:
            java.lang.Object r6 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L75
            if (r0 != r2) goto Lb8
            java.lang.Object r1 = r4.A01
            com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository r1 = (com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository) r1
            X.AbstractC09560e7.A00(r6)
        L2b:
            X.3NY r6 = (X.C3NY) r6
            boolean r0 = r6 instanceof X.C3NX
            if (r0 == 0) goto L60
            X.05A r7 = r1.A03
        L33:
            java.lang.Object r5 = r7.getValue()
            X.2JS r4 = X.AbstractC25232BEp.A18(r6)
            if (r4 == 0) goto L5e
            java.lang.Class<X.Qd8> r3 = X.Qd8.class
            r2 = 0
            java.lang.String r1 = "xig_ig_suggested_replies_enabled_query"
            r0 = 1213210711(0x48502057, float:213121.36)
            X.2JS r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L5e
            java.lang.String r0 = "enabled"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
        L51:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r7.AIi(r5, r0)
            if (r0 == 0) goto L33
        L5b:
            X.0eB r3 = X.C0eB.A00
            return r3
        L5e:
            r0 = 0
            goto L51
        L60:
            boolean r0 = r6 instanceof X.C194848jk
            if (r0 == 0) goto Lb3
            X.05A r2 = r1.A03
        L66:
            java.lang.Object r1 = r2.getValue()
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto L66
            goto L5b
        L75:
            X.AbstractC09560e7.A00(r6)
            r12 = 0
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.2JM r0 = X.AbstractC25225BEi.A0b()
            X.1uJ r6 = X.AbstractC25225BEi.A0c()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r0.getParamsCopy()
            java.lang.Class<X.Qd9> r10 = X.Qd9.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "GetIsCreatorAgentSuggestedRepliesEnabledQuery"
            r11 = 0
            java.lang.String r15 = "xig_ig_suggested_replies_enabled_query"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1ud r0 = r1.A02
            r4.A01 = r1
            r4.A00 = r2
            java.lang.Object r6 = r0.A04(r5, r4)
            if (r6 != r3) goto L2b
            return r3
        Lac:
            X.MAF r4 = new X.MAF
            r4.<init>(r15, r6, r5)
            goto L19
        Lb3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository.A00(com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository r15, X.InterfaceC23621Ds r16, boolean r17) {
        /*
            r4 = 18
            r5 = r16
            boolean r0 = X.MAF.A01(r5, r4)
            if (r0 == 0) goto Lc3
            r2 = r5
            X.MAF r2 = (X.MAF) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lc3
            int r3 = r3 - r1
            r2.A00 = r3
        L18:
            java.lang.Object r6 = r2.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L7f
            if (r0 != r9) goto Lcf
            java.lang.Object r15 = r2.A01
            com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository r15 = (com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository) r15
            X.AbstractC09560e7.A00(r6)
        L2a:
            X.3NY r6 = (X.C3NY) r6
            boolean r0 = r6 instanceof X.C3NX
            if (r0 == 0) goto L66
            X.05A r8 = r15.A03
        L32:
            java.lang.Object r7 = r8.getValue()
            boolean r5 = X.AbstractC166987dD.A1a(r7)
            X.2JS r4 = X.AbstractC25232BEp.A18(r6)
            if (r4 == 0) goto L61
            java.lang.Class<X.QdA> r3 = X.C59352QdA.class
            r2 = 0
            java.lang.String r1 = "xig_ig_suggested_replies_set_enabled_mutation(input:$input)"
            r0 = 565641481(0x21b70109, float:1.2400836E-18)
            X.2JS r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L61
            java.lang.String r0 = "enabled"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
        L54:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r8.AIi(r7, r0)
            if (r0 == 0) goto L32
        L5e:
            X.0eB r1 = X.C0eB.A00
            return r1
        L61:
            boolean r0 = X.AbstractC167007dF.A1N(r5)
            goto L54
        L66:
            boolean r0 = r6 instanceof X.C194848jk
            if (r0 == 0) goto Lca
            X.05A r2 = r15.A03
        L6c:
            java.lang.Object r1 = r2.getValue()
            boolean r0 = X.AbstractC166987dD.A1a(r1)
            java.lang.Boolean r0 = X.AbstractC31172DnG.A0s(r0)
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto L6c
            goto L5e
        L7f:
            X.AbstractC09560e7.A00(r6)
            r10 = 0
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.0Jx r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "enabled"
            X.0CA r3 = X.AbstractC25227BEk.A0T(r4, r3, r0)
            java.lang.String r0 = "input"
            X.1uJ r4 = X.AbstractC25233BEq.A0H(r3, r6, r0)
            java.util.Map r6 = r6.getParamsCopy()
            java.util.Map r7 = r5.getParamsCopy()
            java.lang.Class<X.QdB> r8 = X.C59353QdB.class
            java.util.ArrayList r14 = X.AbstractC166987dD.A1E()
            java.lang.String r5 = "ToggleCreatorAgentSuggestedReplies"
            r11 = 0
            java.lang.String r13 = "xig_ig_suggested_replies_set_enabled_mutation"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.1ud r0 = r15.A02
            r2.A01 = r15
            r2.A00 = r9
            java.lang.Object r6 = r0.A04(r3, r2)
            if (r6 != r1) goto L2a
            return r1
        Lc3:
            X.MAF r2 = new X.MAF
            r2.<init>(r15, r5, r4)
            goto L18
        Lca:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lcf:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository.A01(com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC25229BEm.A1R(this.A00);
    }
}
