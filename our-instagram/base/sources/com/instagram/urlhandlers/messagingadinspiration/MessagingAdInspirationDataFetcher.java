package com.instagram.urlhandlers.messagingadinspiration;

import X.AbstractC24771Iv;
import X.C14360o3;
import X.C19K;
import X.C19L;
import X.InterfaceC50122Sb;
import X.MSW;
import X.PZE;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MessagingAdInspirationDataFetcher {
    public final UserSession A00;
    public final InterfaceC50122Sb A01;
    public final C19L A02;

    public MessagingAdInspirationDataFetcher(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C19K A01 = AbstractC24771Iv.A01(1866985000, 3);
        this.A02 = A01;
        this.A01 = MSW.A1H(new PZE(this, null, 20), A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r1 == r2) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1JX] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r17, com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationDataFetcher r18, X.InterfaceC23621Ds r19) {
        /*
            r3 = 20
            r5 = r19
            boolean r0 = X.PXB.A03(r5, r3)
            if (r0 == 0) goto Laa
            r4 = r5
            X.PXB r4 = (X.PXB) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r1 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L73
            if (r0 != r3) goto Lb2
            X.AbstractC09560e7.A00(r1)
        L26:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            r2 = 0
            if (r0 == 0) goto La9
            X.2JS r4 = X.AbstractC25232BEp.A18(r1)
            if (r4 == 0) goto La9
            java.lang.Class<X.QhO> r3 = X.C59550QhO.class
            r5 = 0
            java.lang.String r1 = "xdt_get_messaging_ad_inspiration"
            r0 = 607367896(0x2433b2d8, float:3.8965924E-17)
            X.2JS r4 = r4.getOptionalTreeField(r5, r1, r3, r0)
            if (r4 == 0) goto La9
            java.lang.Class<X.QhN> r3 = X.C59549QhN.class
            r0 = 2702(0xa8e, float:3.786E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            r0 = -438911180(0xffffffffe5d6bf34, float:-1.2676419E23)
            com.google.common.collect.ImmutableList r0 = r4.getRequiredCompactedTreeListField(r5, r1, r3, r0)
            if (r0 == 0) goto La9
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r4 = r0.iterator()
        L5a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La9
            X.2JS r3 = X.AbstractC25225BEi.A0l(r4)
            java.lang.Class<X.Qhe> r1 = X.C59566Qhe.class
            r0 = 567749638(0x21d72c06, float:1.458062E-18)
            X.2JS r0 = r3.reinterpretRequired(r5, r1, r0)
            if (r0 == 0) goto L5a
            r2.add(r0)
            goto L5a
        L73:
            X.AbstractC09560e7.A00(r1)
            r12 = 0
            X.2JM r1 = X.AbstractC25225BEi.A0b()
            X.2JM r0 = X.AbstractC25225BEi.A0b()
            X.1uJ r6 = X.AbstractC25225BEi.A0c()
            java.util.Map r8 = r1.getParamsCopy()
            java.util.Map r9 = r0.getParamsCopy()
            java.lang.Class<X.QhP> r10 = X.C59551QhP.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "IGMessagingAdInspirationQuery"
            r11 = 0
            java.lang.String r15 = "xdt_get_messaging_ad_inspiration"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1ud r0 = X.AbstractC40691uc.A01(r17)
            r4.A00 = r3
            java.lang.Object r1 = r0.A04(r5, r4)
            if (r1 != r2) goto L26
        La9:
            return r2
        Laa:
            r0 = r18
            X.PXB r4 = X.PXB.A00(r0, r5, r3)
            goto L18
        Lb2:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationDataFetcher.A00(com.instagram.common.session.UserSession, com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationDataFetcher, X.1Ds):java.lang.Object");
    }
}
