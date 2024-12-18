package X;

/* renamed from: X.OOo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54876OOo {
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c8, code lost:
    
        if (0 == 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[Catch: Exception -> 0x009c, all -> 0x00ce, DONT_GENERATE, TRY_ENTER, TryCatch #2 {Exception -> 0x009c, blocks: (B:4:0x0001, B:15:0x0042, B:35:0x008f, B:26:0x0098, B:27:0x009b), top: B:3:0x0001, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final double A00(java.lang.Integer r7, java.lang.String r8, int r9, int r10) {
        /*
            r6 = 0
            java.nio.ByteBuffer r0 = X.AbstractC66019TyH.A00(r9, r10)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lce
            X.AbstractC66019TyH.A01(r0, r9, r10)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lce
            android.graphics.Bitmap r2 = X.AbstractC167007dF.A0F(r9, r10)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lce
            r2.copyPixelsFromBuffer(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lce
            r6 = r2
            java.lang.String r4 = "image_upload_quality_error"
            java.lang.String r5 = "Image upload %s calc error"
            r3 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r8)     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
            if (r3 == 0) goto L47
            int r1 = r2.getWidth()     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
            int r0 = r3.getWidth()     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
            if (r1 != r0) goto L4e
            int r1 = r2.getHeight()     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
            int r0 = r3.getHeight()     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
            if (r1 != r0) goto L4e
            com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils r1 = new com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
            r1.<init>()     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
            if (r7 != r0) goto L3e
            float r0 = r1.calculateSSIM(r2, r3)     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
            double r0 = (double) r0     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
            goto L42
        L3e:
            double r0 = r1.calculateMSSSIM(r2, r3)     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
        L42:
            r3.recycle()     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lce
            goto Lca
        L47:
            java.lang.String r0 = "null bitmap"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
            goto L54
        L4e:
            java.lang.String r0 = "size mismatch"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
        L54:
            throw r0     // Catch: java.lang.OutOfMemoryError -> L55 java.lang.RuntimeException -> L57 java.lang.Throwable -> L95
        L55:
            r2 = move-exception
            goto L71
        L57:
            r2 = move-exception
            java.lang.Class<X.OOo> r1 = X.C54876OOo.class
            int r0 = r7.intValue()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L6e
            java.lang.String r0 = "MSSSIM"
        L62:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch: java.lang.Throwable -> L95
            X.C0K8.A09(r1, r5, r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = X.AbstractC166987dD.A19(r1)     // Catch: java.lang.Throwable -> L95
            goto L86
        L6e:
            java.lang.String r0 = "SSIM"
            goto L62
        L71:
            java.lang.Class<X.OOo> r1 = X.C54876OOo.class
            int r0 = r7.intValue()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L8a
            java.lang.String r0 = "MSSSIM"
        L7b:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch: java.lang.Throwable -> L95
            X.C0K8.A09(r1, r5, r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = X.AbstractC166987dD.A19(r1)     // Catch: java.lang.Throwable -> L95
        L86:
            X.AbstractC12120kG.A07(r0, r4, r2)     // Catch: java.lang.Throwable -> L95
            goto L8d
        L8a:
            java.lang.String r0 = "SSIM"
            goto L7b
        L8d:
            if (r3 == 0) goto L92
            r3.recycle()     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lce
        L92:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto Lca
        L95:
            r0 = move-exception
            if (r3 == 0) goto L9b
            r3.recycle()     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lce
        L9b:
            throw r0     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Lce
        L9c:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()     // Catch: java.lang.Throwable -> Lce
            java.lang.Class<X.OOo> r2 = X.C54876OOo.class
            r1.append(r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = "#measureImageSimilarityFromGLFrame"
            java.lang.String r1 = X.AbstractC166997dE.A0x(r0, r1)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = "image_upload_quality_error"
            X.AbstractC12120kG.A07(r1, r0, r3)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "Image upload %s calc error"
            int r0 = r7.intValue()     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lc3
            java.lang.String r0 = "MSSSIM"
        Lbb:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}     // Catch: java.lang.Throwable -> Lce
            X.C0K8.A09(r2, r1, r0)     // Catch: java.lang.Throwable -> Lce
            goto Lc6
        Lc3:
            java.lang.String r0 = "SSIM"
            goto Lbb
        Lc6:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r6 == 0) goto Lcd
        Lca:
            r6.recycle()
        Lcd:
            return r0
        Lce:
            r0 = move-exception
            if (r6 == 0) goto Ld4
            r6.recycle()
        Ld4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54876OOo.A00(java.lang.Integer, java.lang.String, int, int):double");
    }
}
