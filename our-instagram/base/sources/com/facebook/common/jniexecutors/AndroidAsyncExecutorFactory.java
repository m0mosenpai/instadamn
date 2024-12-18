package com.facebook.common.jniexecutors;

import X.C09270dc;
import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class AndroidAsyncExecutorFactory {
    public static final AndroidAsyncExecutorFactory $redex_init_class = null;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService);

    static {
        C09270dc.A03("jniexecutors");
    }

    public AndroidAsyncExecutorFactory(ScheduledExecutorService scheduledExecutorService) {
        this.mHybridData = initHybrid(scheduledExecutorService);
    }
}
