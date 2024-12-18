package X;

import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class SEB {
    public final X509Certificate A00;
    public final List A01;

    public SEB(List list) {
        this.A01 = Collections.unmodifiableList(list);
        X509Certificate x509Certificate = null;
        try {
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(AnonymousClass001.A0g(MSV.A00(656), (String) AbstractC166987dD.A16(list), "\n-----END CERTIFICATE-----").getBytes()));
            if (generateCertificate instanceof X509Certificate) {
                x509Certificate = (X509Certificate) generateCertificate;
            }
        } catch (Throwable unused) {
        }
        this.A00 = x509Certificate;
    }
}
