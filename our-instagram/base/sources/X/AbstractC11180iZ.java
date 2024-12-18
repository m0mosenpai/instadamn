package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.0iZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11180iZ {
    public static InterfaceC26421Px A00(String str, String str2, String str3, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        String str4;
        C1Ee c1Ee = new C1Ee();
        c1Ee.A05("format", "json");
        if (z2) {
            str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str4 = "0";
        }
        c1Ee.A05("compressed", str4);
        if (z) {
            c1Ee.A05("multi_batch", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        c1Ee.A05("sent_time", AbstractC13670mt.A06("%.3f", Double.valueOf(j / 1000.0d)));
        c1Ee.A05("access_token", str2);
        c1Ee.A05("ffdb_token", str3);
        c1Ee.A05(DialogModule.KEY_MESSAGE, str);
        if (z3) {
            c1Ee.A05("request_debug_config", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        return c1Ee.A00(z4);
    }
}
