package com.instagram.avatars.graphql;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class InstantAvatarsGraphQLRepository {
    public final UserSession A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r19) {
        /*
            r18 = this;
            r3 = 29
            r4 = r19
            boolean r0 = X.MAR.A03(r4, r3)
            r6 = r18
            if (r0 == 0) goto L95
            r5 = r4
            X.MAR r5 = (X.MAR) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r5.A00 = r2
        L1a:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L5c
            if (r0 != r3) goto L9a
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L53
            X.2JS r4 = X.AbstractC25232BEp.A18(r1)
            if (r4 == 0) goto L51
            java.lang.Class<X.Qml> r3 = X.C59771Qml.class
            r2 = 0
            java.lang.String r1 = "xfb_avatar_editor_instant_avatar_ondemand_eligibility(disable_exposure_logging:true)"
            r0 = -196949188(0xfffffffff442cb3c, float:-6.1732646E31)
            X.2JS r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L51
            r0 = 33
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.Boolean r0 = X.AbstractC31174DnI.A0o(r1, r0, r2)
        L4c:
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L50:
            return r1
        L51:
            r0 = 0
            goto L4c
        L53:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L50
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L5c:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1ud r2 = X.AbstractC40691uc.A01(r0)
            r13 = 0
            X.2JM r1 = X.AbstractC25225BEi.A0b()
            X.2JM r0 = X.AbstractC25225BEi.A0b()
            X.1uJ r7 = X.AbstractC25225BEi.A0c()
            java.util.Map r9 = r1.getParamsCopy()
            java.util.Map r10 = r0.getParamsCopy()
            java.lang.Class<X.Qmm> r11 = X.C59772Qmm.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "InstantAvatarsOnDemandEligibility"
            r12 = 0
            java.lang.String r16 = "xfb_avatar_editor_instant_avatar_ondemand_eligibility"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5.A00 = r3
            java.lang.Object r1 = r2.A04(r6, r5)
            if (r1 != r4) goto L28
            return r4
        L95:
            X.MAR r5 = X.MAR.A01(r6, r4, r3)
            goto L1a
        L9a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.InstantAvatarsGraphQLRepository.A00(X.1Ds):java.lang.Object");
    }

    public InstantAvatarsGraphQLRepository(UserSession userSession) {
        this.A00 = userSession;
    }
}
