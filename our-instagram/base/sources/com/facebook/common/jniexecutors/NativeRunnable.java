package com.facebook.common.jniexecutors;

import X.AbstractC09800fd;
import X.AnonymousClass001;
import X.C09270dc;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public class NativeRunnable implements Runnable {
    public HybridData mHybridData;
    public volatile String mNativeExecutor;

    private native void nativeRun();

    @Override // java.lang.Runnable
    public void run() {
        AbstractC09800fd.A03("%s", this, -693752208);
        try {
            nativeRun();
            AbstractC09800fd.A00(-291915969);
        } catch (Throwable th) {
            AbstractC09800fd.A00(570492259);
            throw th;
        }
    }

    public String toString() {
        String str = this.mNativeExecutor;
        if (str == null) {
            return "NativeRunnable";
        }
        return AnonymousClass001.A0R("NativeRunnable - ", str);
    }

    static {
        C09270dc.A03("jniexecutors");
    }

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
