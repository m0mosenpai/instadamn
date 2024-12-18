package com.facebook.cameracore.mediapipeline.services.persistence.sandbox;

import X.C09170dP;
import X.C14360o3;
import X.C224949wJ;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateHybrid;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class PersistenceServiceHostBridgeHybrid {
    public static final C224949wJ Companion = new Object();
    public final NetworkClient client;
    public final PersistenceServiceDelegateHybrid hybridDelegate;
    public final HybridData mHybridData;
    public final int scope;

    public PersistenceServiceHostBridgeHybrid(PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid, NetworkClient networkClient, int i) {
        C14360o3.A0B(networkClient, 2);
        this.hybridDelegate = persistenceServiceDelegateHybrid;
        this.client = networkClient;
        this.scope = i;
        this.mHybridData = initHybrid(persistenceServiceDelegateHybrid, networkClient);
    }

    public static final native HybridData initHybrid(PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid, NetworkClient networkClient);

    public final native String nativeGet(int i, String str);

    public final native String nativeGetV2(String str, String str2, String str3, int i, int i2);

    public final native boolean nativeRemove(int i, String str);

    public final native void nativeRemoveV2(String str, String str2, String str3, int i, int i2);

    public final native boolean nativeSet(int i, String str, String str2);

    public final native void nativeSetV2(String str, String str2, int i, int i2, String str3, String str4);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9wJ] */
    static {
        C09170dP.A0C("arpersistenceserviceipc");
    }
}
