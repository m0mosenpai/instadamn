package com.instagram.realtimeclient;

import X.AbstractC111324zv;
import X.AbstractC12220kQ;
import X.C0K8;
import X.C16V;
import X.C18920wW;
import X.C5EZ;
import X.C95094Pu;
import X.InterfaceC02590Ai;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.clientconfig.RealtimeClientConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes2.dex */
public class RealtimeClientEventObserver implements RealtimeClientManager.Observer {
    public static final String TAG = "com.instagram.realtimeclient.RealtimeClientEventObserver";
    public final Map mQueryId2SubtopicMap = Collections.synchronizedMap(new HashMap());
    public final RealtimeClientConfig mRealtimeClientConfig;
    public final UserSession mUserSession;

    /* loaded from: classes11.dex */
    public class ClientSubEventType {
        public static final String PAYLOAD_RECEIVED = "receivepayload";
        public static final String SUBSCRIBE = "client_subscribe";
        public static final String UNSUBSCRIBE = "client_unsubscribe";
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onConnectionChanged(C95094Pu c95094Pu) {
    }

    public static boolean coinFlip(int i) {
        if (new Random().nextInt(i) != 0) {
            return false;
        }
        return true;
    }

    private boolean isRealTimeSub(String str) {
        return RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str);
    }

    private void logEvent(String str, String str2) {
        long j;
        long j2;
        C18920wW A02 = AbstractC12220kQ.A02(this.mUserSession);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, AbstractC111324zv.A00(2492));
        RealtimeClientConfig realtimeClientConfig = this.mRealtimeClientConfig;
        if (realtimeClientConfig != null) {
            j = realtimeClientConfig.getGQLSSamplingWeight();
        } else {
            j = 10000;
        }
        if (coinFlip((int) j)) {
            A00.AAP("event_type", str);
            A00.AAP("event_source", "Android");
            A00.A9K(AbstractC111324zv.A00(3033), Long.valueOf(j));
            String str3 = this.mUserSession.userId;
            if (str3 != null) {
                j2 = Long.parseLong(str3);
            } else {
                j2 = 0;
            }
            A00.A9K("ig_user_id", Long.valueOf(j2));
            A00.AAP("mqtt_subtopic", str2);
            A00.AAP(TraceFieldType.TransportType, "MQTT");
            A00.Cht();
        }
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onMessage(C5EZ c5ez) {
        if (c5ez != null && this.mRealtimeClientConfig.isRealtimeEventLogEnabled() && RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(c5ez.A00)) {
            RealtimePayload parse = RealtimePayloadParser.parse(c5ez);
            if (parse != null) {
                logEvent(AbstractC111324zv.A00(5159), (String) this.mQueryId2SubtopicMap.get(parse.subTopic));
            } else {
                C0K8.A0D(TAG, "the payload is empty.");
            }
        }
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        if (RealtimeConstants.SEND_ATTEMPT.equals(str3) && this.mRealtimeClientConfig.isRealtimeEventLogEnabled() && RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str)) {
            try {
                SkywalkerCommand parseFromJson = SkywalkerCommand__JsonHelper.parseFromJson(C16V.A00(str2));
                List<String> list = parseFromJson.mSubscribeTopics;
                if (list != null) {
                    for (String str4 : list) {
                        cacheSubtopic(str4);
                        logEvent(AbstractC111324zv.A00(4097), str4);
                    }
                }
                List<String> list2 = parseFromJson.mUnsubscribeTopics;
                if (list2 != null) {
                    for (String str5 : list2) {
                        cacheSubtopic(str5);
                        logEvent(AbstractC111324zv.A00(4098), str5);
                    }
                }
            } catch (IOException e) {
                C0K8.A0F(TAG, "Failed convert message back to command.", e);
            }
        }
    }

    public RealtimeClientEventObserver(UserSession userSession, RealtimeClientConfig realtimeClientConfig) {
        this.mUserSession = userSession;
        this.mRealtimeClientConfig = realtimeClientConfig;
    }

    private void cacheSubtopic(String str) {
        this.mQueryId2SubtopicMap.put(RealtimeSubscription.fromSubscriptionString(str).mSubscriptionQueryId, str);
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onSendPayload(String str, byte[] bArr, String str2, Long l) {
    }
}
