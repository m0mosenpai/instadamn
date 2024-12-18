package com.facebook.cameracore.mediapipeline.services.camerashare;

import X.C14360o3;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class CameraShareService {
    public final HybridData mHybridData;

    public CameraShareService(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public abstract void setDeeplinkTextureMap(Map map);

    public abstract void setEffectArgumentsJSON(String str);
}
