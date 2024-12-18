package com.instagram.pendingmedia.service.impl;

/* loaded from: classes9.dex */
public final class ShareAudioHelper {
    public static final ShareAudioHelper A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        if (X.C18U.A06(r4, r7, 36330333787931454L) != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.OXD r15, X.InterfaceC23621Ds r16) {
        /*
            r14 = this;
            r10 = r15
            r3 = 27
            r4 = r16
            boolean r0 = X.C57145PWx.A02(r4, r3)
            if (r0 == 0) goto L2d
            r11 = r4
            X.PWx r11 = (X.C57145PWx) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r11.A00 = r2
        L19:
            java.lang.Object r0 = r11.A02
            X.1JX r2 = X.C1JX.A02
            int r1 = r11.A00
            r6 = 2
            r5 = 5
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 == r6) goto L32
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2d:
            X.PWx r11 = X.C57145PWx.A00(r14, r4, r3)
            goto L19
        L32:
            java.lang.Object r10 = r11.A01
            X.OXD r10 = (X.OXD) r10
            X.AbstractC09560e7.A00(r0)
            goto L51
        L3a:
            X.AbstractC09560e7.A00(r0)
            X.NRK r0 = X.NRK.A00
            X.47k r1 = r15.A04
            if (r1 == 0) goto L51
            int r4 = r1.ordinal()
            if (r4 == r6) goto L6b
            if (r4 == r5) goto Lb6
            r1 = 6
            if (r4 == r1) goto Lb6
            r1 = 7
            if (r4 == r1) goto Lb6
        L51:
            X.47k r2 = r10.A05
            boolean r1 = r0 instanceof X.NRK
            if (r1 == 0) goto L6a
            X.47k r1 = X.EnumC915447k.A07
            if (r2 == r1) goto L6a
            X.3Du r1 = r10.A0D
            X.47Z r3 = r10.A0C
            java.lang.String r5 = X.OXD.A00(r10, r2)
            r2 = 0
            java.lang.String r4 = "AUDIO_STATE_MACHINE_ERROR"
            r6 = r2
            r1.Ckw(r2, r3, r4, r5, r6)
        L6a:
            return r0
        L6b:
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r8 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            X.47Z r0 = r15.A0C
            boolean r0 = r0.A5D
            if (r0 == 0) goto L8e
            com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep r9 = new com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep
            r9.<init>()
        L78:
            com.instagram.common.session.UserSession r5 = r15.A0B
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36611495232018714(0x8211f60000191a, double:3.2165952351624125E-306)
            long r12 = X.C18U.A01(r4, r5, r0)
            r11.A01 = r15
            r11.A00 = r3
            java.lang.Object r0 = r8.A01(r9, r10, r11, r12)
            goto Lc5
        L8e:
            X.OI2 r5 = r15.A0E
            com.instagram.common.session.UserSession r7 = r15.A0B
            r6 = 0
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36318058771453808(0x81071500011770, double:3.031024835927379E-306)
            boolean r0 = X.C18U.A06(r4, r7, r0)
            if (r0 != 0) goto Lac
            r0 = 36330333787931454(0x81123f0000433e, double:3.0387876057753665E-306)
            boolean r1 = X.C18U.A06(r4, r7, r0)
            r0 = 0
            if (r1 == 0) goto Lad
        Lac:
            r0 = 1
        Lad:
            X.C14360o3.A0B(r5, r6)
            com.instagram.pendingmedia.service.upload.UploadAudioStep r9 = new com.instagram.pendingmedia.service.upload.UploadAudioStep
            r9.<init>(r5, r0)
            goto L78
        Lb6:
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r1 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            com.instagram.pendingmedia.service.igapi.ConfigureMediaStep r0 = new com.instagram.pendingmedia.service.igapi.ConfigureMediaStep
            r0.<init>()
            r11.A01 = r15
            r11.A00 = r6
            java.lang.Object r0 = X.MSY.A0b(r0, r1, r15, r11)
        Lc5:
            if (r0 != r2) goto L51
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.ShareAudioHelper.A00(X.OXD, X.1Ds):java.lang.Object");
    }
}
