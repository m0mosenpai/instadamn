package com.instagram.closefriends.audiencelists.api;

import X.ADE;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC23721Ec;
import X.AbstractC25227BEk;
import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.AnonymousClass001;
import X.C14360o3;
import X.C168027ex;
import X.C168037ey;
import X.C1ON;
import X.C214309eU;
import X.C25621Ms;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class AudienceListsApiUtil {
    public static final AudienceListsApiUtil A00 = new Object();

    public static final C1ON A01(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("friendships/followers_you_follow_back/");
        A0M.A0H("query", str2);
        A0M.A0H("module", str);
        return AbstractC25227BEk.A0e(A0M, C168027ex.class, C168037ey.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(com.instagram.common.session.UserSession r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, X.InterfaceC23621Ds r11, boolean r12) {
        /*
            r6 = this;
            r4 = 20
            boolean r0 = X.MAS.A03(r11, r4)
            if (r0 == 0) goto L82
            r2 = r11
            X.MAS r2 = (X.MAS) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L82
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r1 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto L8f
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L3b
            X.3NX r1 = X.AbstractC31181DnP.A0D(r1)
        L2e:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L3a
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L8a
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L3a:
            return r1
        L3b:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L2e
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L44:
            X.AbstractC09560e7.A00(r1)
            X.AbstractC25230BEn.A15(r4, r7, r9)
            X.1Ms r5 = X.AbstractC31177DnL.A0M(r7)
            r5.A03()
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "api/v1/stories/private_stories/%s/members/"
            X.AbstractC31173DnH.A1Q(r5, r0, r1)
            java.lang.String r0 = "suggested_users_max_id"
            r5.A0H(r0, r10)
            java.lang.String r0 = "page_size"
            r5.A0A(r8, r0)
            java.lang.String r0 = "pagination_enabled"
            r5.A0I(r0, r12)
            java.lang.Class<X.EAw> r1 = X.C32149EAw.class
            java.lang.Class<X.FSh> r0 = X.C34742FSh.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r5, r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.PrivateStoriesMembersResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.PrivateStoriesMembersResponse>>"
            X.C14360o3.A0C(r1, r0)
            r2.A00 = r4
            r0 = 266936970(0xfe9228a, float:2.2988878E-29)
            java.lang.Object r1 = r1.A00(r0, r2)
            if (r1 != r3) goto L24
            return r3
        L82:
            r0 = 42
            X.MAS r2 = new X.MAS
            r2.<init>(r6, r11, r4, r0)
            goto L16
        L8a:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A03(com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(com.instagram.common.session.UserSession r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.List r16, java.util.List r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A04(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(com.instagram.common.session.UserSession r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List r13, java.util.List r14, X.InterfaceC23621Ds r15) {
        /*
            r8 = this;
            r3 = 19
            boolean r0 = X.MAS.A03(r15, r3)
            if (r0 == 0) goto Lc6
            r4 = r15
            X.MAS r4 = (X.MAS) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc6
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L44
            if (r0 != r6) goto Ld4
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L3b
            X.3NX r1 = X.AbstractC31181DnP.A0D(r1)
        L2e:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L3a
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lcf
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L3a:
            return r1
        L3b:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L2e
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L44:
            X.AbstractC09560e7.A00(r1)
            r2 = 0
            if (r13 == 0) goto L62
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L62
            org.json.JSONArray r2 = X.AbstractC31171DnF.A0p()
            java.util.Iterator r1 = r13.iterator()
        L58:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L62
            X.AbstractC31172DnG.A1W(r1, r2)
            goto L58
        L62:
            r3 = 0
            if (r14 == 0) goto L7d
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L7d
            org.json.JSONArray r3 = X.AbstractC31171DnF.A0p()
            java.util.Iterator r1 = r14.iterator()
        L73:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7d
            X.AbstractC31172DnG.A1W(r1, r3)
            goto L73
        L7d:
            X.1Ms r7 = X.AbstractC25228BEl.A0q(r9)
            java.lang.String r0 = "api/v1/stories/private_stories/friend_lists/edit/"
            A02(r7, r0)
            java.lang.String r0 = "friend_list_id"
            r7.A9s(r0, r10)
            java.lang.Class<X.9eU> r1 = X.C214309eU.class
            java.lang.Class<X.ADE> r0 = X.ADE.class
            r7.A0R(r1, r0)
            if (r11 == 0) goto L99
            java.lang.String r0 = "name"
            r7.A9s(r0, r11)
        L99:
            if (r13 == 0) goto La4
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "edited_member_ids"
            r7.AA6(r0, r1)
        La4:
            if (r14 == 0) goto Laf
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "edited_thread_ids"
            r7.AA6(r0, r1)
        Laf:
            if (r12 == 0) goto Lb6
            java.lang.String r0 = "icon"
            r7.A9s(r0, r12)
        Lb6:
            X.1ON r1 = X.AbstractC31172DnG.A0U(r7, r6)
            r4.A00 = r6
            r0 = 1382921735(0x526db607, float:2.5524029E11)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L24
            return r5
        Lc6:
            r0 = 42
            X.MAS r4 = new X.MAS
            r4.<init>(r8, r15, r3, r0)
            goto L16
        Lcf:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld4:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A05(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(com.instagram.common.session.UserSession r15, java.lang.String r16, java.lang.String r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A06(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(com.instagram.common.session.UserSession r14, java.lang.String r15, java.util.List r16, java.util.List r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A07(com.instagram.common.session.UserSession, java.lang.String, java.util.List, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        if (r0 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(com.instagram.common.session.UserSession r14, java.lang.String r15, X.InterfaceC23621Ds r16) {
        /*
            r13 = this;
            r3 = 19
            r5 = r16
            boolean r0 = X.MAG.A01(r5, r3)
            if (r0 == 0) goto Lb5
            r4 = r5
            X.MAG r4 = (X.MAG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb5
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r0 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto La0
            if (r1 != r3) goto Lc1
            java.lang.Object r14 = r4.A01
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14
            X.AbstractC09560e7.A00(r0)
        L2a:
            r2 = r0
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L78
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.3DC r0 = (X.C3DC) r0
            java.lang.Object r4 = r0.F7f()
            X.C14360o3.A07(r4)
            X.XFO r4 = (X.XFO) r4
            X.8Qt r6 = X.AbstractC186998Qs.A00(r14)
            r0 = r4
            X.9a2 r0 = (X.C211779a2) r0
            java.util.List r1 = r0.A00
            int r0 = r1.size()
            r6.A01(r0)
            X.8Qu r5 = r6.A02
            java.util.Iterator r2 = r1.iterator()
        L56:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r2.next()
            X.MRc r0 = (X.InterfaceC50499MRc) r0
            X.E82 r0 = (X.E82) r0
            long r0 = r0.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            if (r5 == 0) goto L76
            java.lang.String r0 = r5.A01
        L6e:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L56
            r3 = 0
            goto L56
        L76:
            r0 = 0
            goto L6e
        L78:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L93
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L81:
            if (r3 == 0) goto L8f
            r7 = 0
            r10 = 0
            r11 = 1
            r8 = r7
            r9 = r7
            r12 = r10
            r6.A03(r7, r8, r9, r10, r11, r12)
            r6.A00()
        L8f:
            X.3NX r2 = X.AbstractC25225BEi.A0z(r4)
        L93:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto Lb4
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto Lbc
            X.8jk r2 = X.AbstractC25227BEk.A0h()
            return r2
        La0:
            X.AbstractC09560e7.A00(r0)
            X.1ON r1 = A00(r14, r15)
            r4.A01 = r14
            r4.A00 = r3
            r0 = 1480484788(0x583e67b4, float:8.3741044E14)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r2) goto L2a
        Lb4:
            return r2
        Lb5:
            X.MAG r4 = new X.MAG
            r4.<init>(r13, r5, r3)
            goto L18
        Lbc:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A08(com.instagram.common.session.UserSession, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(com.instagram.common.session.UserSession r14, X.InterfaceC23621Ds r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A09(com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }

    public static final C1ON A00(UserSession userSession, String str) {
        boolean A1a = AbstractC167017dG.A1a(userSession, str);
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A02(A0q, "api/v1/stories/private_stories/friend_lists/delete/");
        A0q.A0R(C214309eU.class, ADE.class);
        Long A0j = AbstractC166997dE.A0j(str);
        if (A0j != null) {
            A0q.A0E("friend_list_id", A0j.longValue());
        }
        return AbstractC31172DnG.A0U(A0q, A1a);
    }

    public static void A02(AbstractC23721Ec abstractC23721Ec, String str) {
        abstractC23721Ec.A05();
        abstractC23721Ec.A03();
        String A0B = AnonymousClass001.A0B(str);
        C14360o3.A07(A0B);
        abstractC23721Ec.A0E = A0B;
    }
}
