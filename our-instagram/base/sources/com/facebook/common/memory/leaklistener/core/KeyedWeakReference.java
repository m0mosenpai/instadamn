package com.facebook.common.memory.leaklistener.core;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class KeyedWeakReference extends WeakReference {
    public final WeakReference mCanary;
    public final String mDebugData;
    public final Map mMetadata;
    public final long mTimestamp;

    public Object getCanary() {
        return this.mCanary.get();
    }

    public Map getLeakMetadata() {
        return Collections.unmodifiableMap(this.mMetadata);
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public KeyedWeakReference(Object obj, long j, Map map, String str) {
        super(obj);
        this.mTimestamp = j;
        this.mMetadata = map;
        this.mCanary = new WeakReference(new Object());
        this.mDebugData = str;
    }

    public KeyedWeakReference(Object obj, long j, Map map) {
        this(obj, j, map, null);
    }

    public KeyedWeakReference(Object obj, long j) {
        this(obj, j, Collections.emptyMap());
    }
}
