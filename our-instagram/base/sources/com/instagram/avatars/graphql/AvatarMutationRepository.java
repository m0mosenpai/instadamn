package com.instagram.avatars.graphql;

import X.AbstractC167017dG;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class AvatarMutationRepository {
    public final AvatarStore A00;
    public final UserSession A01;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r16) {
        /*
            r15 = this;
            r4 = 5
            r5 = r16
            boolean r0 = X.MAG.A01(r5, r4)
            if (r0 == 0) goto La2
            r2 = r5
            X.MAG r2 = (X.MAG) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto La2
            int r3 = r3 - r1
            r2.A00 = r3
        L17:
            java.lang.Object r3 = r2.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L3c
            if (r0 != r9) goto La9
            java.lang.Object r1 = r2.A01
            com.instagram.avatars.graphql.AvatarMutationRepository r1 = (com.instagram.avatars.graphql.AvatarMutationRepository) r1
            X.AbstractC09560e7.A00(r3)
        L29:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L33
            com.instagram.avatars.store.AvatarStore r0 = r1.A00
            r0.A03()
        L32:
            return r3
        L33:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L32
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L3c:
            X.AbstractC09560e7.A00(r3)
            r10 = 0
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            X.0Jx r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r3 = "IG_EDIT_PROFILE"
            java.lang.String r0 = "referrer_surface"
            X.0CA r5 = X.AbstractC25227BEk.A0T(r4, r3, r0)
            r0 = 728(0x2d8, float:1.02E-42)
            java.lang.String r3 = X.MSV.A00(r0)
            java.lang.String r0 = "referrer_mechanism"
            X.C0CA.A00(r5, r3, r0)
            java.lang.String r0 = "logging_data"
            X.0CA r4 = r4.A02()
            r4.A0E(r5, r0)
            java.lang.String r3 = X.AbstractC166997dE.A0n()
            java.lang.String r0 = "client_mutation_id"
            X.C0CA.A00(r4, r3, r0)
            java.lang.String r0 = "input"
            X.1uJ r4 = X.AbstractC25233BEq.A0H(r4, r6, r0)
            java.util.Map r6 = r6.getParamsCopy()
            java.util.Map r7 = r7.getParamsCopy()
            java.lang.Class<X.QkA> r8 = X.C59688QkA.class
            java.util.ArrayList r14 = X.AbstractC166987dD.A1E()
            java.lang.String r5 = "IGAvatarDeleteMutation"
            r11 = 96
            java.lang.String r13 = "avatar_delete"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.instagram.common.session.UserSession r0 = r15.A01
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r2.A01 = r15
            r2.A00 = r9
            java.lang.Object r3 = r0.A04(r3, r2)
            if (r3 != r1) goto La0
            return r1
        La0:
            r1 = r15
            goto L29
        La2:
            X.MAG r2 = new X.MAG
            r2.<init>(r15, r5, r4)
            goto L17
        La9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarMutationRepository.A00(X.1Ds):java.lang.Object");
    }

    public AvatarMutationRepository(AvatarStore avatarStore, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, avatarStore);
        this.A01 = userSession;
        this.A00 = avatarStore;
    }
}
