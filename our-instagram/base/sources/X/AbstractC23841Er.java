package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.1Er, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23841Er {
    public static final void A00(Context context, AbstractC23721Ec abstractC23721Ec, UserSession userSession, C1CM c1cm, boolean z) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C18720vz c18720vz = AbstractC12960li.A00;
        String str = "0";
        String str2 = "0";
        if (AbstractC19730y1.A00(c18720vz).A00.getBoolean("opt_out_ads", false)) {
            str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        abstractC23721Ec.A0G("X-Ads-Opt-Out", str2);
        String string = AbstractC19730y1.A00(c18720vz).A00.getString("fb_attribution_id", null);
        String string2 = AbstractC19730y1.A00(c18720vz).A00.getString("google_ad_id", null);
        if (string != null) {
            abstractC23721Ec.A0G("X-Attribution-ID", string);
        }
        if (string2 != null) {
            abstractC23721Ec.A0G("X-Google-AD-ID", string2);
        }
        abstractC23721Ec.A0G("X-DEVICE-ID", C16030qx.A02.A05(context));
        if (AbstractC23851Es.A03()) {
            abstractC23721Ec.A0G("X-FB", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (AbstractC13180m4.A03("com.facebook.orca")) {
            abstractC23721Ec.A0G("X-Messenger", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (AbstractC14490oL.A0G(context)) {
            abstractC23721Ec.A0G("X-WhatsApp", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (!z) {
            abstractC23721Ec.A0G("X-CM-Bandwidth-KBPS", AbstractC13670mt.A06("%.3f", Double.valueOf(C1FP.A00())));
            abstractC23721Ec.A0G("X-CM-Latency", AbstractC13670mt.A06("%.3f", Double.valueOf(C1FP.A01())));
            C1CM.A00(c1cm);
            abstractC23721Ec.A9s("battery_level", String.valueOf(c1cm.A00));
            String str3 = "0";
            if (c1cm.A06()) {
                str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            abstractC23721Ec.A9s("is_charging", str3);
            String str4 = "0";
            if (C1H6.A03()) {
                str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            abstractC23721Ec.A9s("is_dark_mode", str4);
            abstractC23721Ec.A9s("phone_id", C11830jh.A04.A01(userSession).A02(C19T.A1G));
            Boolean bool = AbstractC24321Hb.A00(userSession).A01;
            if (bool != null && bool.booleanValue() && AbstractC41221vX.A00().A01 != 0) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            abstractC23721Ec.A9s("will_sound_on", str);
        }
    }
}
