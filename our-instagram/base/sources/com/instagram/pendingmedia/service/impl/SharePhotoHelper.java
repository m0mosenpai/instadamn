package com.instagram.pendingmedia.service.impl;

/* loaded from: classes9.dex */
public final class SharePhotoHelper {
    public static final SharePhotoHelper A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (X.C18U.A06(r5, r4, 36330333788128065L) != false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.OXD r13, X.InterfaceC23621Ds r14) {
        /*
            r12 = this;
            r8 = r13
            r3 = 28
            boolean r0 = X.C57145PWx.A02(r14, r3)
            if (r0 == 0) goto L2b
            r9 = r14
            X.PWx r9 = (X.C57145PWx) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r9.A00 = r2
        L17:
            java.lang.Object r0 = r9.A02
            X.1JX r2 = X.C1JX.A02
            int r1 = r9.A00
            r7 = 2
            r6 = 6
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L30
            if (r1 == r7) goto L30
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2b:
            X.PWx r9 = X.C57145PWx.A00(r12, r14, r3)
            goto L17
        L30:
            java.lang.Object r8 = r9.A01
            X.OXD r8 = (X.OXD) r8
            X.AbstractC09560e7.A00(r0)
            goto L53
        L38:
            X.AbstractC09560e7.A00(r0)
            X.47Z r5 = r13.A0C
            com.instagram.common.session.UserSession r4 = r13.A0B
            X.AbstractC68554VVh.A00(r4, r5)
            X.47k r0 = r13.A04
            if (r0 == 0) goto L51
            int r1 = r0.ordinal()
            if (r1 == r7) goto L6d
            if (r1 == r6) goto Lac
            r0 = 7
            if (r1 == r0) goto Lac
        L51:
            X.NRK r0 = X.NRK.A00
        L53:
            X.47k r2 = r8.A05
            boolean r1 = r0 instanceof X.NRK
            if (r1 == 0) goto L6c
            X.47k r1 = X.EnumC915447k.A07
            if (r2 == r1) goto L6c
            X.3Du r1 = r8.A0D
            X.47Z r3 = r8.A0C
            java.lang.String r5 = X.OXD.A00(r8, r2)
            r2 = 0
            java.lang.String r4 = "PHOTO_STATE_MACHINE_ERROR"
            r6 = r2
            r1.Ckw(r2, r3, r4, r5, r6)
        L6c:
            return r0
        L6d:
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r6 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            boolean r0 = r5.A5D
            if (r0 == 0) goto L8c
            com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep r7 = new com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep
            r7.<init>()
        L78:
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36611495232084251(0x8211f60001191b, double:3.2165952352038583E-306)
            long r10 = X.C18U.A01(r5, r4, r0)
            r9.A01 = r13
            r9.A00 = r3
            java.lang.Object r0 = r6.A01(r7, r8, r9, r10)
            goto Lbb
        L8c:
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36318058771781492(0x81071500061774, double:3.031024836134608E-306)
            boolean r0 = X.C18U.A06(r5, r4, r0)
            if (r0 != 0) goto La5
            r0 = 36330333788128065(0x81123f00034341, double:3.038787605899704E-306)
            boolean r1 = X.C18U.A06(r5, r4, r0)
            r0 = 0
            if (r1 == 0) goto La6
        La5:
            r0 = 1
        La6:
            com.instagram.pendingmedia.service.upload.UploadImageStep r7 = new com.instagram.pendingmedia.service.upload.UploadImageStep
            r7.<init>(r0)
            goto L78
        Lac:
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r1 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            com.instagram.pendingmedia.service.igapi.ConfigureMediaStep r0 = new com.instagram.pendingmedia.service.igapi.ConfigureMediaStep
            r0.<init>()
            r9.A01 = r13
            r9.A00 = r7
            java.lang.Object r0 = X.MSY.A0b(r0, r1, r13, r9)
        Lbb:
            if (r0 != r2) goto L53
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.SharePhotoHelper.A00(X.OXD, X.1Ds):java.lang.Object");
    }
}
