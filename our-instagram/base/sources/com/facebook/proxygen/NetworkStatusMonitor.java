package com.facebook.proxygen;

import ca.psiphon.PsiphonTunnel;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class NetworkStatusMonitor extends NativeHandleImpl {
    public BandwidthEstimate mBandwidthEstimate;
    public NetworkStatus mCacheStatus;
    public final EventBase mEventBase;
    public boolean mInitialized;
    public ProxygenRadioMeter mRadioMeter;
    public int mMaxPriority = 7;
    public int mBandwidthSplitSize = 10000;
    public int mCacheDurationInSeconds = 2;
    public int mPoorRtt = PsiphonTunnel.VPN_INTERFACE_MTU;
    public int mModerateRtt = 150;
    public int mGoodRtt = 50;
    public int mPoorUL = 30000;
    public int mModerateUL = 110000;
    public int mGoodUL = 400000;
    public int mPoorDL = 150000;
    public int mModerateDL = 550000;
    public int mGoodDL = 2000000;
    public boolean mCalcBandwidthOnEvbThreadEnabled = true;

    private native BandwidthEstimate getBandwidthEstimateNative();

    private native void getNetworkStatusNative();

    public native void close();

    public native HashMap getAccumulativeRadioCounterData();

    public native long getConnectionLevelTraceDurationNative();

    public native SocketData[] getInboundConnectionLevelTraceDataNative();

    public native SocketData[] getOutboundConnectionLevelTraceDataNative();

    public native HashMap getRadioData();

    public native void init(EventBase eventBase, ProxygenRadioMeter proxygenRadioMeter, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z);

    public native void setNetworkType(int i, int i2);

    public native long startConnectionLevelTracingNative(String str);

    public native void stopConnectionLevelTracingNative();

    public BandwidthEstimate getBandwidthEstimate() {
        if (!this.mInitialized) {
            return null;
        }
        BandwidthEstimate bandwidthEstimateNative = getBandwidthEstimateNative();
        this.mBandwidthEstimate = bandwidthEstimateNative;
        return bandwidthEstimateNative;
    }

    public NetworkStatus getNetworkStatus() {
        if (!this.mInitialized) {
            return null;
        }
        getNetworkStatusNative();
        return this.mCacheStatus;
    }

    public void init(int i) {
        init(this.mEventBase, this.mRadioMeter, i, this.mMaxPriority, this.mBandwidthSplitSize, this.mCacheDurationInSeconds, this.mPoorRtt, this.mModerateRtt, this.mGoodRtt, this.mPoorUL, this.mModerateUL, this.mGoodUL, this.mPoorDL, this.mModerateDL, this.mGoodDL, this.mCalcBandwidthOnEvbThreadEnabled);
        this.mInitialized = true;
    }

    public NetworkStatusMonitor(EventBase eventBase) {
        this.mEventBase = eventBase;
    }

    public void finalize() {
        close();
    }

    public void setCacheDuration(int i) {
        this.mCacheDurationInSeconds = i;
    }

    public void setCalcBandwidthOnEvbThreadEnabled(boolean z) {
        this.mCalcBandwidthOnEvbThreadEnabled = z;
    }

    public void setRadioMeter(ProxygenRadioMeter proxygenRadioMeter) {
        this.mRadioMeter = proxygenRadioMeter;
    }
}
