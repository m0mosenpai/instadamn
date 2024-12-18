package com.instagram.trials.repository;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ClipsTrialBottomSheetRepositoryImpl {
    public final UserSession A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.api.schemas.MediaTrialGraduationStrategy r16, java.lang.String r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl.A00(com.instagram.api.schemas.MediaTrialGraduationStrategy, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r20, java.lang.String r21, X.InterfaceC23621Ds r22) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl.A01(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r19, java.lang.String r20, X.InterfaceC23621Ds r21) {
        /*
            r18 = this;
            r5 = 15
            r6 = r21
            boolean r0 = X.PXB.A03(r6, r5)
            r4 = r18
            if (r0 == 0) goto Lca
            r2 = r6
            X.PXB r2 = (X.PXB) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lca
            int r3 = r3 - r1
            r2.A00 = r3
        L1a:
            java.lang.Object r3 = r2.A01
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r12 = 1
            if (r0 == 0) goto L83
            if (r0 != r12) goto Ld5
            X.AbstractC09560e7.A00(r3)
        L28:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L7a
            X.2JS r3 = X.AbstractC25232BEp.A18(r3)
            if (r3 == 0) goto L78
            java.lang.Class<X.QyY> r2 = X.C60384QyY.class
            java.lang.String r1 = "xdt_graduate_trial_media_v2(entry_point:$entry_point,media_id:$media_id)"
            r0 = -1721440550(0xffffffff9964e6da, float:-1.1833944E-23)
            X.2JS r2 = r3.A05(r2, r1, r0)
            if (r2 == 0) goto L78
            java.lang.Class<X.Umi> r1 = X.C67482Umi.class
            r0 = 1643126146(0x61f01d82, float:5.536681E20)
            X.2JS r3 = r2.A01(r1, r0)
            if (r3 == 0) goto L78
            java.lang.Class<X.Umh> r2 = X.C67481Umh.class
            java.lang.String r1 = "clips_trial"
            r0 = -490438940(0xffffffffe2c47ee4, float:-1.8123526E21)
            X.2JS r3 = r3.getOptionalTreeField(r12, r1, r2, r0)
            if (r3 == 0) goto L78
            X.Nhd r2 = X.EnumC53301Nhd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            java.lang.String r0 = "status"
            java.lang.Enum r1 = r3.getRequiredEnumField(r1, r0, r2)
        L62:
            X.Nhd r0 = X.EnumC53301Nhd.GRADUATED
            if (r1 == r0) goto L67
            r12 = 0
        L67:
            X.3NX r3 = X.AbstractC25235BEs.A0f(r12)
        L6b:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto L77
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto Ld0
            X.8jk r3 = X.AbstractC43594JPz.A0m(r3)
        L77:
            return r3
        L78:
            r1 = 0
            goto L62
        L7a:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L6b
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L83:
            X.AbstractC09560e7.A00(r3)
            r13 = 0
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "media_id"
            r3 = r19
            boolean r3 = X.AbstractC43594JPz.A1X(r6, r0, r3)
            java.lang.String r0 = "entry_point"
            r7 = r20
            r6.A04(r0, r7)
            X.1uJ r7 = X.AbstractC25227BEk.A0U(r3)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.QyZ> r11 = X.C60385QyZ.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "IgCreatorsTrialsGraduateTrialMutation"
            r14 = 0
            java.lang.String r16 = "xdt_graduate_trial_media_v2"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r2.A00 = r12
            java.lang.Object r3 = r0.A04(r6, r2)
            if (r3 != r1) goto L28
            return r1
        Lca:
            X.PXB r2 = X.PXB.A00(r4, r6, r5)
            goto L1a
        Ld0:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl.A02(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            r17 = this;
            r5 = 17
            r6 = r19
            boolean r0 = X.PXB.A03(r6, r5)
            r3 = r17
            if (r0 == 0) goto Lbd
            r2 = r6
            X.PXB r2 = (X.PXB) r2
            int r4 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto Lbd
            int r4 = r4 - r1
            r2.A00 = r4
        L1a:
            java.lang.Object r4 = r2.A01
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r11 = 1
            if (r0 == 0) goto L7d
            if (r0 != r11) goto Lc8
            X.AbstractC09560e7.A00(r4)
        L28:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L74
            X.2JS r3 = X.AbstractC25232BEp.A18(r4)
            if (r3 == 0) goto L72
            java.lang.Class<X.QyW> r2 = X.C60382QyW.class
            java.lang.String r1 = "xdt_reveal_trial_media(media_id:$media_id)"
            r0 = 1487699125(0x58ac7cb5, float:1.5172129E15)
            X.2JS r2 = r3.A05(r2, r1, r0)
            if (r2 == 0) goto L72
            java.lang.Class<X.Umi> r1 = X.C67482Umi.class
            r0 = 1643126146(0x61f01d82, float:5.536681E20)
            X.2JS r3 = r2.A01(r1, r0)
            if (r3 == 0) goto L72
            java.lang.Class<X.Umh> r2 = X.C67481Umh.class
            java.lang.String r1 = "clips_trial"
            r0 = -490438940(0xffffffffe2c47ee4, float:-1.8123526E21)
            X.2JS r0 = r3.getOptionalTreeField(r11, r1, r2, r0)
            if (r0 == 0) goto L72
        L59:
            X.3NX r4 = X.AbstractC25235BEs.A0f(r11)
        L5d:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L71
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Lc3
            X.8jk r4 = (X.C194848jk) r4
            java.lang.Object r0 = r4.A00
            java.lang.String r0 = r0.toString()
            X.8jk r4 = X.AbstractC43592JPx.A0p(r0)
        L71:
            return r4
        L72:
            r11 = 0
            goto L59
        L74:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L5d
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L7d:
            X.AbstractC09560e7.A00(r4)
            r12 = 0
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.2JM r4 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "media_id"
            r6 = r18
            boolean r0 = X.AbstractC43594JPz.A1X(r5, r0, r6)
            X.1uJ r6 = X.AbstractC25227BEk.A0U(r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.QyX> r10 = X.C60383QyX.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "IgCreatorsTrialRevealStatusMutation"
            r13 = 0
            java.lang.String r15 = "xdt_reveal_trial_media"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r2.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r2)
            if (r4 != r1) goto L28
            return r1
        Lbd:
            X.PXB r2 = X.PXB.A00(r3, r6, r5)
            goto L1a
        Lc3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl.A03(java.lang.String, X.1Ds):java.lang.Object");
    }

    public ClipsTrialBottomSheetRepositoryImpl(UserSession userSession) {
        this.A00 = userSession;
    }
}
