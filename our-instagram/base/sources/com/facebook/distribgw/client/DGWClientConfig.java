package com.facebook.distribgw.client;

import X.C22815A4k;

/* loaded from: classes.dex */
public class DGWClientConfig {
    public static final String FB_GATEWAY_DOMAIN = "gateway.facebook.com";
    public static final String WP_GATEWAY_DOMAIN = "gateway.workplace.com";
    public final String appId;
    public final String appVersion;
    public final boolean bufferRequestWhileConnectivityNotStarted;
    public final boolean closeNetworkConnectionOnTimeout;
    public final ConnectivityManagerOptions connectivityManagerOptions;
    public final boolean debugCallbackCrashes2;
    public final String deviceId;
    public final String deviceOS;
    public final boolean eagerStreamGroupEnabled;
    public final boolean enableBufferRequestsWhenSuspended;
    public final boolean enableFetchRegionHintFromWww;
    public final boolean enableFlushPrioritization;
    public final boolean enableHTTP3;
    public final boolean enableInFlightStreamWrites;
    public final boolean enableMCLLogging;
    public final boolean enableStreamGroupLoadShedding;
    public String gatewayDomain;
    public final boolean isWorkBuild;
    public final boolean keepStreamGroupAliveAfterLastStream;
    public final long loadSheddingExponentialBackoffRate;
    public final double loadSheddingInitialBackoffTimeS;
    public final double loadSheddingMaxBackoffTimeS;
    public final boolean logDebugConnectionInfo;
    public final DGWPersonalizationConfig personalizationConfig;
    public final long regionHintCacheTtlHours;
    public final String responseCompression;
    public final long streamGroupBgTeardownDelaySeconds;
    public final long streamGroupConnectTimeoutSeconds;
    public final long streamGroupMaxConnectRetries;
    public final long streamGroupPingPeriod;
    public final long streamGroupPingTimeout;
    public final long streamGroupStopBgPingDelay;
    public final int streamGroupTrafficTracingSamplingRate;
    public final long streamIdleTimeoutMs;
    public final boolean triggerHighSignalSyncInFgOnly;
    public final boolean useCachedStreamGroupsStatus;
    public final boolean useStreamGroupRegistryV2;
    public final boolean useStreamGroupsForConnectivity;
    public final boolean zeroRatingEnabled;

    private String getGatewayDomain() {
        String str = this.gatewayDomain;
        if (str == null) {
            if (this.isWorkBuild) {
                return WP_GATEWAY_DOMAIN;
            }
            return FB_GATEWAY_DOMAIN;
        }
        return str;
    }

    public static C22815A4k newBuilder() {
        return new C22815A4k();
    }

    public String getDeviceOS(String str) {
        String str2 = this.deviceOS;
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{deviceOS:");
        sb.append(this.deviceOS);
        sb.append(",isWorkBuild:");
        sb.append(this.isWorkBuild);
        sb.append(",appVersion:");
        sb.append(this.appVersion);
        sb.append(",appId:");
        sb.append(this.appId);
        sb.append(",streamIdleTimeoutMs:");
        sb.append(this.streamIdleTimeoutMs);
        sb.append(",responseCompression:");
        sb.append(this.responseCompression);
        sb.append(",enableHTTP3:");
        sb.append(this.enableHTTP3);
        sb.append(",zeroRatingEnabled:");
        sb.append(this.zeroRatingEnabled);
        sb.append(",gatewayDomain:");
        sb.append(this.gatewayDomain);
        sb.append(",streamGroupPingPeriod:");
        sb.append(this.streamGroupPingPeriod);
        sb.append(",streamGroupPingTimeout:");
        sb.append(this.streamGroupPingTimeout);
        sb.append(",streamGroupStopBgPingDelay:");
        sb.append(this.streamGroupStopBgPingDelay);
        sb.append(",debugCallbackCrashes2:");
        sb.append(this.debugCallbackCrashes2);
        sb.append(",useStreamGroupsForConnectivity:");
        sb.append(this.useStreamGroupsForConnectivity);
        sb.append(",useCachedStreamGroupsStatus:");
        sb.append(this.useCachedStreamGroupsStatus);
        sb.append(",closeNetworkConnectionOnTimeout:");
        sb.append(this.closeNetworkConnectionOnTimeout);
        sb.append(",streamGroupMaxConnectRetries:");
        sb.append(this.streamGroupMaxConnectRetries);
        sb.append(",enableMCLLogging:");
        sb.append(this.enableMCLLogging);
        sb.append(",connectivityManagerOptions:");
        sb.append(this.connectivityManagerOptions);
        sb.append(",personalizationConfig:");
        sb.append(this.personalizationConfig);
        sb.append(",enableInFlightStreamWrites:");
        sb.append(this.enableInFlightStreamWrites);
        sb.append(",eagerStreamGroupEnabled:");
        sb.append(this.eagerStreamGroupEnabled);
        sb.append(",bufferRequestWhileConnectivityNotStarted:");
        sb.append(this.bufferRequestWhileConnectivityNotStarted);
        sb.append(",triggerHighSignalSyncInFgOnly:");
        sb.append(this.triggerHighSignalSyncInFgOnly);
        sb.append(",keepStreamGroupAliveAfterLastStream:");
        sb.append(this.keepStreamGroupAliveAfterLastStream);
        sb.append(",streamGroupBgTeardownDelaySeconds:");
        sb.append(this.streamGroupBgTeardownDelaySeconds);
        sb.append(",enableFetchRegionHintFromWww:");
        sb.append(this.enableFetchRegionHintFromWww);
        sb.append(",regionHintCacheTtlHours:");
        sb.append(this.regionHintCacheTtlHours);
        sb.append(",enableBufferRequestsWhenSuspended:");
        sb.append(this.enableBufferRequestsWhenSuspended);
        sb.append("}");
        return sb.toString();
    }

    public DGWClientConfig(int i, String str, String str2, ConnectivityManagerOptions connectivityManagerOptions, boolean z, String str3, String str4, long j, String str5, boolean z2, boolean z3, String str6, long j2, long j3, long j4, boolean z4, double d, double d2, long j5, DGWPersonalizationConfig dGWPersonalizationConfig, boolean z5, boolean z6, long j6, boolean z7, boolean z8, boolean z9, long j7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j8, boolean z17, long j9, boolean z18, boolean z19) {
        this.streamGroupTrafficTracingSamplingRate = i;
        this.deviceOS = str2;
        this.deviceId = str;
        this.connectivityManagerOptions = connectivityManagerOptions;
        this.isWorkBuild = z;
        this.appId = str3;
        this.appVersion = str4;
        this.streamIdleTimeoutMs = j;
        this.responseCompression = str5;
        this.enableHTTP3 = z2;
        this.zeroRatingEnabled = z3;
        this.gatewayDomain = str6;
        this.streamGroupPingPeriod = j2;
        this.streamGroupPingTimeout = j3;
        this.streamGroupStopBgPingDelay = j4;
        this.enableStreamGroupLoadShedding = z4;
        this.loadSheddingInitialBackoffTimeS = d;
        this.loadSheddingMaxBackoffTimeS = d2;
        this.loadSheddingExponentialBackoffRate = j5;
        this.personalizationConfig = dGWPersonalizationConfig;
        this.debugCallbackCrashes2 = z5;
        this.useStreamGroupsForConnectivity = z6;
        this.streamGroupConnectTimeoutSeconds = j6;
        this.useCachedStreamGroupsStatus = z7;
        this.closeNetworkConnectionOnTimeout = z8;
        this.enableFlushPrioritization = z9;
        this.streamGroupMaxConnectRetries = j7;
        this.enableMCLLogging = z10;
        this.logDebugConnectionInfo = z11;
        this.enableInFlightStreamWrites = z12;
        this.eagerStreamGroupEnabled = z13;
        this.bufferRequestWhileConnectivityNotStarted = z14;
        this.triggerHighSignalSyncInFgOnly = z15;
        this.keepStreamGroupAliveAfterLastStream = z16;
        this.streamGroupBgTeardownDelaySeconds = j8;
        this.enableFetchRegionHintFromWww = z17;
        this.regionHintCacheTtlHours = j9;
        this.useStreamGroupRegistryV2 = z18;
        this.enableBufferRequestsWhenSuspended = z19;
    }
}
