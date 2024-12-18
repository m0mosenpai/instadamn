package com.facebook.realtime.clientsync;

import X.C09170dP;
import X.EnumC72356Xbs;
import com.facebook.jni.HybridData;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public abstract class NativeClientFactory {
    public static final Companion Companion = new Object();
    public static final EnumC72356Xbs DEFAULT_TIER = EnumC72356Xbs.PROD;
    public final HybridData mHybridData;

    /* loaded from: classes12.dex */
    public final class Companion {
        private final HybridData initHybrid(String str, BaseRequestStreamClient baseRequestStreamClient, Executor executor, DelegatingEventHandler delegatingEventHandler, DelegatingEntityMutator delegatingEntityMutator, int i) {
            return NativeClientFactory.initHybrid(str, baseRequestStreamClient, executor, delegatingEventHandler, delegatingEntityMutator, i);
        }
    }

    private final native ListenableFuture createNativeClient(String str, Object obj, String str2, int i, String str3);

    public static final native HybridData initHybrid(String str, BaseRequestStreamClient baseRequestStreamClient, Executor executor, DelegatingEventHandler delegatingEventHandler, DelegatingEntityMutator delegatingEntityMutator, int i);

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.realtime.clientsync.NativeClientFactory$Companion, java.lang.Object] */
    static {
        C09170dP.A0C("realtime-client-sync-jni");
    }
}
