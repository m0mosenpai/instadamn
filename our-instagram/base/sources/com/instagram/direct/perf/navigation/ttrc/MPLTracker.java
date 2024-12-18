package com.instagram.direct.perf.navigation.ttrc;

import X.C09170dP;
import X.C0w9;
import X.C6A3;
import X.EnumC12410kj;
import com.facebook.jni.HybridData;

/* loaded from: classes3.dex */
public final class MPLTracker {
    public static final C6A3 Companion = new Object();
    public static boolean isNativeLibraryLoaded;
    public final HybridData mHybridData;

    private final native HybridData initHybrid();

    public final native boolean getIsCurrentSyncGroupStateCompleted();

    public final native void registerMPLTTRCListenerSessionedNotifications(Object obj);

    public final native void stopTrackingInteraction(int i, int i2);

    public final native void syncTamGroupStateListenForCompletion();

    public final native void trackSyncGroup(int i, int i2);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.6A3] */
    static {
        C09170dP.A0C("mpl-tracker");
        isNativeLibraryLoaded = true;
    }

    public final HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final boolean isReady() {
        if (isNativeLibraryLoaded && this.mHybridData != null) {
            return true;
        }
        return false;
    }

    public MPLTracker() {
        HybridData hybridData;
        if (isNativeLibraryLoaded) {
            hybridData = initHybrid();
        } else {
            hybridData = null;
        }
        this.mHybridData = hybridData;
        if (!isNativeLibraryLoaded) {
            C0w9.A01(EnumC12410kj.A09, "MPLTracker", "Failed to load library when initializing MPLTracker");
        }
    }
}
