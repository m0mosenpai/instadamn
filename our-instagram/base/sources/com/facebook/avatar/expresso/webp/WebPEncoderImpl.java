package com.facebook.avatar.expresso.webp;

import X.C12W;
import X.C14360o3;
import com.facebook.onecamera.modules.videoencoding.webp.WebPEncoder;

/* loaded from: classes8.dex */
public final class WebPEncoderImpl {
    public final int A00;
    public final WebPEncoder A01;
    public final C12W A02;

    public WebPEncoderImpl(C12W c12w, int i) {
        C14360o3.A0B(c12w, 1);
        this.A02 = c12w;
        this.A00 = i;
        this.A01 = new WebPEncoder();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.facebook.quicklog.QuickPerformanceLogger r9, java.io.File r10, X.InterfaceC23621Ds r11, int r12) {
        /*
            r8 = this;
            r6 = 2
            boolean r0 = X.MAI.A01(r11, r6)
            if (r0 == 0) goto L31
            r5 = r11
            X.MAI r5 = (X.MAI) r5
            int r2 = r5.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r5.A01 = r2
        L15:
            java.lang.Object r1 = r5.A05
            X.1JX r0 = X.C1JX.A02
            int r3 = r5.A01
            r2 = 1
            if (r3 == 0) goto L4b
            if (r3 == r2) goto L3c
            if (r3 != r6) goto L37
            int r12 = r5.A00
            java.lang.Object r7 = r5.A04
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r5.A03
            com.facebook.quicklog.QuickPerformanceLogger r9 = (com.facebook.quicklog.QuickPerformanceLogger) r9
            java.lang.Object r10 = r5.A02
            java.io.File r10 = (java.io.File) r10
            goto L97
        L31:
            X.MAI r5 = new X.MAI
            r5.<init>(r8, r11, r6)
            goto L15
        L37:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L3c:
            int r12 = r5.A00
            java.lang.Object r9 = r5.A04
            com.facebook.quicklog.QuickPerformanceLogger r9 = (com.facebook.quicklog.QuickPerformanceLogger) r9
            java.lang.Object r10 = r5.A03
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r2 = r5.A02
            com.facebook.avatar.expresso.webp.WebPEncoderImpl r2 = (com.facebook.avatar.expresso.webp.WebPEncoderImpl) r2
            goto L77
        L4b:
            X.AbstractC09560e7.A00(r1)
            r5.A02 = r8     // Catch: java.io.IOException -> La7
            r5.A03 = r10     // Catch: java.io.IOException -> La7
            r5.A04 = r9     // Catch: java.io.IOException -> La7
            r5.A00 = r12     // Catch: java.io.IOException -> La7
            r5.A01 = r2     // Catch: java.io.IOException -> La7
            com.facebook.onecamera.modules.videoencoding.webp.WebPEncoder r1 = r8.A01     // Catch: java.io.IOException -> La7
            java.nio.ByteBuffer r7 = r1.assemble()     // Catch: java.io.IOException -> La7
            X.C14360o3.A07(r7)     // Catch: java.io.IOException -> La7
            X.12W r4 = r8.A02     // Catch: java.io.IOException -> La7
            r3 = 0
            r2 = 8
            X.MBr r1 = new X.MBr     // Catch: java.io.IOException -> La7
            r1.<init>(r7, r10, r3, r2)     // Catch: java.io.IOException -> La7
            java.lang.Object r1 = X.AbstractC23641Du.A00(r5, r4, r1)     // Catch: java.io.IOException -> La7
            if (r1 == r0) goto L73
            X.0eB r1 = X.C0eB.A00     // Catch: java.io.IOException -> La7
        L73:
            if (r1 == r0) goto Laf
            r2 = r8
            goto L7a
        L77:
            X.AbstractC09560e7.A00(r1)     // Catch: java.io.IOException -> La7
        L7a:
            java.lang.String r7 = "file_size"
            X.12W r4 = r2.A02     // Catch: java.io.IOException -> La7
            r3 = 0
            r2 = 27
            X.MW8 r1 = new X.MW8     // Catch: java.io.IOException -> La7
            r1.<init>(r10, r3, r2)     // Catch: java.io.IOException -> La7
            r5.A02 = r10     // Catch: java.io.IOException -> La7
            r5.A03 = r9     // Catch: java.io.IOException -> La7
            r5.A04 = r7     // Catch: java.io.IOException -> La7
            r5.A00 = r12     // Catch: java.io.IOException -> La7
            r5.A01 = r6     // Catch: java.io.IOException -> La7
            java.lang.Object r1 = X.AbstractC23641Du.A00(r5, r4, r1)     // Catch: java.io.IOException -> La7
            if (r1 != r0) goto L9a
            return r0
        L97:
            X.AbstractC09560e7.A00(r1)     // Catch: java.io.IOException -> La7
        L9a:
            long r0 = X.AbstractC166987dD.A0N(r1)     // Catch: java.io.IOException -> La7
            r9.markerAnnotate(r12, r7, r0)     // Catch: java.io.IOException -> La7
            X.Mol r0 = new X.Mol     // Catch: java.io.IOException -> La7
            r0.<init>(r10)     // Catch: java.io.IOException -> La7
            return r0
        La7:
            r2 = move-exception
            java.lang.Integer r1 = X.C05F.A00
            X.JuQ r0 = new X.JuQ
            r0.<init>(r2, r1)
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.webp.WebPEncoderImpl.A00(com.facebook.quicklog.QuickPerformanceLogger, java.io.File, X.1Ds, int):java.lang.Object");
    }
}
