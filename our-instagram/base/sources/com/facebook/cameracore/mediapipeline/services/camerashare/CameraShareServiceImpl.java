package com.facebook.cameracore.mediapipeline.services.camerashare;

import X.C14360o3;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes12.dex */
public final class CameraShareServiceImpl extends CameraShareService {
    public static final native HybridData initHybrid();

    private final native void nativeSetDeeplinkTextureMap(Map map);

    private final native void nativeSetEffectArgumentsJSON(String str);

    @Override // com.facebook.cameracore.mediapipeline.services.camerashare.CameraShareService
    public final void setDeeplinkTextureMap(Map map) {
        C14360o3.A0B(map, 0);
        nativeSetDeeplinkTextureMap(map);
    }

    @Override // com.facebook.cameracore.mediapipeline.services.camerashare.CameraShareService
    public final void setEffectArgumentsJSON(String str) {
        C14360o3.A0B(str, 0);
        nativeSetEffectArgumentsJSON(str);
    }

    public CameraShareServiceImpl() {
        super(initHybrid());
    }
}
