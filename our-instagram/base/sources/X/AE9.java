package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* loaded from: classes4.dex */
public abstract class AE9 {
    public static final void A01(InterfaceC23731Ed interfaceC23731Ed, UserSession userSession, A96 a96, String str, String str2) {
        String str3;
        C14360o3.A0B(str, 3);
        if (a96.A03) {
            AbstractC54097Nvv.A00(interfaceC23731Ed, userSession, str, str2, "story_composer");
        } else if (a96.A02 && (str3 = a96.A01) != null) {
            interfaceC23731Ed.A9s("share_to_facebook_dating", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            if (str2 != null) {
                interfaceC23731Ed.A9s("waterfall_id", str2);
            }
            interfaceC23731Ed.A9s(MSV.A00(570), str3);
        }
        interfaceC23731Ed.A9s(MSV.A00(1794), a96.A00);
    }

    public static final A96 A00(C47Z c47z, InterfaceC40171tl interfaceC40171tl) {
        boolean z;
        boolean A0C = C180377zR.A0C(c47z, interfaceC40171tl);
        String str = c47z.A2i;
        if (c47z.A55 || (interfaceC40171tl != null && interfaceC40171tl.CUB())) {
            z = true;
        } else {
            z = false;
        }
        return new A96(str, c47z.A2p, A0C, z);
    }
}
