package com.instagram.realtimeclient;

import X.C5EZ;

/* loaded from: classes3.dex */
public class RealtimePayloadParser {
    public static RealtimePayload parse(C5EZ c5ez) {
        String str = c5ez.A00;
        if (RealtimeConstants.MQTT_TOPIC_SKYWALKER.equals(str)) {
            return parseSkywalkerMessage(c5ez);
        }
        if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str)) {
            return parseGraphQLSubscriptionMessage(c5ez);
        }
        return null;
    }

    public static RealtimePayload parseGraphQLSubscriptionMessage(C5EZ c5ez) {
        GraphQLSubscriptionMessage graphQLSubscriptionMessage = new GraphQLSubscriptionMessage(c5ez.A01);
        return new RealtimePayload(graphQLSubscriptionMessage.getMessageTopicAsString(), graphQLSubscriptionMessage.getMessagePayloadAsString());
    }

    public static RealtimePayload parseSkywalkerMessage(C5EZ c5ez) {
        SkywalkerMessage skywalkerMessage = new SkywalkerMessage(c5ez.A01);
        return new RealtimePayload(Integer.toString(skywalkerMessage.mMessageType.intValue()), skywalkerMessage.getPayloadAsString());
    }
}
