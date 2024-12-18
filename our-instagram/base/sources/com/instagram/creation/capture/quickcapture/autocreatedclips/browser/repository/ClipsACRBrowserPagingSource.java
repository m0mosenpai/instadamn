package com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository;

import X.AbstractC09440dt;
import X.C12L;
import X.C12N;
import X.C50151MDe;
import X.C54827OLm;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import android.content.Context;
import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class ClipsACRBrowserPagingSource extends PagingSource {
    public boolean A00;
    public final Context A01;
    public final UserSession A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50151MDe(this, 19));
    public final C12N A02 = C12L.A00;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.api.schemas.ACRType r17, X.C45136Jyc r18, com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r19, X.InterfaceC23621Ds r20) {
        /*
            r4 = r19
            r1 = r18
            r9 = r17
            r5 = 30
            r7 = r20
            boolean r0 = X.MAL.A01(r7, r5)
            if (r0 == 0) goto Lc2
            r6 = r7
            X.MAL r6 = (X.MAL) r6
            int r3 = r6.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto Lc2
            int r3 = r3 - r2
            r6.A00 = r3
        L1e:
            java.lang.Object r2 = r6.A04
            X.1JX r7 = X.C1JX.A02
            int r0 = r6.A00
            r5 = 1
            r8 = 0
            if (r0 == 0) goto L9c
            if (r0 != r5) goto Lc9
            java.lang.Object r9 = r6.A03
            com.instagram.api.schemas.ACRType r9 = (com.instagram.api.schemas.ACRType) r9
            java.lang.Object r1 = r6.A02
            X.Jyc r1 = (X.C45136Jyc) r1
            java.lang.Object r4 = r6.A01
            com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r4 = (com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource) r4
            X.AbstractC09560e7.A00(r2)
        L39:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto Lce
            X.H2A r0 = r1.A00
            if (r0 == 0) goto Lce
            java.util.List r0 = r0.A01
            if (r0 == 0) goto Lce
            r6 = 0
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r6)
            X.Mv1 r0 = (X.C51797Mv1) r0
            if (r0 == 0) goto Lce
            java.util.ArrayList r20 = X.AbstractC55153OdH.A03(r0)
            com.instagram.api.schemas.TrackData r5 = r0.A01
            int r15 = r0.A00
            java.lang.Integer r0 = X.AbstractC55153OdH.A01(r20)
            int r3 = X.AbstractC25227BEk.A06(r0, r6)
            X.C14360o3.A0B(r5, r6)
            com.instagram.music.common.model.MusicAssetModel r0 = com.instagram.music.common.model.MusicAssetModel.A01(r5, r6)
            com.instagram.music.common.model.AudioOverlayTrack r13 = new com.instagram.music.common.model.AudioOverlayTrack
            r13.<init>(r0, r15, r3)
            java.lang.String r14 = r5.getProgressiveDownloadUrl()
            if (r14 == 0) goto L79
            android.content.Context r11 = r4.A01
            com.instagram.common.session.UserSession r12 = r4.A03
            r16 = r3
            X.AbstractC55153OdH.A04(r11, r12, r13, r14, r15, r16)
        L79:
            java.lang.String r14 = r1.A04
            if (r14 != 0) goto L81
            java.lang.String r14 = X.AbstractC167017dG.A0j()
        L81:
            java.lang.String r15 = r1.A05
            java.lang.String r4 = r1.A07
            java.lang.String r3 = r1.A08
            com.instagram.api.schemas.SmartReelType r10 = r1.A02
            com.instagram.model.reels.ReelType r12 = r1.A03
            java.lang.String r0 = r1.A06
            X.Jx6 r7 = new X.Jx6
            r11 = r8
            r18 = r0
            r19 = r2
            r16 = r4
            r17 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r7
        L9c:
            X.AbstractC09560e7.A00(r2)
            java.lang.String r3 = r1.A07
            if (r3 == 0) goto Lce
            X.H2A r0 = r1.A00
            if (r0 == 0) goto Lce
            java.util.List r2 = r0.A00
            if (r2 == 0) goto Lce
            X.0do r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            X.OeS r0 = (X.C55209OeS) r0
            r6.A01 = r4
            r6.A02 = r1
            r6.A03 = r9
            r6.A00 = r5
            java.lang.Object r2 = r0.A07(r2, r3, r6)
            if (r2 != r7) goto L39
            return r7
        Lc2:
            X.MAL r6 = new X.MAL
            r6.<init>(r4, r7, r5)
            goto L1e
        Lc9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lce:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource.A00(com.instagram.api.schemas.ACRType, X.Jyc, com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r15, X.C37964Gn6 r16, java.lang.String r17, java.lang.String r18, java.util.List r19, X.InterfaceC23621Ds r20) {
        /*
            r14 = r17
            r2 = r19
            r3 = r18
            r10 = 0
            r5 = 5
            r6 = r20
            boolean r0 = X.PX7.A02(r6, r5)
            if (r0 == 0) goto Lb3
            r7 = r6
            X.PX7 r7 = (X.PX7) r7
            int r4 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto Lb3
            int r4 = r4 - r1
            r7.A00 = r4
        L1e:
            java.lang.Object r0 = r7.A06
            X.1JX r6 = X.C1JX.A02
            int r1 = r7.A00
            r5 = 1
            if (r1 == 0) goto L63
            if (r1 != r5) goto Lbf
            java.lang.Object r4 = r7.A05
            X.0ps r4 = (X.C15370ps) r4
            java.lang.Object r3 = r7.A04
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r8 = r7.A03
            com.facebook.videolite.transcoder.base.composition.MediaComposition r8 = (com.facebook.videolite.transcoder.base.composition.MediaComposition) r8
            java.lang.Object r2 = r7.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r14 = r7.A01
            java.lang.String r14 = (java.lang.String) r14
            X.AbstractC09560e7.A00(r0)
        L40:
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L4a
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto Lba
            r4.A00 = r10
        L4a:
            com.instagram.api.schemas.ACRType r9 = com.instagram.api.schemas.ACRType.A05
            java.lang.Object r13 = r4.A00
            com.instagram.music.common.model.AudioOverlayTrack r13 = (com.instagram.music.common.model.AudioOverlayTrack) r13
            X.Jx6 r7 = new X.Jx6
            r11 = r10
            r12 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r3
            r19 = r2
            r20 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r7
        L63:
            X.AbstractC09560e7.A00(r0)
            X.0ps r4 = X.AbstractC25225BEi.A1F()
            r0 = r16
            if (r16 == 0) goto Lb1
            com.instagram.api.schemas.TrackData r0 = r0.A06
            com.instagram.api.schemas.TrackDataImpl r1 = r0.F3P()
            java.lang.Integer r0 = r1.A06
            int r9 = X.AbstractC167017dG.A0K(r0)
            r8 = 0
            com.instagram.music.common.model.MusicAssetModel r1 = com.instagram.music.common.model.MusicAssetModel.A01(r1, r8)
            com.instagram.music.common.model.AudioOverlayTrack r0 = new com.instagram.music.common.model.AudioOverlayTrack
            r0.<init>(r1, r8, r9)
            r4.A00 = r0
            android.content.Context r9 = r15.A01
            com.instagram.common.session.UserSession r8 = r15.A03
            r0 = 17
            X.B61 r1 = new X.B61
            r1.<init>(r0, r9, r8)
            java.lang.Class<X.ABW> r0 = X.ABW.class
            java.lang.Object r1 = r8.A01(r0, r1)
            X.ABW r1 = (X.ABW) r1
            java.lang.Object r0 = r4.A00
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            r7.A01 = r14
            r7.A02 = r2
            r8 = r10
            r7.A03 = r10
            r7.A04 = r3
            r7.A05 = r4
            r7.A00 = r5
            java.lang.Object r0 = r1.A00(r0, r7)
            if (r0 != r6) goto L40
            return r6
        Lb1:
            r8 = r10
            goto L4a
        Lb3:
            X.PX7 r7 = new X.PX7
            r7.<init>(r15, r6, r5)
            goto L1e
        Lba:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lbf:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource.A01(com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource, X.Gn6, java.lang.String, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d1 -> B:10:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r16, java.util.List r17, java.util.List r18, java.util.List r19, X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource.A02(com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource, java.util.List, java.util.List, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r9 == r2) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [X.0pQ] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008c -> B:12:0x0047). Please report as a decompilation issue!!! */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.AbstractC54752OHh r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource.A04(X.OHh, X.1Ds):java.lang.Object");
    }

    @Override // androidx.paging.PagingSource
    public final /* bridge */ /* synthetic */ Object A05(C54827OLm c54827OLm) {
        return null;
    }

    public ClipsACRBrowserPagingSource(UserSession userSession, Context context) {
        this.A03 = userSession;
        this.A01 = context;
    }
}
