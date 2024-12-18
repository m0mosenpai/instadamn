package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vvy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69812Vvy {
    public static C102884kP A00(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C102884kP c102884kP = (C102884kP) it.next();
                if (c102884kP.A05 == 14063) {
                    return c102884kP;
                }
            }
            return null;
        }
        return null;
    }

    public static String A01(Object obj) {
        if (!(obj instanceof Number) && (obj instanceof Boolean)) {
            if (((Boolean) obj).booleanValue()) {
                return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            return "0";
        }
        return obj.toString();
    }
}
