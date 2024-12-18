package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class ActionMetadata {
    public static C2N9 CONVERTER = C55648OnZ.A00(39);
    public static long sMcfTypeId;
    public final long actionTimeMs;
    public final Integer carouselItemIndex;
    public final long mediaPositionMs;

    public static native ActionMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ActionMetadata)) {
                return false;
            }
            ActionMetadata actionMetadata = (ActionMetadata) obj;
            if (this.actionTimeMs == actionMetadata.actionTimeMs && this.mediaPositionMs == actionMetadata.mediaPositionMs) {
                Integer num = this.carouselItemIndex;
                Integer num2 = actionMetadata.carouselItemIndex;
                if (num != null) {
                    if (!num.equals(num2)) {
                        return false;
                    }
                } else if (num2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.actionTimeMs;
        int A01 = JQ0.A01((int) (j ^ (j >>> 32)));
        long j2 = this.mediaPositionMs;
        return ((A01 + ((int) ((j2 >>> 32) ^ j2))) * 31) + AbstractC167017dG.A0M(this.carouselItemIndex);
    }

    public ActionMetadata(long j, long j2, Integer num) {
        this.actionTimeMs = j;
        this.mediaPositionMs = j2;
        this.carouselItemIndex = num;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ActionMetadata{actionTimeMs=");
        A1C.append(this.actionTimeMs);
        A1C.append(",mediaPositionMs=");
        A1C.append(this.mediaPositionMs);
        A1C.append(",carouselItemIndex=");
        return JQ0.A0l(this.carouselItemIndex, A1C);
    }
}
