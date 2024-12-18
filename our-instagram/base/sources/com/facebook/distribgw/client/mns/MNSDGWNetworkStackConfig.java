package com.facebook.distribgw.client.mns;

import X.C0RX;
import X.C72548XgH;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class MNSDGWNetworkStackConfig {
    public static final C0RX Companion = new Object();
    public final String dnsCacheDir;
    public final boolean enableFallbackSessions;
    public final boolean enableHttpVersionCache;
    public final boolean enableQuicEarlyData;
    public final long fallbackRttThresholdMs;
    public final boolean highPriorityEvLoopThread;
    public final long http2PingIntervalSec;
    public final long maxConsecutivePTO;
    public final boolean quicEnabled;
    public final long quicHandshakeTimeoutSec;
    public final long quicIdleTimeoutSec;
    public final long quicKeepAliveTimeoutSec;
    public final String quicKnobs;
    public final long tcpConnectTimeoutSec;
    public final long tcpHappyEyeballsDelayMs;
    public final long tcpProbeDelayMs;
    public final String tlsCacheDir;
    public final boolean trustSandboxCertificates;
    public final String userAgent;

    public /* synthetic */ MNSDGWNetworkStackConfig(String str, String str2, boolean z, long j, long j2, long j3, long j4, String str3, boolean z2, long j5, long j6, long j7, boolean z3, boolean z4, String str4, long j8, boolean z5, boolean z6, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, j, j2, j3, j4, str3, z2, j5, j6, j7, z3, z4, str4, j8, z5, z6, j9);
    }

    public static final C72548XgH newBuilder() {
        return new C72548XgH();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MNSDGWNetworkStackConfig: dnsCacheDir:");
        sb.append(this.dnsCacheDir);
        sb.append(", tlsCacheDir:");
        sb.append(this.tlsCacheDir);
        sb.append(", quicEnabled:");
        sb.append(this.quicEnabled);
        sb.append(", quicIdleTimeoutSec:");
        sb.append(this.quicIdleTimeoutSec);
        sb.append(", quicKeepAliveTimeoutSec:");
        sb.append(this.quicKeepAliveTimeoutSec);
        sb.append(", quicHandshakeTimeoutSec:");
        sb.append(this.quicHandshakeTimeoutSec);
        sb.append(", http2PingIntervalSec:");
        sb.append(this.http2PingIntervalSec);
        sb.append(", userAgent:");
        sb.append(this.userAgent);
        sb.append(", enableQuicEarlyData:");
        sb.append(this.enableQuicEarlyData);
        sb.append(", tcpProbeDelayMs:");
        sb.append(this.tcpProbeDelayMs);
        sb.append(", tcpHappyEyeballsDelayMs:");
        sb.append(this.tcpHappyEyeballsDelayMs);
        sb.append(", tcpConnectTimeoutSec:");
        sb.append(this.tcpConnectTimeoutSec);
        sb.append(", highPriorityEvLoopThread:");
        sb.append(this.highPriorityEvLoopThread);
        sb.append(", enableHttpVersionCache:");
        sb.append(this.enableHttpVersionCache);
        sb.append(", quicKnobs:");
        sb.append(this.quicKnobs);
        sb.append(", maxConsecutivePTO:");
        sb.append(this.maxConsecutivePTO);
        sb.append(", trustSandboxCertificates:");
        sb.append(this.trustSandboxCertificates);
        sb.append(" enableFallbackSessions:");
        sb.append(this.enableFallbackSessions);
        sb.append(", fallbackRttThresholdMs:");
        sb.append(this.fallbackRttThresholdMs);
        return sb.toString();
    }

    public MNSDGWNetworkStackConfig(String str, String str2, boolean z, long j, long j2, long j3, long j4, String str3, boolean z2, long j5, long j6, long j7, boolean z3, boolean z4, String str4, long j8, boolean z5, boolean z6, long j9) {
        this.dnsCacheDir = str;
        this.tlsCacheDir = str2;
        this.quicEnabled = z;
        this.quicIdleTimeoutSec = j;
        this.quicKeepAliveTimeoutSec = j2;
        this.quicHandshakeTimeoutSec = j3;
        this.http2PingIntervalSec = j4;
        this.userAgent = str3;
        this.enableQuicEarlyData = z2;
        this.tcpProbeDelayMs = j5;
        this.tcpHappyEyeballsDelayMs = j6;
        this.tcpConnectTimeoutSec = j7;
        this.highPriorityEvLoopThread = z3;
        this.enableHttpVersionCache = z4;
        this.quicKnobs = str4;
        this.maxConsecutivePTO = j8;
        this.trustSandboxCertificates = z5;
        this.enableFallbackSessions = z6;
        this.fallbackRttThresholdMs = j9;
    }
}
