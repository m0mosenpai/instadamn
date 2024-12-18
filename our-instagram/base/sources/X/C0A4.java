package X;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.0A4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0A4 implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
