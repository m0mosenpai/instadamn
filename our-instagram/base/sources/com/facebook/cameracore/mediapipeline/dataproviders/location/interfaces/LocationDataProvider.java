package com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces;

import X.AbstractC63183Sei;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: classes10.dex */
public abstract class LocationDataProvider {
    public HybridData mHybridData;

    public abstract void getCurrentCityName(NativeDataPromise nativeDataPromise);

    public abstract LocationData getCurrentLocationData();

    public abstract void setDataSource(AbstractC63183Sei abstractC63183Sei);
}
