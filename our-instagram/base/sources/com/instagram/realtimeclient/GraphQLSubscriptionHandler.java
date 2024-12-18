package com.instagram.realtimeclient;

import X.C5EZ;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class GraphQLSubscriptionHandler extends RealtimeEventHandler {
    public abstract void onRealtimeEventPayload(String str, String str2, String str3);

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final List getMqttTopicsToHandle() {
        return Collections.singletonList(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE);
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean handleRealtimeEvent(C5EZ c5ez, RealtimePayload realtimePayload) {
        if (canHandleRealtimeEvent(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, realtimePayload.subTopic)) {
            onRealtimeEventPayload(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, realtimePayload.subTopic, realtimePayload.stringPayload);
            return true;
        }
        return false;
    }
}
