package com.instagram.rtc.rsys.proxies;

import X.C2N9;
import X.C55647OnY;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.rsys.transport.gen.SignalingMessageIncomingStats;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.simplejni.NativeHolder;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.ParsedMwsBinaryMessage;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class IGRTCSignalingCoordinator {
    public static C2N9 CONVERTER = new C55647OnY(15);

    /* loaded from: classes9.dex */
    public final class CProxy extends IGRTCSignalingCoordinator {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native IGRTCSignalingCoordinator createFromMcfType(McfReference mcfReference);

        public static native ArrayList createInitialDataMessages(ArrayList arrayList, boolean z, boolean z2, String str);

        public static native IGRTCSignalingCoordinator createSignalingCoordinator(String str, String str2, SignalingSenderProxy signalingSenderProxy, McfReference mcfReference, int i);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native void cacheIncomingMessageUntilFirstSend();

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native EngineModel createEngineModel(Map map);

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native ArrayList createEngineUserIds(ArrayList arrayList);

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native void declineWithSubReason(String str, String str2);

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native PerfLoggerHolder getPerfLoggerHolder();

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native SignalingTransportProxy getSignalingTransportProxy();

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native String getUserId();

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native void handleMqttMessage(String str);

        public native int hashCode();

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native void receiveParsedMultiwaySignalingMessage(ParsedMwsBinaryMessage parsedMwsBinaryMessage, int i, SignalingMessageIncomingStats signalingMessageIncomingStats);

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native void receivedMultiwayHttpResponse(String str, Map map, int i);

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native void receivedMultiwayLegacyMessage(Map map);

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator
        public native void receivedMultiwaySignalingMessage(byte[] bArr, int i, SignalingMessageIncomingStats signalingMessageIncomingStats);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof IGRTCSignalingCoordinator)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void cacheIncomingMessageUntilFirstSend();

    public abstract EngineModel createEngineModel(Map map);

    public abstract ArrayList createEngineUserIds(ArrayList arrayList);

    public abstract void declineWithSubReason(String str, String str2);

    public abstract PerfLoggerHolder getPerfLoggerHolder();

    public abstract SignalingTransportProxy getSignalingTransportProxy();

    public abstract String getUserId();

    public abstract void handleMqttMessage(String str);

    public abstract void receiveParsedMultiwaySignalingMessage(ParsedMwsBinaryMessage parsedMwsBinaryMessage, int i, SignalingMessageIncomingStats signalingMessageIncomingStats);

    public abstract void receivedMultiwayHttpResponse(String str, Map map, int i);

    public abstract void receivedMultiwayLegacyMessage(Map map);

    public abstract void receivedMultiwaySignalingMessage(byte[] bArr, int i, SignalingMessageIncomingStats signalingMessageIncomingStats);
}
