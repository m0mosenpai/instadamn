package X;

/* loaded from: classes7.dex */
public abstract class ITL {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r16.BVc() == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.AbstractC59962oe r15, X.C3x9 r16, X.InterfaceC11380iw r17, com.instagram.common.session.UserSession r18, X.C38321qM r19, int r20) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ITL.A01(X.2oe, X.3x9, X.0iw, com.instagram.common.session.UserSession, X.1qM, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r11.BVc() == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.AbstractC59962oe r10, X.C3x9 r11, X.InterfaceC11380iw r12, com.instagram.common.session.UserSession r13, X.C38321qM r14, int r15) {
        /*
            android.content.Context r2 = r10.requireContext()
            r4 = r14
            X.3x9 r0 = X.AbstractC25226BEj.A0u(r14)
            r3 = r13
            if (r0 == 0) goto L21
            java.lang.String r5 = r0.getMusicCanonicalId()
            if (r5 == 0) goto L21
            X.2k6 r0 = X.AbstractC25229BEm.A0a(r10)
            r6 = 0
            r7 = 16
            X.MVR r1 = new X.MVR
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.AbstractC166987dD.A1Z(r1, r0)
        L21:
            r4 = 0
            if (r11 == 0) goto Ld4
            com.instagram.api.schemas.MusicInfo r0 = r11.BVc()
            if (r0 == 0) goto Lc7
            X.3xC r2 = new X.3xC
            r2.<init>(r0)
        L2f:
            X.3xD r2 = (X.InterfaceC88553xD) r2
            if (r2 == 0) goto Lc4
            com.instagram.api.schemas.OriginalAudioSubtype r1 = r2.Ae4()
        L37:
            com.instagram.api.schemas.OriginalAudioSubtype r0 = com.instagram.api.schemas.OriginalAudioSubtype.A04
            if (r1 != r0) goto Lc1
            X.8JW r6 = X.C8JW.A02
        L3d:
            java.lang.String r5 = X.AbstractC167017dG.A0j()
            if (r2 == 0) goto Lbd
            java.lang.String r10 = r2.getAudioAssetId()
            java.lang.String r9 = r2.getArtistId()
            java.lang.String r8 = r2.BZi()
        L4f:
            java.lang.String r2 = X.AbstractC167017dG.A0j()
            if (r11 == 0) goto L5c
            com.instagram.api.schemas.MusicInfo r0 = r11.BVc()
            r7 = 0
            if (r0 != 0) goto L5d
        L5c:
            r7 = 1
        L5d:
            X.0wW r1 = X.AbstractC12220kQ.A01(r12, r13)
            java.lang.String r0 = "instagram_organic_audio_page_pin_media"
            X.0Ai r3 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto Laf
            X.AbstractC25229BEm.A1A(r3, r12)
            java.lang.Long r0 = X.AbstractC37302Gc3.A0W(r10)
            X.AbstractC37300Gc1.A0j(r3, r0)
            if (r7 == 0) goto Lba
            X.HiR r1 = X.EnumC39636HiR.ORIGINAL
        L7b:
            java.lang.String r0 = "audio_type"
            r3.A8R(r1, r0)
            if (r9 != 0) goto Lb5
            r1 = r4
        L83:
            java.lang.String r0 = "audio_owner_id"
            r3.AAK(r1, r0)
            java.lang.String r0 = "pivot_page_entry_point"
            r3.A8R(r6, r0)
            java.lang.String r0 = "pivot_page_session_id"
            r3.AAP(r0, r5)
            if (r9 != 0) goto Lb0
            r1 = r4
        L95:
            java.lang.String r0 = "media_author_id"
            r3.AAK(r1, r0)
            if (r8 == 0) goto La0
            java.lang.Long r4 = X.AbstractC166997dE.A0j(r8)
        La0:
            X.AbstractC37300Gc1.A0h(r3, r4)
            long r0 = (long) r15
            X.AbstractC25230BEn.A1C(r3, r0)
            java.lang.String r0 = "media_tap_token"
            X.AbstractC25233BEq.A17(r3, r0, r2)
            r3.Cht()
        Laf:
            return
        Lb0:
            X.4SX r1 = X.C4SX.A00(r9)
            goto L95
        Lb5:
            X.4SX r1 = X.C4SX.A00(r9)
            goto L83
        Lba:
            X.HiR r1 = X.EnumC39636HiR.SONG
            goto L7b
        Lbd:
            r10 = r4
            r9 = r4
            r8 = r4
            goto L4f
        Lc1:
            r6 = r4
            goto L3d
        Lc4:
            r1 = r4
            goto L37
        Lc7:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r11.BZw()
            if (r0 == 0) goto Ld4
            X.5Si r2 = new X.5Si
            r2.<init>(r0)
            goto L2f
        Ld4:
            r2 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ITL.A00(X.2oe, X.3x9, X.0iw, com.instagram.common.session.UserSession, X.1qM, int):void");
    }
}
