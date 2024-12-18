package com.facebook.rsys.media.gen;

import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class StreamInfo {
    public static C2N9 CONVERTER = YAN.A00(68);
    public static long sMcfTypeId;
    public final String streamName;
    public final int streamType;

    public static native StreamInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StreamInfo)) {
                return false;
            }
            StreamInfo streamInfo = (StreamInfo) obj;
            if (this.streamType == streamInfo.streamType) {
                String str = this.streamName;
                String str2 = streamInfo.streamName;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return JQ0.A01(this.streamType) + AbstractC167017dG.A0O(this.streamName);
    }

    public String toString() {
        return AnonymousClass001.A08(this.streamType, "StreamInfo{streamType=", ",streamName=", this.streamName, "}");
    }

    public StreamInfo(int i, String str) {
        this.streamType = i;
        this.streamName = str;
    }
}
