package com.facebook.rsys.stream.gen;

import X.AbstractC166987dD;
import X.AbstractC72049XLp;
import X.C2N9;
import X.MSV;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

/* loaded from: classes12.dex */
public class LocalVideoStream {
    public static C2N9 CONVERTER = YAM.A00(52);
    public static long sMcfTypeId;
    public final StreamInfo streamInfo;
    public final int streamState;

    public static native LocalVideoStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalVideoStream)) {
            return false;
        }
        LocalVideoStream localVideoStream = (LocalVideoStream) obj;
        return this.streamInfo.equals(localVideoStream.streamInfo) && this.streamState == localVideoStream.streamState;
    }

    public int hashCode() {
        return AbstractC72049XLp.A02(this.streamInfo) + this.streamState;
    }

    public LocalVideoStream(StreamInfo streamInfo, int i) {
        streamInfo.getClass();
        this.streamInfo = streamInfo;
        this.streamState = i;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LocalVideoStream{streamInfo=");
        A1C.append(this.streamInfo);
        A1C.append(MSV.A00(652));
        return AbstractC72049XLp.A0B(A1C, this.streamState);
    }
}
