package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.location.platform.api.Location;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.StS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63772StS implements InterfaceC65570Tn3 {
    public static final C61681Rrv A06 = new Object();
    public InputStream A00;
    public HttpURLConnection A01;
    public final int A02;
    public final C61681Rrv A03;
    public final C63732Ssm A04;
    public volatile boolean A05;

    private InputStream A00(java.net.URL url, java.net.URL url2, Map map, int i) {
        int i2;
        int i3;
        int i4;
        InputStream A00;
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C61021Rdp("In re-direct loop", null, -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    httpURLConnection.addRequestProperty(AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K));
                }
                int i5 = this.A02;
                httpURLConnection.setConnectTimeout(i5);
                httpURLConnection.setReadTimeout(i5);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.A01 = httpURLConnection;
                try {
                    AbstractC09810fe.A02(httpURLConnection, -167850520);
                    this.A00 = AbstractC09810fe.A00(this.A01, -2142065203);
                    if (this.A05) {
                        return null;
                    }
                    try {
                        i3 = this.A01.getResponseCode();
                    } catch (IOException unused2) {
                        android.util.Log.isLoggable("HttpUrlFetcher", 3);
                        i3 = -1;
                    }
                    int i6 = i3 / 100;
                    if (AbstractC167007dF.A1P(i6, 2)) {
                        HttpURLConnection httpURLConnection2 = this.A01;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                A00 = new C61002RdV(AbstractC09810fe.A00(httpURLConnection2, 1829354929), httpURLConnection2.getContentLength());
                            } else {
                                if (android.util.Log.isLoggable("HttpUrlFetcher", 3)) {
                                    httpURLConnection2.getContentEncoding();
                                }
                                A00 = AbstractC09810fe.A00(httpURLConnection2, -1924838033);
                            }
                            this.A00 = A00;
                            return A00;
                        } catch (IOException e) {
                            try {
                                i4 = httpURLConnection2.getResponseCode();
                            } catch (IOException unused3) {
                                android.util.Log.isLoggable("HttpUrlFetcher", 3);
                                i4 = -1;
                            }
                            throw new C61021Rdp("Failed to obtain InputStream", e, i4);
                        }
                    }
                    if (AbstractC167007dF.A1P(i6, 3)) {
                        String headerField = this.A01.getHeaderField(Location.TAG);
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                java.net.URL url3 = new java.net.URL(url, headerField);
                                cleanup();
                                return A00(url3, url, map, i + 1);
                            } catch (MalformedURLException e2) {
                                throw new C61021Rdp(AnonymousClass001.A0R("Bad redirect url: ", headerField), e2, i3);
                            }
                        }
                        throw new C61021Rdp("Received empty or null redirect url", null, i3);
                    }
                    if (i3 == -1) {
                        throw new C61021Rdp("Http request failed", null, -1);
                    }
                    try {
                        throw new C61021Rdp(this.A01.getResponseMessage(), null, i3);
                    } catch (IOException e3) {
                        throw new C61021Rdp("Failed to get a response message", e3, i3);
                    }
                } catch (IOException e4) {
                    try {
                        i2 = this.A01.getResponseCode();
                    } catch (IOException unused4) {
                        android.util.Log.isLoggable("HttpUrlFetcher", 3);
                        i2 = -1;
                    }
                    throw new C61021Rdp("Failed to connect or obtain data", e4, i2);
                }
            } catch (IOException e5) {
                throw new C61021Rdp("URL.openConnection threw", e5, 0);
            }
        }
        throw new C61021Rdp("Too many (> 5) redirects!", null, -1);
    }

    @Override // X.InterfaceC65570Tn3
    public final void cancel() {
        this.A05 = true;
    }

    public C63772StS(C63732Ssm c63732Ssm, int i) {
        C61681Rrv c61681Rrv = A06;
        this.A04 = c63732Ssm;
        this.A02 = i;
        this.A03 = c61681Rrv;
    }

    @Override // X.InterfaceC65570Tn3
    public final Class Avg() {
        return InputStream.class;
    }

    @Override // X.InterfaceC65570Tn3
    public final Integer Avo() {
        return C05F.A01;
    }

    @Override // X.InterfaceC65570Tn3
    public final void ChQ(EnumC61107RfN enumC61107RfN, InterfaceC65471Tko interfaceC65471Tko) {
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                C63732Ssm c63732Ssm = this.A04;
                java.net.URL url = c63732Ssm.A01;
                if (url == null) {
                    if (TextUtils.isEmpty(c63732Ssm.A00)) {
                        String str = c63732Ssm.A04;
                        if (TextUtils.isEmpty(str)) {
                            java.net.URL url2 = c63732Ssm.A05;
                            Rs8.A00(url2);
                            str = url2.toString();
                        }
                        c63732Ssm.A00 = android.net.Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                    }
                    url = new java.net.URL(c63732Ssm.A00);
                    c63732Ssm.A01 = url;
                }
                interfaceC65471Tko.D9H(A00(url, null, c63732Ssm.A03.BDK(), 0));
            } catch (IOException e) {
                android.util.Log.isLoggable("HttpUrlFetcher", 3);
                interfaceC65471Tko.DPj(e);
            }
        } finally {
            if (android.util.Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    @Override // X.InterfaceC65570Tn3
    public final void cleanup() {
        InputStream inputStream = this.A00;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.A01;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.A01 = null;
    }
}
