package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class LF9 {
    public static final Integer A00(Throwable th) {
        if (th instanceof C46321Ker) {
            return C05F.A00;
        }
        if (th instanceof C46322Kes) {
            return C05F.A01;
        }
        return C05F.A0C;
    }

    public final LinkedHashMap A01(Throwable th) {
        String str;
        String str2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (th != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            A1I.put("underlying_error_message", message);
            boolean z = th instanceof C46321Ker;
            if (z) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else if (th instanceof C46322Kes) {
                str = "2";
            } else {
                str = "Unknown";
            }
            A1I.put(MSV.A00(202), str);
            if (z) {
                str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else if (th instanceof C46322Kes) {
                str2 = "2";
            } else {
                str2 = "0";
            }
            A1I.put("error_resource", str2);
            String str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            A1I.put("error_severity", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A1I.put("error_renderer", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            if (!(!(th instanceof C53401Njq))) {
                str3 = "2";
            }
            A1I.put("error_recoverability", str3);
        }
        return A1I;
    }
}
