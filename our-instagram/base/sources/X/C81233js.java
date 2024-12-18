package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3js, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81233js extends GraphQLSubscriptionHandler {
    public final UserSession A00;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean canHandleRealtimeEvent(String str, String str2) {
        C14360o3.A0B(str, 0);
        if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && AbstractC111324zv.A00(3466).equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // com.instagram.realtimeclient.GraphQLSubscriptionHandler
    public final void onRealtimeEventPayload(String str, String str2, String str3) {
        ICJ icj;
        C41132IIx c41132IIx;
        C14360o3.A0B(str3, 2);
        try {
            ICK parseFromJson = I18.parseFromJson(C16V.A00(str3));
            if (parseFromJson != null && (icj = parseFromJson.A00) != null && (c41132IIx = icj.A00) != null) {
                C11T.A02(new RunnableC43119J4i(c41132IIx, this));
            }
        } catch (IOException e) {
            throw new IllegalStateException("error parsing feedback like event from skywalker", e);
        }
    }

    public C81233js(UserSession userSession) {
        this.A00 = userSession;
    }
}
