package com.facebook.msys.mci;

import X.C6ED;

/* loaded from: classes3.dex */
public class SqlStatementCache {
    public static native void enableMemoryOptimizedStatementCache(boolean z);

    public static native void enablePreparedStatementCacheMemoryStats(boolean z);

    static {
        C6ED.A00();
    }
}
