package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Nvv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54097Nvv {
    public static final void A00(InterfaceC23731Ed interfaceC23731Ed, UserSession userSession, String str, String str2, String str3) {
        String str4;
        C131995xZ A00 = C196068lw.A00(userSession).A00(CallerContext.A01("FacebookMediaShareApi"));
        String str5 = A00.A03;
        if (C196068lw.A02(A00)) {
            str4 = "PAGE";
        } else {
            str4 = "USER";
        }
        interfaceC23731Ed.A9s("share_to_fb_destination_type", str4);
        interfaceC23731Ed.A9s("share_to_fb_destination_id", str5);
        interfaceC23731Ed.A9s("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        interfaceC23731Ed.A9s("no_token_crosspost", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        if (str5.length() == 0) {
            AbstractC35784FrM.A01(userSession, str3);
        }
        if (str2 != null) {
            interfaceC23731Ed.A9s("waterfall_id", str2);
        }
        interfaceC23731Ed.A9s("attempt_id", str);
    }
}
