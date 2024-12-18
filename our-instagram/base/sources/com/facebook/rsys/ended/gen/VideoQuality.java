package com.facebook.rsys.ended.gen;

import X.AbstractC166987dD;
import X.AbstractC72049XLp;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class VideoQuality {
    public static C2N9 CONVERTER = YAN.A00(47);
    public static long sMcfTypeId;
    public final VideoStats receiverVideoQuality;
    public final VideoStats senderVideoQuality;

    public static native VideoQuality createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoQuality)) {
            return false;
        }
        VideoQuality videoQuality = (VideoQuality) obj;
        return this.senderVideoQuality.equals(videoQuality.senderVideoQuality) && this.receiverVideoQuality.equals(videoQuality.receiverVideoQuality);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.receiverVideoQuality, AbstractC72049XLp.A02(this.senderVideoQuality));
    }

    public VideoQuality(VideoStats videoStats, VideoStats videoStats2) {
        videoStats.getClass();
        videoStats2.getClass();
        this.senderVideoQuality = videoStats;
        this.receiverVideoQuality = videoStats2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoQuality{senderVideoQuality=");
        A1C.append(this.senderVideoQuality);
        A1C.append(",receiverVideoQuality=");
        return JQ0.A0l(this.receiverVideoQuality, A1C);
    }
}
