package com.instagram.fanclub.api;

import X.AbstractC40511uK;
import X.AbstractC40691uc;
import X.C14360o3;
import X.C23351AXa;
import X.C2JM;
import X.C2JQ;
import X.C40701ud;
import X.C48150LSz;
import X.C60488R0o;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class FanClubApi {
    public final UserSession A00;

    public FanClubApi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final PandoGraphQLRequest A00(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C14360o3.A0B(str, 0);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A02("should_fetch_blocked_member_count", false);
        c2jm.A02("should_fetch_member_count", false);
        c2jm.A02("should_fetch_sku", false);
        c2jm.A02("should_fetch_early_pricing", false);
        c2jm.A02("should_fetch_enabled_benefits", false);
        c2jm.A02("should_fetch_seconds_until_notification", false);
        c2jm.A02("should_fetch_customized_benefits", false);
        c2jm.A02("should_fetch_content_preview", false);
        c2jm.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        c2jm.A02("should_fetch_blocked_member_count", Boolean.valueOf(z));
        c2jm.A02("should_fetch_member_count", Boolean.valueOf(z2));
        c2jm.A02("should_fetch_sku", Boolean.valueOf(z3));
        c2jm.A02("should_fetch_enabled_benefits", Boolean.valueOf(z4));
        c2jm.A02("should_fetch_early_pricing", Boolean.valueOf(z5));
        c2jm.A02("should_fetch_seconds_until_notification", Boolean.valueOf(z6));
        c2jm.A02("should_fetch_customized_benefits", Boolean.valueOf(z7));
        c2jm.A02("should_fetch_content_preview", Boolean.valueOf(z8));
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "FanClubInfoForCreator", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C60488R0o.class, false, null, 0, null, "xig_user_by_igid_v2", new ArrayList());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.api.schemas.FanClubCategoryType r13, X.InterfaceC23621Ds r14, boolean r15, boolean r16) {
        /*
            r12 = this;
            r4 = 7
            boolean r0 = X.MAJ.A01(r14, r4)
            if (r0 == 0) goto Lb4
            r2 = r14
            X.MAJ r2 = (X.MAJ) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lb4
            int r3 = r3 - r1
            r2.A00 = r3
        L15:
            java.lang.Object r0 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto Lc3
            X.AbstractC09560e7.A00(r0)
        L23:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L33
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto Lbd
            X.0eB r0 = X.C0eB.A00
            X.8jk r3 = new X.8jk
            r3.<init>(r0)
        L33:
            return r3
        L34:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r6 = r12.A00
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36596089184913721(0x8203f300090939, double:3.2068523889380425E-306)
            long r0 = X.C18U.A01(r5, r6, r0)
            int r5 = (int) r0
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r5)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r15)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r16)
            X.C14360o3.A0B(r13, r4)
            r0 = -2
            X.1Ms r5 = new X.1Ms
            r5.<init>(r6, r0)
            java.lang.String r8 = "category"
            java.lang.String r7 = "api/"
            java.lang.String r6 = "v1/"
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "category_members/"
            r5.A06()
            r5.A03()
            java.lang.String r0 = X.AnonymousClass001.A0u(r7, r6, r1, r0)
            X.C14360o3.A07(r0)
            r5.A0E = r0
            java.lang.Class<X.EAr> r1 = X.C32144EAr.class
            java.lang.Class<X.FSB> r0 = X.FSB.class
            r5.A0R(r1, r0)
            java.lang.String r0 = r13.A00
            r5.A9s(r8, r0)
            int r1 = r9.intValue()
            java.lang.String r0 = "limit"
            r5.A0D(r0, r1)
            if (r11 == 0) goto L94
            boolean r1 = r11.booleanValue()
            java.lang.String r0 = "should_include_unconnected"
            r5.A0I(r0, r1)
        L94:
            if (r10 == 0) goto L9f
            boolean r1 = r10.booleanValue()
            java.lang.String r0 = "should_include_restricted_countries"
            r5.A0I(r0, r1)
        L9f:
            X.1ON r1 = r5.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCategoryMembersResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCategoryMembersResponse>>"
            X.C14360o3.A0C(r1, r0)
            r2.A00 = r4
            r0 = 1037542755(0x3dd7a563, float:0.10529592)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L23
            return r3
        Lb4:
            r0 = 42
            X.MAJ r2 = new X.MAJ
            r2.<init>(r12, r14, r4, r0)
            goto L15
        Lbd:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        Lc3:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A01(com.instagram.api.schemas.FanClubCategoryType, X.1Ds, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            r17 = this;
            r5 = 2
            r6 = r19
            boolean r0 = X.MAJ.A01(r6, r5)
            r3 = r17
            if (r0 == 0) goto Lae
            r1 = r6
            X.MAJ r1 = (X.MAJ) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto Lae
            int r4 = r4 - r2
            r1.A00 = r4
        L19:
            java.lang.Object r4 = r1.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L4c
            if (r0 != r11) goto Lbd
            X.AbstractC09560e7.A00(r4)
        L27:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L42
            X.0eB r0 = X.C0eB.A00
            X.3NX r4 = new X.3NX
            r4.<init>(r0)
        L32:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L41
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Lb7
            X.0eB r0 = X.C0eB.A00
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
        L41:
            return r4
        L42:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L32
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L4c:
            X.AbstractC09560e7.A00(r4)
            X.0Jx r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            X.0CA r6 = r5.A02()
            X.C0CA.A00(r6, r4, r0)
            java.lang.String r0 = "fan_club_id"
            r4 = r18
            X.C0CA.A00(r6, r4, r0)
            X.2JM r5 = new X.2JM
            r5.<init>()
            X.2JM r4 = new X.2JM
            r4.<init>()
            java.lang.String r14 = "input"
            X.2JO r0 = r5.A00
            X.0CA r0 = r0.A02()
            r0.A0E(r6, r14)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r6 = X.AbstractC40511uK.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Qgg> r10 = X.C59512Qgg.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "GrantDogfoodingAccess"
            r13 = 8
            java.lang.String r15 = "xig_fan_club_grant_dogfooding_access"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L27
            return r2
        Lae:
            r0 = 42
            X.MAJ r1 = new X.MAJ
            r1.<init>(r3, r6, r5, r0)
            goto L19
        Lb7:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lbd:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A08(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            r18 = this;
            r5 = 3
            r6 = r20
            boolean r0 = X.MAJ.A01(r6, r5)
            r4 = r18
            if (r0 == 0) goto La0
            r2 = r6
            X.MAJ r2 = (X.MAJ) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto La0
            int r3 = r3 - r1
            r2.A00 = r3
        L19:
            java.lang.Object r5 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L54
            if (r0 != r1) goto Laf
            X.AbstractC09560e7.A00(r5)
        L27:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L4a
            X.3NX r5 = (X.C3NX) r5
            java.lang.Object r0 = r5.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.3NX r5 = new X.3NX
            r5.<init>(r0)
        L3a:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 != 0) goto L49
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 == 0) goto La9
            X.0eB r0 = X.C0eB.A00
            X.8jk r5 = new X.8jk
            r5.<init>(r0)
        L49:
            return r5
        L4a:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto L3a
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L54:
            X.AbstractC09560e7.A00(r5)
            r13 = 0
            X.2JM r6 = new X.2JM
            r6.<init>()
            X.2JM r5 = new X.2JM
            r5.<init>()
            java.lang.String r0 = "user_id"
            r7 = r19
            r6.A04(r0, r7)
            r0 = 0
            if (r19 == 0) goto L6d
            r0 = 1
        L6d:
            X.C18C.A0E(r0)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r7 = X.AbstractC40511uK.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Qgn> r11 = X.C59519Qgn.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "IGFanClubGuidanceInspirationUsersQuery"
            r12 = 0
            java.lang.String r16 = "xig_user_by_igid_v2"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r2.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r2)
            if (r5 != r3) goto L27
            return r3
        La0:
            r0 = 42
            X.MAJ r2 = new X.MAJ
            r2.<init>(r4, r6, r5, r0)
            goto L19
        La9:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Laf:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A09(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r4 = 5
            boolean r0 = X.MAJ.A01(r8, r4)
            if (r0 == 0) goto L71
            r3 = r8
            X.MAJ r3 = (X.MAJ) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r0 = r3.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L34
            if (r1 != r5) goto L7f
            X.AbstractC09560e7.A00(r0)
        L23:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L33
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L79
            X.0eB r0 = X.C0eB.A00
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
        L33:
            return r4
        L34:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            r2.A06()
            r2.A03()
            java.lang.String r0 = "api/v1/fan_club/blocked_members/"
            r2.A0B(r0)
            java.lang.Class<X.EAj> r1 = X.C32136EAj.class
            java.lang.Class<X.FS9> r0 = X.FS9.class
            r2.A0R(r1, r0)
            if (r7 == 0) goto L5c
            r0 = 177(0xb1, float:2.48E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r2.A9s(r0, r7)
        L5c:
            X.1ON r1 = r2.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubBlockedMembersResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubBlockedMembersResponse>>"
            X.C14360o3.A0C(r1, r0)
            r3.A00 = r5
            r0 = 1264748884(0x4b628954, float:1.4846292E7)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r4) goto L23
            return r4
        L71:
            r0 = 42
            X.MAJ r3 = new X.MAJ
            r3.<init>(r6, r8, r4, r0)
            goto L15
        L79:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L7f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0A(java.lang.String, X.1Ds):java.lang.Object");
    }

    public final Object A0F(String str, InterfaceC23621Ds interfaceC23621Ds) {
        return A0J(str, interfaceC23621Ds, false, false, false, false, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0K(java.util.List r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r4 = 1
            boolean r0 = X.MAJ.A01(r8, r4)
            if (r0 == 0) goto L6b
            r3 = r8
            X.MAJ r3 = (X.MAJ) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r0 = r3.A01
            X.1JX r5 = X.C1JX.A02
            int r1 = r3.A00
            if (r1 == 0) goto L33
            if (r1 != r4) goto L79
            X.AbstractC09560e7.A00(r0)
        L22:
            r5 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L32
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L73
            X.0eB r0 = X.C0eB.A00
            X.8jk r5 = new X.8jk
            r5.<init>(r0)
        L32:
            return r5
        L33:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            r2.A05()
            java.lang.String r0 = "fan_club/make_preview_content_into_exclusive/"
            r2.A0B(r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r7)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "media_ids"
            r2.A9s(r0, r1)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r2.A0R(r1, r0)
            X.1ON r1 = r2.A0N()
            r3.A00 = r4
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r5) goto L22
            return r5
        L6b:
            r0 = 42
            X.MAJ r3 = new X.MAJ
            r3.<init>(r6, r8, r4, r0)
            goto L15
        L73:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L79:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0K(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (r0 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0O(java.util.List r7, X.InterfaceC23621Ds r8, boolean r9) {
        /*
            r6 = this;
            r4 = 0
            boolean r0 = X.MAJ.A01(r8, r4)
            if (r0 == 0) goto L9a
            r3 = r8
            X.MAJ r3 = (X.MAJ) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r0 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L5d
            if (r1 != r5) goto La9
            X.AbstractC09560e7.A00(r0)
        L23:
            r2 = r0
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L3e
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.H8W r0 = (X.H8W) r0
            X.Mum r0 = r0.A00
            if (r0 != 0) goto L48
            java.lang.String r0 = "response"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3e:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L4d
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L48:
            X.3NX r2 = new X.3NX
            r2.<init>(r0)
        L4d:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L99
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto La3
            X.0eB r0 = X.C0eB.A00
            X.8jk r2 = new X.8jk
            r2.<init>(r0)
            return r2
        L5d:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1Ms r4 = new X.1Ms
            r4.<init>(r1, r0)
            r4.A05()
            java.lang.String r0 = "fan_club/make_exclusive_content_into_preview/"
            r4.A0B(r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r7)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "media_ids"
            r4.A9s(r0, r1)
            java.lang.String r0 = "need_replace"
            r4.A0I(r0, r9)
            java.lang.Class<X.H8W> r1 = X.H8W.class
            java.lang.Class<X.IO4> r0 = X.IO4.class
            r4.A0R(r1, r0)
            X.1ON r1 = r4.A0N()
            r3.A00 = r5
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r2) goto L23
        L99:
            return r2
        L9a:
            r0 = 42
            X.MAJ r3 = new X.MAJ
            r3.<init>(r6, r8, r4, r0)
            goto L15
        La3:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        La9:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0O(java.util.List, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (r0 == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0P(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 4
            boolean r0 = X.MAJ.A01(r7, r3)
            if (r0 == 0) goto L87
            r5 = r7
            X.MAJ r5 = (X.MAJ) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r0 = r5.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L5d
            if (r1 != r4) goto L95
            X.AbstractC09560e7.A00(r0)
        L23:
            r3 = r0
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L3e
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.H8X r0 = (X.H8X) r0
            X.Jyi r0 = r0.A00
            if (r0 != 0) goto L48
            java.lang.String r0 = "response"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3e:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L4d
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L48:
            X.3NX r3 = new X.3NX
            r3.<init>(r0)
        L4d:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto L86
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L8f
            X.0eB r0 = X.C0eB.A00
            X.8jk r3 = new X.8jk
            r3.<init>(r0)
            return r3
        L5d:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            r2.A06()
            java.lang.String r0 = "fan_club/content_preview_ids/"
            r2.A0B(r0)
            java.lang.Class<X.H8X> r1 = X.H8X.class
            java.lang.Class<X.IO5> r0 = X.IO5.class
            r2.A0R(r1, r0)
            X.1ON r1 = r2.A0N()
            r5.A00 = r4
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r3) goto L23
        L86:
            return r3
        L87:
            r0 = 42
            X.MAJ r5 = new X.MAJ
            r5.<init>(r6, r7, r3, r0)
            goto L15
        L8f:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L95:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0P(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0T(X.InterfaceC23621Ds r12, boolean r13, boolean r14) {
        /*
            r11 = this;
            r4 = 6
            boolean r0 = X.MAJ.A01(r12, r4)
            if (r0 == 0) goto Laa
            r2 = r12
            X.MAJ r2 = (X.MAJ) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Laa
            int r3 = r3 - r1
            r2.A00 = r3
        L15:
            java.lang.Object r0 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto Lb9
            X.AbstractC09560e7.A00(r0)
        L23:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L33
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto Lb3
            X.0eB r0 = X.C0eB.A00
            X.8jk r3 = new X.8jk
            r3.<init>(r0)
        L33:
            return r3
        L34:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r7 = r11.A00
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r13)
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36596089184913721(0x8203f300090939, double:3.2068523889380425E-306)
            long r5 = X.C18U.A01(r5, r7, r0)
            int r0 = (int) r5
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r14)
            r0 = -2
            X.1Ms r5 = new X.1Ms
            r5.<init>(r7, r0)
            java.lang.String r7 = "api/"
            java.lang.String r6 = "v1/"
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "categories_metadata/"
            r5.A06()
            r5.A03()
            java.lang.String r0 = X.AnonymousClass001.A0u(r7, r6, r1, r0)
            X.C14360o3.A07(r0)
            r5.A0E = r0
            java.lang.Class<X.EA9> r1 = X.EA9.class
            java.lang.Class<X.FSA> r0 = X.FSA.class
            r5.A0R(r1, r0)
            if (r10 == 0) goto L81
            boolean r1 = r10.booleanValue()
            java.lang.String r0 = "should_include_unconnected"
            r5.A0I(r0, r1)
        L81:
            int r1 = r8.intValue()
            java.lang.String r0 = "limit"
            r5.A0D(r0, r1)
            if (r9 == 0) goto L95
            boolean r1 = r9.booleanValue()
            java.lang.String r0 = "should_include_restricted_countries"
            r5.A0I(r0, r1)
        L95:
            X.1ON r1 = r5.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCategoriesMetadataResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCategoriesMetadataResponse>>"
            X.C14360o3.A0C(r1, r0)
            r2.A00 = r4
            r0 = 849052330(0x329b82aa, float:1.8103794E-8)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L23
            return r3
        Laa:
            r0 = 42
            X.MAJ r2 = new X.MAJ
            r2.<init>(r11, r12, r4, r0)
            goto L15
        Lb3:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        Lb9:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0T(X.1Ds, boolean, boolean):java.lang.Object");
    }

    public final void A0U(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        UserSession userSession = this.A00;
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        PandoGraphQLRequest A00 = A00(userSession.userId, false, false, false, false, false, true, false, false);
        A01.ATV(new C23351AXa(interfaceC16820sZ), new C48150LSz(interfaceC16660sJ), A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.EnumC31515Dsz r10, java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A02(X.Dsz, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r8 = this;
            r4 = 49
            boolean r0 = X.MAT.A03(r11, r4)
            if (r0 == 0) goto L9d
            r3 = r11
            X.MAT r3 = (X.MAT) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9d
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r0 = r3.A01
            X.1JX r5 = X.C1JX.A02
            int r1 = r3.A00
            r6 = 1
            if (r1 == 0) goto L35
            if (r1 != r6) goto Lac
            X.AbstractC09560e7.A00(r0)
        L24:
            r5 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L34
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto La6
            X.0eB r0 = X.C0eB.A00
            X.8jk r5 = new X.8jk
            r5.<init>(r0)
        L34:
            return r5
        L35:
            X.AbstractC09560e7.A00(r0)
            X.Be9 r7 = new X.Be9
            r7.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            r7.A07(r1, r0)
            java.lang.String r0 = "fan_club_id"
            r7.A07(r9, r0)
            X.2JO r2 = new X.2JO
            r2.<init>()
            java.lang.String r0 = "user_id"
            r2.A09(r10, r0)
            java.lang.String r1 = "BLOCK"
            java.lang.String r0 = "block_action_type"
            r2.A09(r1, r0)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            X.C14360o3.A07(r1)
            java.lang.String r0 = "user_args"
            r7.A05(r0, r1)
            X.2JM r4 = new X.2JM
            r4.<init>()
            java.lang.String r0 = "input"
            r4.A00(r7, r0)
            java.lang.Class<X.9Ym> r1 = X.C9Ym.class
            java.lang.String r0 = "FanClubBlockMember"
            X.42n r2 = new X.42n
            r2.<init>(r4, r1, r0, r6)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.42o r1 = new X.42o
            r1.<init>(r0)
            r1.A08(r2)
            java.lang.String r0 = "ads_viewer_context_policy"
            r1.A08 = r0
            X.1ON r1 = r1.A05()
            r3.A00 = r6
            r0 = 338680868(0x142fdc24, float:8.878657E-27)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r5) goto L24
            return r5
        L9d:
            r0 = 42
            X.MAT r3 = new X.MAT
            r3.<init>(r8, r11, r4, r0)
            goto L16
        La6:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        Lac:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A03(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.lang.String r18, java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            r17 = this;
            r5 = 13
            r6 = r20
            boolean r0 = X.MAJ.A01(r6, r5)
            r3 = r17
            if (r0 == 0) goto Lca
            r1 = r6
            X.MAJ r1 = (X.MAJ) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto Lca
            int r4 = r4 - r2
            r1.A00 = r4
        L1a:
            java.lang.Object r4 = r1.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L61
            if (r0 != r11) goto Ld9
            X.AbstractC09560e7.A00(r4)
        L28:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L57
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.3NX r4 = new X.3NX
            r4.<init>(r0)
        L3b:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L56
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Ld3
            X.8jk r4 = (X.C194848jk) r4
            java.lang.Object r0 = r4.A00
            X.5If r0 = (X.AbstractC115105If) r0
            java.lang.Throwable r0 = r0.A01()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
        L56:
            return r4
        L57:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L3b
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L61:
            X.AbstractC09560e7.A00(r4)
            X.0Jx r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            X.0CA r6 = r5.A02()
            X.C0CA.A00(r6, r4, r0)
            java.lang.String r0 = "ssc_id"
            r4 = r18
            X.C0CA.A00(r6, r4, r0)
            java.lang.String r0 = "target_thread_id"
            r4 = r19
            X.C0CA.A00(r6, r4, r0)
            X.2JM r5 = new X.2JM
            r5.<init>()
            X.2JM r4 = new X.2JM
            r4.<init>()
            java.lang.String r14 = "input"
            X.2JO r0 = r5.A00
            X.0CA r0 = r0.A02()
            r0.A0E(r6, r14)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r6 = X.AbstractC40511uK.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Qh4> r10 = X.Qh4.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "ShareSscXmaMutation"
            r13 = 8
            java.lang.String r15 = "xig_share_ssc_xma"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L28
            return r2
        Lca:
            r0 = 42
            X.MAJ r1 = new X.MAJ
            r1.<init>(r3, r6, r5, r0)
            goto L1a
        Ld3:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Ld9:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A04(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r8, java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r7 = this;
            r3 = 14
            boolean r0 = X.MAJ.A01(r10, r3)
            if (r0 == 0) goto L8c
            r4 = r10
            X.MAJ r4 = (X.MAJ) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A01
            X.1JX r5 = X.C1JX.A02
            int r1 = r4.A00
            r6 = 1
            if (r1 == 0) goto L35
            if (r1 != r6) goto L9a
            X.AbstractC09560e7.A00(r0)
        L24:
            r5 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L34
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L94
            X.0eB r0 = X.C0eB.A00
            X.8jk r5 = new X.8jk
            r5.<init>(r0)
        L34:
            return r5
        L35:
            X.AbstractC09560e7.A00(r0)
            X.Be9 r2 = new X.Be9
            r2.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            r2.A07(r1, r0)
            java.lang.String r0 = "fan_club_id"
            r2.A07(r8, r0)
            java.util.List r1 = java.util.Collections.singletonList(r9)
            X.C14360o3.A07(r1)
            java.lang.String r0 = "users"
            r2.A05(r0, r1)
            X.2JM r3 = new X.2JM
            r3.<init>()
            java.lang.String r0 = "input"
            r3.A00(r2, r0)
            java.lang.Class<X.9Yn> r1 = X.C211539Yn.class
            java.lang.String r0 = "FanClubUnBlockMember"
            X.42n r2 = new X.42n
            r2.<init>(r3, r1, r0, r6)
            com.instagram.common.session.UserSession r0 = r7.A00
            X.42o r1 = new X.42o
            r1.<init>(r0)
            r1.A08(r2)
            java.lang.String r0 = "ads_viewer_context_policy"
            r1.A08 = r0
            X.1ON r1 = r1.A05()
            r4.A00 = r6
            r0 = 1620689189(0x6099c125, float:8.863342E19)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r5) goto L24
            return r5
        L8c:
            r0 = 42
            X.MAJ r4 = new X.MAJ
            r4.<init>(r7, r10, r3, r0)
            goto L16
        L94:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L9a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A05(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(java.lang.String r18, java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            r17 = this;
            r5 = 19
            r6 = r20
            boolean r0 = X.C9CX.A00(r6, r5)
            r3 = r17
            if (r0 == 0) goto L9f
            r1 = r6
            X.9CX r1 = (X.C9CX) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L9f
            int r4 = r4 - r2
            r1.A00 = r4
        L1a:
            java.lang.Object r4 = r1.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L36
            if (r0 != r11) goto Lab
            X.AbstractC09560e7.A00(r4)
        L28:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto La8
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto La8
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L36:
            X.AbstractC09560e7.A00(r4)
            X.0Jx r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            X.0CA r6 = r5.A02()
            X.C0CA.A00(r6, r4, r0)
            java.lang.String r0 = "creator_igid"
            r4 = r18
            X.C0CA.A00(r6, r4, r0)
            java.lang.String r0 = "entry_point"
            r4 = r19
            X.C0CA.A00(r6, r4, r0)
            X.2JM r5 = new X.2JM
            r5.<init>()
            X.2JM r4 = new X.2JM
            r4.<init>()
            java.lang.String r14 = "input"
            X.2JO r0 = r5.A00
            X.0CA r0 = r0.A02()
            r0.A0E(r6, r14)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r6 = X.AbstractC40511uK.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.QgY> r10 = X.QgY.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "FanClubSetFanOnboardingEntryPoint"
            r13 = 8
            java.lang.String r15 = "xig_ig_fan_club_set_join_entry_point"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L28
            return r2
        L9f:
            r0 = 42
            X.9CX r1 = new X.9CX
            r1.<init>(r3, r6, r5, r0)
            goto L1a
        La8:
            X.0eB r2 = X.C0eB.A00
            return r2
        Lab:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A06(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(java.lang.String r10, java.lang.String r11, X.InterfaceC23621Ds r12, boolean r13) {
        /*
            r9 = this;
            r4 = 9
            boolean r0 = X.MAJ.A01(r12, r4)
            if (r0 == 0) goto L97
            r2 = r12
            X.MAJ r2 = (X.MAJ) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L97
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r0 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 != r4) goto La6
            X.AbstractC09560e7.A00(r0)
        L24:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L34
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto La0
            X.0eB r0 = X.C0eB.A00
            X.8jk r3 = new X.8jk
            r3.<init>(r0)
        L34:
            return r3
        L35:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r9.A00
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)
            r0 = -2
            X.1Ms r5 = new X.1Ms
            r5.<init>(r1, r0)
            java.lang.String r7 = "api/"
            java.lang.String r6 = "v1/"
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "members/"
            r5.A06()
            r5.A03()
            java.lang.String r0 = X.AnonymousClass001.A0u(r7, r6, r1, r0)
            X.C14360o3.A07(r0)
            r5.A0E = r0
            java.lang.Class<X.EAs> r1 = X.C32145EAs.class
            java.lang.Class<X.FSE> r0 = X.FSE.class
            r5.A0R(r1, r0)
            if (r10 == 0) goto L69
            java.lang.String r0 = "max_id"
            r5.A9s(r0, r10)
        L69:
            if (r11 == 0) goto L70
            java.lang.String r0 = "query"
            r5.A9s(r0, r11)
        L70:
            java.lang.String r1 = "should_include_unconnected"
            java.lang.String r0 = "false"
            r5.A9s(r1, r0)
            if (r8 == 0) goto L82
            boolean r1 = r8.booleanValue()
            java.lang.String r0 = "should_include_restricted_countries"
            r5.A0I(r0, r1)
        L82:
            X.1ON r1 = r5.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubMembersResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubMembersResponse>>"
            X.C14360o3.A0C(r1, r0)
            r2.A00 = r4
            r0 = 1240235265(0x49ec7d01, float:1937312.1)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L24
            return r3
        L97:
            r0 = 42
            X.MAJ r2 = new X.MAJ
            r2.<init>(r9, r12, r4, r0)
            goto L16
        La0:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        La6:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A07(java.lang.String, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0B(java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r4 = 16
            boolean r0 = X.C9CX.A00(r10, r4)
            if (r0 == 0) goto L73
            r3 = r10
            X.9CX r3 = (X.C9CX) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r0 = r3.A01
            X.1JX r5 = X.C1JX.A02
            int r1 = r3.A00
            r7 = 1
            if (r1 == 0) goto L35
            if (r1 != r7) goto L81
            X.AbstractC09560e7.A00(r0)
        L24:
            r5 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L34
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L7b
            X.0eB r0 = X.C0eB.A00
            X.8jk r5 = new X.8jk
            r5.<init>(r0)
        L34:
            return r5
        L35:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r8.A00
            r6 = 0
            r0 = -2
            X.1Ms r4 = new X.1Ms
            r4.<init>(r1, r0)
            java.lang.Integer r0 = X.C05F.A0N
            r4.A09(r0)
            r4.A03()
            java.lang.String r0 = "api/v1/fan_club/creators_subscribed_to/"
            r4.A0B(r0)
            java.lang.Class<X.EAk> r2 = X.C32137EAk.class
            java.lang.Class<X.FSC> r1 = X.FSC.class
            r0 = 0
            r4.A0P(r0, r2, r1, r6)
            if (r9 == 0) goto L5d
            java.lang.String r0 = "max_id"
            r4.A9s(r0, r9)
        L5d:
            X.1ON r2 = r4.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCreatorsSubscribedToResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCreatorsSubscribedToResponse>>"
            X.C14360o3.A0C(r2, r0)
            r3.A00 = r7
            r1 = 1561350127(0x5d104fef, float:6.4992455E17)
            r0 = 3
            java.lang.Object r0 = r2.A02(r3, r1, r0, r6)
            if (r0 != r5) goto L24
            return r5
        L73:
            r0 = 42
            X.9CX r3 = new X.9CX
            r3.<init>(r8, r10, r4, r0)
            goto L16
        L7b:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L81:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0B(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0C(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r4 = 8
            boolean r0 = X.MAJ.A01(r8, r4)
            if (r0 == 0) goto L6e
            r3 = r8
            X.MAJ r3 = (X.MAJ) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r0 = r3.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L35
            if (r1 != r5) goto L7c
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L34
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L76
            X.0eB r0 = X.C0eB.A00
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
        L34:
            return r4
        L35:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            r2.A06()
            r2.A03()
            java.lang.String r0 = "api/v1/fan_club/followed_creators_to_susbcribe_to/"
            r2.A0B(r0)
            java.lang.Class<X.EAl> r1 = X.C32138EAl.class
            java.lang.Class<X.FSD> r0 = X.FSD.class
            r2.A0R(r1, r0)
            if (r7 == 0) goto L59
            java.lang.String r0 = "max_id"
            r2.A9s(r0, r7)
        L59:
            X.1ON r1 = r2.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubFollowedCreatorsToSubscribeToResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubFollowedCreatorsToSubscribeToResponse>>"
            X.C14360o3.A0C(r1, r0)
            r3.A00 = r5
            r0 = 1327216684(0x4f1bb82c, float:2.6125384E9)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r4) goto L24
            return r4
        L6e:
            r0 = 42
            X.MAJ r3 = new X.MAJ
            r3.<init>(r6, r8, r4, r0)
            goto L16
        L76:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L7c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0C(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r0 == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0D(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 10
            boolean r0 = X.MAJ.A01(r8, r3)
            if (r0 == 0) goto L8d
            r4 = r8
            X.MAJ r4 = (X.MAJ) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r5 = 1
            if (r1 == 0) goto L5e
            if (r1 != r5) goto L9b
            X.AbstractC09560e7.A00(r0)
        L24:
            r3 = r0
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L3f
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.EAA r0 = (X.EAA) r0
            X.Muo r0 = r0.A00
            if (r0 != 0) goto L49
            java.lang.String r0 = "response"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3f:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L4e
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L49:
            X.3NX r3 = new X.3NX
            r3.<init>(r0)
        L4e:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto L8c
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L95
            X.0eB r0 = X.C0eB.A00
            X.8jk r3 = new X.8jk
            r3.<init>(r0)
            return r3
        L5e:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            r2.A06()
            java.lang.String r0 = "fan_club/subscription_next_steps_recommendations/"
            r2.A0B(r0)
            java.lang.String r0 = "entrypoint"
            r2.A9s(r0, r7)
            java.lang.Class<X.EAA> r1 = X.EAA.class
            java.lang.Class<X.FSF> r0 = X.FSF.class
            r2.A0R(r1, r0)
            X.1ON r1 = r2.A0N()
            r4.A00 = r5
            r0 = 1269204293(0x4ba68545, float:2.1826186E7)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L24
        L8c:
            return r3
        L8d:
            r0 = 42
            X.MAJ r4 = new X.MAJ
            r4.<init>(r6, r8, r3, r0)
            goto L16
        L95:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L9b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0D(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0E(java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            r18 = this;
            r5 = 16
            r6 = r20
            boolean r0 = X.MAJ.A01(r6, r5)
            r4 = r18
            if (r0 == 0) goto La1
            r2 = r6
            X.MAJ r2 = (X.MAJ) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto La1
            int r3 = r3 - r1
            r2.A00 = r3
        L1a:
            java.lang.Object r5 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L55
            if (r0 != r1) goto Lb0
            X.AbstractC09560e7.A00(r5)
        L28:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L4b
            X.3NX r5 = (X.C3NX) r5
            java.lang.Object r0 = r5.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.3NX r5 = new X.3NX
            r5.<init>(r0)
        L3b:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 != 0) goto L4a
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 == 0) goto Laa
            X.0eB r0 = X.C0eB.A00
            X.8jk r5 = new X.8jk
            r5.<init>(r0)
        L4a:
            return r5
        L4b:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto L3b
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L55:
            X.AbstractC09560e7.A00(r5)
            r13 = 0
            X.2JM r6 = new X.2JM
            r6.<init>()
            X.2JM r5 = new X.2JM
            r5.<init>()
            java.lang.String r0 = "id"
            r7 = r19
            r6.A04(r0, r7)
            r0 = 0
            if (r19 == 0) goto L6e
            r0 = 1
        L6e:
            X.C18C.A0E(r0)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r7 = X.AbstractC40511uK.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Qge> r11 = X.C59510Qge.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "FetchCustomBenefits"
            r12 = 0
            java.lang.String r16 = "xig_user_by_igid_v2"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r2.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r2)
            if (r5 != r3) goto L28
            return r3
        La1:
            r0 = 42
            X.MAJ r2 = new X.MAJ
            r2.<init>(r4, r6, r5, r0)
            goto L1a
        Laa:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lb0:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0E(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0G(java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            r17 = this;
            r5 = 18
            r6 = r19
            boolean r0 = X.MAJ.A01(r6, r5)
            r3 = r17
            if (r0 == 0) goto Laf
            r1 = r6
            X.MAJ r1 = (X.MAJ) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto Laf
            int r4 = r4 - r2
            r1.A00 = r4
        L1a:
            java.lang.Object r4 = r1.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L4d
            if (r0 != r11) goto Lbe
            X.AbstractC09560e7.A00(r4)
        L28:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L43
            X.0eB r0 = X.C0eB.A00
            X.3NX r4 = new X.3NX
            r4.<init>(r0)
        L33:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L42
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Lb8
            X.0eB r0 = X.C0eB.A00
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
        L42:
            return r4
        L43:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L33
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L4d:
            X.AbstractC09560e7.A00(r4)
            X.0Jx r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            X.0CA r6 = r5.A02()
            X.C0CA.A00(r6, r4, r0)
            java.lang.String r0 = "fan_club_id"
            r4 = r18
            X.C0CA.A00(r6, r4, r0)
            X.2JM r5 = new X.2JM
            r5.<init>()
            X.2JM r4 = new X.2JM
            r4.<init>()
            java.lang.String r14 = "input"
            X.2JO r0 = r5.A00
            X.0CA r0 = r0.A02()
            r0.A0E(r6, r14)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r6 = X.AbstractC40511uK.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Qgw> r10 = X.C59528Qgw.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "JoinWaitlistMutation"
            r13 = 8
            java.lang.String r15 = "xig_ig_fan_club_join_waitlist"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L28
            return r2
        Laf:
            r0 = 42
            X.MAJ r1 = new X.MAJ
            r1.<init>(r3, r6, r5, r0)
            goto L1a
        Lb8:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lbe:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0G(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0H(java.lang.String r17, X.InterfaceC23621Ds r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0H(java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0I(java.lang.String r19, X.InterfaceC23621Ds r20, boolean r21, boolean r22, boolean r23) {
        /*
            r18 = this;
            r5 = 17
            r6 = r20
            boolean r0 = X.MAJ.A01(r6, r5)
            r4 = r18
            if (r0 == 0) goto Lc5
            r2 = r6
            X.MAJ r2 = (X.MAJ) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lc5
            int r3 = r3 - r1
            r2.A00 = r3
        L1a:
            java.lang.Object r5 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L55
            if (r0 != r1) goto Ld4
            X.AbstractC09560e7.A00(r5)
        L28:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L4b
            X.3NX r5 = (X.C3NX) r5
            java.lang.Object r0 = r5.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.3NX r5 = new X.3NX
            r5.<init>(r0)
        L3b:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 != 0) goto L4a
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 == 0) goto Lce
            X.0eB r0 = X.C0eB.A00
            X.8jk r5 = new X.8jk
            r5.<init>(r0)
        L4a:
            return r5
        L4b:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto L3b
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L55:
            X.AbstractC09560e7.A00(r5)
            r13 = 0
            X.2JM r8 = new X.2JM
            r8.<init>()
            X.2JM r10 = new X.2JM
            r10.<init>()
            r12 = 0
            java.lang.String r9 = "should_fetch_early_pricing"
            r8.A01(r9)
            java.lang.String r7 = "should_fetch_member_count"
            r8.A01(r7)
            java.lang.String r6 = "fetch_exclusive_metrics"
            r8.A01(r6)
            java.lang.String r0 = "user_id"
            r11 = r19
            r8.A04(r0, r11)
            r5 = 0
            if (r19 == 0) goto L7e
            r5 = 1
        L7e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r21)
            r8.A02(r9, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r8.A02(r7, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            r8.A02(r6, r0)
            X.C18C.A0E(r5)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r7 = X.AbstractC40511uK.A00()
            java.util.Map r9 = r8.getParamsCopy()
            java.util.Map r10 = r10.getParamsCopy()
            java.lang.Class<X.QgV> r11 = X.QgV.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "FanClubInfo"
            java.lang.String r16 = "xig_user_by_igid_v2"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r2.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r2)
            if (r5 != r3) goto L28
            return r3
        Lc5:
            r0 = 42
            X.MAJ r2 = new X.MAJ
            r2.<init>(r4, r6, r5, r0)
            goto L1a
        Lce:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Ld4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0I(java.lang.String, X.1Ds, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0J(java.lang.String r16, X.InterfaceC23621Ds r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0J(java.lang.String, X.1Ds, boolean, boolean, boolean, boolean, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0L(java.util.List r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r4 = 12
            boolean r0 = X.MAJ.A01(r8, r4)
            if (r0 == 0) goto L6d
            r3 = r8
            X.MAJ r3 = (X.MAJ) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r0 = r3.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L35
            if (r1 != r5) goto L7b
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L34
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L75
            X.0eB r0 = X.C0eB.A00
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
        L34:
            return r4
        L35:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            r2.A05()
            java.lang.String r0 = "fan_club/replace_previews/"
            r2.A0B(r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r7)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "media_ids"
            r2.A9s(r0, r1)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r2.A0R(r1, r0)
            X.1ON r1 = r2.A0N()
            r3.A00 = r5
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r4) goto L24
            return r4
        L6d:
            r0 = 42
            X.MAJ r3 = new X.MAJ
            r3.<init>(r6, r8, r4, r0)
            goto L16
        L75:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L7b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0L(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0M(java.util.List r18, X.InterfaceC23621Ds r19) {
        /*
            r17 = this;
            r5 = 20
            r6 = r19
            boolean r0 = X.MAJ.A01(r6, r5)
            r3 = r17
            if (r0 == 0) goto Lb4
            r1 = r6
            X.MAJ r1 = (X.MAJ) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto Lb4
            int r4 = r4 - r2
            r1.A00 = r4
        L1a:
            java.lang.Object r4 = r1.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L55
            if (r0 != r11) goto Lc3
            X.AbstractC09560e7.A00(r4)
        L28:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L4b
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.3NX r4 = new X.3NX
            r4.<init>(r0)
        L3b:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Lbd
            X.0eB r0 = X.C0eB.A00
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
        L4a:
            return r4
        L4b:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L3b
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L55:
            X.AbstractC09560e7.A00(r4)
            X.Be9 r6 = new X.Be9
            r6.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            r6.A07(r4, r0)
            r0 = 37
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r4 = r18
            r6.A05(r0, r4)
            r12 = 0
            X.2JM r5 = new X.2JM
            r5.<init>()
            X.2JM r4 = new X.2JM
            r4.<init>()
            java.lang.String r14 = "input"
            r5.A00(r6, r14)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r6 = X.AbstractC40511uK.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Qh0> r10 = X.Qh0.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "SetCustomBenefits"
            r13 = 8
            java.lang.String r15 = "xig_ig_fan_club_set_custom_benefits"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L28
            return r2
        Lb4:
            r0 = 42
            X.MAJ r1 = new X.MAJ
            r1.<init>(r3, r6, r5, r0)
            goto L1a
        Lbd:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lc3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0M(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0N(java.util.List r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0N(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0Q(X.InterfaceC23621Ds r9) {
        /*
            r8 = this;
            r3 = 18
            boolean r0 = X.C9CX.A00(r9, r3)
            if (r0 == 0) goto L6c
            r4 = r9
            X.9CX r4 = (X.C9CX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A01
            X.1JX r6 = X.C1JX.A02
            int r1 = r4.A00
            r7 = 1
            if (r1 == 0) goto L35
            if (r1 != r7) goto L7a
            X.AbstractC09560e7.A00(r0)
        L24:
            r6 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L34
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L74
            X.0eB r0 = X.C0eB.A00
            X.8jk r6 = new X.8jk
            r6.<init>(r0)
        L34:
            return r6
        L35:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r8.A00
            r5 = 0
            r0 = -2
            X.1Ms r3 = new X.1Ms
            r3.<init>(r1, r0)
            java.lang.Integer r0 = X.C05F.A0N
            r3.A09(r0)
            r3.A03()
            java.lang.String r0 = "api/v1/fan_club/unconnected_creators_to_susbcribe_to/"
            r3.A0B(r0)
            java.lang.Class<X.EAB> r2 = X.EAB.class
            java.lang.Class<X.FSG> r1 = X.FSG.class
            r0 = 0
            r3.A0P(r0, r2, r1, r5)
            X.1ON r2 = r3.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubUnconnectedCreatorsToSubscribeToResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubUnconnectedCreatorsToSubscribeToResponse>>"
            X.C14360o3.A0C(r2, r0)
            r4.A00 = r7
            r1 = 1595688088(0x5f1c4498, float:1.1260292E19)
            r0 = 3
            java.lang.Object r0 = r2.A02(r4, r1, r0, r5)
            if (r0 != r6) goto L24
            return r6
        L6c:
            r0 = 42
            X.9CX r4 = new X.9CX
            r4.<init>(r8, r9, r3, r0)
            goto L16
        L74:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L7a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0Q(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0R(X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0R(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0S(X.InterfaceC23621Ds r18) {
        /*
            r17 = this;
            r5 = 19
            r6 = r18
            boolean r0 = X.MAJ.A01(r6, r5)
            r3 = r17
            if (r0 == 0) goto Lb0
            r1 = r6
            X.MAJ r1 = (X.MAJ) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto Lb0
            int r4 = r4 - r2
            r1.A00 = r4
        L1a:
            java.lang.Object r4 = r1.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L55
            if (r0 != r11) goto Lbf
            X.AbstractC09560e7.A00(r4)
        L28:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L4b
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.3NX r4 = new X.3NX
            r4.<init>(r0)
        L3b:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Lb9
            X.0eB r0 = X.C0eB.A00
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
        L4a:
            return r4
        L4b:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L3b
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L55:
            X.AbstractC09560e7.A00(r4)
            X.0Jx r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            X.0CA r6 = r5.A02()
            X.C0CA.A00(r6, r4, r0)
            X.2JM r5 = new X.2JM
            r5.<init>()
            X.2JM r4 = new X.2JM
            r4.<init>()
            java.lang.String r14 = "input"
            X.2JO r0 = r5.A00
            X.0CA r0 = r0.A02()
            r0.A0E(r6, r14)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r6 = X.AbstractC40511uK.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Qgy> r10 = X.C59530Qgy.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "SendSubscriptionNotification"
            r13 = 8
            java.lang.String r15 = "xig_ig_fan_club_send_subscription_notification"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L28
            return r2
        Lb0:
            r0 = 42
            X.MAJ r1 = new X.MAJ
            r1.<init>(r3, r6, r5, r0)
            goto L1a
        Lb9:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lbf:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0S(X.1Ds):java.lang.Object");
    }
}
