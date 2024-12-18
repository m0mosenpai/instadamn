package com.instagram.nux.deviceverification.impl;

import X.FP4;

/* loaded from: classes10.dex */
public final class VerificationPluginImpl extends FP4 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.RpY] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, X.61b] */
    @Override // X.FP4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startDeviceValidation(android.content.Context r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            X.1oc r0 = X.AbstractC37391oc.$redex_init_class
            X.1od r0 = X.AbstractC37401od.$redex_init_class
            java.lang.String r1 = "c30a13e660cb14207917cd82bcef975e"
            com.instagram.strings.StringBridge$NativeStringBridge r0 = X.S89.A00
            java.lang.String r7 = r0.nativeGetInstagramString(r1)
            X.C14360o3.A07(r7)
            X.S58 r4 = new X.S58
            r4.<init>()
            long r0 = X.AbstractC31177DnL.A06()
            if (r11 != 0) goto L21
            java.lang.String r11 = "unknown"
        L21:
            java.lang.StringBuilder r3 = X.AbstractC166997dE.A11(r11)
            r2 = 124(0x7c, float:1.74E-43)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r3 = X.MSX.A0l(r3, r2)
            r0 = 24
            byte[] r2 = new byte[r0]
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r0.nextBytes(r2)
            java.io.ByteArrayOutputStream r1 = X.AbstractC58318PtA.A0U()
            byte[] r0 = X.MSY.A1a(r3)     // Catch: java.io.IOException -> L57
            r1.write(r0)     // Catch: java.io.IOException -> L57
            r1.write(r2)     // Catch: java.io.IOException -> L57
            byte[] r8 = r1.toByteArray()
            if (r8 == 0) goto L58
            r0 = 2
            java.lang.String r5 = android.util.Base64.encodeToString(r8, r0)
            goto L5b
        L57:
            r8 = 0
        L58:
            java.lang.String r5 = "unknown"
        L5b:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.A00
            int r1 = X.AbstractC58318PtA.A05(r10, r0)
            if (r1 == 0) goto L86
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00
            java.lang.String r1 = com.google.android.gms.common.ConnectionResult.A00(r1)
            X.C14360o3.A07(r1)
            X.C14360o3.A0A(r5)
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            java.lang.Integer r3 = X.C05F.A0C
            java.lang.String r0 = "GOOGLE_PLAY_UNAVAILABLE: "
            java.lang.String r2 = X.AnonymousClass001.A0R(r0, r1)
            X.1vu r1 = X.C41451vu.A01
            X.Fvk r0 = new X.Fvk
            r0.<init>(r2, r3, r5)
            r1.E4s(r0)
            return
        L86:
            java.lang.String r3 = "VERIFICATION_PENDING: request time is "
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "1000"
            java.lang.String r3 = X.AnonymousClass001.A0e(r3, r2, r0)
            X.C14360o3.A0A(r5)
            X.AbstractC167007dF.A1K(r3, r5)
            java.lang.Integer r2 = X.C05F.A00
            X.1vu r1 = X.C41451vu.A01
            X.Fvk r0 = new X.Fvk
            r0.<init>(r3, r2, r5)
            r1.E4s(r0)
            X.61W r6 = X.S9R.A00
            X.61a r3 = new X.61a
            r3.<init>()
            r2 = 0
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            X.61Z r1 = new X.61Z
            r1.<init>(r0, r3)
            X.RGR r0 = new X.RGR
            r0.<init>(r10, r2, r6, r1)
            X.C14360o3.A0A(r8)
            X.C14360o3.A0A(r7)
            X.61e r0 = r0.A05
            X.ROg r1 = new X.ROg
            r1.<init>(r0, r7, r8)
            r0.A06(r1)
            X.RGd r0 = new X.RGd
            r0.<init>()
            X.5KS r3 = X.AbstractC63093Sct.A01(r1, r0)
            r0 = 6
            X.MHy r2 = new X.MHy
            r2.<init>(r5, r4, r0)
            r0 = 2
            X.T7C r1 = new X.T7C
            r1.<init>(r0, r2)
            java.util.concurrent.Executor r0 = X.AbstractC58437PvG.A00
            r3.A04(r1, r0)
            X.T71 r0 = new X.T71
            r0.<init>(r4, r5)
            r3.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.deviceverification.impl.VerificationPluginImpl.startDeviceValidation(android.content.Context, java.lang.String):void");
    }
}
