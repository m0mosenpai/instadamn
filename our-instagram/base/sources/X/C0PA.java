package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* renamed from: X.0PA, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0PA {
    public static String A00;
    public static String A01;
    public static String A02;
    public static ExecutorService A03;
    public static boolean A04;

    public static void A00(final String str, final Map map) {
        ExecutorService executorService;
        if (A04 && (executorService = A03) != null) {
            try {
                executorService.execute(new Runnable() { // from class: X.0P9
                    @Override // java.lang.Runnable
                    public final void run() {
                        HttpsURLConnection httpsURLConnection;
                        byte[] bytes;
                        C0fU A012;
                        int i = 0;
                        do {
                            String str2 = str;
                            Map map2 = map;
                            boolean z = false;
                            HttpsURLConnection httpsURLConnection2 = null;
                            try {
                                StringBuilder sb = new StringBuilder("user_id=0&report_type=debug_ping&debug_ping_ver=");
                                sb.append(9);
                                String str3 = C0PA.A00;
                                if (str3 != null) {
                                    sb.append("&session_id=");
                                    sb.append(URLEncoder.encode(str3, ReactWebViewManager.HTML_ENCODING));
                                }
                                String str4 = C0PA.A01;
                                if (str4 != null) {
                                    sb.append("&app_id=");
                                    sb.append(str4);
                                }
                                sb.append("&extra_data[checkpoint]=");
                                sb.append(URLEncoder.encode(str2, ReactWebViewManager.HTML_ENCODING));
                                String str5 = C0PA.A02;
                                if (str5 != null) {
                                    sb.append("&extra_data[process]=");
                                    sb.append(URLEncoder.encode(str5, ReactWebViewManager.HTML_ENCODING));
                                }
                                int i2 = C0PD.A00;
                                if (i2 >= 0) {
                                    sb.append("&extra_data[mode]=");
                                    sb.append(i2);
                                }
                                int i3 = C0PD.A01;
                                if (i3 > 0) {
                                    sb.append("&extra_data[uf_mode]=");
                                    sb.append(i3);
                                }
                                if (map2 != null) {
                                    for (Map.Entry entry : map2.entrySet()) {
                                        sb.append("&extra_data[");
                                        sb.append(URLEncoder.encode((String) entry.getKey(), ReactWebViewManager.HTML_ENCODING));
                                        sb.append("]=");
                                        sb.append(URLEncoder.encode((String) entry.getValue(), ReactWebViewManager.HTML_ENCODING));
                                    }
                                }
                                String obj = sb.toString();
                                httpsURLConnection = (HttpsURLConnection) new java.net.URL("https://b-www.facebook.com/mobile/extra_data_collector/").openConnection();
                                try {
                                    C0UP c0up = new C0UP(0L);
                                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                                    sSLContext.init(null, c0up.A00, null);
                                    httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                                    httpsURLConnection.setConnectTimeout(30000);
                                    httpsURLConnection.setReadTimeout(30000);
                                    httpsURLConnection.setRequestMethod("POST");
                                    httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                                    httpsURLConnection.setDoOutput(true);
                                    bytes = obj.getBytes(StandardCharsets.UTF_8);
                                    httpsURLConnection.setFixedLengthStreamingMode(bytes.length);
                                    AbstractC09810fe.A02(httpsURLConnection, 803474198);
                                    A012 = AbstractC09810fe.A01(httpsURLConnection, -494451217);
                                } catch (Throwable th) {
                                    th = th;
                                    httpsURLConnection2 = httpsURLConnection;
                                    try {
                                        th.printStackTrace();
                                        if (httpsURLConnection2 != null) {
                                            httpsURLConnection2.disconnect();
                                        }
                                        i++;
                                    } catch (Throwable th2) {
                                        if (httpsURLConnection2 != null) {
                                            try {
                                                httpsURLConnection2.disconnect();
                                                throw th2;
                                            } catch (Throwable th3) {
                                                th3.printStackTrace();
                                                throw th2;
                                            }
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            try {
                                A012.write(bytes);
                                A012.close();
                                if (httpsURLConnection.getResponseCode() == 200) {
                                    z = true;
                                }
                                try {
                                    httpsURLConnection.disconnect();
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                }
                                if (z) {
                                    return;
                                }
                                i++;
                            } catch (Throwable th6) {
                                try {
                                    A012.close();
                                } catch (Throwable th7) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                                }
                                throw th6;
                                break;
                            }
                        } while (i < 3);
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
