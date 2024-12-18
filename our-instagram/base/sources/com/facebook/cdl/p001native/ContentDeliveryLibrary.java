package com.facebook.cdl.p001native;

import X.C09170dP;
import X.C53670NoL;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class ContentDeliveryLibrary {
    public static final C53670NoL Companion = new Object();
    public final HybridData mHybridData;

    private final native HybridData initHybrid(String str, TigonServiceHolder tigonServiceHolder, TigonServiceHolder tigonServiceHolder2, String str2, String str3, boolean z, String str4, int i, int i2, boolean z2);

    public final native boolean cancelRequest(String str);

    public final native boolean generateAvatar(String str, Map map, GltfMemoryPointerWrapper gltfMemoryPointerWrapper, ContentDeliveryLibraryResultCallback contentDeliveryLibraryResultCallback, boolean z, Boolean bool, Integer num);

    public final native void generateBlendWeightsForConfig(Map map, LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder, ContentDeliveryLibraryResultCallback contentDeliveryLibraryResultCallback);

    public final native boolean generateColorRamp(String str, Map map, float[] fArr, LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder, ContentDeliveryLibraryResultCallback contentDeliveryLibraryResultCallback);

    public final native void loadGltfFromPath(String str, GltfMemoryPointerWrapper gltfMemoryPointerWrapper, ContentDeliveryLibraryResultCallback contentDeliveryLibraryResultCallback);

    public final native void setPriority(List list, int i);

    public final native void setQualityOverride(int i, int i2);

    public final native void setRAMCacheMaxSize(int i);

    public final native void tickCache(int i);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.NoL] */
    static {
        C09170dP.A0C("cdl");
        C09170dP.A0C("jniperflogger");
    }

    public ContentDeliveryLibrary(String str, TigonServiceHolder tigonServiceHolder, TigonServiceHolder tigonServiceHolder2, String str2, String str3, boolean z, String str4, int i, int i2, boolean z2) {
        this.mHybridData = initHybrid(str, tigonServiceHolder, tigonServiceHolder2, str2, str3, z, str4, i, i2, z2);
    }
}
