package com.instagram.avatars.graphql;

import X.AbstractC25227BEk;
import X.AbstractC40691uc;
import X.C008002u;
import X.C05A;
import X.C40701ud;
import X.InterfaceC19390xP;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class AvatarCustomizationOptionsRepository {
    public final UserSession A00;
    public final C40701ud A01;
    public final String A02;
    public final InterfaceC19390xP A03;
    public final C05A A04;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.Boolean r11, X.InterfaceC23621Ds r12, boolean r13) {
        /*
            r10 = this;
            r3 = 4
            boolean r0 = X.MAG.A01(r12, r3)
            if (r0 == 0) goto Ld2
            r7 = r12
            X.MAG r7 = (X.MAG) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld2
            int r2 = r2 - r1
            r7.A00 = r2
        L15:
            java.lang.Object r2 = r7.A02
            X.1JX r8 = X.C1JX.A02
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L75
            if (r0 != r6) goto Ld9
            java.lang.Object r1 = r7.A01
            com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository r1 = (com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository) r1
            X.AbstractC09560e7.A00(r2)
        L27:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L6c
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.435 r0 = (X.AnonymousClass435) r0
            X.05A r4 = r1.A04
            java.lang.Object r3 = r0.A01
            X.2JS r3 = (X.C2JS) r3
            if (r3 == 0) goto L6a
            java.lang.Class<X.Qk7> r2 = X.C59685Qk7.class
            r0 = 938(0x3aa, float:1.314E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            r0 = 2139629613(0x7f88282d, float:NaN)
            X.2JS r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L6a
            java.lang.Class<X.Qk6> r2 = X.C59684Qk6.class
            java.lang.String r1 = "user_avatar"
            r0 = 936972892(0x37d9125c, float:2.5876965E-5)
            X.2JS r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L6a
            java.lang.Class<X.Qk5> r2 = X.C59683Qk5.class
            java.lang.String r1 = "ig_fetch_coin_flip_options(query_params:$query_params)"
            r0 = -1914548677(0xffffffff8de24e3b, float:-1.3947159E-30)
            X.2JS r0 = r3.A03(r2, r1, r0)
        L64:
            r4.Egh(r0)
        L67:
            X.0eB r8 = X.C0eB.A00
        L69:
            return r8
        L6a:
            r0 = 0
            goto L64
        L6c:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L67
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L75:
            X.AbstractC09560e7.A00(r2)
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.2JM r4 = X.AbstractC25225BEi.A0b()
            com.instagram.common.session.UserSession r0 = r10.A00
            java.lang.String r1 = r0.userId
            java.lang.String r0 = "user_id"
            boolean r3 = X.AbstractC43594JPz.A1X(r5, r0, r1)
            X.0Jx r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "refresh_only"
            X.0CA r2 = X.AbstractC25227BEk.A0T(r1, r11, r0)
            java.lang.String r1 = r10.A02
            java.lang.String r0 = "sticker_pack_id"
            X.C0CA.A00(r2, r1, r0)
            java.lang.String r1 = "query_params"
            X.2JO r0 = r5.A00
            X.AbstractC31173DnH.A1M(r2, r0, r1)
            com.facebook.pando.PandoGraphQLRequest r9 = X.LTG.A00(r5, r4, r3)
            r2 = 3
            r4 = 0
            if (r13 == 0) goto Lcf
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r0 = r0.toMillis(r2)
        Lb0:
            X.1Dk r1 = r9.setFreshCacheAgeMs(r0)
            if (r13 == 0) goto Lbc
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r4 = r0.toMillis(r2)
        Lbc:
            X.1Dk r1 = r1.setMaxToleratedCacheAgeMs(r4)
            X.1ud r0 = r10.A01
            r7.A01 = r10
            r7.A00 = r6
            java.lang.Object r2 = r0.A04(r1, r7)
            if (r2 == r8) goto L69
            r1 = r10
            goto L27
        Lcf:
            r0 = 0
            goto Lb0
        Ld2:
            X.MAG r7 = new X.MAG
            r7.<init>(r10, r12, r3)
            goto L15
        Ld9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository.A00(java.lang.Boolean, X.1Ds, boolean):java.lang.Object");
    }

    public AvatarCustomizationOptionsRepository(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = AbstractC40691uc.A01(userSession);
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A04 = A0z;
        this.A03 = A0z;
    }
}
