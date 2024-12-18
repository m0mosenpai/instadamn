package X;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: X.0gf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10230gf extends AbstractC18670vu implements InterfaceC18690vw {
    public final X509TrustManagerExtensions A00;

    @Override // X.C0UQ
    public final void AHG(String str, String str2, X509Certificate[] x509CertificateArr) {
        A00(this.A00.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA", str2));
    }

    @Override // X.InterfaceC18690vw
    public final void AHH(String str, String str2, X509Certificate[] x509CertificateArr, boolean z) {
        List<X509Certificate> checkServerTrusted = this.A00.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA", str2);
        if (z) {
            A00(checkServerTrusted);
        }
    }

    public C10230gf(C20710zq c20710zq, long j) {
        super(c20710zq, j);
        this.A00 = new X509TrustManagerExtensions(this.A02);
    }
}
