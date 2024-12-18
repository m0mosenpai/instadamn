package com.facebook.rsys.stream.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class VideoStreamSendParams {
    public static C2N9 CONVERTER = YAM.A00(59);
    public static long sMcfTypeId;
    public final double bitratePriority;
    public final int maxBitrateBps;
    public final int maxFrameRate;
    public final int minBitrateBps;
    public final double scaleResolutionDownBy;

    public static native VideoStreamSendParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoStreamSendParams)) {
            return false;
        }
        VideoStreamSendParams videoStreamSendParams = (VideoStreamSendParams) obj;
        return this.maxFrameRate == videoStreamSendParams.maxFrameRate && this.minBitrateBps == videoStreamSendParams.minBitrateBps && this.maxBitrateBps == videoStreamSendParams.maxBitrateBps && this.bitratePriority == videoStreamSendParams.bitratePriority && this.scaleResolutionDownBy == videoStreamSendParams.scaleResolutionDownBy;
    }

    public int hashCode() {
        int A07 = AbstractC167007dF.A07(Double.doubleToLongBits(this.bitratePriority), (((JQ0.A01(this.maxFrameRate) + this.minBitrateBps) * 31) + this.maxBitrateBps) * 31);
        long doubleToLongBits = Double.doubleToLongBits(this.scaleResolutionDownBy);
        return A07 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public VideoStreamSendParams(int i, int i2, int i3, double d, double d2) {
        this.maxFrameRate = i;
        this.minBitrateBps = i2;
        this.maxBitrateBps = i3;
        this.bitratePriority = d;
        this.scaleResolutionDownBy = d2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoStreamSendParams{maxFrameRate=");
        A1C.append(this.maxFrameRate);
        A1C.append(",minBitrateBps=");
        A1C.append(this.minBitrateBps);
        A1C.append(",maxBitrateBps=");
        A1C.append(this.maxBitrateBps);
        A1C.append(",bitratePriority=");
        A1C.append(this.bitratePriority);
        A1C.append(",scaleResolutionDownBy=");
        A1C.append(this.scaleResolutionDownBy);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
