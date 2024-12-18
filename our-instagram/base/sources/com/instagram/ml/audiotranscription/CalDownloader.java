package com.instagram.ml.audiotranscription;

/* loaded from: classes4.dex */
public final class CalDownloader {
    public static final CalDownloader A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r9, X.C129805tk r10, X.InterfaceC23621Ds r11) {
        /*
            r8 = this;
            r3 = 5
            boolean r0 = X.PXA.A03(r11, r3)
            if (r0 == 0) goto Ld5
            r4 = r11
            X.PXA r4 = (X.PXA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld5
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r0 = r4.A03
            X.1JX r5 = X.C1JX.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L5e
            if (r1 != r3) goto Ldc
            java.lang.Object r10 = r4.A02
            X.5tk r10 = (X.C129805tk) r10
            X.AbstractC09560e7.A00(r0)
        L27:
            r5 = r0
            X.1RQ r1 = X.C1RQ.A00()
            X.C14360o3.A07(r1)
            X.1Ti r0 = X.EnumC27091Ti.A0J
            boolean r3 = r1.A05(r0)
            boolean r2 = r1.A06(r0)
            if (r10 == 0) goto L5d
            X.02i r1 = r10.A00
            r0 = 331812717(0x13c70f6d, float:5.0249873E-27)
            com.facebook.quicklog.MarkerEditor r1 = r1.withMarker(r0)
            java.lang.String r0 = "LIBRARY_VOLTRON_POSTCHECK"
            com.facebook.quicklog.PointEditor r1 = r1.pointEditor(r0)
            java.lang.String r0 = "IS_VOLTRON_MODULE_DOWNLOADED"
            com.facebook.quicklog.PointEditor r1 = r1.addPointData(r0, r3)
            java.lang.String r0 = "IS_VOLTRON_MODULE_LOADED"
            com.facebook.quicklog.PointEditor r0 = r1.addPointData(r0, r2)
            com.facebook.quicklog.MarkerEditor r0 = r0.pointEditingCompleted()
            r0.markerEditingCompleted()
        L5d:
            return r5
        L5e:
            X.AbstractC09560e7.A00(r0)
            X.1RQ r0 = X.C1RQ.A00()
            X.C14360o3.A07(r0)
            X.1Ti r7 = X.EnumC27091Ti.A0J
            boolean r6 = r0.A05(r7)
            boolean r2 = r0.A06(r7)
            if (r10 == 0) goto L96
            X.02i r1 = r10.A00
            r0 = 331812717(0x13c70f6d, float:5.0249873E-27)
            com.facebook.quicklog.MarkerEditor r1 = r1.withMarker(r0)
            java.lang.String r0 = "LIBRARY_VOLTRON_PRECHECK"
            com.facebook.quicklog.PointEditor r1 = r1.pointEditor(r0)
            java.lang.String r0 = "IS_VOLTRON_MODULE_DOWNLOADED"
            com.facebook.quicklog.PointEditor r1 = r1.addPointData(r0, r6)
            java.lang.String r0 = "IS_VOLTRON_MODULE_LOADED"
            com.facebook.quicklog.PointEditor r0 = r1.addPointData(r0, r2)
            com.facebook.quicklog.MarkerEditor r0 = r0.pointEditingCompleted()
            r0.markerEditingCompleted()
        L96:
            X.3Pr r6 = new X.3Pr
            r6.<init>()
            if (r10 == 0) goto La7
            X.02i r2 = r10.A00
            java.lang.String r1 = "LIBRARY_DOWNLOAD_START"
            r0 = 331812717(0x13c70f6d, float:5.0249873E-27)
            r2.markerPoint(r0, r1)
        La7:
            X.1Ti[] r0 = new X.EnumC27091Ti[]{r7}
            X.MTC r2 = new X.MTC
            r2.<init>(r0)
            java.lang.Integer r0 = X.C05F.A00
            r2.A03 = r0
            r1 = 3
            X.9Jw r0 = new X.9Jw
            r0.<init>(r1, r6, r10)
            r2.A02 = r0
            X.MTD r1 = new X.MTD
            r1.<init>(r2)
            X.1RQ r0 = X.C1RQ.A00()
            r0.A03(r9, r1)
            r4.A01 = r8
            r4.A02 = r10
            r4.A00 = r3
            java.lang.Object r0 = r6.A0E(r4)
            if (r0 != r5) goto L27
            return r5
        Ld5:
            X.PXA r4 = new X.PXA
            r4.<init>(r8, r11, r3)
            goto L15
        Ldc:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ml.audiotranscription.CalDownloader.A00(com.instagram.common.session.UserSession, X.5tk, X.1Ds):java.lang.Object");
    }
}
