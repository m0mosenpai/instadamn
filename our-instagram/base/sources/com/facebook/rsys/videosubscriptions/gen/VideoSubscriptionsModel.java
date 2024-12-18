package com.facebook.rsys.videosubscriptions.gen;

import X.AbstractC166987dD;
import X.AbstractC72049XLp;
import X.C2N9;
import X.JQ0;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes12.dex */
public class VideoSubscriptionsModel {
    public static C2N9 CONVERTER = new YAL(13);
    public static long sMcfTypeId;
    public final Map renderSubscriptionsMap;
    public final Map streamIdToQuality;
    public final VideoSubscriptions videoSubscriptions;

    /* loaded from: classes12.dex */
    public class Builder {
        public Map renderSubscriptionsMap;
        public Map streamIdToQuality;
        public VideoSubscriptions videoSubscriptions;

        public VideoSubscriptionsModel build() {
            return new VideoSubscriptionsModel(this);
        }
    }

    public static native VideoSubscriptionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSubscriptionsModel)) {
            return false;
        }
        VideoSubscriptionsModel videoSubscriptionsModel = (VideoSubscriptionsModel) obj;
        return this.videoSubscriptions.equals(videoSubscriptionsModel.videoSubscriptions) && this.renderSubscriptionsMap.equals(videoSubscriptionsModel.renderSubscriptionsMap) && this.streamIdToQuality.equals(videoSubscriptionsModel.streamIdToQuality);
    }

    public int hashCode() {
        return ((AbstractC72049XLp.A02(this.videoSubscriptions) + this.renderSubscriptionsMap.hashCode()) * 31) + this.streamIdToQuality.hashCode();
    }

    public VideoSubscriptionsModel(Builder builder) {
        builder.videoSubscriptions.getClass();
        builder.renderSubscriptionsMap.getClass();
        builder.streamIdToQuality.getClass();
        this.videoSubscriptions = builder.videoSubscriptions;
        this.renderSubscriptionsMap = builder.renderSubscriptionsMap;
        this.streamIdToQuality = builder.streamIdToQuality;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoSubscriptionsModel{videoSubscriptions=");
        A1C.append(this.videoSubscriptions);
        A1C.append(",renderSubscriptionsMap=");
        A1C.append(this.renderSubscriptionsMap);
        A1C.append(",streamIdToQuality=");
        return JQ0.A0l(this.streamIdToQuality, A1C);
    }
}
