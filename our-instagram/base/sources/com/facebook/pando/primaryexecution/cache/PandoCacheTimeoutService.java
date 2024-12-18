package com.facebook.pando.primaryexecution.cache;

import X.C09170dP;
import X.C14360o3;
import X.C93624Ig;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class PandoCacheTimeoutService extends PandoPrimaryExecution {
    public static final C93624Ig Companion = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PandoCacheTimeoutService(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, ScheduledExecutorService scheduledExecutorService) {
        super(initHybridData(pandoPrimaryExecution, pandoResponseCache, scheduledExecutorService));
        C14360o3.A0B(pandoPrimaryExecution, 1);
        C14360o3.A0B(pandoResponseCache, 2);
        C14360o3.A0B(scheduledExecutorService, 3);
    }

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, ScheduledExecutorService scheduledExecutorService);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Ig, java.lang.Object] */
    static {
        C09170dP.A0C("pando-client-cache-jni");
    }
}
