package X;

import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.AEj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23053AEj {
    public static Integer A00(String str) {
        if (str.equals("FXAccountItemEligibilityEligible")) {
            return C05F.A00;
        }
        if (str.equals("FXAccountItemEligibilityIneligible")) {
            return C05F.A01;
        }
        if (str.equals("FXAccountItemEligibilityNoData")) {
            return C05F.A0C;
        }
        throw AbstractC166987dD.A12(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            case 2:
                return "2";
            default:
                return "0";
        }
    }
}
