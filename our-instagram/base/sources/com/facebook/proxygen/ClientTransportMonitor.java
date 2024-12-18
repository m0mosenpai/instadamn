package com.facebook.proxygen;

import com.facebook.traffic.ctm.api.CumulativeConnectionStats;
import com.facebook.traffic.ctm.api.IClientTransportMonitor;
import com.facebook.traffic.ctm.api.RetinaStats;
import com.facebook.traffic.ctm.api.RsysCallStatus;
import com.facebook.traffic.ctm.api.RsysThrottlingOptions;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.traffic.retina.config.RetinaConfig;

/* loaded from: classes12.dex */
public class ClientTransportMonitor extends NativeHandleImpl implements IClientTransportMonitor {
    public EventBase mEventBase;

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public native void enable(boolean z);

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public native void enableInbandTelemetryProcessing(boolean z);

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public native void enableRetina(boolean z);

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public native void enableRsysBackgroundConnThrottling(boolean z);

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public native void enableRsysBackgroundConnThrottlingTimeout(boolean z);

    public native CumulativeConnectionStats getCumulativeConnectionStatsNative();

    public native InbandTelemetryBweEstimate getInbandTelemetryBweEstimateNative(String str, String str2);

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public native void onRsysCallCompleted(RetinaStats retinaStats);

    public native void setEventBaseNative(EventBase eventBase);

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public native void setRetinaConfig(RetinaConfig retinaConfig);

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public native void setRsysMaxPacingRateKnobParamId(long j);

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public native void setRsysThrottlingHostPrefixFilterList(String str);

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public native void setRsysThrottlingHostPrefixFilterType(String str);

    public native void updateRsysCallStatusNative(RsysCallStatus rsysCallStatus, RsysThrottlingOptions rsysThrottlingOptions);

    public void setEventBase(EventBase eventBase) {
        this.mEventBase = eventBase;
        setEventBaseNative(eventBase);
    }

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public CumulativeConnectionStats getCumulativeConnectionStats() {
        return getCumulativeConnectionStatsNative();
    }

    public InbandTelemetryBweEstimate getInbandTelemetryBweEstimate(String str, String str2) {
        return getInbandTelemetryBweEstimateNative(str, str2);
    }

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public /* synthetic */ boolean hasActiveCall() {
        return false;
    }

    @Override // com.facebook.traffic.ctm.api.IClientTransportMonitor
    public void updateRsysCallStatus(RsysCallStatus rsysCallStatus, RsysThrottlingOptions rsysThrottlingOptions) {
        updateRsysCallStatusNative(rsysCallStatus, rsysThrottlingOptions);
    }
}
