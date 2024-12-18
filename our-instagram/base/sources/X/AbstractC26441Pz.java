package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC26441Pz {
    public static final String A00(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C26391Pu c26391Pu = (C26391Pu) it.next();
            try {
                String encode = URLEncoder.encode(c26391Pu.A00, ReactWebViewManager.HTML_ENCODING);
                try {
                    String encode2 = URLEncoder.encode(c26391Pu.A01, ReactWebViewManager.HTML_ENCODING);
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(encode);
                    sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                    sb.append(encode2);
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }
}
