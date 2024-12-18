package com.instagram.friendmap.data;

import X.AbstractC40691uc;
import X.C40701ud;
import com.instagram.common.session.UserSession;

/* loaded from: classes2.dex */
public final class FriendMapGraphQLImpl {
    public final C40701ud A00;
    public final UserSession A01;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C45044JwZ r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A00(X.JwZ, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C45044JwZ r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A01(X.JwZ, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C92984Et r20, X.EnumC46191KcT r21, X.InterfaceC23621Ds r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A02(X.4Et, X.KcT, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.EnumC92974Es r20, java.util.Set r21, java.util.Set r22, X.InterfaceC23621Ds r23) {
        /*
            r19 = this;
            r4 = 47
            r5 = r23
            boolean r0 = X.MAJ.A01(r5, r4)
            r6 = r19
            if (r0 == 0) goto Lba
            r2 = r5
            X.MAJ r2 = (X.MAJ) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lba
            int r3 = r3 - r1
            r2.A00 = r3
        L1a:
            java.lang.Object r1 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r13 = 1
            if (r0 == 0) goto L5b
            if (r0 != r13) goto Lc3
            X.AbstractC09560e7.A00(r1)
        L28:
            boolean r0 = r1 instanceof X.C3NX
            r3 = 0
            if (r0 == 0) goto L5a
            X.3NX r1 = (X.C3NX) r1
            if (r1 == 0) goto L5a
            java.lang.Object r0 = r1.A00
            X.435 r0 = (X.AnonymousClass435) r0
            if (r0 == 0) goto L5a
            java.lang.Object r5 = r0.A01
            X.2JS r5 = (X.C2JS) r5
            if (r5 == 0) goto L5a
            java.lang.Class<X.Qhm> r4 = X.C59574Qhm.class
            r2 = 0
            r0 = 1065(0x429, float:1.492E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 1010177151(0x3c36147f, float:0.011113285)
            X.2JS r1 = r5.getRequiredTreeField(r2, r1, r4, r0)
            if (r1 == 0) goto L5a
            java.lang.String r0 = "num_users"
            int r0 = r1.getRequiredIntField(r2, r0)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
        L5a:
            return r3
        L5b:
            X.AbstractC09560e7.A00(r1)
            X.1ud r1 = r6.A00
            r14 = 0
            X.2JM r6 = new X.2JM
            r6.<init>()
            X.2JM r7 = new X.2JM
            r7.<init>()
            X.2JO r5 = new X.2JO
            r5.<init>()
            r0 = r20
            java.lang.String r4 = r0.A00
            java.lang.String r0 = "list_type"
            r5.A09(r4, r0)
            java.util.List r4 = X.AbstractC001800i.A0a(r21)
            java.lang.String r0 = "add_user_ids"
            r5.A05(r0, r4)
            java.util.List r4 = X.AbstractC001800i.A0a(r22)
            java.lang.String r0 = "remove_user_ids"
            r5.A05(r0, r4)
            java.lang.String r0 = "data"
            r6.A00(r5, r0)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r8 = X.AbstractC40511uK.A00()
            java.util.Map r10 = r6.getParamsCopy()
            java.util.Map r11 = r7.getParamsCopy()
            java.lang.Class<X.Qhn> r12 = X.C59575Qhn.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "CreateOrUpdateAudienceListMutation"
            r15 = 0
            java.lang.String r17 = "xdt_update_presence_audience_list_members"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.A00 = r13
            java.lang.Object r1 = r1.A04(r7, r2)
            if (r1 != r3) goto L28
            return r3
        Lba:
            r0 = 42
            X.MAJ r2 = new X.MAJ
            r2.<init>(r6, r5, r4, r0)
            goto L1a
        Lc3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A03(X.4Es, java.util.Set, java.util.Set, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.EnumC92974Es r22, X.InterfaceC23621Ds r23) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A04(X.4Es, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r10, java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r9 = this;
            r3 = 45
            boolean r0 = X.MAJ.A01(r12, r3)
            if (r0 == 0) goto Lb6
            r5 = r12
            X.MAJ r5 = (X.MAJ) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb6
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r7 = X.C1JX.A02
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L44
            if (r0 != r6) goto Lbf
            X.AbstractC09560e7.A00(r1)
        L24:
            boolean r0 = r1 instanceof X.C3NX
            r7 = 0
            if (r0 == 0) goto L43
            X.3NX r1 = (X.C3NX) r1
            if (r1 == 0) goto L43
            java.lang.Object r0 = r1.A00
            X.435 r0 = (X.AnonymousClass435) r0
            if (r0 == 0) goto L43
            java.lang.Object r0 = r0.A01
            X.Unl r0 = (X.C67547Unl) r0
            if (r0 == 0) goto L43
            X.Unk r0 = r0.A0E()
            if (r0 == 0) goto L43
            X.Umu r7 = r0.A0E()
        L43:
            return r7
        L44:
            X.AbstractC09560e7.A00(r1)
            X.1ud r4 = r9.A00
            X.2JM r8 = new X.2JM
            r8.<init>()
            X.2JM r3 = new X.2JM
            r3.<init>()
            if (r10 != 0) goto L57
            java.lang.String r10 = ""
        L57:
            java.lang.String r0 = "query"
            r8.A04(r0, r10)
            java.lang.String r1 = "friend_map"
            r0 = 62
            java.lang.String r0 = X.MSV.A00(r0)
            r8.A04(r0, r1)
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r8.A01(r0)
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r8.A01(r0)
            r0 = 25
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r8.A01(r0)
            X.0Jx r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r0 = 50
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.String r0 = "limit"
            X.0CA r2 = r2.A02()
            X.C0CA.A00(r2, r1, r0)
            java.lang.String r0 = "next_max_id"
            X.C0CA.A00(r2, r11, r0)
            java.lang.String r1 = "request_data"
            X.2JO r0 = r8.A00
            X.0CA r0 = r0.A02()
            r0.A0E(r2, r1)
            java.lang.String r0 = "max_id"
            r8.A04(r0, r11)
            com.facebook.pando.PandoGraphQLRequest r0 = X.AbstractC35855FsV.A00(r8, r3, r6, r6)
            r5.A00 = r6
            java.lang.Object r1 = r4.A04(r0, r5)
            if (r1 != r7) goto L24
            return r7
        Lb6:
            r0 = 42
            X.MAJ r5 = new X.MAJ
            r5.<init>(r9, r12, r3, r0)
            goto L16
        Lbf:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A05(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            r17 = this;
            r4 = 44
            r5 = r19
            boolean r0 = X.MAJ.A01(r5, r4)
            r6 = r17
            if (r0 == 0) goto L76
            r2 = r5
            X.MAJ r2 = (X.MAJ) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L76
            int r3 = r3 - r1
            r2.A00 = r3
        L1a:
            java.lang.Object r1 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r11 = 1
            if (r0 == 0) goto L2f
            if (r0 != r11) goto L7e
            X.AbstractC09560e7.A00(r1)
        L28:
            boolean r0 = r1 instanceof X.C3NX
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f:
            X.AbstractC09560e7.A00(r1)
            X.1ud r1 = r6.A00
            r12 = 0
            X.2JM r5 = new X.2JM
            r5.<init>()
            X.2JM r4 = new X.2JM
            r4.<init>()
            java.lang.String r0 = "location_id"
            r6 = r18
            r5.A04(r0, r6)
            r0 = 0
            if (r18 == 0) goto L4a
            r0 = 1
        L4a:
            X.C18C.A0E(r0)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r6 = X.AbstractC40511uK.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Ued> r10 = X.C66992Ued.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "DeleteFriendMapHiddenLocationMutation"
            r13 = 0
            java.lang.String r15 = "xdt_delete_friend_map_hidden_location"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.A00 = r11
            java.lang.Object r1 = r1.A04(r5, r2)
            if (r1 != r3) goto L28
            return r3
        L76:
            r0 = 42
            X.MAJ r2 = new X.MAJ
            r2.<init>(r6, r5, r4, r0)
            goto L1a
        L7e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A06(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(java.util.List r19, X.InterfaceC23621Ds r20) {
        /*
            r18 = this;
            r4 = 46
            r5 = r20
            boolean r0 = X.MAJ.A01(r5, r4)
            r6 = r18
            if (r0 == 0) goto L79
            r2 = r5
            X.MAJ r2 = (X.MAJ) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L79
            int r3 = r3 - r1
            r2.A00 = r3
        L1a:
            java.lang.Object r1 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r12 = 1
            if (r0 == 0) goto L2f
            if (r0 != r12) goto L81
            X.AbstractC09560e7.A00(r1)
        L28:
            boolean r0 = r1 instanceof X.C3NX
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f:
            X.AbstractC09560e7.A00(r1)
            X.1ud r1 = r6.A00
            r13 = 0
            X.2JM r6 = new X.2JM
            r6.<init>()
            X.2JM r5 = new X.2JM
            r5.<init>()
            X.2JO r4 = new X.2JO
            r4.<init>()
            java.lang.String r0 = "presence_ids"
            r7 = r19
            r4.A05(r0, r7)
            java.lang.String r0 = "data"
            r6.A00(r4, r0)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r7 = X.AbstractC40511uK.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Uem> r11 = X.C67001Uem.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "UnlockPresencesMutation"
            r14 = 0
            java.lang.String r16 = "xdt_unlock_presences"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.A00 = r12
            java.lang.Object r1 = r1.A04(r6, r2)
            if (r1 != r3) goto L28
            return r3
        L79:
            r0 = 42
            X.MAJ r2 = new X.MAJ
            r2.<init>(r6, r5, r4, r0)
            goto L1a
        L81:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A07(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(X.InterfaceC23621Ds r19) {
        /*
            r18 = this;
            r4 = 21
            r5 = r19
            boolean r0 = X.C9CX.A00(r5, r4)
            r6 = r18
            if (r0 == 0) goto L95
            r3 = r5
            X.9CX r3 = (X.C9CX) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r1 = r3.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L4a
            if (r0 != r2) goto L9e
            X.AbstractC09560e7.A00(r1)
        L28:
            boolean r0 = r1 instanceof X.C3NX
            r4 = 0
            if (r0 == 0) goto L49
            X.3NX r1 = (X.C3NX) r1
            if (r1 == 0) goto L49
            java.lang.Object r0 = r1.A00
            X.435 r0 = (X.AnonymousClass435) r0
            if (r0 == 0) goto L49
            java.lang.Object r5 = r0.A01
            X.2JS r5 = (X.C2JS) r5
            if (r5 == 0) goto L49
            java.lang.Class<X.QiE> r3 = X.C59589QiE.class
            r2 = 0
            java.lang.String r1 = "xdt_get_all_presence_points(data:$data)"
            r0 = -1043750081(0xffffffffc1c9a33f, float:-25.20471)
            X.2JS r4 = r5.getRequiredTreeField(r2, r1, r3, r0)
        L49:
            return r4
        L4a:
            X.AbstractC09560e7.A00(r1)
            X.1ud r1 = r6.A00
            r13 = 0
            X.2JM r9 = new X.2JM
            r9.<init>()
            X.2JM r8 = new X.2JM
            r8.<init>()
            X.0Jx r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r6 = "data"
            X.2JO r0 = r9.A00
            X.0CA r5 = r0.A02()
            X.0CA r0 = r7.A02()
            r5.A0E(r0, r6)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r7 = X.AbstractC40511uK.A00()
            java.util.Map r9 = r9.getParamsCopy()
            java.util.Map r10 = r8.getParamsCopy()
            java.lang.Class<X.QiF> r11 = X.C59590QiF.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "GetAllPresencePoints"
            r12 = 0
            java.lang.String r16 = "xdt_get_all_presence_points"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.A00 = r2
            java.lang.Object r1 = r1.A04(r6, r3)
            if (r1 != r4) goto L28
            return r4
        L95:
            r0 = 42
            X.9CX r3 = new X.9CX
            r3.<init>(r6, r5, r4, r0)
            goto L1a
        L9e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A08(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(X.InterfaceC23621Ds r20) {
        /*
            r19 = this;
            r3 = 37
            r6 = r20
            boolean r0 = X.C9CY.A00(r6, r3)
            r5 = r19
            if (r0 == 0) goto La7
            r4 = r6
            X.9CY r4 = (X.C9CY) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r4.A00 = r2
        L1a:
            java.lang.Object r2 = r4.A02
            X.1JX r0 = X.C1JX.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L66
            if (r1 != r3) goto Lbf
            java.lang.Object r5 = r4.A01
            com.instagram.friendmap.data.FriendMapGraphQLImpl r5 = (com.instagram.friendmap.data.FriendMapGraphQLImpl) r5
            X.AbstractC09560e7.A00(r2)
        L2c:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto Lae
            X.3NX r2 = (X.C3NX) r2
            if (r2 == 0) goto Lae
            java.lang.Object r0 = r2.A00
            X.435 r0 = (X.AnonymousClass435) r0
            if (r0 == 0) goto Lae
            java.lang.Object r4 = r0.A01
            X.2JS r4 = (X.C2JS) r4
            if (r4 == 0) goto Lae
            java.lang.Class<X.QiK> r2 = X.C59595QiK.class
            r3 = 0
            r0 = 394(0x18a, float:5.52E-43)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 586611601(0x22f6fb91, float:6.694479E-18)
            X.2JS r2 = r4.getOptionalTreeField(r3, r1, r2, r0)
            if (r2 == 0) goto Lae
            java.lang.Class<X.Qi8> r1 = X.Qi8.class
            r0 = -1620690398(0xffffffff9f663a22, float:-4.875248E-20)
            X.2JS r1 = r2.reinterpretRequired(r3, r1, r0)
            X.Qi8 r1 = (X.Qi8) r1
            if (r1 == 0) goto Lae
            com.instagram.common.session.UserSession r0 = r5.A01
            X.4Et r0 = X.LLE.A05(r0, r1)
            return r0
        L66:
            X.AbstractC09560e7.A00(r2)
            X.1ud r2 = r5.A00
            r14 = 0
            X.2JM r7 = new X.2JM
            r7.<init>()
            X.2JM r6 = new X.2JM
            r6.<init>()
            X.2JQ r1 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r8 = X.AbstractC40511uK.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.QiL> r12 = X.C59596QiL.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "GetFriendMapSettingsQuery"
            r13 = 0
            r1 = 394(0x18a, float:5.52E-43)
            java.lang.String r17 = X.AbstractC58317Pt9.A00(r1)
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.A01 = r5
            r4.A00 = r3
            java.lang.Object r2 = r2.A04(r7, r4)
            if (r2 != r0) goto L2c
            return r0
        La7:
            X.9CY r4 = new X.9CY
            r4.<init>(r5, r6, r3)
            goto L1a
        Lae:
            X.4Es r1 = X.EnumC92974Es.A0A
            r7 = 0
            r4 = 0
            X.0sl r2 = X.C16930sl.A00
            X.4Et r0 = new X.4Et
            r3 = r2
            r5 = r4
            r6 = r4
            r9 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            return r0
        Lbf:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A09(X.1Ds):java.lang.Object");
    }

    public FriendMapGraphQLImpl(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AbstractC40691uc.A01(userSession);
    }
}
