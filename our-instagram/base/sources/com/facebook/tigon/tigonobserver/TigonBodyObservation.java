package com.facebook.tigon.tigonobserver;

import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class TigonBodyObservation {
    public long mBodySize;
    public boolean mHasBody;
    public final HybridData mHybridData;
    public long mRequestId;
    public long mUntrimmedSize;

    public native ByteBuffer body();

    public native void cleanup();

    public TigonBodyObservation(HybridData hybridData, long j, boolean z, long j2, long j3) {
        this.mHybridData = hybridData;
        this.mRequestId = j;
        this.mHasBody = z;
        this.mBodySize = j2;
        this.mUntrimmedSize = j3;
    }
}
