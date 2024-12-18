package com.facebook.rsys.call.gen;

import X.AbstractC166987dD;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes8.dex */
public class CallStartContext {
    public final Map contexts;

    public static native CallStartContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallStartContext)) {
            return false;
        }
        return this.contexts.equals(((CallStartContext) obj).contexts);
    }

    public final int hashCode() {
        return 527 + this.contexts.hashCode();
    }

    public CallStartContext(Map map) {
        map.getClass();
        this.contexts = map;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CallStartContext{contexts=");
        return JQ0.A0l(this.contexts, A1C);
    }
}
