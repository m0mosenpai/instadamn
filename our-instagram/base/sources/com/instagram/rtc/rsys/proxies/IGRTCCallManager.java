package com.instagram.rtc.rsys.proxies;

import X.C2N9;
import X.C55647OnY;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp;
import com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClient;
import com.facebook.rsys.callmanager.callclient.gen.SetupCallback;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import com.facebook.simplejni.NativeHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class IGRTCCallManager {
    public static C2N9 CONVERTER = new C55647OnY(13);

    /* loaded from: classes9.dex */
    public final class CProxy extends IGRTCCallManager {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native IGRTCCallManager createCallManager(CallManagerCallClient callManagerCallClient, IGRTCSignalingCoordinator iGRTCSignalingCoordinator, String str, LoggingProxy loggingProxy, LogPersistenceProxy logPersistenceProxy, LargeLogUploadProxy largeLogUploadProxy, OverlayConfigManagerHolder overlayConfigManagerHolder, Map map, CryptoContextHolder cryptoContextHolder, TurnAllocationProxy turnAllocationProxy, XAnalyticsHolder xAnalyticsHolder);

        public static native IGRTCCallManager createFromMcfType(McfReference mcfReference);

        public static native OverlayConfigManagerHolder createOverlayConfigManager(int i, OverlayConfigLayerInterface overlayConfigLayerInterface);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.instagram.rtc.rsys.proxies.IGRTCCallManager
        public native String joinCallCopyId(String str, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, SetupCallback setupCallback);

        @Override // com.instagram.rtc.rsys.proxies.IGRTCCallManager
        public native void logLeaveCallInitiated(int i);

        @Override // com.instagram.rtc.rsys.proxies.IGRTCCallManager
        public native void registerAppModelListener(CallApi callApi, EngineProxy engineProxy);

        @Override // com.instagram.rtc.rsys.proxies.IGRTCCallManager
        public native void registerUser(CryptoContextHolder cryptoContextHolder);

        @Override // com.instagram.rtc.rsys.proxies.IGRTCCallManager
        public native String startCallCopyId(String str, String str2, String str3, ArrayList arrayList, boolean z, boolean z2, String str4, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, SetupCallback setupCallback, PregenerateSdp pregenerateSdp, OverlayConfigLayerInterface overlayConfigLayerInterface);

        @Override // com.instagram.rtc.rsys.proxies.IGRTCCallManager
        public native String startLiveSwapCopyId(String str, int i, int i2, String str2, SetupCallback setupCallback);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof IGRTCCallManager)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract String joinCallCopyId(String str, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, SetupCallback setupCallback);

    public abstract void logLeaveCallInitiated(int i);

    public abstract void registerAppModelListener(CallApi callApi, EngineProxy engineProxy);

    public abstract void registerUser(CryptoContextHolder cryptoContextHolder);

    public abstract String startCallCopyId(String str, String str2, String str3, ArrayList arrayList, boolean z, boolean z2, String str4, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, SetupCallback setupCallback, PregenerateSdp pregenerateSdp, OverlayConfigLayerInterface overlayConfigLayerInterface);

    public abstract String startLiveSwapCopyId(String str, int i, int i2, String str2, SetupCallback setupCallback);
}
