package com.facebook.rsys.media.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class UserStreamInfo {
    public static C2N9 CONVERTER = YAN.A00(69);
    public static long sMcfTypeId;
    public final StreamInfo streamInfo;
    public final String userId;

    public static native UserStreamInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStreamInfo)) {
            return false;
        }
        UserStreamInfo userStreamInfo = (UserStreamInfo) obj;
        return this.userId.equals(userStreamInfo.userId) && this.streamInfo.equals(userStreamInfo.streamInfo);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.streamInfo, AbstractC50523MSb.A02(this.userId));
    }

    public UserStreamInfo(String str, StreamInfo streamInfo) {
        str.getClass();
        streamInfo.getClass();
        this.userId = str;
        this.streamInfo = streamInfo;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UserStreamInfo{userId=");
        A1C.append(this.userId);
        A1C.append(",streamInfo=");
        return JQ0.A0l(this.streamInfo, A1C);
    }
}
