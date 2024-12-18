package com.instagram.realtimeclient;

import X.AbstractC58319PtB;
import com.instagram.realtimeclient.protocol.TCompactProtocol;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class GraphQLSubscriptionMessage {
    public static final int FIELD_MESSAGE_PAYLOAD = 2;
    public static final int FIELD_MESSAGE_TOPIC = 1;
    public ByteBuffer mMessagePayload;
    public ByteBuffer mMessageTopic;

    public ByteBuffer getMessagePayload() {
        return this.mMessagePayload;
    }

    public String getMessagePayloadAsString() {
        return TCompactProtocol.getStringFromByteBuffer(this.mMessagePayload);
    }

    public ByteBuffer getMessageTopic() {
        return this.mMessageTopic;
    }

    public String getMessageTopicAsString() {
        return TCompactProtocol.getStringFromByteBuffer(this.mMessageTopic);
    }

    public GraphQLSubscriptionMessage(byte[] bArr) {
        int readVarint;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = 0;
        while (wrap.hasRemaining()) {
            int i2 = wrap.get() & 255;
            int i3 = i2 >> 4;
            if (i3 == 0) {
                int readVarint2 = TCompactProtocol.readVarint(wrap);
                i = (-(readVarint2 & 1)) ^ (readVarint2 >> 1);
            } else {
                i += i3;
            }
            int i4 = i2 & 15;
            if (i4 != 0) {
                if (i == 1) {
                    if (i4 == 8) {
                        readVarint = TCompactProtocol.readVarint(wrap);
                        this.mMessageTopic = ByteBuffer.wrap(bArr, wrap.position(), readVarint);
                        AbstractC58319PtB.A1L(wrap, readVarint);
                    }
                } else if (i == 2 && i4 == 8) {
                    readVarint = TCompactProtocol.readVarint(wrap);
                    this.mMessagePayload = ByteBuffer.wrap(bArr, wrap.position(), readVarint);
                    AbstractC58319PtB.A1L(wrap, readVarint);
                }
            } else {
                return;
            }
        }
    }
}
