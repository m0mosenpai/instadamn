package com.facebook.common.restricks;

import X.C09170dP;
import X.C0K8;
import X.C14360o3;
import android.content.res.AssetManager;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes10.dex */
public final class FBAssetManager {
    public static final FBAssetManager INSTANCE = new Object();
    public static ConcurrentLinkedQueue loadedResources;
    public static boolean resourceCoverageEnabled;
    public static AssetManager targetAssetManager;

    public static final native void initColorResourceInterceptionProxies();

    public static final native void initJNIProxy();

    public static final native void initLoadResourceValueProxy();

    public static final native void initResourceCoverage();

    public static final int interceptLoadedColorValue(int i, int i2) {
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.common.restricks.FBAssetManager, java.lang.Object] */
    static {
        try {
            C09170dP.A0C("restricks");
            initJNIProxy();
        } catch (Throwable th) {
            C0K8.A0J("FBAssetManager", "Error initializing FBAssetManager", th);
        }
        loadedResources = new ConcurrentLinkedQueue();
        resourceCoverageEnabled = false;
    }

    public static final void onAssetLoaded(String str) {
        loadedResources.add(str);
    }

    public static final void onResourceValueLoaded(Object obj, int i) {
        if (C14360o3.A0K(obj, targetAssetManager)) {
            C0K8.A0E("FBAssetManager", "No loadResourceValueListener is available in onResourceValueLoaded");
        }
    }
}
