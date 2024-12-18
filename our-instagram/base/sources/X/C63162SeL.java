package X;

import java.lang.ref.SoftReference;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* renamed from: X.SeL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63162SeL {
    public SoftReference A00 = new SoftReference(null);

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        r5 = (javax.net.ssl.X509TrustManager) r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[Catch: all -> 0x0059, TryCatch #2 {, blocks: (B:8:0x000d, B:11:0x0015, B:13:0x0032, B:15:0x003a, B:19:0x0040, B:17:0x0043, B:28:0x001f, B:30:0x0029), top: B:7:0x000d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[Catch: all -> 0x0065, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:24:0x0049, B:25:0x004d, B:32:0x005a, B:8:0x000d, B:11:0x0015, B:13:0x0032, B:15:0x003a, B:19:0x0040, B:17:0x0043, B:28:0x001f, B:30:0x0029), top: B:3:0x0002, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:24:0x0049, B:25:0x004d, B:32:0x005a, B:8:0x000d, B:11:0x0015, B:13:0x0032, B:15:0x003a, B:19:0x0040, B:17:0x0043, B:28:0x001f, B:30:0x0029), top: B:3:0x0002, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[][] A02() {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            java.lang.ref.SoftReference r0 = r7.A00     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L65
            java.security.cert.X509Certificate[] r1 = (java.security.cert.X509Certificate[]) r1     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L5b
            r5 = 0
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch: java.security.KeyStoreException -> L1d java.security.NoSuchAlgorithmException -> L27 java.lang.Throwable -> L59
            javax.net.ssl.TrustManagerFactory r3 = javax.net.ssl.TrustManagerFactory.getInstance(r0)     // Catch: java.security.KeyStoreException -> L1d java.security.NoSuchAlgorithmException -> L27 java.lang.Throwable -> L59
            r3.init(r5)     // Catch: java.security.KeyStoreException -> L19 java.security.NoSuchAlgorithmException -> L1b java.lang.Throwable -> L59
            goto L30
        L19:
            r2 = move-exception
            goto L1f
        L1b:
            r2 = move-exception
            goto L29
        L1d:
            r2 = move-exception
            r3 = r5
        L1f:
            java.lang.Class<X.SeL> r1 = X.C63162SeL.class
            java.lang.String r0 = "Failed to create TrustManagerFactory"
            X.C0K8.A05(r1, r0, r2)     // Catch: java.lang.Throwable -> L59
            goto L30
        L27:
            r2 = move-exception
            r3 = r5
        L29:
            java.lang.Class<X.SeL> r1 = X.C63162SeL.class
            java.lang.String r0 = "Failed to create TrustManagerFactory"
            X.C0K8.A05(r1, r0, r2)     // Catch: java.lang.Throwable -> L59
        L30:
            if (r3 == 0) goto L47
            javax.net.ssl.TrustManager[] r4 = r3.getTrustManagers()     // Catch: java.lang.Throwable -> L59
            int r3 = r4.length     // Catch: java.lang.Throwable -> L59
            r2 = 0
        L38:
            if (r2 >= r3) goto L47
            r1 = r4[r2]     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1 instanceof javax.net.ssl.X509TrustManager     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L43
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1     // Catch: java.lang.Throwable -> L59
            goto L46
        L43:
            int r2 = r2 + 1
            goto L38
        L46:
            r5 = r1
        L47:
            if (r5 != 0) goto L4d
            r0 = 0
            java.security.cert.X509Certificate[] r1 = new java.security.cert.X509Certificate[r0]     // Catch: java.lang.Throwable -> L65
            goto L5b
        L4d:
            java.security.cert.X509Certificate[] r1 = r5.getAcceptedIssuers()     // Catch: java.lang.Throwable -> L65
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L65
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L65
            r7.A00 = r0     // Catch: java.lang.Throwable -> L65
            goto L5b
        L59:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L65
        L5b:
            monitor-exit(r6)
            java.util.List r0 = java.util.Arrays.asList(r1)
            byte[][] r0 = A01(r0)
            return r0
        L65:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63162SeL.A02():byte[][]");
    }

    public static synchronized ArrayList A00() {
        ArrayList A1E;
        synchronized (C63162SeL.class) {
            A1E = AbstractC166987dD.A1E();
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                keyStore.load(null, null);
                Enumeration<String> aliases = keyStore.aliases();
                while (aliases.hasMoreElements()) {
                    String nextElement = aliases.nextElement();
                    if (nextElement.startsWith("user:")) {
                        try {
                            Certificate certificate = keyStore.getCertificate(nextElement);
                            if (certificate instanceof X509Certificate) {
                                A1E.add((X509Certificate) certificate);
                            }
                        } catch (KeyStoreException e) {
                            C0K8.A06(C63162SeL.class, "Failed to get user Root CA", e);
                        }
                    }
                }
            } catch (Throwable th) {
                C0K8.A06(C63162SeL.class, "Failed to load AndroidCAStore", th);
            }
        }
        return A1E;
    }

    public static byte[][] A01(List list) {
        byte[][] bArr = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            try {
                bArr[i] = ((Certificate) list.get(i)).getEncoded();
            } catch (CertificateEncodingException e) {
                C0K8.A06(C63162SeL.class, "Failed to encode Root CA", e);
            }
        }
        return bArr;
    }
}
