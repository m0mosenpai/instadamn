package com.facebook.rsys.callmanager.callclient.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.MSV;
import X.YAN;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class StartCallCopyIdParams {
    public static C2N9 CONVERTER = YAN.A00(25);
    public static long sMcfTypeId;
    public final boolean acceptRemoteVideoEnabled;
    public final CallContext callContext;
    public final OverlayConfigLayerInterface callLevelOverlayConfigLayer;
    public final ArrayList initialDataMessages;
    public final ArrayList initialPeerIds;
    public final int joinMode;
    public final String localCallId;
    public final PregenerateSdp pregeneratedSdpManager;
    public final SetupCallback setupCallback;
    public final boolean startWithVideo;
    public final String trigger;
    public final ArrayList userIDsToRing;

    /* loaded from: classes12.dex */
    public class Builder {
        public boolean acceptRemoteVideoEnabled;
        public CallContext callContext;
        public OverlayConfigLayerInterface callLevelOverlayConfigLayer;
        public ArrayList initialDataMessages;
        public ArrayList initialPeerIds;
        public int joinMode;
        public String localCallId;
        public PregenerateSdp pregeneratedSdpManager;
        public SetupCallback setupCallback;
        public boolean startWithVideo;
        public String trigger;
        public ArrayList userIDsToRing;

        public StartCallCopyIdParams build() {
            return new StartCallCopyIdParams(this);
        }
    }

    public static native StartCallCopyIdParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StartCallCopyIdParams)) {
                return false;
            }
            StartCallCopyIdParams startCallCopyIdParams = (StartCallCopyIdParams) obj;
            String str = this.localCallId;
            String str2 = startCallCopyIdParams.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.callContext.equals(startCallCopyIdParams.callContext) || !this.userIDsToRing.equals(startCallCopyIdParams.userIDsToRing) || this.startWithVideo != startCallCopyIdParams.startWithVideo || this.acceptRemoteVideoEnabled != startCallCopyIdParams.acceptRemoteVideoEnabled || !this.trigger.equals(startCallCopyIdParams.trigger)) {
                return false;
            }
            SetupCallback setupCallback = this.setupCallback;
            SetupCallback setupCallback2 = startCallCopyIdParams.setupCallback;
            if (setupCallback == null) {
                if (setupCallback2 != null) {
                    return false;
                }
            } else if (!setupCallback.equals(setupCallback2)) {
                return false;
            }
            ArrayList arrayList = this.initialDataMessages;
            ArrayList arrayList2 = startCallCopyIdParams.initialDataMessages;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            ArrayList arrayList3 = this.initialPeerIds;
            ArrayList arrayList4 = startCallCopyIdParams.initialPeerIds;
            if (arrayList3 == null) {
                if (arrayList4 != null) {
                    return false;
                }
            } else if (!arrayList3.equals(arrayList4)) {
                return false;
            }
            if (this.joinMode != startCallCopyIdParams.joinMode) {
                return false;
            }
            OverlayConfigLayerInterface overlayConfigLayerInterface = this.callLevelOverlayConfigLayer;
            OverlayConfigLayerInterface overlayConfigLayerInterface2 = startCallCopyIdParams.callLevelOverlayConfigLayer;
            if (overlayConfigLayerInterface == null) {
                if (overlayConfigLayerInterface2 != null) {
                    return false;
                }
            } else if (!overlayConfigLayerInterface.equals(overlayConfigLayerInterface2)) {
                return false;
            }
            PregenerateSdp pregenerateSdp = this.pregeneratedSdpManager;
            PregenerateSdp pregenerateSdp2 = startCallCopyIdParams.pregeneratedSdpManager;
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
        return ((((((((((AbstractC166997dE.A0K(this.trigger, (((AbstractC166997dE.A0J(this.userIDsToRing, AbstractC166997dE.A0J(this.callContext, JQ0.A01(AbstractC167017dG.A0O(this.localCallId)))) + (this.startWithVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + AbstractC167017dG.A0M(this.setupCallback)) * 31) + AbstractC167017dG.A0M(this.initialDataMessages)) * 31) + AbstractC167017dG.A0M(this.initialPeerIds)) * 31) + this.joinMode) * 31) + AbstractC167017dG.A0M(this.callLevelOverlayConfigLayer)) * 31) + AbstractC166997dE.A0I(this.pregeneratedSdpManager);
    }

    public StartCallCopyIdParams(Builder builder) {
        builder.callContext.getClass();
        builder.userIDsToRing.getClass();
        builder.trigger.getClass();
        this.localCallId = builder.localCallId;
        this.callContext = builder.callContext;
        this.userIDsToRing = builder.userIDsToRing;
        this.startWithVideo = builder.startWithVideo;
        this.acceptRemoteVideoEnabled = builder.acceptRemoteVideoEnabled;
        this.trigger = builder.trigger;
        this.setupCallback = builder.setupCallback;
        this.initialDataMessages = builder.initialDataMessages;
        this.initialPeerIds = builder.initialPeerIds;
        this.joinMode = builder.joinMode;
        this.callLevelOverlayConfigLayer = builder.callLevelOverlayConfigLayer;
        this.pregeneratedSdpManager = builder.pregeneratedSdpManager;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StartCallCopyIdParams{localCallId=");
        A1C.append(this.localCallId);
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
        A1C.append(",setupCallback=");
        A1C.append(this.setupCallback);
        A1C.append(MSV.A00(303));
        A1C.append(this.initialDataMessages);
        A1C.append(",initialPeerIds=");
        A1C.append(this.initialPeerIds);
        A1C.append(",joinMode=");
        A1C.append(this.joinMode);
        A1C.append(",callLevelOverlayConfigLayer=");
        A1C.append(this.callLevelOverlayConfigLayer);
        A1C.append(",pregeneratedSdpManager=");
        return JQ0.A0l(this.pregeneratedSdpManager, A1C);
    }
}
