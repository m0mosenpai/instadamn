package com.facebook.models;

import X.C09170dP;
import X.C0K8;
import X.C184018Ei;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.models.interfaces.ModelLoaderBase;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class IgModelLoader extends ModelLoaderBase {
    public static final Class TAG = IgModelLoader.class;

    public static native HybridData initHybridWithJavaManifestLoader(String str, XAnalyticsHolder xAnalyticsHolder, TigonServiceHolder tigonServiceHolder, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, ManifestLoaderProxy manifestLoaderProxy, VoltronModuleLoaderProxy voltronModuleLoaderProxy);

    private native void load(String str, long j, Set set, ModelLoaderCallbacks modelLoaderCallbacks);

    static {
        C09170dP.A0C("models-core_ig");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // com.facebook.models.interfaces.ModelLoaderBase
    public ListenableFuture load(String str) {
        HashSet hashSet = new HashSet();
        ?? obj = new Object();
        load(str, -1L, hashSet, new C184018Ei(this, obj));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    @Override // com.facebook.models.interfaces.ModelLoaderBase
    public ListenableFuture loadPersonalized(String str, Long l) {
        ?? obj = new Object();
        obj.setException(new IOException("Model personalization on IG4A is not supported"));
        return obj;
    }

    @Override // com.facebook.models.interfaces.ModelLoaderBase
    public boolean removePersonalized(String str, Long l) {
        C0K8.A03(IgModelLoader.class, "removePersonalized is not supported on IG4A");
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    @Override // com.facebook.models.interfaces.ModelLoaderBase
    public ListenableFuture load(String str, long j) {
        if (j < 0) {
            ?? obj = new Object();
            obj.setException(new IOException("Invalid version"));
            return obj;
        }
        HashSet hashSet = new HashSet();
        ?? obj2 = new Object();
        load(str, j, hashSet, new C184018Ei(this, obj2));
        return obj2;
    }
}
