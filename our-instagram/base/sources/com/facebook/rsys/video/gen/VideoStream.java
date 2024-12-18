package com.facebook.rsys.video.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55647OnY;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.video.VideoSource;

/* loaded from: classes9.dex */
public class VideoStream {
    public static C2N9 CONVERTER = new C55647OnY(1);
    public static long sMcfTypeId;
    public final boolean isFrozen;
    public final boolean isSuppressedByUser;
    public final String streamId;
    public final StreamInfo streamInfo;
    public final int streamState;
    public final VideoSource videoSource;

    public static native VideoStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoStream)) {
                return false;
            }
            VideoStream videoStream = (VideoStream) obj;
            if (this.videoSource.equals(videoStream.videoSource) && this.isFrozen == videoStream.isFrozen && this.streamInfo.equals(videoStream.streamInfo)) {
                String str = this.streamId;
                String str2 = videoStream.streamId;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
                if (this.streamState != videoStream.streamState || this.isSuppressedByUser != videoStream.isSuppressedByUser) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC166997dE.A0J(this.streamInfo, (JQ0.A01(this.videoSource.hashCode()) + (this.isFrozen ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.streamId)) * 31) + this.streamState) * 31) + (this.isSuppressedByUser ? 1 : 0);
    }

    public VideoStream(VideoSource videoSource, boolean z, StreamInfo streamInfo, String str, int i, boolean z2) {
        videoSource.getClass();
        streamInfo.getClass();
        this.videoSource = videoSource;
        this.isFrozen = z;
        this.streamInfo = streamInfo;
        this.streamId = str;
        this.streamState = i;
        this.isSuppressedByUser = z2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoStream{videoSource=");
        A1C.append(this.videoSource);
        A1C.append(",isFrozen=");
        A1C.append(this.isFrozen);
        A1C.append(",streamInfo=");
        A1C.append(this.streamInfo);
        A1C.append(",streamId=");
        A1C.append(this.streamId);
        A1C.append(",streamState=");
        A1C.append(this.streamState);
        A1C.append(",isSuppressedByUser=");
        return AbstractC50523MSb.A0X(A1C, this.isSuppressedByUser);
    }
}
