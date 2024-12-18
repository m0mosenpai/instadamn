package X;

import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.4J1, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4J1 {
    public static String A00(C4C6 c4c6) {
        C4C2 c4c2;
        String str;
        if (c4c6 != null && (c4c2 = c4c6.A0I) != null) {
            String str2 = c4c2.A00;
            String str3 = "unknown";
            if (str2 == null || str2.isEmpty()) {
                str2 = "unknown";
            }
            String str4 = c4c2.A01;
            if (str4 != null && !str4.isEmpty()) {
                str3 = str4;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("player_origin");
            sb.append(':');
            sb.append(str2);
            sb.append(';');
            sb.append("player_suborigin");
            sb.append(':');
            sb.append(str3);
            sb.append(';');
            if (c4c2.A02) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            sb.append("prefetch");
            sb.append(':');
            sb.append(str);
            return sb.toString();
        }
        return "video_unknown";
    }
}
