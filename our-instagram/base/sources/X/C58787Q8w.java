package X;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Q8w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58787Q8w extends AbstractC73327Y8i implements InterfaceC65627Tpn {
    public long A00;
    public long A01;
    public InputStream A02;
    public int A03;
    public C62932SYa A04;
    public HttpURLConnection A05;
    public boolean A06;
    public final C62472SCz A07;
    public final C62472SCz A08;

    public C58787Q8w(C62472SCz c62472SCz) {
        super(true);
        this.A07 = c62472SCz;
        this.A08 = new C62472SCz();
    }

    private HttpURLConnection A00(java.net.URL url, Map map, long j) {
        Map map2;
        Map map3;
        String A0e;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD);
        httpURLConnection.setReadTimeout(CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD);
        HashMap A1G = AbstractC166987dD.A1G();
        C62472SCz c62472SCz = this.A07;
        synchronized (c62472SCz) {
            map2 = c62472SCz.A00;
            if (map2 == null) {
                map2 = Collections.unmodifiableMap(AbstractC58318PtA.A10(c62472SCz.A01));
                c62472SCz.A00 = map2;
            }
        }
        A1G.putAll(map2);
        C62472SCz c62472SCz2 = this.A08;
        synchronized (c62472SCz2) {
            map3 = c62472SCz2.A00;
            if (map3 == null) {
                map3 = Collections.unmodifiableMap(AbstractC58318PtA.A10(c62472SCz2.A01));
                c62472SCz2.A00 = map3;
            }
        }
        A1G.putAll(map3);
        A1G.putAll(map);
        Iterator A14 = AbstractC166997dE.A14(A1G);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            httpURLConnection.setRequestProperty(AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K));
        }
        if (j == 0) {
            A0e = null;
        } else {
            A0e = AnonymousClass001.A0e("bytes=", "-", j);
        }
        if (A0e != null) {
            httpURLConnection.setRequestProperty("Range", A0e);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoOutput(false);
        C62932SYa c62932SYa = C62932SYa.$redex_init_class;
        httpURLConnection.setRequestMethod("GET");
        AbstractC09810fe.A02(httpURLConnection, 419728071);
        return httpURLConnection;
    }

    @Override // X.InterfaceC65627Tpn
    public final void close() {
        try {
            InputStream inputStream = this.A02;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new Q94(this.A04, e, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 3);
                }
            }
        } finally {
            this.A02 = null;
            A01();
            if (this.A06) {
                this.A06 = false;
                A02();
            }
        }
    }

    private void A01() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC63374Sil.A05("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.A05 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    @Override // X.InterfaceC65627Tpn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E2I(X.C62932SYa r23) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58787Q8w.E2I(X.SYa):long");
    }

    @Override // X.InterfaceC65627Tpn
    public final android.net.Uri getUri() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // X.InterfaceC71873X8g
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.A01;
            if (j != -1) {
                long j2 = j - this.A00;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                } else {
                    return -1;
                }
            }
            int read = this.A02.read(bArr, i, i2);
            if (read != -1) {
                this.A00 += read;
                A04(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            throw Q94.A00(this.A04, e, 2);
        }
    }
}
