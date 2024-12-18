package com.instagram.wonderwall.api;

import X.AbstractC40691uc;
import X.C14360o3;
import X.C194848jk;
import X.C28154Cb1;
import X.C40701ud;
import X.O9M;
import X.PW6;
import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallText;

/* loaded from: classes9.dex */
public final class WallApiGraphQLImpl {
    public final UserSession A00;
    public final C40701ud A01;

    public WallApiGraphQLImpl(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC40691uc.A01(userSession);
    }

    public static PW6 A00(int i) {
        WallText.Res res = new WallText.Res(i, new String[0]);
        if (!(!res.equals(C28154Cb1.A00))) {
            res = new WallText.Res(2131976978, new String[0]);
        }
        return new PW6(new C194848jk(new O9M(res, false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C51740MtP r19, java.lang.String r20, X.InterfaceC23621Ds r21) {
        /*
            r18 = this;
            r3 = 48
            r5 = r21
            boolean r0 = X.PX4.A02(r5, r3)
            r6 = r18
            if (r0 == 0) goto L8c
            r4 = r5
            X.PX4 r4 = (X.PX4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r4.A00 = r2
        L1a:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r12 = 1
            if (r0 == 0) goto L2f
            if (r0 != r12) goto L91
            X.AbstractC09560e7.A00(r1)
        L28:
            boolean r0 = r1 instanceof X.C3NX
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f:
            X.AbstractC09560e7.A00(r1)
            X.1ud r2 = r6.A01
            r13 = 0
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r8 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "post_id"
            r1 = r20
            boolean r7 = X.AbstractC43594JPz.A1X(r6, r0, r1)
            r14 = 0
            r9 = r19
            X.C14360o3.A0B(r9, r14)
            X.0Jx r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "emoji"
            X.0CA r5 = X.AbstractC25227BEk.A0T(r5, r1, r0)
            boolean r0 = r9.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_reacted"
            X.C0CA.A00(r5, r1, r0)
            java.lang.String r1 = "data"
            X.2JO r0 = r6.A00
            X.AbstractC31173DnH.A1M(r5, r0, r1)
            X.1uJ r7 = X.AbstractC25227BEk.A0U(r7)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r8.getParamsCopy()
            java.lang.Class<X.QzQ> r11 = X.C60438QzQ.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "PostWallReactionMutation"
            java.lang.String r16 = "xdt_react_to_wall_post"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.A00 = r12
            java.lang.Object r1 = r2.A04(r6, r4)
            if (r1 != r3) goto L28
            return r3
        L8c:
            X.PX4 r4 = X.PX4.A00(r6, r5, r3)
            goto L1a
        L91:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.api.WallApiGraphQLImpl.A01(X.MtP, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d9 A[Catch: PW6 -> 0x0137, TryCatch #0 {PW6 -> 0x0137, blocks: (B:11:0x00d0, B:12:0x00d3, B:14:0x00d9, B:16:0x00dd, B:17:0x0132, B:18:0x0136, B:20:0x00ec, B:22:0x00f8, B:24:0x0106, B:26:0x0113, B:28:0x0125, B:30:0x012a, B:35:0x0040, B:37:0x0056, B:38:0x0068, B:39:0x006d, B:41:0x00a9, B:45:0x0086, B:47:0x008a, B:48:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0125 A[Catch: PW6 -> 0x0137, TryCatch #0 {PW6 -> 0x0137, blocks: (B:11:0x00d0, B:12:0x00d3, B:14:0x00d9, B:16:0x00dd, B:17:0x0132, B:18:0x0136, B:20:0x00ec, B:22:0x00f8, B:24:0x0106, B:26:0x0113, B:28:0x0125, B:30:0x012a, B:35:0x0040, B:37:0x0056, B:38:0x0068, B:39:0x006d, B:41:0x00a9, B:45:0x0086, B:47:0x008a, B:48:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.wonderwall.model.WallPostItem r19, java.lang.String r20, X.InterfaceC23621Ds r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.api.WallApiGraphQLImpl.A02(com.instagram.wonderwall.model.WallPostItem, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            r17 = this;
            r4 = 47
            r5 = r19
            boolean r0 = X.PX4.A02(r5, r4)
            r6 = r17
            if (r0 == 0) goto L6b
            r3 = r5
            X.PX4 r3 = (X.PX4) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r1 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r11 = 1
            if (r0 == 0) goto L2f
            if (r0 != r11) goto L70
            X.AbstractC09560e7.A00(r1)
        L28:
            boolean r0 = r1 instanceof X.C3NX
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f:
            X.AbstractC09560e7.A00(r1)
            X.1ud r1 = r6.A01
            r12 = 0
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.2JM r4 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "post_id"
            r6 = r18
            boolean r0 = X.AbstractC43594JPz.A1X(r5, r0, r6)
            X.1uJ r6 = X.AbstractC25227BEk.A0U(r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.QzH> r10 = X.C60429QzH.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "DeleteWallPostMutation"
            r13 = 0
            java.lang.String r15 = "xdt_delete_wall_post"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.A00 = r11
            java.lang.Object r1 = r1.A04(r5, r3)
            if (r1 != r2) goto L28
            return r2
        L6b:
            X.PX4 r3 = X.PX4.A00(r6, r5, r4)
            goto L1a
        L70:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.api.WallApiGraphQLImpl.A03(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008b A[Catch: PW6 -> 0x0155, TryCatch #0 {PW6 -> 0x0155, blocks: (B:11:0x0082, B:12:0x0085, B:14:0x008b, B:16:0x008f, B:17:0x0148, B:38:0x0154, B:20:0x009e, B:22:0x00aa, B:24:0x00b8, B:25:0x00cd, B:27:0x00d3, B:30:0x0129, B:35:0x012d, B:37:0x014d, B:42:0x0039), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.api.WallApiGraphQLImpl.A04(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[Catch: PW6 -> 0x015f, TryCatch #0 {PW6 -> 0x015f, blocks: (B:11:0x0075, B:12:0x0078, B:14:0x007e, B:16:0x0082, B:17:0x0152, B:41:0x015e, B:20:0x0091, B:22:0x009d, B:24:0x00ab, B:27:0x00d9, B:28:0x0122, B:30:0x0128, B:33:0x0144, B:38:0x0148, B:40:0x0157, B:45:0x0039, B:47:0x004e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.api.WallApiGraphQLImpl.A05(java.lang.String, X.1Ds):java.lang.Object");
    }
}
