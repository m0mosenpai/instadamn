package com.instagram.avatars.graphql;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC40691uc;
import X.C14360o3;
import X.C2JM;
import X.C4A7;
import X.C4A8;
import X.C59619Qij;
import X.InterfaceC23621Ds;
import X.JQ1;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public final class AvatarMentionsRepository extends C4A7 {
    public final UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarMentionsRepository(UserSession userSession) {
        super("Stories", C4A8.A00(921052282));
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final Object A02(List list, InterfaceC23621Ds interfaceC23621Ds) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) AbstractC001800i.A0X(list));
        A0b.A05("user_ids", copyOf);
        return AbstractC40691uc.A01(this.A00).A04(JQ1.A08(new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC167007dF.A1W(copyOf)), "AvatarsMentionsUsersInfo", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59619Qij.class, false, null, 0, null, "xig_users_by_igid_v2", AbstractC166987dD.A1E())), interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.avatars.graphql.AvatarMentionsRepository r14, java.util.List r15, X.InterfaceC23621Ds r16) {
        /*
            r3 = 24
            r5 = r16
            boolean r0 = X.MAR.A03(r5, r3)
            if (r0 == 0) goto Lb8
            r4 = r5
            X.MAR r4 = (X.MAR) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r3 = r4.A01
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto La4
            if (r0 != r2) goto Lc7
            X.AbstractC09560e7.A00(r3)
        L26:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto Lbe
            X.2JS r4 = X.AbstractC25232BEp.A18(r3)
            if (r4 == 0) goto Lcc
            java.lang.Class<X.Qii> r3 = X.C59618Qii.class
            java.lang.String r1 = "xig_users_by_igid_v2(ids:$user_ids)"
            r0 = -1488942796(0xffffffffa7408934, float:-2.671973E-15)
            com.google.common.collect.ImmutableList r0 = r4.A06(r3, r1, r0)
            if (r0 == 0) goto Lcc
            r4 = 0
            java.util.ArrayList r3 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r10 = r0.iterator()
        L48:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lcd
            X.2JS r5 = X.AbstractC25225BEi.A0l(r10)
            java.lang.String r0 = "instagram_user_id"
            java.lang.String r13 = r5.getOptionalStringField(r4, r0)
            java.lang.Class<X.Qih> r7 = X.C59617Qih.class
            r1 = 7
            java.lang.String r6 = "user_avatar"
            r0 = 1934184079(0x73494e8f, float:1.5949173E31)
            X.2JS r9 = r5.getOptionalTreeField(r1, r6, r7, r0)
            r12 = 0
            if (r9 == 0) goto La2
            java.lang.Class<X.Qig> r8 = X.C59616Qig.class
            java.lang.String r1 = "avatar_pog"
            r0 = 1586910313(0x5e965469, float:5.416199E18)
            X.2JS r1 = r9.getOptionalTreeField(r2, r1, r8, r0)
            if (r1 == 0) goto La2
            java.lang.String r0 = "cdn_url"
            java.lang.String r14 = r1.getOptionalStringField(r2, r0)
        L7a:
            java.lang.String r0 = X.AbstractC50529MSi.A00()
            java.lang.String r15 = r5.A0B(r0)
            r1 = 7
            r0 = 1934184079(0x73494e8f, float:1.5949173E31)
            X.2JS r1 = r5.getOptionalTreeField(r1, r6, r7, r0)
            if (r1 == 0) goto L92
            java.lang.String r0 = "is_public_and_usable_by_viewer"
            java.lang.Boolean r12 = X.AbstractC31174DnI.A0o(r1, r0, r4)
        L92:
            r1 = 6
            java.lang.String r0 = "is_mentionable"
            boolean r16 = r5.getCoercedBooleanField(r1, r0)
            X.Mt0 r11 = new X.Mt0
            r11.<init>(r12, r13, r14, r15, r16)
            r3.add(r11)
            goto L48
        La2:
            r14 = r12
            goto L7a
        La4:
            X.AbstractC09560e7.A00(r3)
            if (r15 == 0) goto Ldb
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto Ldb
            r4.A00 = r2
            java.lang.Object r3 = r14.A02(r15, r4)
            if (r3 != r1) goto L26
            return r1
        Lb8:
            X.MAR r4 = X.MAR.A01(r14, r5, r3)
            goto L18
        Lbe:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto Ld1
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc7:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lcc:
            r3 = 0
        Lcd:
            X.3NX r3 = X.AbstractC25225BEi.A0z(r3)
        Ld1:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto Lde
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
        Ld9:
            if (r0 != 0) goto Ldd
        Ldb:
            X.0sl r0 = X.C16930sl.A00
        Ldd:
            return r0
        Lde:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto Le5
            X.0sl r0 = X.C16930sl.A00
            goto Ld9
        Le5:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarMentionsRepository.A00(com.instagram.avatars.graphql.AvatarMentionsRepository, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.avatars.graphql.AvatarMentionsRepository r16, X.InterfaceC23621Ds r17, int r18) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarMentionsRepository.A01(com.instagram.avatars.graphql.AvatarMentionsRepository, X.1Ds, int):java.lang.Object");
    }
}
