package com.facebook.tigon.iface;

import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class HttpPriorityContext {
    public HybridData mHybridData;

    public final HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final void setMHybridData(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public HttpPriorityContext(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public /* synthetic */ HttpPriorityContext(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public HttpPriorityContext() {
        this(null);
    }
}
