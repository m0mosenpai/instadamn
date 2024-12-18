package X;

import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.KrP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47068KrP {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "2";
            case 2:
                return "4";
            case 3:
                return "5";
            default:
                return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
    }
}
