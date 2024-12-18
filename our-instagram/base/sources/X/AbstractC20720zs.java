package X;

/* renamed from: X.0zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20720zs {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r1 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r0.getPublicKey().equals(r2.getPublicKey()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.cert.X509Certificate[] A00(X.C20710zq r8, java.security.cert.Certificate[] r9) {
        /*
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r0 = 0
            r2 = r9[r0]
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.util.HashMap r3 = r8.A01
            javax.security.auth.x500.X500Principal r0 = r2.getSubjectX500Principal()
            java.lang.Object r0 = r3.get(r0)
            java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0
            if (r0 == 0) goto L27
            java.security.PublicKey r1 = r0.getPublicKey()
            java.security.PublicKey r0 = r2.getPublicKey()
            boolean r0 = r1.equals(r0)
            r8 = 1
            if (r0 != 0) goto L28
        L27:
            r8 = 0
        L28:
            r5.add(r2)
            r7 = 1
            r6 = 1
        L2d:
            int r0 = r9.length
            if (r6 >= r0) goto L78
            r4 = r9[r6]
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            int r0 = r6 + (-1)
            r2 = r9[r0]
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            javax.security.auth.x500.X500Principal r0 = r4.getSubjectX500Principal()
            java.lang.Object r0 = r3.get(r0)
            java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0
            if (r0 == 0) goto L55
            java.security.PublicKey r1 = r0.getPublicKey()
            java.security.PublicKey r0 = r4.getPublicKey()
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L59
            r8 = 1
        L59:
            javax.security.auth.x500.X500Principal r1 = r4.getSubjectX500Principal()
            javax.security.auth.x500.X500Principal r0 = r2.getIssuerX500Principal()
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L70
            java.security.PublicKey r0 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L70
            r2.verify(r0)     // Catch: java.security.GeneralSecurityException -> L70
            r1 = 1
        L70:
            if (r1 == 0) goto L78
            r5.add(r4)
            int r6 = r6 + 1
            goto L2d
        L78:
            int r6 = r6 - r7
            r4 = r9[r6]
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            javax.security.auth.x500.X500Principal r0 = r4.getIssuerX500Principal()
            java.lang.Object r3 = r3.get(r0)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            r2 = 0
            if (r3 == 0) goto La0
            javax.security.auth.x500.X500Principal r1 = r3.getSubjectX500Principal()
            javax.security.auth.x500.X500Principal r0 = r4.getSubjectX500Principal()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La0
            java.security.PublicKey r0 = r3.getPublicKey()     // Catch: java.security.GeneralSecurityException -> La0
            r4.verify(r0)     // Catch: java.security.GeneralSecurityException -> La0
            r2 = r3
        La0:
            if (r2 == 0) goto Lb2
            r5.add(r2)
        La5:
            int r0 = r5.size()
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r0 = r5.toArray(r0)
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0
            return r0
        Lb2:
            if (r8 != 0) goto La5
            java.lang.String r1 = "Didn't find a trust anchor in chain cleanup!"
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20720zs.A00(X.0zq, java.security.cert.Certificate[]):java.security.cert.X509Certificate[]");
    }
}
