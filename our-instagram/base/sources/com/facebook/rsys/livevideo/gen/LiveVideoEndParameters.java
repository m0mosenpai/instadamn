package com.facebook.rsys.livevideo.gen;

import X.AnonymousClass001;
import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class LiveVideoEndParameters {
    public static C2N9 CONVERTER = YAN.A00(60);
    public static long sMcfTypeId;
    public final String funnelSessionId;

    public static native LiveVideoEndParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveVideoEndParameters)) {
            return false;
        }
        return this.funnelSessionId.equals(((LiveVideoEndParameters) obj).funnelSessionId);
    }

    public int hashCode() {
        return 527 + this.funnelSessionId.hashCode();
    }

    public String toString() {
        return AnonymousClass001.A0g("LiveVideoEndParameters{funnelSessionId=", this.funnelSessionId, "}");
    }

    public LiveVideoEndParameters(String str) {
        str.getClass();
        this.funnelSessionId = str;
    }
}
