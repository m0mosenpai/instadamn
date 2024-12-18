package X;

import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* loaded from: classes10.dex */
public final class SL8 {
    public final Network A00;
    public final C62476SDd A01;

    public final HttpURLConnection A00(java.net.URL url) {
        URLConnection openConnection = this.A00.openConnection(url);
        C14360o3.A0C(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        C62476SDd c62476SDd = this.A01;
        httpURLConnection.setConnectTimeout(c62476SDd.A00);
        httpURLConnection.setReadTimeout(c62476SDd.A01);
        return httpURLConnection;
    }

    public SL8(Network network, C62476SDd c62476SDd) {
        this.A00 = network;
        this.A01 = c62476SDd;
    }
}
