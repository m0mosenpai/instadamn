package X;

import java.net.Proxy;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.Ptv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58355Ptv {
    public final C1FN A00;
    public final String A01;
    public final Proxy A02;
    public final HostnameVerifier A03;
    public final SSLSocketFactory A04;
    public final SSLSocketFactory A05;

    public C58355Ptv(C1FN c1fn, String str, Proxy proxy, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory, SSLSocketFactory sSLSocketFactory2) {
        this.A02 = proxy;
        this.A01 = str;
        this.A04 = sSLSocketFactory;
        this.A05 = sSLSocketFactory2;
        this.A00 = c1fn;
        this.A03 = hostnameVerifier;
    }

    public C58355Ptv() {
    }
}
