package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.FacebookLoggingRequestInfo;
import com.facebook.tigon.iface.RedirectRequestInfo;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.iface.TigonRequest;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1SL, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1SL {
    public static final C1SM A00 = new Object();
    public static final Charset A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1SM, java.lang.Object] */
    static {
        Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
        C14360o3.A07(forName);
        A01 = forName;
    }

    public static void A00(C1SJ c1sj, TigonError tigonError) {
        TigonErrorCode tigonErrorCode = tigonError.category;
        C14360o3.A0B(tigonErrorCode, 1);
        C1SM.A00(c1sj, tigonErrorCode.value);
        String str = tigonError.errorDomain;
        C1SM c1sm = A00;
        c1sm.A02(c1sj, str);
        C1SM.A00(c1sj, tigonError.domainErrorCode);
        c1sm.A02(c1sj, tigonError.analyticsDetail);
    }

    public static void A01(C1SJ c1sj, TigonRequest tigonRequest) {
        String method = tigonRequest.method();
        C1SM c1sm = A00;
        c1sm.A02(c1sj, method);
        c1sm.A02(c1sj, tigonRequest.url());
        c1sm.A03(c1sj, tigonRequest.headers());
        c1sj.A00((byte) tigonRequest.tigonPriority());
        C1S0 httpPriority = tigonRequest.httpPriority();
        c1sj.A00(httpPriority.A00);
        c1sj.A00(httpPriority.A01 ? (byte) 1 : (byte) 0);
        c1sj.A00(tigonRequest.retryable() ? (byte) 1 : (byte) 0);
        c1sj.A00(tigonRequest.replaySafe() ? (byte) 1 : (byte) 0);
        C1SM.A01(c1sj, tigonRequest.connectionTimeoutMS());
        C1SM.A01(c1sj, tigonRequest.idleTimeoutMS());
        C1SM.A01(c1sj, tigonRequest.requestTimeoutMS());
        C1SM.A01(c1sj, tigonRequest.expectedResponseSizeBytes());
        EnumC26881Rz requestCategory = tigonRequest.requestCategory();
        C14360o3.A0B(requestCategory, 1);
        C1SM.A00(c1sj, requestCategory.A00);
        c1sm.A02(c1sj, tigonRequest.loggingId());
        C1SM.A00(c1sj, tigonRequest.startupStatusOnAdded());
        C1SM.A01(c1sj, tigonRequest.addedToMiddlewareSinceEpochMS());
        FacebookLoggingRequestInfo facebookLoggingRequestInfo = (FacebookLoggingRequestInfo) tigonRequest.getLayerInformation(C1S2.A01);
        if (facebookLoggingRequestInfo != null) {
            c1sj.A00((byte) 1);
            c1sm.A02(c1sj, facebookLoggingRequestInfo.mLogName);
            c1sm.A02(c1sj, facebookLoggingRequestInfo.mAnalyticsTag);
            c1sm.A02(c1sj, facebookLoggingRequestInfo.mCallerClass);
        } else {
            c1sj.A00((byte) 0);
        }
        C1SR c1sr = (C1SR) tigonRequest.getLayerInformation(C1S2.A06);
        if (c1sr != null) {
            c1sj.A00((byte) 1);
            C1SM.A00(c1sj, c1sr.A03);
            C1SM.A00(c1sj, c1sr.A01);
            C1SM.A00(c1sj, c1sr.A00);
            C1SM.A00(c1sj, c1sr.A02);
        } else {
            c1sj.A00((byte) 0);
        }
        C9BW c9bw = (C9BW) tigonRequest.getLayerInformation(C1S2.A02);
        if (c9bw != null) {
            c1sj.A00((byte) 1);
            C1S5 c1s5 = (C1S5) c9bw.A01;
            c1sm.A02(c1sj, c1s5.A00);
            c1sm.A03(c1sj, c1s5.A01);
            c1sm.A03(c1sj, (Map) c9bw.A00);
        } else {
            c1sj.A00((byte) 0);
        }
        RedirectRequestInfo redirectRequestInfo = (RedirectRequestInfo) tigonRequest.getLayerInformation(C1S2.A03);
        if (redirectRequestInfo != null) {
            c1sj.A00((byte) 1);
            c1sj.A00(redirectRequestInfo.A01 ? (byte) 1 : (byte) 0);
            C1SM.A00(c1sj, redirectRequestInfo.A00);
        } else {
            c1sj.A00((byte) 0);
        }
        C1ST c1st = (C1ST) tigonRequest.getLayerInformation(C1S2.A07);
        if (c1st != null) {
            c1sj.A00((byte) 1);
            HashMap hashMap = new HashMap();
            for (C72791XnC c72791XnC : c1st.A01.values()) {
                String str = c72791XnC.A04;
                StringBuilder sb = new StringBuilder();
                char c = '.';
                char c2 = '.';
                if (c72791XnC.A00) {
                    c2 = 'E';
                }
                sb.append(c2);
                if (c72791XnC.A01) {
                    c = 'T';
                }
                sb.append(c);
                sb.append(':');
                sb.append(str);
                sb.append(':');
                sb.append(c72791XnC.A02);
                sb.append(':');
                sb.append(c72791XnC.A03);
                hashMap.put(str, sb.toString());
            }
            c1sm.A03(c1sj, hashMap);
            c1sj.A00(c1st.A03 ? (byte) 1 : (byte) 0);
            c1sj.A00(c1st.A02 ? (byte) 1 : (byte) 0);
            c1sm.A02(c1sj, c1st.A00);
        } else {
            c1sj.A00((byte) 0);
        }
        C1SU c1su = (C1SU) tigonRequest.getLayerInformation(C1S2.A00);
        if (c1su != null) {
            c1sj.A00((byte) 1);
            c1sm.A02(c1sj, c1su.A04);
            c1sm.A02(c1sj, c1su.A06);
            c1sm.A02(c1sj, c1su.A03);
            c1sm.A02(c1sj, c1su.A05);
            C1SM.A01(c1sj, c1su.A02);
            C1SM.A01(c1sj, c1su.A01);
            C1SM.A01(c1sj, c1su.A00);
        } else {
            c1sj.A00((byte) 0);
        }
        C1SV c1sv = (C1SV) tigonRequest.getLayerInformation(C1S2.A04);
        if (c1sv != null) {
            c1sj.A00((byte) 1);
            c1sm.A03(c1sj, Collections.unmodifiableMap(c1sv.A00));
        } else {
            c1sj.A00((byte) 0);
        }
        C26861Rw c26861Rw = (C26861Rw) tigonRequest.getLayerInformation(C1S2.A05);
        if (c26861Rw != null) {
            c1sj.A00((byte) 1);
            Map unmodifiableMap = Collections.unmodifiableMap(c26861Rw.A00);
            C14360o3.A07(unmodifiableMap);
            c1sm.A03(c1sj, unmodifiableMap);
        } else {
            c1sj.A00((byte) 0);
        }
        C1SW c1sw = (C1SW) tigonRequest.getLayerInformation(C1S2.A08);
        if (c1sw != null) {
            c1sj.A00((byte) 1);
            c1sj.A00(c1sw.A05 ? (byte) 1 : (byte) 0);
            c1sm.A02(c1sj, c1sw.A02);
            c1sm.A02(c1sj, c1sw.A03);
            c1sm.A02(c1sj, c1sw.A04);
            c1sm.A02(c1sj, c1sw.A01);
            c1sm.A02(c1sj, c1sw.A00);
            return;
        }
        c1sj.A00((byte) 0);
    }
}
