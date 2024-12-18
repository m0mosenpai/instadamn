package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.RMj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60691RMj extends AbstractC60694RMm {
    public static final byte[] A02 = "\n".getBytes();
    public final SYI A00;
    public final String A01;

    public static final int A00(C60691RMj c60691RMj, java.net.URL url, byte[] bArr) {
        C3U5.A02(bArr);
        int length = bArr.length;
        HttpURLConnection httpURLConnection = null;
        AbstractC63371Sic.A08(c60691RMj, Integer.valueOf(length), url, null, "POST bytes, url", 3);
        if (android.util.Log.isLoggable((String) SVM.A0D.A00, 2)) {
            c60691RMj.A0D("Post payload\n", new String(bArr));
        }
        C0fU c0fU = null;
        try {
            try {
                C63335Shm c63335Shm = ((AbstractC63371Sic) c60691RMj).A00;
                c63335Shm.A00.getPackageName();
                httpURLConnection = A01(c60691RMj, url);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setFixedLengthStreamingMode(length);
                AbstractC09810fe.A02(httpURLConnection, -342800347);
                c0fU = AbstractC09810fe.A01(httpURLConnection, -313428621);
                c0fU.write(bArr);
                A02(c60691RMj, httpURLConnection);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    AbstractC63371Sic.A0A(c63335Shm);
                }
                c60691RMj.A0E("POST status", Integer.valueOf(responseCode));
                try {
                    c0fU.close();
                } catch (IOException e) {
                    c60691RMj.A0G("Error closing http post connection output stream", e);
                }
                httpURLConnection.disconnect();
                return responseCode;
            } catch (IOException e2) {
                c60691RMj.A0F("Network POST connection error", e2);
                if (c0fU != null) {
                    try {
                        c0fU.close();
                    } catch (IOException e3) {
                        c60691RMj.A0G("Error closing http post connection output stream", e3);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    return 0;
                }
                return 0;
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0018, code lost:
    
        r4.A0G("Error closing http connection input stream", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C60691RMj r4, java.net.HttpURLConnection r5) {
        /*
            java.lang.String r3 = "Error closing http connection input stream"
            r0 = -1939423162(0xffffffff8c66c046, float:-1.7776416E-31)
            X.0fR r2 = X.AbstractC09810fe.A00(r5, r0)     // Catch: java.lang.Throwable -> L27
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L1d
        Ld:
            int r0 = r2.read(r1)     // Catch: java.lang.Throwable -> L1d
            if (r0 > 0) goto Ld
            r2.close()     // Catch: java.io.IOException -> L17
            goto L1c
        L17:
            r0 = move-exception
            r4.A0G(r3, r0)
            return
        L1c:
            return
        L1d:
            r1 = move-exception
            r2.close()     // Catch: java.io.IOException -> L22
            throw r1
        L22:
            r0 = move-exception
            r4.A0G(r3, r0)
            throw r1
        L27:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60691RMj.A02(X.RMj, java.net.HttpURLConnection):void");
    }

    public C60691RMj(C63335Shm c63335Shm) {
        super(c63335Shm);
        this.A01 = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", AbstractC62369S8t.A00, Build.VERSION.RELEASE, AbstractC63066Sbn.A01(Locale.getDefault()), Build.MODEL, Build.ID);
        this.A00 = new SYI(c63335Shm.A04);
    }

    public static final HttpURLConnection A01(C60691RMj c60691RMj, java.net.URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(AbstractC166987dD.A0H(SVM.A02.A00));
            httpURLConnection.setReadTimeout(AbstractC166987dD.A0H(SVM.A03.A00));
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", c60691RMj.A01);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw MSW.A0y("Failed to obtain http connection");
    }

    public static void A03(String str, String str2, StringBuilder sb) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        AbstractC58322PtE.A1S(sb, URLEncoder.encode(str, ReactWebViewManager.HTML_ENCODING));
        sb.append(URLEncoder.encode(str2, ReactWebViewManager.HTML_ENCODING));
    }

    public final String A0J(SZ8 sz8, boolean z) {
        String valueOf;
        C3U5.A02(sz8);
        StringBuilder A1C = AbstractC166987dD.A1C();
        try {
            Map map = sz8.A04;
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                String A17 = AbstractC31172DnG.A17(A1K);
                if (!"ht".equals(A17) && !"qt".equals(A17) && !"AppUID".equals(A17) && !"z".equals(A17) && !"_gmsv".equals(A17)) {
                    A03(A17, AbstractC58318PtA.A0p(A1K), A1C);
                }
            }
            long j = sz8.A02;
            A03("ht", String.valueOf(j), A1C);
            A03("qt", String.valueOf(AbstractC37300Gc1.A00(j)), A1C);
            if (z) {
                String str = "0";
                C3U5.A04("_s");
                C3U5.A08(!"_s".startsWith("&"), "Short param name required");
                String A1A = AbstractC166987dD.A1A("_s", map);
                if (A1A != null) {
                    str = A1A;
                }
                long j2 = 0;
                try {
                    j2 = Long.parseLong(str);
                } catch (NumberFormatException unused) {
                }
                if (j2 == 0) {
                    valueOf = String.valueOf(sz8.A01);
                } else {
                    valueOf = String.valueOf(j2);
                }
                A03("z", valueOf, A1C);
            }
            return A1C.toString();
        } catch (UnsupportedEncodingException e) {
            A0G("Failed to encode name or value", e);
            return null;
        }
    }

    public final boolean A0K() {
        SX6.A00();
        A0I();
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((AbstractC63371Sic) this).A00.A00.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
        } catch (SecurityException unused) {
        }
        AbstractC63371Sic.A09(this, "No network connectivity", 2);
        return false;
    }
}
