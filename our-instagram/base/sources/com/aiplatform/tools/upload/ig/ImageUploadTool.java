package com.aiplatform.tools.upload.ig;

/* loaded from: classes8.dex */
public final class ImageUploadTool {
    public static final ImageUploadTool A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.aiplatform.tools.upload.ig.ImageUploadTool r14, com.instagram.common.session.UserSession r15, java.lang.String r16, X.InterfaceC23621Ds r17, int r18) {
        /*
            r3 = 15
            r4 = r17
            boolean r0 = X.MAQ.A02(r4, r3)
            if (r0 == 0) goto L90
            r11 = r4
            X.MAQ r11 = (X.MAQ) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r11.A00 = r2
        L18:
            java.lang.Object r4 = r11.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r11.A00
            r3 = 1
            if (r0 == 0) goto L57
            if (r0 != r3) goto L9d
            X.AbstractC09560e7.A00(r4)
        L26:
            X.Nle r4 = (X.AbstractC53512Nle) r4
            boolean r0 = r4 instanceof X.NRT
            r1 = 0
            if (r0 == 0) goto L37
            X.NRT r4 = (X.NRT) r4
            java.lang.String r0 = r4.A00
        L31:
            X.Jsp r2 = new X.Jsp
            r2.<init>(r0, r1)
            return r2
        L37:
            boolean r0 = r4 instanceof X.NRU
            if (r0 == 0) goto L42
            X.NRU r4 = (X.NRU) r4
            java.lang.Throwable r1 = r4.A00
            java.lang.String r0 = "Media Upload Failure"
            goto L31
        L42:
            boolean r0 = r4 instanceof X.NRV
            if (r0 == 0) goto L98
            X.NRV r4 = (X.NRV) r4
            X.W63 r0 = r4.A00
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L54
            X.Jso r2 = new X.Jso
            r2.<init>(r0)
            return r2
        L54:
            java.lang.String r0 = "Successful response, but missing file handle"
            goto L31
        L57:
            X.AbstractC09560e7.A00(r4)
            java.lang.String r9 = X.AbstractC43593JPy.A0x()
            com.instagram.pendingmedia.service.upload.FbUploaderUtil r4 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A00
            X.OVd r0 = new X.OVd
            r13 = r15
            r0.<init>(r15)
            X.WVG r5 = new X.WVG
            r5.<init>(r0)
            X.Onf r6 = new X.Onf
            r6.<init>()
            X.1tc r1 = X.EnumC40111tc.A0Q
            java.lang.String r15 = "ig_sharing_genai"
            r12 = 0
            r8 = r16
            r17 = r18
            r14 = r9
            r18 = r12
            X.OUc r0 = X.AbstractC54105Nw3.A00(r13, r14, r15, r16, r17, r18)
            X.O8O r7 = new X.O8O
            r7.<init>(r0, r1)
            r11.A00 = r3
            java.lang.String r10 = ""
            java.lang.Object r4 = r4.A04(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r4 != r2) goto L26
            return r2
        L90:
            r0 = 42
            X.MAQ r11 = new X.MAQ
            r11.<init>(r14, r4, r3, r0)
            goto L18
        L98:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L9d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aiplatform.tools.upload.ig.ImageUploadTool.A00(com.aiplatform.tools.upload.ig.ImageUploadTool, com.instagram.common.session.UserSession, java.lang.String, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(android.content.Context r13, android.graphics.Bitmap r14, com.instagram.common.session.UserSession r15, X.InterfaceC23621Ds r16) {
        /*
            r12 = this;
            r3 = 18
            r4 = r16
            boolean r0 = X.MAN.A02(r4, r3)
            if (r0 == 0) goto La7
            r9 = r4
            X.MAN r9 = (X.MAN) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r9.A00 = r2
        L18:
            java.lang.Object r1 = r9.A02
            X.1JX r8 = X.C1JX.A02
            int r0 = r9.A00
            r7 = 1
            if (r0 == 0) goto L32
            if (r0 != r7) goto Lae
            java.lang.Object r6 = r9.A01
            java.io.File r6 = (java.io.File) r6
            X.AbstractC09560e7.A00(r1)
        L2a:
            boolean r0 = r1 instanceof X.C44817Jso
            if (r0 == 0) goto L31
            r6.delete()
        L31:
            return r1
        L32:
            X.AbstractC09560e7.A00(r1)
            android.graphics.Bitmap$Config r1 = r14.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r10 = 0
            if (r1 == r0) goto L55
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "bitmap format not supported: "
            r1.append(r0)
            android.graphics.Bitmap$Config r0 = r14.getConfig()
            java.lang.String r1 = X.AbstractC166997dE.A0v(r0, r1)
            X.Jsp r0 = new X.Jsp
            r0.<init>(r1, r10)
            return r0
        L55:
            int r5 = r14.getWidth()
            java.lang.String r2 = "tmp_photo_"
            java.lang.String r1 = ".jpg"
            java.io.File r0 = r13.getCacheDir()     // Catch: java.io.IOException -> L66
            java.io.File r6 = java.io.File.createTempFile(r2, r1, r0)     // Catch: java.io.IOException -> L66
            goto L67
        L66:
            r6 = 0
        L67:
            java.lang.String r4 = "new file creation failed"
            if (r6 == 0) goto Lb3
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG
            r1 = 100
            java.io.File r2 = r6.getParentFile()
            r3 = 0
            if (r2 == 0) goto L82
            boolean r0 = r2.exists()
            if (r0 != 0) goto L93
            boolean r0 = r2.mkdirs()
            if (r0 != 0) goto L93
        L82:
            if (r3 == 0) goto Lb3
            java.lang.String r0 = X.AbstractC43592JPx.A0x(r6)
            r9.A01 = r6
            r9.A00 = r7
            java.lang.Object r1 = A00(r12, r15, r0, r9, r5)
            if (r1 != r8) goto L2a
            return r8
        L93:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L82
            r2.<init>(r6)     // Catch: java.io.IOException -> L82
            X.C0fK.A02(r11, r14, r2, r1)     // Catch: java.lang.Throwable -> La0
            r2.close()     // Catch: java.io.IOException -> L82
            r3 = 1
            goto L82
        La0:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> La2
        La2:
            r0 = move-exception
            X.C20I.A00(r2, r1)     // Catch: java.io.IOException -> L82
            throw r0     // Catch: java.io.IOException -> L82
        La7:
            X.MAN r9 = new X.MAN
            r9.<init>(r12, r4, r3)
            goto L18
        Lae:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lb3:
            X.Jsp r8 = new X.Jsp
            r8.<init>(r4, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aiplatform.tools.upload.ig.ImageUploadTool.A01(android.content.Context, android.graphics.Bitmap, com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }
}
