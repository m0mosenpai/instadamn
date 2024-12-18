package com.facebook.rsys.stream.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC72049XLp;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

/* loaded from: classes12.dex */
public class VideoStreamParams {
    public static C2N9 CONVERTER = YAM.A00(58);
    public static long sMcfTypeId;
    public final int preferredCodec;
    public final StreamCallbacks streamCallbacks;
    public final int syncGroup;
    public final StreamInfo videoStreamInfo;

    public static native VideoStreamParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoStreamParams)) {
                return false;
            }
            VideoStreamParams videoStreamParams = (VideoStreamParams) obj;
            if (this.videoStreamInfo.equals(videoStreamParams.videoStreamInfo) && this.syncGroup == videoStreamParams.syncGroup && this.preferredCodec == videoStreamParams.preferredCodec) {
                StreamCallbacks streamCallbacks = this.streamCallbacks;
                StreamCallbacks streamCallbacks2 = videoStreamParams.streamCallbacks;
                if (streamCallbacks != null) {
                    if (!streamCallbacks.equals(streamCallbacks2)) {
                        return false;
                    }
                } else if (streamCallbacks2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC72049XLp.A02(this.videoStreamInfo) + this.syncGroup) * 31) + this.preferredCodec) * 31) + AbstractC167017dG.A0M(this.streamCallbacks);
    }

    public VideoStreamParams(StreamInfo streamInfo, int i, int i2, StreamCallbacks streamCallbacks) {
        streamInfo.getClass();
        this.videoStreamInfo = streamInfo;
        this.syncGroup = i;
        this.preferredCodec = i2;
        this.streamCallbacks = streamCallbacks;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoStreamParams{videoStreamInfo=");
        A1C.append(this.videoStreamInfo);
        A1C.append(",syncGroup=");
        A1C.append(this.syncGroup);
        A1C.append(",preferredCodec=");
        A1C.append(this.preferredCodec);
        A1C.append(",streamCallbacks=");
        return JQ0.A0l(this.streamCallbacks, A1C);
    }
}
