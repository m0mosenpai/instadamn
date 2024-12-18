package com.facebook.msys.mci;

import X.C6ED;

/* loaded from: classes3.dex */
public class SqlUtils {
    public static native void disableSqliteMemoryStatus();

    public static native void enableCustomAllocationTracker();

    public static native void enableSqliteMultiThreadAndroid();

    public static native void enableSqliteSmallMalloc();

    public static native boolean isMultiThreadEnabled();

    public static native void setSqliteLookasideAllocation(long j, long j2);

    public static native void setSqliteMMAPSize(long j);

    static {
        C6ED.A00();
    }
}
