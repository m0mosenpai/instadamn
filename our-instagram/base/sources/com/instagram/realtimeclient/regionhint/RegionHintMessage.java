package com.instagram.realtimeclient.regionhint;

import X.C14360o3;
import com.instagram.realtimeclient.protocol.TCompactProtocol;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class RegionHintMessage {
    public static final Companion Companion = new Object();
    public static final int FIELD_MESSAGE_REGION = 1;
    public String region;

    public RegionHintMessage(byte[] bArr) {
        C14360o3.A0B(bArr, 1);
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
                if (i == 1 && i4 == 8) {
                    this.region = TCompactProtocol.getStringFromByteBuffer(wrap, TCompactProtocol.readVarint(wrap));
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* loaded from: classes10.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final String getRegion() {
        return this.region;
    }

    public final void setRegion(String str) {
        this.region = str;
    }
}
