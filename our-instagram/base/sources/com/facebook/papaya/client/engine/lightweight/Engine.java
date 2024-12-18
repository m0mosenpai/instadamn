package com.facebook.papaya.client.engine.lightweight;

import X.AbstractC167017dG;
import X.C09170dP;
import X.C14360o3;
import X.C53718Np7;
import android.content.Context;
import com.facebook.jni.HybridClassBase;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes9.dex */
public final class Engine extends HybridClassBase {
    public static final C53718Np7 Companion = new Object();

    private final native void initHybrid(ScheduledExecutorService scheduledExecutorService, String str, ImmutableMap immutableMap, ITransport iTransport, Context context, String str2, String str3, IModelLoader iModelLoader, Set set);

    private final native SettableFuture nativeRun();

    private final native void nativeStop();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Np7, java.lang.Object] */
    static {
        C09170dP.A0C("papaya-lightweight-engine");
    }

    public Engine(ScheduledExecutorService scheduledExecutorService, String str, ImmutableMap immutableMap, ITransport iTransport, Context context, String str2, String str3, IModelLoader iModelLoader, ImmutableSet immutableSet) {
        C14360o3.A0B(scheduledExecutorService, 1);
        AbstractC167017dG.A1U(str2, str3);
        initHybrid(scheduledExecutorService, "ig4a", immutableMap, iTransport, context, str2, str3, null, immutableSet);
    }

    public final ListenableFuture run() {
        return nativeRun();
    }
}
