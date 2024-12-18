package X;

import android.content.Context;
import android.os.Looper;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.045, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass045 {
    public static final void A00(Context context, AnonymousClass047 anonymousClass047, Map map) {
        HttpURLConnection httpURLConnection;
        if (!C14360o3.A0K(Looper.getMainLooper(), Looper.myLooper())) {
            if (anonymousClass047 == null) {
                int i = AnonymousClass046.A01;
                String simpleName = AnonymousClass046.class.getSimpleName();
                C14360o3.A07(simpleName);
                C0w9.A03(simpleName, "tried to report instacrash without session");
                return;
            }
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    URLConnection openConnection = new java.net.URL(AnonymousClass046.A03).openConnection();
                    C14360o3.A0C(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    httpURLConnection = (HttpURLConnection) openConnection;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
            try {
                httpURLConnection.addRequestProperty("User-Agent", AbstractC12270kV.A00(context));
                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                String str = anonymousClass047.A00;
                C09530e4 c09530e4 = new C09530e4(AbstractC006902j.A00(9, 10, 89), str);
                C09530e4 c09530e42 = new C09530e4("app_name", "Instagram");
                C09530e4 c09530e43 = new C09530e4(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, AbstractC12880la.A04(context));
                C09530e4 c09530e44 = new C09530e4("build_number", String.valueOf(AbstractC12880la.A00()));
                String A05 = C16030qx.A02.A05(context);
                Locale locale = Locale.getDefault();
                C14360o3.A07(locale);
                String upperCase = A05.toUpperCase(locale);
                C14360o3.A07(upperCase);
                LinkedHashMap A07 = AbstractC06930Yk.A07(c09530e4, c09530e42, c09530e43, c09530e44, new C09530e4(AbstractC006902j.A00(0, 9, 64), upperCase), new C09530e4("forced_mitigation", Boolean.valueOf(AbstractC002300n.A0h(str, "fm", false))));
                A07.putAll(map);
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : A07.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (sb.length() > 0) {
                        sb.append('&');
                    }
                    sb.append(URLEncoder.encode(str2, ReactWebViewManager.HTML_ENCODING));
                    sb.append('=');
                    sb.append(URLEncoder.encode(value.toString(), ReactWebViewManager.HTML_ENCODING));
                }
                String obj = sb.toString();
                C14360o3.A07(obj);
                byte[] bytes = obj.getBytes(C15W.A05);
                C14360o3.A07(bytes);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            byte[] bArr = new byte[C3OO.FLAG_MOVED];
                            while (true) {
                                int read = byteArrayInputStream.read(bArr);
                                if (read > 0) {
                                    gZIPOutputStream.write(bArr, 0, read);
                                } else {
                                    gZIPOutputStream.close();
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    C14360o3.A07(byteArray);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream.close();
                                    byteArrayInputStream.close();
                                    httpURLConnection.setFixedLengthStreamingMode(byteArray.length);
                                    AbstractC09810fe.A01(httpURLConnection, 553183061).write(byteArray);
                                    AbstractC09810fe.A02(httpURLConnection, 1177410998);
                                    httpURLConnection.getResponseCode();
                                    httpURLConnection.getResponseMessage();
                                    httpURLConnection.disconnect();
                                    return;
                                }
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C20I.A00(byteArrayInputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                httpURLConnection2 = httpURLConnection;
                String name = AnonymousClass046.class.getName();
                C14360o3.A07(name);
                C0w9.A07(name, e);
                if (httpURLConnection2 == null) {
                    return;
                }
                httpURLConnection2.disconnect();
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("Do not call this on the main thread");
        }
    }
}
