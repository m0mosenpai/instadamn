package com.facebook.rsys.overlayconfigmanager;

import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class OverlayConfigManagerHolder {
    public static final OverlayConfigLayerInterface[] EMPTY_OVERLAYCONFIG_LAYER_ARRAY = new OverlayConfigLayerInterface[0];
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(OverlayConfigLayerInterface[] overlayConfigLayerInterfaceArr);

    private native boolean nativeEquals(Object obj);

    public native boolean fetchParameterBoolean(int i, boolean z);

    public native int fetchParameterInt32(int i, boolean z);

    public native int hashCode();

    public native void logExposure(int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof OverlayConfigManagerHolder)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public OverlayConfigManagerHolder(ArrayList arrayList) {
        this.mNativeHolder = initNativeHolder((OverlayConfigLayerInterface[]) arrayList.toArray(EMPTY_OVERLAYCONFIG_LAYER_ARRAY));
    }

    public OverlayConfigManagerHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
