package com.facebook.cameracore.mediapipeline.services.avatars;

import X.C09170dP;
import X.C53667NoI;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes9.dex */
public final class AvatarsNativeInputDelegate {
    public static final C53667NoI Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native void loadAnimationFromFile(String str, String str2);

    public final native void loadAvatarFromMemory(String str, String str2, GltfMemoryPointerWrapper gltfMemoryPointerWrapper);

    public final native void loadColorRampFromMemory(String str, String str2, LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder);

    public final native void setAle(LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder);

    public final native void setFixedElapsedTimeForAnimation(float f);

    public final native void updateBlendWeightsForPrimitive(LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder);

    public final native void updateSliderValues(Map map);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.NoI] */
    static {
        C09170dP.A0C("avatarsdataprovider");
    }
}
