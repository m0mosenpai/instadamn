package X;

/* renamed from: X.Nxf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54201Nxf {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r4 = r0.getAuthority();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r3 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        return new X.C45123Jxs(X.C9L8.A01(r6, r7), java.lang.Boolean.valueOf(r6.getBooleanExtra("com.instagram.sharedSticker.attach_audio_previews", false)), r3, r4, r6.getStringExtra("content_url"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r4 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4.length() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r0 = r5.getReferrer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r0 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C45123Jxs A00(android.app.Activity r5, android.content.Intent r6, X.AbstractC12990ll r7) {
        /*
            r1 = 0
            java.lang.String r0 = "source_application"
            java.lang.String r3 = r6.getStringExtra(r0)
            if (r3 == 0) goto L44
            int r0 = r3.length()
            if (r0 == 0) goto L44
            r4 = r3
        L10:
            int r0 = r4.length()
            if (r0 != 0) goto L20
        L16:
            android.net.Uri r0 = r5.getReferrer()
            if (r0 == 0) goto L42
            java.lang.String r4 = r0.getAuthority()
        L20:
            java.lang.String r0 = ""
            if (r4 != 0) goto L25
            r4 = r0
        L25:
            if (r3 != 0) goto L28
            r3 = r0
        L28:
            java.lang.String r0 = "content_url"
            java.lang.String r5 = r6.getStringExtra(r0)
            java.lang.String r0 = "com.instagram.sharedSticker.attach_audio_previews"
            boolean r0 = r6.getBooleanExtra(r0, r1)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = X.C9L8.A01(r6, r7)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            X.Jxs r0 = new X.Jxs
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L42:
            r4 = 0
            goto L20
        L44:
            java.lang.String r4 = r5.getCallingPackage()
            if (r4 == 0) goto L16
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54201Nxf.A00(android.app.Activity, android.content.Intent, X.0ll):X.Jxs");
    }
}
