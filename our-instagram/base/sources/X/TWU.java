package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes10.dex */
public final class TWU implements InterfaceC65462TkY {
    public final Method A00;
    public final X509TrustManager A01;

    @Override // X.InterfaceC65462TkY
    public final X509Certificate AVO(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.A00.invoke(this.A01, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException unused) {
            throw AbstractC58318PtA.A0W("unable to get issues and signature");
        } catch (InvocationTargetException unused2) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TWU)) {
            return false;
        }
        TWU twu = (TWU) obj;
        return this.A01.equals(twu.A01) && this.A00.equals(twu.A00);
    }

    public final int hashCode() {
        return this.A01.hashCode() + AbstractC166987dD.A0G(this.A00);
    }

    public TWU(Method method, X509TrustManager x509TrustManager) {
        this.A00 = method;
        this.A01 = x509TrustManager;
    }
}
