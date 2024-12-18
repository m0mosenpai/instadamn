package com.facebook.avatar.expresso.graphql.asset;

import X.AbstractC40691uc;
import X.C14360o3;
import X.C40701ud;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class ODRAssetRepository {
    public final UserSession A00;
    public final C40701ud A01;

    public ODRAssetRepository(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C14360o3.A0B(A01, 2);
        this.A00 = userSession;
        this.A01 = A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r18) {
        /*
            r17 = this;
            r5 = 21
            r6 = r18
            boolean r0 = X.MAN.A02(r6, r5)
            r4 = r17
            if (r0 == 0) goto L77
            r3 = r6
            X.MAN r3 = (X.MAN) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r5 = r3.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 != r2) goto Ld8
            X.AbstractC09560e7.A00(r5)
        L28:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 == 0) goto L7d
            X.8jk r5 = (X.C194848jk) r5
            java.lang.Object r0 = r5.A00
            java.lang.String r1 = r0.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            X.8jk r1 = X.AbstractC43592JPx.A0p(r0)
            return r1
        L40:
            X.AbstractC09560e7.A00(r5)
            r12 = 0
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.2JM r0 = X.AbstractC25225BEi.A0b()
            X.1uJ r6 = X.AbstractC25225BEi.A0c()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r0.getParamsCopy()
            java.lang.Class<X.QnK> r10 = X.QnK.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "ODRAssetsQueryQuery"
            r11 = 0
            java.lang.String r15 = "xfb_odr_avatar_user_model"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1ud r0 = r4.A01
            r3.A01 = r4
            r3.A00 = r2
            java.lang.Object r5 = r0.A04(r5, r3)
            if (r5 != r1) goto L28
            return r1
        L77:
            X.MAN r3 = new X.MAN
            r3.<init>(r4, r6, r5)
            goto L1a
        L7d:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto Ld3
            java.lang.Class<X.KbY> r0 = X.EnumC46134KbY.class
            java.util.EnumMap r8 = new java.util.EnumMap
            r8.<init>(r0)
            X.2JS r7 = X.AbstractC25232BEp.A18(r5)
            if (r7 == 0) goto Lc7
            java.lang.Class<X.QnJ> r6 = X.QnJ.class
            r5 = 0
            java.lang.String r4 = "xfb_odr_avatar_user_model"
            r3 = 715405302(0x2aa437f6, float:2.9171083E-13)
            X.2JS r1 = r7.getOptionalTreeField(r5, r4, r6, r3)
            if (r1 == 0) goto Lc7
            java.lang.String r0 = "url"
            java.lang.String r1 = r1.getOptionalStringField(r2, r0)
            if (r1 == 0) goto Lc7
            X.KbY r0 = X.EnumC46134KbY.A03
            r8.put(r0, r1)
            X.KbY r2 = X.EnumC46134KbY.A02
            X.2JS r1 = r7.getOptionalTreeField(r5, r4, r6, r3)
            if (r1 == 0) goto Lbd
            r0 = 358(0x166, float:5.02E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            java.lang.String r0 = r1.getOptionalStringField(r5, r0)
            if (r0 != 0) goto Lbf
        Lbd:
            java.lang.String r0 = ""
        Lbf:
            r8.put(r2, r0)
            X.3NX r1 = X.AbstractC25225BEi.A0z(r8)
            return r1
        Lc7:
            java.lang.String r1 = "Illegal Query Response"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            X.8jk r1 = X.AbstractC43592JPx.A0p(r0)
            return r1
        Ld3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.graphql.asset.ODRAssetRepository.A00(X.1Ds):java.lang.Object");
    }
}
