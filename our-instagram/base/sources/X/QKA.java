package X;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes10.dex */
public final class QKA extends AbstractC64833TVy implements C0UQ, InterfaceC18690vw {
    public final X509TrustManagerExtensions A00;
    public final C0UQ A01;

    @Override // X.C0UQ
    public final void AHG(String str, String str2, X509Certificate[] x509CertificateArr) {
        try {
            this.A01.AHG("ECDHE_ECDSA", str2, x509CertificateArr);
        } catch (CertificateException unused) {
            this.A00.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA", str2);
        }
    }

    @Override // X.InterfaceC18690vw
    public final void AHH(String str, String str2, X509Certificate[] x509CertificateArr, boolean z) {
        C0UQ c0uq = this.A01;
        if (c0uq instanceof InterfaceC18690vw) {
            try {
                ((InterfaceC18690vw) c0uq).AHH("ECDHE_ECDSA", str2, x509CertificateArr, z);
                return;
            } catch (CertificateException unused) {
                this.A00.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA", str2);
                return;
            }
        }
        AHG("ECDHE_ECDSA", str2, x509CertificateArr);
    }

    public QKA(C0UQ c0uq) {
        super(c0uq);
        this.A01 = c0uq;
        this.A00 = new X509TrustManagerExtensions((X509TrustManager) super.A01[0]);
    }
}
