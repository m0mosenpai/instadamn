package com.facebook.rsys.callmanager.gen;

import X.AnonymousClass001;
import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CallManagerConfig {
    public static C2N9 CONVERTER = YAN.A00(27);
    public static long sMcfTypeId;
    public final boolean allowMultipleActiveCalls;

    /* loaded from: classes12.dex */
    public class Builder {
        public boolean allowMultipleActiveCalls;

        public CallManagerConfig build() {
            return new CallManagerConfig(this);
        }
    }

    public CallManagerConfig() {
        this.allowMultipleActiveCalls = false;
    }

    public static native CallManagerConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CallManagerConfig) && this.allowMultipleActiveCalls == ((CallManagerConfig) obj).allowMultipleActiveCalls;
        }
        return true;
    }

    public int hashCode() {
        return 527 + (this.allowMultipleActiveCalls ? 1 : 0);
    }

    public String toString() {
        return AnonymousClass001.A1B("CallManagerConfig{allowMultipleActiveCalls=", "}", this.allowMultipleActiveCalls);
    }

    public CallManagerConfig(Builder builder) {
        this.allowMultipleActiveCalls = builder.allowMultipleActiveCalls;
    }
}
