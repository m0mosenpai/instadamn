package X;

import android.util.Base64;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.SLg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62669SLg {
    public final SBT A00;
    public final String A01;
    public final String A02;

    public final int A00(String str) {
        String str2;
        String str3;
        DataOutputStream dataOutputStream;
        StringBuilder A1C;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("format", "json");
        A1G.put("access_token", this.A01);
        if (str == null) {
            try {
                C0K8.A0D("AnalyticsHttpClient", "Json data cannot be null");
            } catch (IOException e) {
                C0K8.A0G("AnalyticsHttpClient", "Unable to compress message to Json object, using original message", e);
                A1G.put(DialogModule.KEY_MESSAGE, str);
            }
        }
        byte[] bytes = str.getBytes(ReactWebViewManager.HTML_ENCODING);
        ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(A0U);
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        A1G.put(DialogModule.KEY_MESSAGE, Base64.encodeToString(A0U.toByteArray(), 2));
        A1G.put("compressed", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        SBT sbt = this.A00;
        String str4 = this.A02;
        int i = -1;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new java.net.URL((String) sbt.A00.get()).openConnection();
                httpURLConnection.setConnectTimeout(10000);
                try {
                    try {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                        httpURLConnection.setRequestProperty("User-Agent", str4);
                        httpURLConnection.setRequestProperty("X-FB-HTTP-Engine", "MQTT Analytics");
                        try {
                            dataOutputStream = new DataOutputStream(AbstractC09810fe.A01(httpURLConnection, 133641169));
                            A1C = AbstractC166987dD.A1C();
                            Iterator A14 = AbstractC166997dE.A14(A1G);
                            while (A14.hasNext()) {
                                try {
                                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                                    if (A1C.length() != 0) {
                                        A1C.append("&");
                                    }
                                    try {
                                        A1C.append(URLEncoder.encode(AbstractC31172DnG.A17(A1K), ReactWebViewManager.HTML_ENCODING));
                                        A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                                        A1C.append(URLEncoder.encode(AbstractC58318PtA.A0p(A1K), ReactWebViewManager.HTML_ENCODING));
                                    } catch (UnsupportedEncodingException e2) {
                                        C0K8.A0G("AnalyticsService", "", e2);
                                        dataOutputStream.close();
                                        return i;
                                    }
                                } catch (Throwable th) {
                                    dataOutputStream.close();
                                    throw th;
                                }
                            }
                        } catch (IOException | SecurityException e3) {
                            C0K8.A0G("AnalyticsService", "Unable to create output stream", e3);
                        }
                    } catch (IOException e4) {
                        C0K8.A0G("AnalyticsService", "", e4);
                    }
                    try {
                        dataOutputStream.writeBytes(A1C.toString());
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        i = httpURLConnection.getResponseCode();
                    } catch (IOException e5) {
                        C0K8.A0G("AnalyticsService", "Failed to write to output stream", e5);
                        dataOutputStream.close();
                        return i;
                    }
                    return i;
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e6) {
                e = e6;
                str2 = "AnalyticsService";
                str3 = "Failed to open http connection";
                C0K8.A0G(str2, str3, e);
                return -1;
            }
        } catch (MalformedURLException e7) {
            e = e7;
            str2 = "AnalyticsService";
            str3 = "Logging end point malformed";
        }
    }

    public C62669SLg(SBT sbt, String str, String str2) {
        this.A01 = str;
        this.A00 = sbt;
        this.A02 = str2;
    }
}
