package com.instagram.quicksnap.data.api;

import X.AbstractC40691uc;
import X.C14360o3;
import X.C191098d7;
import X.C40701ud;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class QuickSnapApi {
    public final UserSession A00;
    public final C40701ud A01;
    public final C191098d7 A02;

    public QuickSnapApi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC40691uc.A01(userSession);
        this.A02 = new C191098d7(userSession);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r17, java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            r16 = this;
            r4 = 7
            r5 = r19
            boolean r0 = X.PXD.A03(r5, r4)
            r6 = r16
            if (r0 == 0) goto La1
            r2 = r5
            X.PXD r2 = (X.PXD) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto La1
            int r3 = r3 - r1
            r2.A00 = r3
        L19:
            java.lang.Object r1 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r10 = 1
            if (r0 == 0) goto L49
            if (r0 != r10) goto Lba
            X.AbstractC09560e7.A00(r1)
        L27:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L3f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
        L36:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto Laa
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            return r0
        L3f:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L36
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L49:
            X.AbstractC09560e7.A00(r1)
            X.1ud r1 = r6.A01
            r11 = 0
            X.2JM r7 = new X.2JM
            r7.<init>()
            X.2JM r6 = new X.2JM
            r6.<init>()
            X.0Jx r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "media_id"
            X.0CA r5 = r4.A02()
            r4 = r17
            X.C0CA.A00(r5, r4, r0)
            java.lang.String r0 = "emoji_reaction_unicode"
            r4 = r18
            X.C0CA.A00(r5, r4, r0)
            java.lang.String r4 = "input"
            X.2JO r0 = r7.A00
            X.0CA r0 = r0.A02()
            r0.A0E(r5, r4)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r5 = X.AbstractC40511uK.A00()
            java.util.Map r7 = r7.getParamsCopy()
            java.util.Map r8 = r6.getParamsCopy()
            java.lang.Class<X.QvR> r9 = X.C60191QvR.class
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.String r6 = "IGQuickSnapSendEmojiReactionMutation"
            r12 = 0
            java.lang.String r14 = "xdt_send_quick_snap_emoji_reaction"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A00 = r10
            java.lang.Object r1 = r1.A04(r4, r2)
            if (r1 != r3) goto L27
            return r3
        La1:
            r0 = 42
            X.PXD r2 = new X.PXD
            r2.<init>(r6, r5, r4, r0)
            goto L19
        Laa:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lb4
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Lb4:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lba:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A00(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r4 = 5
            boolean r0 = X.PXD.A03(r9, r4)
            if (r0 == 0) goto L8c
            r3 = r9
            X.PXD r3 = (X.PXD) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r1 = r3.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r3.A00
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L55
            if (r0 != r4) goto L94
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L4b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
        L33:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L46
            X.3NX r1 = (X.C3NX) r1
            if (r1 == 0) goto L46
            java.lang.Object r0 = r1.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r4) goto L46
            r6 = 1
        L46:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L4b:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L33
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L55:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            r2.A05()
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            r0 = 2696(0xa88, float:3.778E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.A0L(r0, r1)
            java.lang.String r0 = "media_id"
            r2.A9s(r0, r8)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r2.A0R(r1, r0)
            X.1ON r1 = r2.A0N()
            r3.A00 = r4
            r0 = 1961489254(0x74e9f366, float:1.4828392E32)
            java.lang.Object r1 = r1.A00(r0, r3)
            if (r1 != r5) goto L24
            return r5
        L8c:
            r0 = 42
            X.PXD r3 = new X.PXD
            r3.<init>(r7, r9, r4, r0)
            goto L15
        L94:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A01(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r17, X.InterfaceC23621Ds r18) {
        /*
            r16 = this;
            r4 = 6
            r5 = r18
            boolean r0 = X.PXD.A03(r5, r4)
            r6 = r16
            if (r0 == 0) goto L9a
            r2 = r5
            X.PXD r2 = (X.PXD) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L9a
            int r3 = r3 - r1
            r2.A00 = r3
        L19:
            java.lang.Object r1 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r10 = 1
            if (r0 == 0) goto L49
            if (r0 != r10) goto Lb3
            X.AbstractC09560e7.A00(r1)
        L27:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L3f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
        L36:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto La3
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            return r0
        L3f:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L36
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L49:
            X.AbstractC09560e7.A00(r1)
            X.1ud r1 = r6.A01
            r11 = 0
            X.2JM r7 = new X.2JM
            r7.<init>()
            X.2JM r6 = new X.2JM
            r6.<init>()
            X.0Jx r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "target_user_id"
            X.0CA r5 = r4.A02()
            r4 = r17
            X.C0CA.A00(r5, r4, r0)
            java.lang.String r4 = "input"
            X.2JO r0 = r7.A00
            X.0CA r0 = r0.A02()
            r0.A0E(r5, r4)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r5 = X.AbstractC40511uK.A00()
            java.util.Map r7 = r7.getParamsCopy()
            java.util.Map r8 = r6.getParamsCopy()
            java.lang.Class<X.QvN> r9 = X.C60187QvN.class
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.String r6 = "IGQuickSnapMuteUserMutation"
            r12 = 0
            java.lang.String r14 = "xdt_mute_quick_snap_user"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A00 = r10
            java.lang.Object r1 = r1.A04(r4, r2)
            if (r1 != r3) goto L27
            return r3
        L9a:
            r0 = 42
            X.PXD r2 = new X.PXD
            r2.<init>(r6, r5, r4, r0)
            goto L19
        La3:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lad
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Lad:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lb3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A03(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0212  */
    /* JADX WARN: Type inference failed for: r16v1, types: [X.OEy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r27, X.InterfaceC23621Ds r28) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A02(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.util.List r20, X.InterfaceC23621Ds r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A04(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.InterfaceC23621Ds r22) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A05(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A06(X.1Ds):java.lang.Object");
    }
}
