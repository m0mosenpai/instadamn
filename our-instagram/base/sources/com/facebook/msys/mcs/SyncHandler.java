package com.facebook.msys.mcs;

import X.C137306Jk;
import com.facebook.msys.mci.Log;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class SyncHandler {
    public NativeHolder mNativeHolder;

    private native void enableTraceTypeNative(int i);

    private native void executeSyncNative();

    private native void notifyAppEnterForegroundNative();

    private native void reportAppStateNative();

    private native void setProcessSyncResponseInIdleQueueNative(boolean z);

    public void enableTraceType(int i) {
        Log.log(4, "SyncHandler enableTraceType");
        enableTraceTypeNative(i);
    }

    static {
        C137306Jk.A00();
    }

    public SyncHandler(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public void notifyAppEnterForeground() {
        notifyAppEnterForegroundNative();
    }
}
