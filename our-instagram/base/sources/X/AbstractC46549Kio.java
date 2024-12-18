package X;

import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Arrays;

/* renamed from: X.Kio, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46549Kio {
    public static final boolean A00() {
        URLConnection openConnection = new java.net.URL("https://connectivitycheck.gstatic.com/generate_204").openConnection();
        C14360o3.A0C(openConnection, AbstractC58317Pt9.A00(121));
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        try {
            C14360o3.A07(String.format("probe succeeded %s", Arrays.copyOf(new Object[]{String.valueOf(httpURLConnection.getResponseCode())}, 1)));
            return true;
        } catch (Exception e) {
            C14360o3.A07(String.format("probe failed %s", AbstractC166997dE.A1b(e.getMessage(), 1)));
            return false;
        }
    }
}
