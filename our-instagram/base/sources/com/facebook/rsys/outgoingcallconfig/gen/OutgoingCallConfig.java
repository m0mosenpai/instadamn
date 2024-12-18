package com.facebook.rsys.outgoingcallconfig.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31180DnO;
import X.C2N9;
import X.JQ0;
import X.MSV;
import X.YAM;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class OutgoingCallConfig {
    public static C2N9 CONVERTER = YAM.A00(24);
    public static long sMcfTypeId;
    public final boolean acceptRemoteVideoEnabled;
    public final String appId;
    public final CallContext callContext;
    public final OverlayConfigLayerInterface callLevelOverlayConfigLayer;
    public final boolean forReconnect;
    public final ArrayList initialDataMessages;
    public final boolean isE2eeModeMandated;
    public final int joinMode;
    public final String localCallId;
    public final PregenerateSdp pregeneratedSdpManager;
    public final boolean startWithVideo;
    public final String trigger;
    public final ArrayList userIDsToRing;

    public static native OutgoingCallConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OutgoingCallConfig)) {
                return false;
            }
            OutgoingCallConfig outgoingCallConfig = (OutgoingCallConfig) obj;
            String str = this.localCallId;
            String str2 = outgoingCallConfig.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.appId.equals(outgoingCallConfig.appId) || !this.callContext.equals(outgoingCallConfig.callContext) || !this.userIDsToRing.equals(outgoingCallConfig.userIDsToRing) || this.startWithVideo != outgoingCallConfig.startWithVideo || this.acceptRemoteVideoEnabled != outgoingCallConfig.acceptRemoteVideoEnabled || !this.trigger.equals(outgoingCallConfig.trigger)) {
                return false;
            }
            ArrayList arrayList = this.initialDataMessages;
            ArrayList arrayList2 = outgoingCallConfig.initialDataMessages;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            if (this.isE2eeModeMandated != outgoingCallConfig.isE2eeModeMandated || this.forReconnect != outgoingCallConfig.forReconnect || this.joinMode != outgoingCallConfig.joinMode) {
                return false;
            }
            OverlayConfigLayerInterface overlayConfigLayerInterface = this.callLevelOverlayConfigLayer;
            OverlayConfigLayerInterface overlayConfigLayerInterface2 = outgoingCallConfig.callLevelOverlayConfigLayer;
            if (overlayConfigLayerInterface == null) {
                if (overlayConfigLayerInterface2 != null) {
                    return false;
                }
            } else if (!overlayConfigLayerInterface.equals(overlayConfigLayerInterface2)) {
                return false;
            }
            PregenerateSdp pregenerateSdp = this.pregeneratedSdpManager;
            PregenerateSdp pregenerateSdp2 = outgoingCallConfig.pregeneratedSdpManager;
            if (pregenerateSdp != null) {
                if (!pregenerateSdp.equals(pregenerateSdp2)) {
                    return false;
                }
            } else if (pregenerateSdp2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((AbstractC166997dE.A0K(this.trigger, (((AbstractC166997dE.A0J(this.userIDsToRing, AbstractC166997dE.A0J(this.callContext, AbstractC166997dE.A0K(this.appId, JQ0.A01(AbstractC167017dG.A0O(this.localCallId))))) + (this.startWithVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + AbstractC167017dG.A0M(this.initialDataMessages)) * 31) + (this.isE2eeModeMandated ? 1 : 0)) * 31) + (this.forReconnect ? 1 : 0)) * 31) + this.joinMode) * 31) + AbstractC167017dG.A0M(this.callLevelOverlayConfigLayer)) * 31) + AbstractC166997dE.A0I(this.pregeneratedSdpManager);
    }

    public OutgoingCallConfig(String str, String str2, CallContext callContext, ArrayList arrayList, boolean z, boolean z2, String str3, ArrayList arrayList2, boolean z3, boolean z4, int i, OverlayConfigLayerInterface overlayConfigLayerInterface, PregenerateSdp pregenerateSdp) {
        AbstractC31180DnO.A1U(str2, callContext, arrayList);
        str3.getClass();
        this.localCallId = str;
        this.appId = str2;
        this.callContext = callContext;
        this.userIDsToRing = arrayList;
        this.startWithVideo = z;
        this.acceptRemoteVideoEnabled = z2;
        this.trigger = str3;
        this.initialDataMessages = arrayList2;
        this.isE2eeModeMandated = z3;
        this.forReconnect = z4;
        this.joinMode = i;
        this.callLevelOverlayConfigLayer = overlayConfigLayerInterface;
        this.pregeneratedSdpManager = pregenerateSdp;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OutgoingCallConfig{localCallId=");
        A1C.append(this.localCallId);
        A1C.append(",appId=");
        A1C.append(this.appId);
        A1C.append(",callContext=");
        A1C.append(this.callContext);
        A1C.append(",userIDsToRing=");
        A1C.append(this.userIDsToRing);
        A1C.append(",startWithVideo=");
        A1C.append(this.startWithVideo);
        A1C.append(MSV.A00(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD));
        A1C.append(this.acceptRemoteVideoEnabled);
        A1C.append(",trigger=");
        A1C.append(this.trigger);
        A1C.append(MSV.A00(303));
        A1C.append(this.initialDataMessages);
        A1C.append(",isE2eeModeMandated=");
        A1C.append(this.isE2eeModeMandated);
        A1C.append(",forReconnect=");
        A1C.append(this.forReconnect);
        A1C.append(",joinMode=");
        A1C.append(this.joinMode);
        A1C.append(",callLevelOverlayConfigLayer=");
        A1C.append(this.callLevelOverlayConfigLayer);
        A1C.append(",pregeneratedSdpManager=");
        return JQ0.A0l(this.pregeneratedSdpManager, A1C);
    }
}
