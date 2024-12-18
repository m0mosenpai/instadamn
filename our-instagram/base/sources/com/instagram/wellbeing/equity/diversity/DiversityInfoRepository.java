package com.instagram.wellbeing.equity.diversity;

import X.AbstractC166987dD;
import X.AnonymousClass194;
import X.C14360o3;
import X.C19L;
import X.C57517Pfr;
import X.OHc;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes9.dex */
public final class DiversityInfoRepository {
    public final UserSession A00;
    public final Map A01;
    public final C19L A02 = AnonymousClass194.A01();
    public final OHc A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C2JO r14, com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r15, X.InterfaceC23621Ds r16) {
        /*
            r1 = r15
            r5 = 31
            r6 = r16
            boolean r0 = X.C57146PWy.A01(r6, r5)
            if (r0 == 0) goto Lcc
            r3 = r6
            X.PWy r3 = (X.C57146PWy) r3
            int r4 = r3.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto Lcc
            int r4 = r4 - r2
            r3.A00 = r4
        L19:
            java.lang.Object r4 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r11 = 1
            if (r0 == 0) goto L89
            if (r0 != r11) goto Ld8
            java.lang.Object r1 = r3.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r1 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r1
            X.AbstractC09560e7.A00(r4)
        L2b:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            java.lang.String r5 = "update_diversity_info"
            if (r0 == 0) goto L80
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r6 = r4.A00
            X.435 r6 = (X.AnonymousClass435) r6
            X.OHc r4 = r1.A03
            com.instagram.common.session.UserSession r0 = r1.A00
            java.lang.String r0 = r0.userId
            long r2 = java.lang.Long.parseLong(r0)
            r4.A00(r2, r5)
            java.lang.Object r4 = r6.A01
            X.2JS r4 = (X.C2JS) r4
            if (r4 == 0) goto L7e
            java.lang.Class<X.QjK> r3 = X.C59640QjK.class
            java.lang.String r2 = "ig_shop_diversity_profile_update(data:$input)"
            r0 = -922171226(0xffffffffc908c8a6, float:-560266.4)
            X.2JS r3 = r4.A03(r3, r2, r0)
            if (r3 == 0) goto L7e
            java.lang.Class<X.QjO> r2 = X.C59644QjO.class
            r0 = -989627154(0xffffffffc5037cee, float:-2103.808)
            X.2JS r0 = r3.A01(r2, r0)
        L62:
            X.3NX r4 = X.AbstractC25225BEi.A0z(r0)
        L66:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L7d
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Ld3
            X.5If r3 = X.MSX.A0E(r4)
            X.OHc r2 = r1.A03
            com.instagram.common.session.UserSession r0 = r1.A00
            A03(r3, r0, r2, r5)
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L7d:
            return r4
        L7e:
            r0 = 0
            goto L62
        L80:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L66
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L89:
            X.AbstractC09560e7.A00(r4)
            r12 = 0
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.2JM r4 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "input"
            r5.A00(r14, r0)
            boolean r0 = X.AbstractC167007dF.A1W(r14)
            X.1uJ r6 = X.AbstractC25227BEk.A0U(r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.QjL> r10 = X.C59641QjL.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "DiverseOwnedBusinessMutate"
            r13 = 0
            java.lang.String r15 = "ig_shop_diversity_profile_update"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r1.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r3.A01 = r1
            r3.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r3)
            if (r4 != r2) goto L2b
            return r2
        Lcc:
            X.PWy r3 = new X.PWy
            r3.<init>(r15, r6, r5)
            goto L19
        Ld3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A00(X.2JO, com.instagram.wellbeing.equity.diversity.DiversityInfoRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r22, java.lang.String r23, X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A01(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r15, X.InterfaceC23621Ds r16) {
        /*
            r4 = 30
            r5 = r16
            boolean r0 = X.C57146PWy.A01(r5, r4)
            if (r0 == 0) goto Lc0
            r2 = r5
            X.PWy r2 = (X.C57146PWy) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lc0
            int r3 = r3 - r1
            r2.A00 = r3
        L18:
            java.lang.Object r3 = r2.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L86
            if (r0 != r9) goto Lcc
            java.lang.Object r15 = r2.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r15 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r15
            X.AbstractC09560e7.A00(r3)
        L2a:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            java.lang.String r5 = "delete_diversity_info"
            if (r0 == 0) goto L7d
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r3 = r3.A00
            X.435 r3 = (X.AnonymousClass435) r3
            X.OHc r2 = r15.A03
            com.instagram.common.session.UserSession r0 = r15.A00
            java.lang.String r0 = r0.userId
            long r0 = java.lang.Long.parseLong(r0)
            r2.A00(r0, r5)
            java.lang.Object r4 = r3.A01
            X.2JS r4 = (X.C2JS) r4
            if (r4 == 0) goto L7b
            java.lang.Class<X.QjI> r3 = X.C59638QjI.class
            r2 = 0
            java.lang.String r1 = "ig_shop_diversity_profile_delete"
            r0 = -270936568(0xffffffffefd9d608, float:-1.3483399E29)
            X.2JS r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L7b
            java.lang.String r0 = "success"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
        L5f:
            X.3NX r3 = X.AbstractC25235BEs.A0f(r0)
        L63:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto L7a
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto Lc7
            X.5If r2 = X.MSX.A0E(r3)
            X.OHc r1 = r15.A03
            com.instagram.common.session.UserSession r0 = r15.A00
            A03(r2, r0, r1, r5)
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L7a:
            return r3
        L7b:
            r0 = 0
            goto L5f
        L7d:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L63
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L86:
            X.AbstractC09560e7.A00(r3)
            r10 = 0
            X.2JM r3 = X.AbstractC25225BEi.A0b()
            X.2JM r0 = X.AbstractC25225BEi.A0b()
            X.1uJ r4 = X.AbstractC25225BEi.A0c()
            java.util.Map r6 = r3.getParamsCopy()
            java.util.Map r7 = r0.getParamsCopy()
            java.lang.Class<X.QjJ> r8 = X.C59639QjJ.class
            java.util.ArrayList r14 = X.AbstractC166987dD.A1E()
            java.lang.String r5 = "DiverseOwnedBusinessDelete"
            r11 = 0
            java.lang.String r13 = "ig_shop_diversity_profile_delete"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.instagram.common.session.UserSession r0 = r15.A00
            X.1ud r0 = X.AbstractC40691uc.A01(r0)
            r2.A01 = r15
            r2.A00 = r9
            java.lang.Object r3 = r0.A04(r3, r2)
            if (r3 != r1) goto L2a
            return r1
        Lc0:
            X.PWy r2 = new X.PWy
            r2.<init>(r15, r5, r4)
            goto L18
        Lc7:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lcc:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A02(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        X.AbstractC31171DnF.A1A(r2, r0);
        X.AbstractC31171DnF.A1C(r2, "error");
        r2.AAP("event_source", com.facebook.common.dextricks.DexOptimization.OPT_KEY_CLIENT);
        r2.AAP("error_message", r3);
        X.AbstractC31175DnJ.A17(r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        r0 = "diversity_info_gql_failure_unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r3 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r3.equals("UnknownNetworkError") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r5 = java.lang.Long.parseLong(r6.userId);
        r4 = !r1;
        r2 = X.AbstractC166987dD.A0f(r7.A00, "ig_smb_sensitive_event");
        r2.A9K("ig_userid", java.lang.Long.valueOf(r5));
        r2.AAP("product", "network_call");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r4 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        r0 = "diversity_info_gql_failure";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.AbstractC115105If r5, com.instagram.common.session.UserSession r6, X.OHc r7, java.lang.String r8) {
        /*
            boolean r0 = r5 instanceof X.C115095Ie
            java.lang.String r1 = "UnknownNetworkError"
            if (r0 == 0) goto L57
            X.5Ie r5 = (X.C115095Ie) r5
            java.lang.Throwable r0 = r5.A00
            java.lang.String r3 = r0.getLocalizedMessage()
            if (r3 == 0) goto L17
        L10:
            boolean r0 = r3.equals(r1)
            r1 = 0
            if (r0 == 0) goto L18
        L17:
            r1 = 1
        L18:
            java.lang.String r0 = r6.userId
            long r5 = java.lang.Long.parseLong(r0)
            r4 = r1 ^ 1
            X.0wW r1 = r7.A00
            java.lang.String r0 = "ig_smb_sensitive_event"
            X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = "ig_userid"
            r2.A9K(r0, r1)
            java.lang.String r1 = "network_call"
            java.lang.String r0 = "product"
            r2.AAP(r0, r1)
            if (r4 == 0) goto L54
            java.lang.String r0 = "diversity_info_gql_failure"
        L3c:
            X.AbstractC31171DnF.A1A(r2, r0)
            java.lang.String r0 = "error"
            X.AbstractC31171DnF.A1C(r2, r0)
            java.lang.String r1 = "client"
            java.lang.String r0 = "event_source"
            r2.AAP(r0, r1)
            java.lang.String r0 = "error_message"
            r2.AAP(r0, r3)
            X.AbstractC31175DnJ.A17(r2, r8)
            return
        L54:
            java.lang.String r0 = "diversity_info_gql_failure_unknown"
            goto L3c
        L57:
            boolean r0 = r5 instanceof X.C115115Ig
            if (r0 == 0) goto L5d
            r3 = r1
            goto L10
        L5d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A03(X.5If, com.instagram.common.session.UserSession, X.OHc, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r4 = 9
            boolean r0 = X.C57147PWz.A02(r7, r4)
            if (r0 == 0) goto L7a
            r3 = r7
            X.PWz r3 = (X.C57147PWz) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r1 = r3.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L55
            if (r0 != r2) goto L89
            java.lang.Object r6 = r3.A02
            java.lang.Object r3 = r3.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r3 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r3
            X.AbstractC09560e7.A00(r1)
        L2a:
            r4 = r1
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L80
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r2 = r4.A00
            X.QjO r2 = (X.C59644QjO) r2
            java.util.Map r0 = r3.A01
            java.lang.Object r0 = r0.get(r6)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L8e
            java.util.Iterator r1 = r0.iterator()
        L45:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r1.next()
            X.PpG r0 = (X.InterfaceC58091PpG) r0
            r0.Dpw(r2)
            goto L45
        L55:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.Ovn r1 = X.AbstractC54280Nz0.A00(r0)
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            android.util.LruCache r0 = r1.A00
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L6f
            X.3NX r4 = X.AbstractC25225BEi.A0z(r0)
            return r4
        L6f:
            X.C57147PWz.A00(r5, r6, r3, r2)
            java.lang.Object r1 = A01(r5, r6, r3)
            if (r1 == r4) goto La3
            r3 = r5
            goto L2a
        L7a:
            X.PWz r3 = new X.PWz
            r3.<init>(r5, r7, r4)
            goto L16
        L80:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto La3
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L89:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L8e:
            com.instagram.common.session.UserSession r0 = r3.A00
            X.Ovn r1 = X.AbstractC54280Nz0.A00(r0)
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            if (r2 == 0) goto La4
            android.util.LruCache r0 = r1.A00
            r0.put(r6, r2)
        L9f:
            X.3NX r4 = X.AbstractC25225BEi.A0z(r2)
        La3:
            return r4
        La4:
            r2 = 0
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A04(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.util.List r8, java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r7 = this;
            r3 = 11
            boolean r0 = X.C57147PWz.A02(r10, r3)
            if (r0 == 0) goto L98
            r5 = r10
            X.PWz r5 = (X.C57147PWz) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A03
            X.1JX r6 = X.C1JX.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L6a
            if (r1 != r4) goto La8
            java.lang.Object r3 = r5.A02
            java.lang.Object r5 = r5.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r5 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r5
            X.AbstractC09560e7.A00(r0)
        L2a:
            r6 = r0
            X.3NY r6 = (X.C3NY) r6
            boolean r0 = r6 instanceof X.C3NX
            if (r0 == 0) goto L9f
            X.3NX r6 = (X.C3NX) r6
            java.lang.Object r2 = r6.A00
            X.QjO r2 = (X.C59644QjO) r2
            if (r2 == 0) goto Lbc
            X.NhZ r6 = X.EnumC53297NhZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 4
            java.lang.String r0 = "platform_visibility"
            com.google.common.collect.ImmutableList r1 = r2.getRequiredCompactedEnumListField(r1, r0, r6)
            if (r1 == 0) goto Lbc
            X.NhZ r0 = X.EnumC53297NhZ.INSTAGRAM
            boolean r0 = r1.contains(r0)
            if (r0 != r4) goto Lbc
            java.util.Map r0 = r5.A01
            java.lang.Object r0 = r0.get(r3)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto Lad
            java.util.Iterator r1 = r0.iterator()
        L5a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r1.next()
            X.PpG r0 = (X.InterfaceC58091PpG) r0
            r0.Dpw(r2)
            goto L5a
        L6a:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r7.A00
            java.lang.String r3 = r1.userId
            X.2JO r2 = new X.2JO
            r2.<init>()
            java.lang.String r0 = "diversity_type"
            r2.A05(r0, r8)
            java.lang.String r0 = "ethnicity"
            r2.A09(r9, r0)
            X.Ovn r1 = X.AbstractC54280Nz0.A00(r1)
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            android.util.LruCache r0 = r1.A00
            r0.remove(r3)
            X.C57147PWz.A00(r7, r3, r5, r4)
            java.lang.Object r0 = A00(r2, r7, r5)
            if (r0 == r6) goto Lc0
            r5 = r7
            goto L2a
        L98:
            X.PWz r5 = new X.PWz
            r5.<init>(r7, r10, r3)
            goto L16
        L9f:
            boolean r0 = r6 instanceof X.C194848jk
            if (r0 != 0) goto Lc0
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lad:
            com.instagram.common.session.UserSession r0 = r5.A00
            X.Ovn r1 = X.AbstractC54280Nz0.A00(r0)
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            android.util.LruCache r0 = r1.A00
            r0.put(r3, r2)
        Lbc:
            X.3NX r6 = X.AbstractC25225BEi.A0z(r2)
        Lc0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A05(java.util.List, java.lang.String, X.1Ds):java.lang.Object");
    }

    public DiversityInfoRepository(UserSession userSession) {
        this.A00 = userSession;
        C14360o3.A0B(userSession, 0);
        this.A03 = (OHc) userSession.A01(OHc.class, new C57517Pfr(userSession, 43));
        this.A01 = AbstractC166987dD.A1I();
    }
}
