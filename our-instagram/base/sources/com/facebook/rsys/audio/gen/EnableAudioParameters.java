package com.facebook.rsys.audio.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class EnableAudioParameters {
    public static C2N9 CONVERTER = C55648OnZ.A00(6);
    public static long sMcfTypeId;
    public final boolean enable;
    public final int streamType;
    public final String userID;

    public static native EnableAudioParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EnableAudioParameters)) {
                return false;
            }
            EnableAudioParameters enableAudioParameters = (EnableAudioParameters) obj;
            String str = this.userID;
            String str2 = enableAudioParameters.userID;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (this.streamType != enableAudioParameters.streamType || this.enable != enableAudioParameters.enable) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((JQ0.A01(AbstractC167017dG.A0O(this.userID)) + this.streamType) * 31) + (this.enable ? 1 : 0);
    }

    public EnableAudioParameters(String str, int i, boolean z) {
        this.userID = str;
        this.streamType = i;
        this.enable = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EnableAudioParameters{userID=");
        A1C.append(this.userID);
        A1C.append(",streamType=");
        A1C.append(this.streamType);
        A1C.append(",enable=");
        return AbstractC50523MSb.A0X(A1C, this.enable);
    }
}
