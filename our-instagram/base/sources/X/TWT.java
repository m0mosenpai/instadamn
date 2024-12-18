package X;

import java.security.cert.X509Certificate;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes10.dex */
public final class TWT implements InterfaceC65462TkY {
    public final Map A00 = AbstractC166987dD.A1I();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof TWT) && ((TWT) obj).A00.equals(this.A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public TWT(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            java.util.Set set = (java.util.Set) this.A00.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.A00.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    @Override // X.InterfaceC65462TkY
    public final X509Certificate AVO(X509Certificate x509Certificate) {
        java.util.Set<X509Certificate> set = (java.util.Set) this.A00.get(x509Certificate.getIssuerX500Principal());
        if (set != null) {
            for (X509Certificate x509Certificate2 : set) {
                try {
                    x509Certificate.verify(x509Certificate2.getPublicKey());
                    return x509Certificate2;
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }
}
