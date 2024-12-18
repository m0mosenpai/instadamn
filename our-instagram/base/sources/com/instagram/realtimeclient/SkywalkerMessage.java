package com.instagram.realtimeclient;

import X.AbstractC58319PtB;
import com.instagram.realtimeclient.protocol.TCompactProtocol;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class SkywalkerMessage {
    public static final int FIELD_MESSAGE_PAYLOAD = 2;
    public static final int FIELD_MESSAGE_TYPE = 1;
    public ByteBuffer mMessagePayload;
    public Integer mMessageType;

    public ByteBuffer getMessagePayload() {
        return this.mMessagePayload;
    }

    public Integer getMessageType() {
        return this.mMessageType;
    }

    public String getPayloadAsString() {
        return TCompactProtocol.getStringFromByteBuffer(this.mMessagePayload);
    }

    public SkywalkerMessage(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = 0;
        while (wrap.hasRemaining()) {
            int i2 = wrap.get() & 255;
            int i3 = i2 >> 4;
            if (i3 == 0) {
                int readVarint = TCompactProtocol.readVarint(wrap);
                i = (-(readVarint & 1)) ^ (readVarint >> 1);
            } else {
                i += i3;
            }
            int i4 = i2 & 15;
            if (i4 != 0) {
                if (i == 1) {
                    if (i4 == 5) {
                        int readVarint2 = TCompactProtocol.readVarint(wrap);
                        this.mMessageType = Integer.valueOf((-(readVarint2 & 1)) ^ (readVarint2 >> 1));
                    }
                } else if (i == 2 && i4 == 8) {
                    int readVarint3 = TCompactProtocol.readVarint(wrap);
                    this.mMessagePayload = ByteBuffer.wrap(bArr, wrap.position(), readVarint3);
                    AbstractC58319PtB.A1L(wrap, readVarint3);
                }
            } else {
                return;
            }
        }
    }
}
