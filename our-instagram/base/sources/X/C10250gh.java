package X;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;

/* renamed from: X.0gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10250gh extends X509ExtendedTrustManager implements InterfaceC18690vw {
    public final C10230gf A00;

    @Override // X.C0UQ
    public final void AHG(String str, String str2, X509Certificate[] x509CertificateArr) {
        this.A00.AHG("ECDHE_ECDSA", str2, x509CertificateArr);
    }

    @Override // X.InterfaceC18690vw
    public final void AHH(String str, String str2, X509Certificate[] x509CertificateArr, boolean z) {
        this.A00.AHH("ECDHE_ECDSA", str2, x509CertificateArr, z);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.A00.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.A00.getAcceptedIssuers();
    }

    public C10250gh(long j) {
        this.A00 = new C10230gf(C20710zq.A00(), j);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        throw new CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        C10230gf c10230gf = this.A00;
        ((X509ExtendedTrustManager) c10230gf.A02).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        c10230gf.A01(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        throw new CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        C10230gf c10230gf = this.A00;
        ((X509ExtendedTrustManager) c10230gf.A02).checkServerTrusted(x509CertificateArr, str, socket);
        c10230gf.A01(x509CertificateArr);
    }
}
