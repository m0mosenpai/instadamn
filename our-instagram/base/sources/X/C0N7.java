package X;

import java.net.HttpURLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* renamed from: X.0N7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0N7 implements InterfaceC024309r {
    public long A00;
    public C0UP A01;

    @Override // X.InterfaceC024309r
    public final HttpURLConnection AqP(java.net.URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            C0UP c0up = this.A01;
            if (c0up == null) {
                c0up = new C0UP(this.A00);
                this.A01 = c0up;
            }
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, c0up.A00, null);
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (KeyManagementException | NoSuchAlgorithmException e) {
                C0K8.A0H("lacrima", "Pinning failed", e);
                C0PC.A00().DEh("SocketFactory", e, null);
            }
        }
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        return httpURLConnection;
    }
}
