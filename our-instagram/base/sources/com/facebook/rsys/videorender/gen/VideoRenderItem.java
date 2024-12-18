package com.facebook.rsys.videorender.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

/* loaded from: classes12.dex */
public class VideoRenderItem {
    public static C2N9 CONVERTER = new YAL(10);
    public static long sMcfTypeId;
    public final int preferredQuality;
    public final StreamInfo streamInfo;
    public final String userId;
    public final VideoRenderFrameCallback videoFrameCallback;

    /* loaded from: classes12.dex */
    public class Builder {
        public int preferredQuality;
        public StreamInfo streamInfo;
        public String userId;
        public VideoRenderFrameCallback videoFrameCallback;

        public VideoRenderItem build() {
            return new VideoRenderItem(this);
        }
    }

    public static native VideoRenderItem createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoRenderItem)) {
            return false;
        }
        VideoRenderItem videoRenderItem = (VideoRenderItem) obj;
        return this.userId.equals(videoRenderItem.userId) && this.streamInfo.equals(videoRenderItem.streamInfo) && this.preferredQuality == videoRenderItem.preferredQuality && this.videoFrameCallback.equals(videoRenderItem.videoFrameCallback);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.videoFrameCallback, (AbstractC166997dE.A0J(this.streamInfo, AbstractC50523MSb.A02(this.userId)) + this.preferredQuality) * 31);
    }

    public VideoRenderItem(Builder builder) {
        builder.userId.getClass();
        builder.streamInfo.getClass();
        builder.videoFrameCallback.getClass();
        this.userId = builder.userId;
        this.streamInfo = builder.streamInfo;
        this.preferredQuality = builder.preferredQuality;
        this.videoFrameCallback = builder.videoFrameCallback;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoRenderItem{userId=");
        A1C.append(this.userId);
        A1C.append(",streamInfo=");
        A1C.append(this.streamInfo);
        A1C.append(",preferredQuality=");
        A1C.append(this.preferredQuality);
        A1C.append(",videoFrameCallback=");
        return JQ0.A0l(this.videoFrameCallback, A1C);
    }
}
