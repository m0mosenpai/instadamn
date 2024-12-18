package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;
import java.io.IOException;

/* renamed from: X.1zI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43481zI implements RealtimeEventHandlerProvider {
    public static final C43481zI A00 = new C43481zI();

    @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
    public final RealtimeEventHandler get(final UserSession userSession) {
        return new GraphQLSubscriptionHandler(userSession) { // from class: X.4MB
            public final C25671My A00;

            @Override // com.instagram.realtimeclient.RealtimeEventHandler
            public final boolean canHandleRealtimeEvent(String str, String str2) {
                if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && AbstractC111324zv.A00(3468).equals(str2)) {
                    return true;
                }
                return false;
            }

            {
                this.A00 = AbstractC25651Mw.A00(userSession);
            }

            @Override // com.instagram.realtimeclient.GraphQLSubscriptionHandler
            public final void onRealtimeEventPayload(String str, String str2, String str3) {
                SF5 sf5;
                try {
                    C62452SCf parseFromJson = S5M.parseFromJson(C16V.A00(str3));
                    if (parseFromJson != null && (sf5 = parseFromJson.A00) != null) {
                        this.A00.E4s(new NYP(sf5.A00, sf5.A01));
                    }
                } catch (IOException e) {
                    C0K8.A0M("InteractivitySubmissionStatusRealtimeEventHandler", "onRealtimeEventPayload exception", e, str2, str3);
                }
            }
        };
    }
}
