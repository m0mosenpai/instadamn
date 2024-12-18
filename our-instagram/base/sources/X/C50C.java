package X;

import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.50C, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C50C {
    public static final LinkedHashMap A00(String str) {
        C14360o3.A0B(str, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = AbstractC001900j.A0R(str, new String[]{"&"}, 0).iterator();
        while (it.hasNext()) {
            List A0R = AbstractC001900j.A0R((String) it.next(), new String[]{InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR}, 0);
            linkedHashMap.put(URLDecoder.decode((String) A0R.get(0), ReactWebViewManager.HTML_ENCODING), URLDecoder.decode((String) A0R.get(1), ReactWebViewManager.HTML_ENCODING));
        }
        return linkedHashMap;
    }

    public static final boolean A01(PushInfraMetaData pushInfraMetaData) {
        String str = pushInfraMetaData.A06;
        if (str == null) {
            str = "0";
        }
        if (!str.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION) && !str.equals("2")) {
            return false;
        }
        return true;
    }

    public static final boolean A02(String str) {
        InterfaceC09390do interfaceC09390do;
        if (str != null && (interfaceC09390do = C09Z.A00) != null && interfaceC09390do.CWa() && !C09Y.A00().A05(str)) {
            return true;
        }
        return false;
    }
}
