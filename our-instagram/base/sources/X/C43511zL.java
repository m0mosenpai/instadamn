package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;

/* renamed from: X.1zL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43511zL implements RealtimeEventHandlerProvider {
    public static final C43511zL A00 = new C43511zL();

    @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
    public final RealtimeEventHandler get(final UserSession userSession) {
        C14360o3.A0A(userSession);
        return new GraphQLSubscriptionHandler(userSession) { // from class: X.4MC
            public final UserSession A00;

            {
                C14360o3.A0B(userSession, 1);
                this.A00 = userSession;
            }

            @Override // com.instagram.realtimeclient.RealtimeEventHandler
            public final boolean canHandleRealtimeEvent(String str, String str2) {
                C14360o3.A0B(str, 0);
                if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && str2 != null && str2.equals(GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID)) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
            
                if (r2.A00(X.AbstractC111324zv.A00(137)) != null) goto L19;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0041. Please report as an issue. */
            @Override // com.instagram.realtimeclient.GraphQLSubscriptionHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onRealtimeEventPayload(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
                /*
                    Method dump skipped, instructions count: 340
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4MC.onRealtimeEventPayload(java.lang.String, java.lang.String, java.lang.String):void");
            }
        };
    }
}
