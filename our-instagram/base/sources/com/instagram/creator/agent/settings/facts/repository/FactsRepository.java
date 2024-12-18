package com.instagram.creator.agent.settings.facts.repository;

import X.C14360o3;
import X.C19L;
import X.C40701ud;
import X.C4A7;
import X.EnumC27380C6j;

/* loaded from: classes5.dex */
public final class FactsRepository extends C4A7 {
    public final EnumC27380C6j A00;
    public final C40701ud A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FactsRepository(EnumC27380C6j enumC27380C6j, C40701ud c40701ud, String str, C19L c19l) {
        super("facts_repository", c19l);
        C14360o3.A0B(c40701ud, 2);
        this.A00 = enumC27380C6j;
        this.A01 = c40701ud;
        this.A02 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.repository.FactsRepository.A04(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        if (r0.length() != 0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C45116Jxl r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, X.InterfaceC23621Ds r26) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.repository.FactsRepository.A00(X.Jxl, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C25984BeY r20, X.InterfaceC23621Ds r21) {
        /*
            r19 = this;
            r3 = 22
            r5 = r21
            boolean r0 = X.C29630D3l.A03(r5, r3)
            r6 = r19
            if (r0 == 0) goto L96
            r4 = r5
            X.D3l r4 = (X.C29630D3l) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r4.A00 = r2
        L1a:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r13 = 1
            if (r0 == 0) goto L53
            if (r0 != r13) goto La9
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L9b
            X.2JS r4 = X.AbstractC25232BEp.A18(r1)
            if (r4 == 0) goto La4
            java.lang.Class<X.QcL> r3 = X.C59311QcL.class
            r2 = 0
            r0 = 1091(0x443, float:1.529E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 1369458680(0x51a047f8, float:8.6050275E10)
            X.2JS r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto La4
            java.lang.String r0 = "success"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
            if (r0 == 0) goto La4
            X.3NX r3 = X.AbstractC25227BEk.A0i()
            return r3
        L53:
            X.AbstractC09560e7.A00(r1)
            X.1ud r2 = r6.A01
            r14 = 0
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.0Jx r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r0 = r20
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "fact_id"
            X.0CA r1 = X.AbstractC25227BEk.A0T(r5, r1, r0)
            java.lang.String r0 = "request"
            X.1uJ r8 = X.AbstractC25233BEq.A0H(r1, r7, r0)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.QcM> r12 = X.C59312QcM.class
            java.util.ArrayList r18 = X.AbstractC166987dD.A1E()
            java.lang.String r9 = "IGCreatorAIDeleteFactMutation"
            r15 = 0
            java.lang.String r17 = "xig_creator_ai_free_form_fact_delete_mutation"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.A00 = r13
            java.lang.Object r1 = r2.A04(r7, r4)
            if (r1 != r3) goto L28
            return r3
        L96:
            X.D3l r4 = X.C29630D3l.A01(r6, r5, r3)
            goto L1a
        L9b:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto La4
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La4:
            X.8jk r3 = X.AbstractC25227BEk.A0h()
            return r3
        La9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.repository.FactsRepository.A01(X.BeY, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r21, java.lang.String r22, java.lang.String r23, X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.repository.FactsRepository.A02(java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r2.length() == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        if (r1.length() == 0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r19, java.lang.String r20, X.InterfaceC23621Ds r21) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.repository.FactsRepository.A03(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }
}
