package com.facebook.rsys.videosubscriptions.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes12.dex */
public class VideoSubscriptions {
    public static C2N9 CONVERTER = new YAL(12);
    public static long sMcfTypeId;
    public final boolean dominantIncludeSelf;
    public final int dominantStreamQuality;
    public final Map subscriptionsMap;
    public final int videoSubscriptionsMode;

    /* loaded from: classes12.dex */
    public class Builder {
        public boolean dominantIncludeSelf;
        public int dominantStreamQuality;
        public Map subscriptionsMap;
        public int videoSubscriptionsMode;

        public VideoSubscriptions build() {
            return new VideoSubscriptions(this);
        }
    }

    public VideoSubscriptions(Map map) {
        map.getClass();
        this.videoSubscriptionsMode = 2;
        this.subscriptionsMap = map;
        this.dominantStreamQuality = 1;
        this.dominantIncludeSelf = true;
    }

    public static native VideoSubscriptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSubscriptions)) {
            return false;
        }
        VideoSubscriptions videoSubscriptions = (VideoSubscriptions) obj;
        return this.videoSubscriptionsMode == videoSubscriptions.videoSubscriptionsMode && this.subscriptionsMap.equals(videoSubscriptions.subscriptionsMap) && this.dominantStreamQuality == videoSubscriptions.dominantStreamQuality && this.dominantIncludeSelf == videoSubscriptions.dominantIncludeSelf;
    }

    public int hashCode() {
        return ((((JQ0.A01(this.videoSubscriptionsMode) + this.subscriptionsMap.hashCode()) * 31) + this.dominantStreamQuality) * 31) + (this.dominantIncludeSelf ? 1 : 0);
    }

    public VideoSubscriptions(Builder builder) {
        builder.subscriptionsMap.getClass();
        this.videoSubscriptionsMode = builder.videoSubscriptionsMode;
        this.subscriptionsMap = builder.subscriptionsMap;
        this.dominantStreamQuality = builder.dominantStreamQuality;
        this.dominantIncludeSelf = builder.dominantIncludeSelf;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoSubscriptions{videoSubscriptionsMode=");
        A1C.append(this.videoSubscriptionsMode);
        A1C.append(",subscriptionsMap=");
        A1C.append(this.subscriptionsMap);
        A1C.append(",dominantStreamQuality=");
        A1C.append(this.dominantStreamQuality);
        A1C.append(",dominantIncludeSelf=");
        return AbstractC50523MSb.A0X(A1C, this.dominantIncludeSelf);
    }
}
