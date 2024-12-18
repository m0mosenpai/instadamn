package com.facebook.rsys.callintent.gen;

import X.AbstractC31180DnO;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public class SignalingUserContext {
    public final NativeHolder mNativeHolder;

    public static native SignalingUserContext createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2, String str3, SignalingTransportProxy signalingTransportProxy, OverlayConfigManagerHolder overlayConfigManagerHolder, EnvironmentVariablesProxy environmentVariablesProxy);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native String getAppId();

    public native String getDeviceId();

    public native EnvironmentVariablesProxy getEnvironmentVariables();

    public native OverlayConfigManagerHolder getOverlayConfigManager();

    public native SignalingTransportProxy getSignalingTransport();

    public native String getUserId();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof SignalingUserContext)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public SignalingUserContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SignalingUserContext(String str, String str2, String str3, SignalingTransportProxy signalingTransportProxy, OverlayConfigManagerHolder overlayConfigManagerHolder, EnvironmentVariablesProxy environmentVariablesProxy) {
        AbstractC31180DnO.A1U(str, str2, str3);
        signalingTransportProxy.getClass();
        overlayConfigManagerHolder.getClass();
        this.mNativeHolder = initNativeHolder(str, str2, str3, signalingTransportProxy, overlayConfigManagerHolder, environmentVariablesProxy);
    }
}
