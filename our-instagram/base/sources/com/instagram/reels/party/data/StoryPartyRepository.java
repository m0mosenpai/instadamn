package com.instagram.reels.party.data;

import X.O48;

/* loaded from: classes9.dex */
public final class StoryPartyRepository {
    public final O48 A00;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            r17 = this;
            r3 = 14
            r5 = r19
            boolean r0 = X.PXD.A03(r5, r3)
            r6 = r17
            if (r0 == 0) goto La3
            r4 = r5
            X.PXD r4 = (X.PXD) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La3
            int r2 = r2 - r1
            r4.A00 = r2
        L1a:
            java.lang.Object r2 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L56
            if (r0 != r1) goto La9
            X.AbstractC09560e7.A00(r2)
        L28:
            boolean r0 = r2 instanceof X.C3NX
            r3 = 0
            if (r0 == 0) goto L55
            X.3NX r2 = (X.C3NX) r2
            if (r2 == 0) goto L55
            java.lang.Object r0 = r2.A00
            X.435 r0 = (X.AnonymousClass435) r0
            if (r0 == 0) goto L55
            java.lang.Object r4 = r0.A01
            X.2JS r4 = (X.C2JS) r4
            if (r4 == 0) goto L55
            java.lang.Class<X.QvW> r2 = X.C60196QvW.class
            java.lang.String r1 = "xdt_media_reshare_participants(media_id:$media_id)"
            r0 = -183652518(0xfffffffff50daf5a, float:-1.7960703E32)
            X.2JS r4 = r4.A05(r2, r1, r0)
            if (r4 == 0) goto L55
            java.lang.Class<X.R1M> r2 = X.R1M.class
            java.lang.String r1 = "participation"
            r0 = -862910651(0xffffffffcc910745, float:-7.603665E7)
            com.google.common.collect.ImmutableList r3 = r4.A06(r2, r1, r0)
        L55:
            return r3
        L56:
            X.AbstractC09560e7.A00(r2)
            X.O48 r0 = r6.A00
            r4.A00 = r1
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1ud r2 = X.AbstractC40691uc.A01(r0)
            r12 = 0
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.2JM r1 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "media_id"
            r6 = r18
            boolean r0 = X.AbstractC43594JPz.A1X(r5, r0, r6)
            X.1uJ r6 = X.AbstractC25227BEk.A0U(r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r1.getParamsCopy()
            java.lang.Class<X.QvX> r10 = X.C60197QvX.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "StoryPartyParticipantsQuery"
            r11 = 0
            java.lang.String r15 = "xdt_media_reshare_participants"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 0
            X.1Dk r5 = r5.setFreshCacheAgeMs(r0)
            X.1Dk r0 = r5.setMaxToleratedCacheAgeMs(r0)
            java.lang.Object r2 = r2.A04(r0, r4)
            if (r2 != r3) goto L28
            return r3
        La3:
            X.PXD r4 = X.PXD.A00(r6, r5, r3)
            goto L1a
        La9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.party.data.StoryPartyRepository.A00(java.lang.String, X.1Ds):java.lang.Object");
    }

    public StoryPartyRepository(O48 o48) {
        this.A00 = o48;
    }
}
