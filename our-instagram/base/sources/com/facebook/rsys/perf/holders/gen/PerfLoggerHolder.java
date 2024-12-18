package com.facebook.rsys.perf.holders.gen;

import X.AbstractC166987dD;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class PerfLoggerHolder {
    public static C2N9 CONVERTER = YAM.A00(25);
    public static long sMcfTypeId;
    public final McfReference perfLogger;

    public static native PerfLoggerHolder createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerfLoggerHolder)) {
            return false;
        }
        return this.perfLogger.equals(((PerfLoggerHolder) obj).perfLogger);
    }

    public int hashCode() {
        return 527 + this.perfLogger.hashCode();
    }

    public PerfLoggerHolder(McfReference mcfReference) {
        mcfReference.getClass();
        this.perfLogger = mcfReference;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PerfLoggerHolder{perfLogger=");
        return JQ0.A0l(this.perfLogger, A1C);
    }
}
