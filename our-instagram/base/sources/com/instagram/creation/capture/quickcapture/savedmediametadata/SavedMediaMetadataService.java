package com.instagram.creation.capture.quickcapture.savedmediametadata;

import X.C14360o3;
import X.C188728Xm;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class SavedMediaMetadataService {
    public final UserSession A00;
    public final EffectCollectionService A01;
    public final C188728Xm A02;

    public SavedMediaMetadataService(EffectCollectionService effectCollectionService, UserSession userSession, C188728Xm c188728Xm) {
        C14360o3.A0B(effectCollectionService, 2);
        this.A00 = userSession;
        this.A01 = effectCollectionService;
        this.A02 = c188728Xm;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b2 -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C55U r27, com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService r28, java.util.List r29, X.InterfaceC23621Ds r30) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService.A00(X.55U, com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C183978Ee r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 10
            boolean r0 = X.C206459Cc.A00(r8, r3)
            if (r0 == 0) goto Lb4
            r5 = r8
            X.9Cc r5 = (X.C206459Cc) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L92
            if (r0 != r3) goto Lbb
            java.lang.Object r2 = r5.A02
            X.9PL r2 = (X.C9PL) r2
            java.lang.Object r7 = r5.A01
            X.8Ee r7 = (X.C183978Ee) r7
            X.AbstractC09560e7.A00(r1)
        L2c:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = X.AbstractC001800i.A0N(r1)
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            if (r0 == 0) goto L38
            r7.A0E = r0
        L38:
            java.lang.Float r0 = r2.A01
            if (r0 == 0) goto L47
            float r1 = r0.floatValue()
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r7.A0O = r0
        L47:
            java.lang.Long r0 = r2.A05
            if (r0 == 0) goto L56
            long r3 = r0.longValue()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            r7.A0W = r0
        L56:
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L65
            int r1 = r0.intValue()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r7.A0T = r0
        L65:
            java.lang.Float r0 = r2.A02
            if (r0 == 0) goto L74
            float r1 = r0.floatValue()
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r7.A0P = r0
        L74:
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L83
            int r1 = r0.intValue()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r7.A0Q = r0
        L83:
            X.8Hq r0 = r2.A00
            if (r0 == 0) goto L89
            r7.A0K = r0
        L89:
            java.lang.String r0 = r2.A06
            if (r0 == 0) goto L8f
            r7.A0b = r0
        L8f:
            X.0eB r4 = X.C0eB.A00
            return r4
        L92:
            X.AbstractC09560e7.A00(r1)
            java.lang.String r0 = r7.A06()
            X.9PL r2 = X.AbstractC188508Wp.A00(r0)
            if (r2 == 0) goto L8f
            r7.A18 = r3
            java.util.List r1 = r2.A00()
            X.9Kk r0 = X.C208509Kk.A00
            r5.A01 = r7
            r5.A02 = r2
            r5.A00 = r3
            java.lang.Object r1 = A00(r0, r6, r1, r5)
            if (r1 != r4) goto L2c
            return r4
        Lb4:
            X.9Cc r5 = new X.9Cc
            r5.<init>(r6, r8, r3)
            goto L16
        Lbb:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService.A01(X.8Ee, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C195868lW r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = this;
            r3 = 31
            boolean r0 = X.MAL.A01(r11, r3)
            if (r0 == 0) goto La4
            r5 = r11
            X.MAL r5 = (X.MAL) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La4
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A04
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L7d
            if (r0 != r3) goto Laf
            java.lang.Object r10 = r5.A03
            X.8lW r10 = (X.C195868lW) r10
            java.lang.Object r2 = r5.A02
            X.9PL r2 = (X.C9PL) r2
            java.lang.Object r8 = r5.A01
            X.8lW r8 = (X.C195868lW) r8
            X.AbstractC09560e7.A00(r1)
        L30:
            java.util.List r1 = (java.util.List) r1
            r10.A0u = r1
            X.8Hq r0 = r2.A00
            if (r0 == 0) goto L3a
            r8.A0W = r0
        L3a:
            java.lang.String r0 = r2.A06
            if (r0 == 0) goto L40
            r8.A0g = r0
        L40:
            java.util.List r1 = r2.A09
            if (r1 == 0) goto Lae
            r7 = 0
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L54:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.api.schemas.CameraTool r4 = X.C51T.A00(r0)
            r0 = 0
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r0)
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            com.instagram.feed.media.CameraToolInfo r0 = new com.instagram.feed.media.CameraToolInfo
            r0.<init>(r4, r3, r2, r1)
            r6.add(r0)
            goto L54
        L7d:
            X.AbstractC09560e7.A00(r1)
            java.lang.String r0 = r10.A0k
            X.9PL r2 = X.AbstractC188508Wp.A00(r0)
            if (r2 != 0) goto L89
            return r10
        L89:
            boolean r0 = r2.A0B
            r10.A1F = r0
            java.util.List r1 = r2.A00()
            X.81U r0 = X.C81U.A00
            r5.A01 = r10
            r5.A02 = r2
            r5.A03 = r10
            r5.A00 = r3
            java.lang.Object r1 = A00(r0, r9, r1, r5)
            if (r1 != r4) goto La2
            return r4
        La2:
            r8 = r10
            goto L30
        La4:
            X.MAL r5 = new X.MAL
            r5.<init>(r9, r11, r3)
            goto L16
        Lab:
            r8.A09(r7, r6)
        Lae:
            return r8
        Laf:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService.A02(X.8lW, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.C195868lW r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 11
            boolean r0 = X.C206459Cc.A00(r8, r3)
            if (r0 == 0) goto L69
            r5 = r8
            X.9Cc r5 = (X.C206459Cc) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L47
            if (r0 != r3) goto L6f
            java.lang.Object r2 = r5.A02
            X.9PL r2 = (X.C9PL) r2
            java.lang.Object r7 = r5.A01
            X.8lW r7 = (X.C195868lW) r7
            X.AbstractC09560e7.A00(r1)
        L2c:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = X.AbstractC001800i.A0N(r1)
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            if (r0 == 0) goto L38
            r7.A0P = r0
        L38:
            X.8Hq r0 = r2.A00
            if (r0 == 0) goto L3e
            r7.A0W = r0
        L3e:
            java.lang.String r0 = r2.A06
            if (r0 == 0) goto L44
            r7.A0g = r0
        L44:
            X.0eB r4 = X.C0eB.A00
            return r4
        L47:
            X.AbstractC09560e7.A00(r1)
            java.lang.String r0 = r7.A0k
            X.9PL r2 = X.AbstractC188508Wp.A00(r0)
            if (r2 == 0) goto L44
            boolean r0 = r2.A0B
            r7.A1F = r0
            java.util.List r1 = r2.A00()
            X.9Kk r0 = X.C208509Kk.A00
            r5.A01 = r7
            r5.A02 = r2
            r5.A00 = r3
            java.lang.Object r1 = A00(r0, r6, r1, r5)
            if (r1 != r4) goto L2c
            return r4
        L69:
            X.9Cc r5 = new X.9Cc
            r5.<init>(r6, r8, r3)
            goto L16
        L6f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService.A03(X.8lW, X.1Ds):java.lang.Object");
    }
}
