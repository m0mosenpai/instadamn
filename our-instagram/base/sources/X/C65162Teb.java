package X;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* renamed from: X.Teb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65162Teb extends C63220SfQ {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.Teb, java.lang.Object] */
    public static C65162Teb A01() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new Object();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // X.C63220SfQ
    public final SSLContext A05() {
        try {
            return SSLContext.getInstance("TLSv1.3", Conscrypt.newProviderBuilder().provideTrustManager().build());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", Conscrypt.newProviderBuilder().provideTrustManager().build());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override // X.C63220SfQ
    public final String A04(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // X.C63220SfQ
    public final void A06(String str, List list, SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, AbstractC58319PtB.A1b(C63220SfQ.A00(list), 0));
        }
    }

    @Override // X.C63220SfQ
    public final void A07(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
