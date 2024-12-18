package com.facebook.rsys.mediastats.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class ScreenShareStats {
    public static C2N9 CONVERTER = YAM.A00(2);
    public static long sMcfTypeId;
    public final Integer contentType;

    public static native ScreenShareStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ScreenShareStats)) {
                return false;
            }
            Integer num = this.contentType;
            Integer num2 = ((ScreenShareStats) obj).contentType;
            if (num != null) {
                if (!num.equals(num2)) {
                    return false;
                }
            } else if (num2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 527 + AbstractC167017dG.A0M(this.contentType);
    }

    public ScreenShareStats(Integer num) {
        this.contentType = num;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ScreenShareStats{contentType=");
        return JQ0.A0l(this.contentType, A1C);
    }
}
