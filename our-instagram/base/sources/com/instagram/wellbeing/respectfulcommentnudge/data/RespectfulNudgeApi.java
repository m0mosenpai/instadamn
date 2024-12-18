package com.instagram.wellbeing.respectfulcommentnudge.data;

/* loaded from: classes.dex */
public final class RespectfulNudgeApi {
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r9, X.C38321qM r10, java.lang.String r11, java.lang.String r12, java.util.List r13, X.InterfaceC23621Ds r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.respectfulcommentnudge.data.RespectfulNudgeApi.A00(com.instagram.common.session.UserSession, X.1qM, java.lang.String, java.lang.String, java.util.List, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r19, java.lang.String r20, X.InterfaceC23621Ds r21) {
        /*
            r18 = this;
            r1 = r20
            r5 = 7
            r6 = r21
            boolean r0 = X.C9CZ.A00(r6, r5)
            if (r0 == 0) goto Lb3
            r4 = r6
            X.9CZ r4 = (X.C9CZ) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto Lb3
            int r3 = r3 - r2
            r4.A00 = r3
        L19:
            java.lang.Object r5 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L67
            if (r0 != r2) goto Lc9
            java.lang.Object r1 = r4.A01
            java.lang.String r1 = (java.lang.String) r1
            X.AbstractC09560e7.A00(r5)
        L2b:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto Lbc
            X.3NX r5 = (X.C3NX) r5
            java.lang.Object r0 = r5.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r5 = r0.A01
            X.2JS r5 = (X.C2JS) r5
            if (r5 == 0) goto Lc6
            java.lang.Class<X.7ll> r4 = X.C172167ll.class
            r6 = 0
            java.lang.String r3 = "xdt_users__info(user_id:$user_id)"
            r0 = 1614812718(0x6040162e, float:5.5365204E19)
            X.2JS r5 = r5.getRequiredTreeField(r6, r3, r4, r0)
            if (r5 == 0) goto Lc6
            java.lang.Class<X.7lm> r4 = X.C172177lm.class
            java.lang.String r3 = "user"
            r0 = -930501885(0xffffffffc889ab03, float:-281944.1)
            X.2JS r3 = r5.getRequiredTreeField(r6, r3, r4, r0)
            if (r3 == 0) goto Lc6
            java.lang.String r0 = "paa_score"
            double r2 = r3.getCoercedDoubleField(r2, r0)
            X.7ln r0 = new X.7ln
            r0.<init>(r1, r2)
            return r0
        L67:
            X.AbstractC09560e7.A00(r5)
            r13 = 0
            X.2JM r6 = new X.2JM
            r6.<init>()
            X.2JM r5 = new X.2JM
            r5.<init>()
            java.lang.String r0 = "user_id"
            r6.A04(r0, r1)
            r0 = 0
            if (r20 == 0) goto L7f
            r0 = 1
        L7f:
            X.C18C.A0E(r0)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r7 = X.AbstractC40511uK.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.7l9> r11 = X.C171797l9.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "PaaUserInfo"
            r12 = 0
            java.lang.String r16 = "xdt_users__info"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ud r0 = X.AbstractC40691uc.A01(r19)
            r4.A01 = r1
            r4.A00 = r2
            java.lang.Object r5 = r0.A04(r6, r4)
            if (r5 != r3) goto L2b
            return r3
        Lb3:
            X.9CZ r4 = new X.9CZ
            r0 = r18
            r4.<init>(r0, r6, r5)
            goto L19
        Lbc:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto Lc6
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lc6:
            X.9qo r3 = X.C221859qo.A00
            return r3
        Lc9:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.respectfulcommentnudge.data.RespectfulNudgeApi.A01(com.instagram.common.session.UserSession, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.common.session.UserSession r19, java.lang.String r20, X.InterfaceC23621Ds r21) {
        /*
            r18 = this;
            r4 = 45
            r5 = r21
            boolean r0 = X.C9CX.A00(r5, r4)
            if (r0 == 0) goto L84
            r2 = r5
            X.9CX r2 = (X.C9CX) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L84
            int r3 = r3 - r1
            r2.A00 = r3
        L18:
            java.lang.Object r4 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L9b
            X.AbstractC09560e7.A00(r4)
        L26:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L8e
            X.Xb8 r3 = X.C72311Xb8.A00
            return r3
        L2d:
            X.AbstractC09560e7.A00(r4)
            X.0Jx r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r13 = 0
            java.lang.String r0 = "profile_owner_user_igid"
            X.0CA r7 = r4.A02()
            r4 = r20
            X.C0CA.A00(r7, r4, r0)
            X.2JM r6 = new X.2JM
            r6.<init>()
            X.2JM r5 = new X.2JM
            r5.<init>()
            java.lang.String r4 = "data"
            X.2JO r0 = r6.A00
            X.0CA r0 = r0.A02()
            r0.A0E(r7, r4)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r7 = X.AbstractC40511uK.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.QzC> r11 = X.C60424QzC.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "ProfileBioLinkClickNudge"
            r12 = 0
            java.lang.String r16 = "xdt_expose_ig_profile_bio_click"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ud r0 = X.AbstractC40691uc.A01(r19)
            r2.A00 = r1
            java.lang.Object r4 = r0.A04(r6, r2)
            if (r4 != r3) goto L26
            return r3
        L84:
            r0 = 42
            X.9CX r2 = new X.9CX
            r1 = r18
            r2.<init>(r1, r5, r4, r0)
            goto L18
        L8e:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto L95
            X.Xb7 r3 = X.C72310Xb7.A00
            return r3
        L95:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L9b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.respectfulcommentnudge.data.RespectfulNudgeApi.A02(com.instagram.common.session.UserSession, java.lang.String, X.1Ds):java.lang.Object");
    }
}
