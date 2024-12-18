package com.facebook.react.bridge;

import X.ExecutorC64804TUs;
import X.STV;
import com.facebook.jni.HybridData;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public class ReactInstanceManagerInspectorTarget implements AutoCloseable {
    public static final ReactInstanceManagerInspectorTarget $redex_init_class = null;
    public final HybridData mHybridData;

    /* loaded from: classes10.dex */
    public interface TargetDelegate {
        Map getMetadata();

        void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener);

        void onReload();

        void onSetPausedInDebuggerMessage(String str);
    }

    private native HybridData initHybrid(Executor executor, TargetDelegate targetDelegate);

    public native void sendDebuggerResumeCommand();

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    public boolean isValid() {
        return this.mHybridData.isValid();
    }

    static {
        STV.A00();
    }

    public ReactInstanceManagerInspectorTarget(TargetDelegate targetDelegate) {
        this.mHybridData = initHybrid(new ExecutorC64804TUs(this, 1), targetDelegate);
    }
}
