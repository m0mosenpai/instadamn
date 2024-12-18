package X;

/* loaded from: classes10.dex */
public abstract class S1O {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000c, code lost:
    
        if (r7.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(com.facebook.smartcapture.logging.IdCaptureLogger r6, java.lang.String r7, java.security.PublicKey r8) {
        /*
            java.lang.String r5 = "Error in encrypting results"
            r4 = 0
            r3 = 0
            r2 = 1
            if (r7 == 0) goto Le
            int r1 = r7.length()     // Catch: java.lang.Throwable -> L29
            r0 = 0
            if (r1 != 0) goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 != 0) goto L2d
            if (r8 == 0) goto L2d
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L29
            r1.init(r2, r8)     // Catch: java.lang.Throwable -> L29
            byte[] r0 = X.MSY.A1a(r7)     // Catch: java.lang.Throwable -> L29
            byte[] r0 = r1.doFinal(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = android.util.Base64.encodeToString(r0, r3)     // Catch: java.lang.Throwable -> L29
            return r4
        L29:
            r0 = move-exception
            r6.logError(r5, r0)
        L2d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S1O.A00(com.facebook.smartcapture.logging.IdCaptureLogger, java.lang.String, java.security.PublicKey):java.lang.String");
    }
}
