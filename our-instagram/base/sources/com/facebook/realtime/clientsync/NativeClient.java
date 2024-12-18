package com.facebook.realtime.clientsync;

import X.C09170dP;
import X.C14360o3;
import X.C72561Xgh;
import com.facebook.jni.HybridData;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;

/* loaded from: classes12.dex */
public final class NativeClient implements Closeable {
    public static final C72561Xgh Companion = new Object();
    public final HybridData mHybridData;

    public NativeClient(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    private final native ListenableFuture closeAwait(long j);

    private final native ListenableFuture sendEntityUpdate(String str, int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public native void close();

    public native String getID();

    public native ListenableFuture sendPresenceUpdate(String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Xgh] */
    static {
        C09170dP.A0C("realtime-client-sync-jni");
    }
}
