package com.facebook.mantle.ig;

import X.C09170dP;
import X.C132875zC;
import X.C14360o3;
import com.facebook.jni.HybridData;
import com.facebook.models.IgModelLoader;
import com.facebook.msys.mca.Mailbox;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class IGMantle {
    public static final C132875zC Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(Object obj, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, String str, IgModelLoader igModelLoader);

    private final native SettableFuture nativeRunMantleWithConfigStr(String str, String str2, ImmutableMap immutableMap);

    public final ListenableFuture runMantleWithConfigStr(String str, String str2, ImmutableMap immutableMap) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(immutableMap, 2);
        return nativeRunMantleWithConfigStr(str, str2, immutableMap);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5zC, java.lang.Object] */
    static {
        C09170dP.A0C("mantle-ig");
    }

    public IGMantle(Mailbox mailbox, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, String str, IgModelLoader igModelLoader) {
        C14360o3.A0B(scheduledExecutorService, 3);
        this.mHybridData = initHybrid(mailbox, executorService, scheduledExecutorService, "", igModelLoader);
    }
}
