package com.instagram.creator.agent.settings.content.sources.fetch;

import X.C14360o3;
import X.C40701ud;
import X.C4A7;
import X.C4A8;

/* loaded from: classes5.dex */
public final class IGCreatorAIContentCategoriesRepository extends C4A7 {
    public final C40701ud A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGCreatorAIContentCategoriesRepository(C40701ud c40701ud, String str) {
        super("content_categories", C4A8.A00(245403032));
        C14360o3.A0B(c40701ud, 1);
        this.A00 = c40701ud;
        this.A01 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository.A01(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.EnumC27417C7u r18, X.InterfaceC23621Ds r19, boolean r20) {
        /*
            r17 = this;
            r3 = 21
            r5 = r19
            boolean r0 = X.C29630D3l.A03(r5, r3)
            r9 = r17
            if (r0 == 0) goto Lb5
            r4 = r5
            X.D3l r4 = (X.C29630D3l) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb5
            int r2 = r2 - r1
            r4.A00 = r2
        L1a:
            java.lang.Object r2 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r11 = 1
            if (r0 == 0) goto L5a
            if (r0 != r11) goto Lbb
            X.AbstractC09560e7.A00(r2)
        L28:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            r1 = 0
            if (r0 == 0) goto L51
            X.2JS r4 = X.AbstractC25232BEp.A18(r2)
            if (r4 == 0) goto L4c
            java.lang.Class<X.QcG> r3 = X.C59306QcG.class
            r0 = 1101(0x44d, float:1.543E-42)
            java.lang.String r2 = X.AbstractC58317Pt9.A00(r0)
            r0 = 756614164(0x2d190414, float:8.697949E-12)
            X.2JS r2 = r4.getOptionalTreeField(r1, r2, r3, r0)
            if (r2 == 0) goto L4c
            java.lang.String r0 = "success"
            boolean r1 = r2.getCoercedBooleanField(r1, r0)
        L4c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L51:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L4c
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L5a:
            X.AbstractC09560e7.A00(r2)
            X.1ud r2 = r9.A00
            r12 = 0
            X.2JM r8 = X.AbstractC25225BEi.A0b()
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            java.lang.String r1 = r18.toString()
            java.lang.String r0 = "key"
            r8.A04(r0, r1)
            boolean r6 = X.AbstractC167007dF.A1W(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r20)
            java.lang.String r0 = "value"
            r8.A02(r0, r1)
            boolean r5 = X.AbstractC167007dF.A1W(r1)
            java.lang.String r1 = r9.A01
            java.lang.String r0 = "creator_fbid"
            r8.A04(r0, r1)
            X.C18C.A0E(r6)
            X.C18C.A0E(r5)
            X.1uJ r6 = X.AbstractC25227BEk.A0U(r11)
            java.util.Map r8 = r8.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.QcH> r10 = X.C59307QcH.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "IGCreatorAISetContentCategoryValueMutation"
            r13 = 0
            java.lang.String r15 = "xig_ig_creator_ai_set_content_category_value_mutation"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A00 = r11
            java.lang.Object r2 = r2.A04(r5, r4)
            if (r2 != r3) goto L28
            return r3
        Lb5:
            X.D3l r4 = X.C29630D3l.A01(r9, r5, r3)
            goto L1a
        Lbb:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository.A00(X.C7u, X.1Ds, boolean):java.lang.Object");
    }
}
