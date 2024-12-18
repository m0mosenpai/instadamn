package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1zG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43461zG implements RealtimeEventHandlerProvider {
    public static final C43461zG A00 = new C43461zG();

    @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
    public final RealtimeEventHandler get(final UserSession userSession) {
        return new GraphQLSubscriptionHandler(userSession) { // from class: X.4MA
            public final C25671My A00;
            public final UserSession A01;

            @Override // com.instagram.realtimeclient.RealtimeEventHandler
            public final boolean canHandleRealtimeEvent(String str, String str2) {
                if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && AbstractC111324zv.A00(3467).equals(str2)) {
                    return true;
                }
                return false;
            }

            @Override // com.instagram.realtimeclient.GraphQLSubscriptionHandler
            public final void onRealtimeEventPayload(String str, String str2, String str3) {
                C69414Vmy c69414Vmy;
                long longValue;
                long convert;
                InterfaceC41141vN vby;
                long convert2;
                try {
                    C68854VdA parseFromJson = VXK.parseFromJson(C07950bF.A04.A01(this.A01, str3));
                    if (parseFromJson != null && (c69414Vmy = parseFromJson.A00) != null) {
                        String str4 = c69414Vmy.A07;
                        if (str4 == "story") {
                            longValue = c69414Vmy.A00;
                        } else {
                            longValue = c69414Vmy.A04.longValue();
                        }
                        if (c69414Vmy.A02.booleanValue()) {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            Long l = c69414Vmy.A03;
                            if (l == null) {
                                convert2 = 0;
                            } else {
                                convert2 = timeUnit.convert(l.longValue(), timeUnit);
                            }
                            vby = new VBZ(c69414Vmy.A01, c69414Vmy.A06, c69414Vmy.A05, str4, convert2, longValue);
                        } else {
                            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                            Long l2 = c69414Vmy.A03;
                            if (l2 == null) {
                                convert = 0;
                            } else {
                                convert = timeUnit2.convert(l2.longValue(), timeUnit2);
                            }
                            vby = new VBY(convert, c69414Vmy.A05, longValue);
                        }
                        this.A00.E4s(vby);
                    }
                } catch (IOException e) {
                    C0K8.A0M("InteractivityActivateQuestionEventHandler", "onRealtimeEventPayload exception", e, str2, str3);
                }
            }

            {
                this.A00 = AbstractC25651Mw.A00(userSession);
                this.A01 = userSession;
            }
        };
    }
}
