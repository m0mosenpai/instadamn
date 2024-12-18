package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.6Qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138746Qe {
    public static final Map A08 = AbstractC06930Yk.A06(new C09530e4("partially_enter_viewport", 1), new C09530e4("fully_enter_viewport", 1), new C09530e4("prepare_render_start", 1), new C09530e4("prepare_render_success", 1), new C09530e4("prepare_render_fail", 1), new C09530e4("content_parse_start", 1), new C09530e4("content_parse_success", 1), new C09530e4("content_parse_fail", 1), new C09530e4("media_load_start", 1), new C09530e4("media_load_success", 1), new C09530e4("media_load_fail", 1));
    public static final java.util.Set A09 = AbstractC16830sb.A07("media_#_load_start", "media_#_load_success", "media_#_load_fail", "media_amount_determined");
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final QuickPerformanceLogger A04;
    public final C139406Sv A05;
    public final C139416Sw A06;
    public final ExecutorService A07;

    public C138746Qe(QuickPerformanceLogger quickPerformanceLogger, C139406Sv c139406Sv, C139416Sw c139416Sw) {
        C14360o3.A0B(c139406Sv, 2);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C14360o3.A07(newSingleThreadExecutor);
        this.A04 = quickPerformanceLogger;
        this.A05 = c139406Sv;
        this.A07 = newSingleThreadExecutor;
        this.A06 = c139416Sw;
        this.A00 = -1;
    }

    public final void A0H(final String str, final String str2) {
        A01(this, str);
        final long currentMonotonicTimestampNanos = this.A04.currentMonotonicTimestampNanos();
        this.A07.execute(new Runnable(this) { // from class: X.6T0
            public final /* synthetic */ C138746Qe A01;

            {
                this.A01 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Map map = C138746Qe.A08;
                String str3 = str;
                Number number = (Number) map.get(str3);
                C138746Qe c138746Qe = this.A01;
                int hashCode = c138746Qe.A05.hashCode();
                int A00 = C139446Sz.A00(str3, 906037831, hashCode);
                if (number == null || A00 < number.intValue()) {
                    String str4 = str2;
                    if (str4 == null) {
                        C139446Sz.A02(c138746Qe.A04, str3, TimeUnit.NANOSECONDS, 906037831, hashCode, currentMonotonicTimestampNanos);
                    } else {
                        C139446Sz.A01(c138746Qe.A04, str3, str4, TimeUnit.NANOSECONDS, 906037831, hashCode, currentMonotonicTimestampNanos);
                    }
                    C138746Qe.A02(c138746Qe, str3);
                    C138746Qe.A00(c138746Qe, hashCode);
                }
            }
        });
    }

    public static final void A01(C138746Qe c138746Qe, String str) {
        if (c138746Qe.A06.A00()) {
            int hashCode = str.hashCode();
            if (hashCode != -1536070176) {
                if (hashCode != -360970784) {
                    if (hashCode == 1029446145 && str.equals("media_#_load_success")) {
                        c138746Qe.A03++;
                        return;
                    }
                    return;
                }
                if (!str.equals("media_#_load_start")) {
                    return;
                }
                c138746Qe.A02++;
                return;
            }
            if (!str.equals("media_#_load_fail")) {
                return;
            }
            c138746Qe.A01++;
        }
    }

    public static final void A02(C138746Qe c138746Qe, String str) {
        if (c138746Qe.A06.A00() && c138746Qe.A00 > 0 && AbstractC001800i.A0u(A09, str)) {
            if (C14360o3.A0K(str, "media_amount_determined") && c138746Qe.A02 > 0) {
                c138746Qe.A0H("media_load_start", null);
                if (c138746Qe.A03 >= c138746Qe.A00) {
                    c138746Qe.A0H("media_load_success", null);
                    return;
                } else {
                    if (c138746Qe.A01 <= 0) {
                        return;
                    }
                    c138746Qe.A0H("media_load_fail", null);
                    return;
                }
            }
            int hashCode = str.hashCode();
            if (hashCode != -1536070176) {
                if (hashCode != -360970784) {
                    if (hashCode != 1029446145 || !str.equals("media_#_load_success") || c138746Qe.A03 < c138746Qe.A00) {
                        return;
                    }
                    c138746Qe.A0H("media_load_success", null);
                    return;
                }
                if (!str.equals("media_#_load_start")) {
                    return;
                }
                c138746Qe.A0H("media_load_start", null);
                return;
            }
            if (!str.equals("media_#_load_fail")) {
                return;
            }
            c138746Qe.A0H("media_load_fail", null);
        }
    }

    public final void A03() {
        if (this.A06.A00()) {
            A0H("content_parse_start", null);
        }
    }

    public final void A04() {
        if (!this.A06.A00()) {
            A0H("prepare_render_binding_start", null);
        }
    }

    public final void A05() {
        if (!this.A06.A00()) {
            A0H("prepare_render_binding_success", null);
        }
    }

    public final void A06() {
        if (!this.A06.A00()) {
            A0H("prepare_render_success", null);
        }
    }

    public final void A07() {
        this.A07.execute(new RunnableC71419Wth(this, this.A04.currentMonotonicTimestampNanos()));
    }

    public final void A08() {
        final long currentMonotonicTimestampNanos = this.A04.currentMonotonicTimestampNanos();
        this.A07.execute(new Runnable() { // from class: X.6Sx
            @Override // java.lang.Runnable
            public final void run() {
                C138746Qe c138746Qe = C138746Qe.this;
                QuickPerformanceLogger quickPerformanceLogger = c138746Qe.A04;
                C139406Sv c139406Sv = c138746Qe.A05;
                int hashCode = c139406Sv.hashCode();
                long j = currentMonotonicTimestampNanos;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                HashMap hashMap = new HashMap();
                hashMap.put(AbstractC58354Ptu.A01(9, 10, 37), c139406Sv.A03);
                hashMap.put("client_name", c139406Sv.A01);
                hashMap.put("template_name", c139406Sv.A04);
                hashMap.put("logging_info", c139406Sv.A02);
                hashMap.put(TraceFieldType.ContentLength, String.valueOf(c139406Sv.A00));
                C139446Sz.A03(quickPerformanceLogger, hashMap, timeUnit, 906037831, hashCode, j);
            }
        });
    }

    public final void A09() {
        this.A07.execute(new RunnableC66265U6j(this, this.A04.currentMonotonicTimestampNanos()));
    }

    public final void A0A() {
        HashMap hashMap = new HashMap();
        hashMap.put("error", "Error playing video");
        String obj = new JSONObject(hashMap).toString();
        C14360o3.A07(obj);
        A0H("video_play_request_fail", obj);
    }

    public final void A0B(String str) {
        if (this.A06.A00()) {
            HashMap hashMap = new HashMap();
            hashMap.put("error", str);
            String obj = new JSONObject(hashMap).toString();
            C14360o3.A07(obj);
            A0H("content_parse_fail", obj);
        }
    }

    public final void A0C(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("error", str);
        String obj = new JSONObject(hashMap).toString();
        C14360o3.A07(obj);
        A0H("layout_parsing_fail", obj);
    }

    public final void A0D(String str) {
        if (!this.A06.A00()) {
            HashMap hashMap = new HashMap();
            hashMap.put("error", str);
            String obj = new JSONObject(hashMap).toString();
            C14360o3.A07(obj);
            A0H("prepare_render_binding_fail", obj);
        }
    }

    public final void A0E(String str) {
        if (!this.A06.A00()) {
            HashMap hashMap = new HashMap();
            hashMap.put("error", str);
            String obj = new JSONObject(hashMap).toString();
            C14360o3.A07(obj);
            A0H("prepare_render_fail", obj);
        }
    }

    public final void A0F(String str) {
        this.A07.execute(new RunnableC71540Wvp(this, str, this.A04.currentMonotonicTimestampNanos()));
    }

    public final void A0G(String str, int i, int i2) {
        LinkedHashMap A06 = AbstractC06930Yk.A06(new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str), new C09530e4("x", String.valueOf(i)), new C09530e4("y", String.valueOf(i2)));
        C14360o3.A0B("interaction_#", 0);
        A01(this, "interaction_#");
        this.A07.execute(new RunnableC139886Us(this, "interaction_#", A06, this.A04.currentMonotonicTimestampNanos()));
    }

    public final void A0I(boolean z) {
        String str;
        if (this.A06.A00()) {
            HashMap hashMap = new HashMap();
            if (z) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            hashMap.put("cache_hit", str);
            String obj = new JSONObject(hashMap).toString();
            C14360o3.A07(obj);
            A0H("content_parse_success", obj);
        }
    }

    public final void A0J(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        hashMap.put("cache_hit", str);
        String obj = new JSONObject(hashMap).toString();
        C14360o3.A07(obj);
        A0H("layout_parsing_success", obj);
    }

    public static final void A00(C138746Qe c138746Qe, int i) {
        int i2;
        if (c138746Qe.A06.A00() && C139446Sz.A00("prepare_render_success", 906037831, i) + C139446Sz.A00("prepare_render_fail", 906037831, i) <= 0) {
            int A00 = C139446Sz.A00("content_parse_success", 906037831, i);
            int A002 = C139446Sz.A00("content_parse_fail", 906037831, i);
            if (A00 > 0 && ((i2 = c138746Qe.A00) <= 0 || i2 == c138746Qe.A03)) {
                c138746Qe.A0H("prepare_render_success", null);
            } else {
                if (A002 <= 0 && c138746Qe.A01 <= 0) {
                    return;
                }
                String obj = new JSONObject(new HashMap()).toString();
                C14360o3.A07(obj);
                c138746Qe.A0H("prepare_render_fail", obj);
            }
        }
    }
}
