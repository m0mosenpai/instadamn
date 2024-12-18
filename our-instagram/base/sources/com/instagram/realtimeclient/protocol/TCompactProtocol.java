package com.instagram.realtimeclient.protocol;

import X.AbstractC58318PtA;
import X.C14360o3;
import com.facebook.common.dextricks.StringTreeSet;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public final class TCompactProtocol {
    public static final TCompactProtocol INSTANCE = new Object();
    public static final byte TYPE_BINARY = 8;
    public static final byte TYPE_I32 = 5;
    public static final byte TYPE_STOP = 0;

    public static final int fromZigZag(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    public static final int readVarint(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        int i = 0;
        int i2 = 0;
        while (byteBuffer.hasRemaining()) {
            int i3 = byteBuffer.get() & 255;
            i |= (i3 & StringTreeSet.MAX_SYMBOL_COUNT) << i2;
            if ((i3 >> 7) == 0) {
                break;
            }
            i2 += 7;
        }
        return i;
    }

    public static final String getStringFromByteBuffer(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            return null;
        }
        byte[] array = byteBuffer.array();
        C14360o3.A07(array);
        int position = byteBuffer.position();
        Charset A0u = AbstractC58318PtA.A0u();
        C14360o3.A07(A0u);
        return AbstractC58318PtA.A0n(A0u, array, position, i);
    }

    public static final String getStringFromByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        return getStringFromByteBuffer(byteBuffer, byteBuffer.remaining());
    }
}
