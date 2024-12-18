package com.facebook.rsys.livevideo.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class LiveStreamOptInInfo {
    public static C2N9 CONVERTER = YAN.A00(56);
    public static long sMcfTypeId;
    public final int audience;
    public final String hostId;
    public final int target;
    public final String targetName;

    public static native LiveStreamOptInInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveStreamOptInInfo)) {
                return false;
            }
            LiveStreamOptInInfo liveStreamOptInInfo = (LiveStreamOptInInfo) obj;
            if (this.audience == liveStreamOptInInfo.audience && this.target == liveStreamOptInInfo.target) {
                String str = this.targetName;
                String str2 = liveStreamOptInInfo.targetName;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.hostId;
                String str4 = liveStreamOptInInfo.hostId;
                if (str3 != null) {
                    if (!str3.equals(str4)) {
                        return false;
                    }
                } else if (str4 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((JQ0.A01(this.audience) + this.target) * 31) + AbstractC167017dG.A0O(this.targetName)) * 31) + AbstractC25227BEk.A07(this.hostId);
    }

    public LiveStreamOptInInfo(int i, int i2, String str, String str2) {
        this.audience = i;
        this.target = i2;
        this.targetName = str;
        this.hostId = str2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LiveStreamOptInInfo{audience=");
        A1C.append(this.audience);
        A1C.append(",target=");
        A1C.append(this.target);
        A1C.append(",targetName=");
        A1C.append(this.targetName);
        A1C.append(",hostId=");
        return AbstractC50523MSb.A0W(this.hostId, A1C);
    }
}
