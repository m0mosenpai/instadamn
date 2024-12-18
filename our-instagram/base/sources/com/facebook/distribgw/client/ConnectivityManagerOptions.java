package com.facebook.distribgw.client;

import X.C53702cx;

/* loaded from: classes.dex */
public class ConnectivityManagerOptions {
    public final long bgPingIntervalMs;
    public final boolean disablePingWhileNoActiveStream;
    public final boolean enableLogging;
    public final boolean enablePingInBackground;
    public final boolean ignoreOnNetworkDisconnectedSignalAndSendPing;
    public final boolean ignoreOnNetworkDisconnectedSignalForPing;
    public boolean initAppStateAsBackground;
    public final long initialUnreachableDelayBackOffMode;
    public final long initialUnreachableDelayFastMode;
    public final boolean markDisconnectedInBackground;
    public final DGWPersonalizationProperty pingIntervalInMs;
    public final DGWPersonalizationThreshold pingLatencyInMs;
    public final DGWPersonalizationProperty pingTimeoutInMs;
    public final int pingTrafficTracingSamplingRate;
    public final boolean sendPingOnAppForeground;
    public final boolean shouldSetNotStartedOnFg;
    public final boolean skipPingAfterIngressTraffic;

    public static C53702cx newBuilder() {
        return new C53702cx();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("enablePingInBackground:");
        sb.append(this.enablePingInBackground);
        sb.append(",bgPingIntervalMs:");
        sb.append(this.bgPingIntervalMs);
        sb.append(",pingIntervalInMs:");
        sb.append(this.pingIntervalInMs);
        sb.append(",pingTimeoutInMs:");
        sb.append(this.pingTimeoutInMs);
        sb.append(",pingLatencyInMs:");
        sb.append(this.pingLatencyInMs);
        sb.append(",skipPingAfterIngressTraffic:");
        sb.append(this.skipPingAfterIngressTraffic);
        sb.append(",enableLogging:");
        sb.append(this.enableLogging);
        sb.append(",disablePingWhileNoActiveStream:");
        sb.append(this.disablePingWhileNoActiveStream);
        sb.append(",sendPingOnAppForeground:");
        sb.append(this.sendPingOnAppForeground);
        sb.append(",pingTrafficTracingSamplingRate:");
        sb.append(this.pingTrafficTracingSamplingRate);
        sb.append(",initAppStateAsBackground:");
        sb.append(this.initAppStateAsBackground);
        sb.append(",ignoreOnNetworkDisconnectedSignalForPing:");
        sb.append(this.ignoreOnNetworkDisconnectedSignalForPing);
        sb.append(",initialUnreachableDelayFastMode:");
        sb.append(this.initialUnreachableDelayBackOffMode);
        sb.append(",ignoreOnNetworkDisconnectedSignalAndSendPing:");
        sb.append(this.ignoreOnNetworkDisconnectedSignalAndSendPing);
        sb.append(",markDisconnectedInBackground:");
        sb.append(this.markDisconnectedInBackground);
        sb.append(",shouldSetNotStartedOnFg:");
        sb.append(this.shouldSetNotStartedOnFg);
        sb.append("}");
        return sb.toString();
    }

    public ConnectivityManagerOptions(boolean z, long j, DGWPersonalizationProperty dGWPersonalizationProperty, DGWPersonalizationProperty dGWPersonalizationProperty2, DGWPersonalizationThreshold dGWPersonalizationThreshold, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, long j2, long j3, boolean z8, boolean z9, boolean z10) {
        this.enablePingInBackground = z;
        this.bgPingIntervalMs = j;
        this.pingIntervalInMs = dGWPersonalizationProperty;
        this.pingTimeoutInMs = dGWPersonalizationProperty2;
        this.pingLatencyInMs = dGWPersonalizationThreshold;
        this.skipPingAfterIngressTraffic = z2;
        this.enableLogging = z3;
        this.disablePingWhileNoActiveStream = z4;
        this.sendPingOnAppForeground = z5;
        this.pingTrafficTracingSamplingRate = i;
        this.initAppStateAsBackground = z6;
        this.ignoreOnNetworkDisconnectedSignalForPing = z7;
        this.initialUnreachableDelayFastMode = j2;
        this.initialUnreachableDelayBackOffMode = j3;
        this.ignoreOnNetworkDisconnectedSignalAndSendPing = z8;
        this.markDisconnectedInBackground = z9;
        this.shouldSetNotStartedOnFg = z10;
    }
}
