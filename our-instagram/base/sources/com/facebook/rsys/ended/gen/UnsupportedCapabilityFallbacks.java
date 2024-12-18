package com.facebook.rsys.ended.gen;

import X.AbstractC166987dD;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class UnsupportedCapabilityFallbacks {
    public static C2N9 CONVERTER = YAN.A00(46);
    public static long sMcfTypeId;
    public final ErrorMessageFallback errorMessage;

    public static native UnsupportedCapabilityFallbacks createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedCapabilityFallbacks)) {
            return false;
        }
        return this.errorMessage.equals(((UnsupportedCapabilityFallbacks) obj).errorMessage);
    }

    public int hashCode() {
        return 527 + this.errorMessage.hashCode();
    }

    public UnsupportedCapabilityFallbacks(ErrorMessageFallback errorMessageFallback) {
        errorMessageFallback.getClass();
        this.errorMessage = errorMessageFallback;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UnsupportedCapabilityFallbacks{errorMessage=");
        return JQ0.A0l(this.errorMessage, A1C);
    }
}
