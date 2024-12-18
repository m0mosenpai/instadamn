package com.facebook.tigon.tigonmns;

import X.AbstractC63123SdR;
import X.C09170dP;
import X.C14360o3;
import X.C16930sl;
import X.C23871Ev;
import X.C3OO;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class TigonMNSConfig {
    public static final C23871Ev Companion = new Object();
    public int bugReportMaxLastTelemetryEvents;
    public String cacheDirectory;
    public String certificateRevocationListJson;
    public String debugOptions;
    public String dnsRefreshHosts;
    public long dnsRefreshIntervalMs;
    public boolean enableBugReport;
    public boolean enableConnectionUUIDHeader;
    public boolean enableEgressPrioritization;
    public boolean enableFallbackSessions;
    public boolean enablePerRequestTransactionReceiveTimeout;
    public int eventLoopThreadPriority;
    public int fallbackRttThresholdMs;
    public boolean forceHttp2;
    public int http2ConnectionFlowControlWindow;
    public boolean http2HundredRequestsPerDynamicHostConnection;
    public int http2MaxConnectionsPerHost;
    public int http2MaxRequestsPerConnection;
    public int http2PingIntervalMs;
    public int http2StreamFlowControlWindow;
    public boolean httpConnectionQplEnabled;
    public long maxConsecutivePTO;
    public double mvfstAckTimerFactor;
    public boolean mvfstAlwaysPtoMultiple;
    public boolean mvfstCheckIdleTimerOnWrites;
    public boolean mvfstDefaultPriorityIncremental;
    public boolean mvfstEnableFlowControlTimeBasedUpdates;
    public boolean mvfstEnablePacing;
    public int mvfstFlowControlWindowFrequency;
    public long mvfstInitCwndInMss;
    public boolean mvfstInlineWrites;
    public boolean mvfstLeaveHeadroomForCwndLimited;
    public boolean mvfstLibevScheduleLoopImmediately;
    public int mvfstMaxCwndInMss;
    public int mvfstMaxHttpWrites;
    public int mvfstMinAckDelay;
    public boolean mvfstNetworkDataPerSocketRead;
    public boolean mvfstOnlyGrowCwndWhenLimited;
    public boolean mvfstProcessReadCallbacksPerPacket;
    public int mvfstRxPacketsBeforeAckAfterInit;
    public int mvfstRxPacketsBeforeAckBeforeInit;
    public boolean mvfstShouldUseRecvmmsgForBatchRecv;
    public boolean mvfstStreamFlowControlAutotuneEnabled;
    public int mvfstStreamFlowControlWindowSize;
    public int mvfstTotalBufferSpaceAvailable;
    public boolean mvfstUseHandshakeTimeout;
    public boolean mvfstUseInflightReorderingThreshold;
    public int mvfstWriteConnectionDataPacketsLimit;
    public boolean mvfstWritesConnLimited;
    public List preconnectHosts;
    public String quicAckReceiveTimestampsAllowedHostSubstrings;
    public int quicAckReceiveTimestampsExponent;
    public long quicAckThreshold;
    public boolean quicAttemptSingleIPAddress;
    public String quicCongestionControlAlgorithm;
    public boolean quicEnableEarlyData;
    public boolean quicEnableX25519;
    public int quicFlowControlAutoTuningMaxConnectionWindow;
    public int quicFlowControlAutoTuningMaxStreamWindow;
    public int quicHandshakeTimeoutMs;
    public int quicIdleTimeoutMs;
    public long quicInitialMaxData;
    public long quicInitialMaxStreamDataBidiLocal;
    public int quicInitialRttMs;
    public int quicKeepAliveTimeoutMs;
    public String quicKnobsJson;
    public int quicMaxReadsPerEvent;
    public int quicMaxReceiveTimestampsPerAck;
    public boolean quicPacketCoalescingDisabled;
    public boolean quicUseSendApi;
    public int quicVersionOverride;
    public boolean tcpEnableEarlyData;
    public int tcpEstablishTimeoutMs;
    public int tcpHappyEyeballsConnectionDelayMs;
    public int tcpMaxReadsPerEvent;
    public int tcpProbeDelayMs;
    public int tcpReadTimeoutMs;
    public int tcpWriteTimeoutMs;
    public int transactionReceiveTimeoutMs;
    public boolean trustSandboxCertificates;
    public int udpReceiveBufferSize;
    public boolean useMNSForDevserver;
    public boolean useMnsProxy;
    public boolean useMvfstMobile;
    public boolean useOnBodyExperimental;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TigonMNSConfig() {
        /*
            r97 = this;
            r1 = 0
            r2 = 0
            r5 = 0
            r69 = 0
            r93 = -1
            r95 = 2097151(0x1fffff, float:2.938734E-39)
            r0 = r97
            r3 = r1
            r4 = r1
            r7 = r5
            r9 = r1
            r10 = r5
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r1
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r1
            r23 = r1
            r24 = r1
            r25 = r1
            r26 = r2
            r27 = r1
            r28 = r1
            r29 = r1
            r30 = r1
            r31 = r1
            r32 = r1
            r33 = r1
            r34 = r2
            r35 = r1
            r36 = r1
            r37 = r1
            r38 = r1
            r39 = r1
            r40 = r1
            r41 = r1
            r42 = r1
            r43 = r1
            r44 = r2
            r45 = r2
            r46 = r1
            r47 = r2
            r48 = r1
            r49 = r1
            r50 = r1
            r51 = r1
            r52 = r5
            r54 = r1
            r55 = r2
            r56 = r1
            r57 = r1
            r58 = r1
            r59 = r1
            r60 = r1
            r61 = r1
            r62 = r1
            r63 = r1
            r64 = r1
            r65 = r1
            r66 = r1
            r67 = r1
            r68 = r1
            r71 = r1
            r72 = r1
            r73 = r1
            r74 = r1
            r75 = r1
            r76 = r1
            r77 = r5
            r79 = r1
            r80 = r2
            r81 = r5
            r83 = r1
            r84 = r1
            r85 = r1
            r86 = r1
            r87 = r1
            r88 = r1
            r89 = r1
            r90 = r1
            r91 = r1
            r92 = r1
            r94 = r93
            r96 = r2
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r71, r72, r73, r74, r75, r76, r77, r79, r80, r81, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.tigon.tigonmns.TigonMNSConfig.<init>():void");
    }

    public final void setCacheDirectory(String str) {
        C14360o3.A0B(str, 0);
        this.cacheDirectory = str;
    }

    public final void setCertificateRevocationListJson(String str) {
        C14360o3.A0B(str, 0);
        this.certificateRevocationListJson = str;
    }

    public final void setDebugOptions(String str) {
        C14360o3.A0B(str, 0);
        this.debugOptions = str;
    }

    public final void setDnsRefreshHosts(String str) {
        C14360o3.A0B(str, 0);
        this.dnsRefreshHosts = str;
    }

    public final void setPreconnectHosts(List list) {
        C14360o3.A0B(list, 0);
        this.preconnectHosts = list;
    }

    public final void setQuicAckReceiveTimestampsAllowedHostSubstrings(String str) {
        C14360o3.A0B(str, 0);
        this.quicAckReceiveTimestampsAllowedHostSubstrings = str;
    }

    public final void setQuicCongestionControlAlgorithm(String str) {
        C14360o3.A0B(str, 0);
        this.quicCongestionControlAlgorithm = str;
    }

    public final void setQuicKnobsJson(String str) {
        C14360o3.A0B(str, 0);
        this.quicKnobsJson = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Ev, java.lang.Object] */
    static {
        C09170dP.A0C("tigonmns-jni");
    }

    public final int getBugReportMaxLastTelemetryEvents() {
        return this.bugReportMaxLastTelemetryEvents;
    }

    public final String getCacheDirectory() {
        return this.cacheDirectory;
    }

    public final String getCertificateRevocationListJson() {
        return this.certificateRevocationListJson;
    }

    public final String getDebugOptions() {
        return this.debugOptions;
    }

    public final String getDnsRefreshHosts() {
        return this.dnsRefreshHosts;
    }

    public final long getDnsRefreshIntervalMs() {
        return this.dnsRefreshIntervalMs;
    }

    public final boolean getEnableBugReport() {
        return this.enableBugReport;
    }

    public final boolean getEnableConnectionUUIDHeader() {
        return this.enableConnectionUUIDHeader;
    }

    public final boolean getEnableEgressPrioritization() {
        return this.enableEgressPrioritization;
    }

    public final boolean getEnableFallbackSessions() {
        return this.enableFallbackSessions;
    }

    public final boolean getEnablePerRequestTransactionReceiveTimeout() {
        return this.enablePerRequestTransactionReceiveTimeout;
    }

    public final int getEventLoopThreadPriority() {
        return this.eventLoopThreadPriority;
    }

    public final int getFallbackRttThresholdMs() {
        return this.fallbackRttThresholdMs;
    }

    public final boolean getForceHttp2() {
        return this.forceHttp2;
    }

    public final int getHttp2ConnectionFlowControlWindow() {
        return this.http2ConnectionFlowControlWindow;
    }

    public final boolean getHttp2HundredRequestsPerDynamicHostConnection() {
        return this.http2HundredRequestsPerDynamicHostConnection;
    }

    public final int getHttp2MaxConnectionsPerHost() {
        return this.http2MaxConnectionsPerHost;
    }

    public final int getHttp2MaxRequestsPerConnection() {
        return this.http2MaxRequestsPerConnection;
    }

    public final int getHttp2PingIntervalMs() {
        return this.http2PingIntervalMs;
    }

    public final int getHttp2StreamFlowControlWindow() {
        return this.http2StreamFlowControlWindow;
    }

    public final boolean getHttpConnectionQplEnabled() {
        return this.httpConnectionQplEnabled;
    }

    public final long getMaxConsecutivePTO() {
        return this.maxConsecutivePTO;
    }

    public final double getMvfstAckTimerFactor() {
        return this.mvfstAckTimerFactor;
    }

    public final boolean getMvfstAlwaysPtoMultiple() {
        return this.mvfstAlwaysPtoMultiple;
    }

    public final boolean getMvfstCheckIdleTimerOnWrites() {
        return this.mvfstCheckIdleTimerOnWrites;
    }

    public final boolean getMvfstDefaultPriorityIncremental() {
        return this.mvfstDefaultPriorityIncremental;
    }

    public final boolean getMvfstEnableFlowControlTimeBasedUpdates() {
        return this.mvfstEnableFlowControlTimeBasedUpdates;
    }

    public final boolean getMvfstEnablePacing() {
        return this.mvfstEnablePacing;
    }

    public final int getMvfstFlowControlWindowFrequency() {
        return this.mvfstFlowControlWindowFrequency;
    }

    public final long getMvfstInitCwndInMss() {
        return this.mvfstInitCwndInMss;
    }

    public final boolean getMvfstInlineWrites() {
        return this.mvfstInlineWrites;
    }

    public final boolean getMvfstLeaveHeadroomForCwndLimited() {
        return this.mvfstLeaveHeadroomForCwndLimited;
    }

    public final boolean getMvfstLibevScheduleLoopImmediately() {
        return this.mvfstLibevScheduleLoopImmediately;
    }

    public final int getMvfstMaxCwndInMss() {
        return this.mvfstMaxCwndInMss;
    }

    public final int getMvfstMaxHttpWrites() {
        return this.mvfstMaxHttpWrites;
    }

    public final int getMvfstMinAckDelay() {
        return this.mvfstMinAckDelay;
    }

    public final boolean getMvfstNetworkDataPerSocketRead() {
        return this.mvfstNetworkDataPerSocketRead;
    }

    public final boolean getMvfstOnlyGrowCwndWhenLimited() {
        return this.mvfstOnlyGrowCwndWhenLimited;
    }

    public final boolean getMvfstProcessReadCallbacksPerPacket() {
        return this.mvfstProcessReadCallbacksPerPacket;
    }

    public final int getMvfstRxPacketsBeforeAckAfterInit() {
        return this.mvfstRxPacketsBeforeAckAfterInit;
    }

    public final int getMvfstRxPacketsBeforeAckBeforeInit() {
        return this.mvfstRxPacketsBeforeAckBeforeInit;
    }

    public final boolean getMvfstShouldUseRecvmmsgForBatchRecv() {
        return this.mvfstShouldUseRecvmmsgForBatchRecv;
    }

    public final boolean getMvfstStreamFlowControlAutotuneEnabled() {
        return this.mvfstStreamFlowControlAutotuneEnabled;
    }

    public final int getMvfstStreamFlowControlWindowSize() {
        return this.mvfstStreamFlowControlWindowSize;
    }

    public final int getMvfstTotalBufferSpaceAvailable() {
        return this.mvfstTotalBufferSpaceAvailable;
    }

    public final boolean getMvfstUseHandshakeTimeout() {
        return this.mvfstUseHandshakeTimeout;
    }

    public final boolean getMvfstUseInflightReorderingThreshold() {
        return this.mvfstUseInflightReorderingThreshold;
    }

    public final int getMvfstWriteConnectionDataPacketsLimit() {
        return this.mvfstWriteConnectionDataPacketsLimit;
    }

    public final boolean getMvfstWritesConnLimited() {
        return this.mvfstWritesConnLimited;
    }

    public final List getPreconnectHosts() {
        return this.preconnectHosts;
    }

    public final String getQuicAckReceiveTimestampsAllowedHostSubstrings() {
        return this.quicAckReceiveTimestampsAllowedHostSubstrings;
    }

    public final int getQuicAckReceiveTimestampsExponent() {
        return this.quicAckReceiveTimestampsExponent;
    }

    public final long getQuicAckThreshold() {
        return this.quicAckThreshold;
    }

    public final boolean getQuicAttemptSingleIPAddress() {
        return this.quicAttemptSingleIPAddress;
    }

    public final String getQuicCongestionControlAlgorithm() {
        return this.quicCongestionControlAlgorithm;
    }

    public final boolean getQuicEnableEarlyData() {
        return this.quicEnableEarlyData;
    }

    public final boolean getQuicEnableX25519() {
        return this.quicEnableX25519;
    }

    public final int getQuicFlowControlAutoTuningMaxConnectionWindow() {
        return this.quicFlowControlAutoTuningMaxConnectionWindow;
    }

    public final int getQuicFlowControlAutoTuningMaxStreamWindow() {
        return this.quicFlowControlAutoTuningMaxStreamWindow;
    }

    public final int getQuicHandshakeTimeoutMs() {
        return this.quicHandshakeTimeoutMs;
    }

    public final int getQuicIdleTimeoutMs() {
        return this.quicIdleTimeoutMs;
    }

    public final long getQuicInitialMaxData() {
        return this.quicInitialMaxData;
    }

    public final long getQuicInitialMaxStreamDataBidiLocal() {
        return this.quicInitialMaxStreamDataBidiLocal;
    }

    public final int getQuicInitialRttMs() {
        return this.quicInitialRttMs;
    }

    public final int getQuicKeepAliveTimeoutMs() {
        return this.quicKeepAliveTimeoutMs;
    }

    public final String getQuicKnobsJson() {
        return this.quicKnobsJson;
    }

    public final int getQuicMaxReadsPerEvent() {
        return this.quicMaxReadsPerEvent;
    }

    public final int getQuicMaxReceiveTimestampsPerAck() {
        return this.quicMaxReceiveTimestampsPerAck;
    }

    public final boolean getQuicPacketCoalescingDisabled() {
        return this.quicPacketCoalescingDisabled;
    }

    public final boolean getQuicUseSendApi() {
        return this.quicUseSendApi;
    }

    public final int getQuicVersionOverride() {
        return this.quicVersionOverride;
    }

    public final boolean getTcpEnableEarlyData() {
        return this.tcpEnableEarlyData;
    }

    public final int getTcpEstablishTimeoutMs() {
        return this.tcpEstablishTimeoutMs;
    }

    public final int getTcpHappyEyeballsConnectionDelayMs() {
        return this.tcpHappyEyeballsConnectionDelayMs;
    }

    public final int getTcpMaxReadsPerEvent() {
        return this.tcpMaxReadsPerEvent;
    }

    public final int getTcpProbeDelayMs() {
        return this.tcpProbeDelayMs;
    }

    public final int getTcpReadTimeoutMs() {
        return this.tcpReadTimeoutMs;
    }

    public final int getTcpWriteTimeoutMs() {
        return this.tcpWriteTimeoutMs;
    }

    public final int getTransactionReceiveTimeoutMs() {
        return this.transactionReceiveTimeoutMs;
    }

    public final boolean getTrustSandboxCertificates() {
        return this.trustSandboxCertificates;
    }

    public final int getUdpReceiveBufferSize() {
        return this.udpReceiveBufferSize;
    }

    public final boolean getUseMNSForDevserver() {
        return this.useMNSForDevserver;
    }

    public final boolean getUseMnsProxy() {
        return this.useMnsProxy;
    }

    public final boolean getUseMvfstMobile() {
        return this.useMvfstMobile;
    }

    public final boolean getUseOnBodyExperimental() {
        return this.useOnBodyExperimental;
    }

    public final void setBugReportMaxLastTelemetryEvents(int i) {
        this.bugReportMaxLastTelemetryEvents = i;
    }

    public final void setDnsRefreshIntervalMs(long j) {
        this.dnsRefreshIntervalMs = j;
    }

    public final void setEnableBugReport(boolean z) {
        this.enableBugReport = z;
    }

    public final void setEnableConnectionUUIDHeader(boolean z) {
        this.enableConnectionUUIDHeader = z;
    }

    public final void setEnableEgressPrioritization(boolean z) {
        this.enableEgressPrioritization = z;
    }

    public final void setEnableFallbackSessions(boolean z) {
        this.enableFallbackSessions = z;
    }

    public final void setEnablePerRequestTransactionReceiveTimeout(boolean z) {
        this.enablePerRequestTransactionReceiveTimeout = z;
    }

    public final void setEventLoopThreadPriority(int i) {
        this.eventLoopThreadPriority = i;
    }

    public final void setFallbackRttThresholdMs(int i) {
        this.fallbackRttThresholdMs = i;
    }

    public final void setForceHttp2(boolean z) {
        this.forceHttp2 = z;
    }

    public final void setHttp2ConnectionFlowControlWindow(int i) {
        this.http2ConnectionFlowControlWindow = i;
    }

    public final void setHttp2HundredRequestsPerDynamicHostConnection(boolean z) {
        this.http2HundredRequestsPerDynamicHostConnection = z;
    }

    public final void setHttp2MaxConnectionsPerHost(int i) {
        this.http2MaxConnectionsPerHost = i;
    }

    public final void setHttp2MaxRequestsPerConnection(int i) {
        this.http2MaxRequestsPerConnection = i;
    }

    public final void setHttp2PingIntervalMs(int i) {
        this.http2PingIntervalMs = i;
    }

    public final void setHttp2StreamFlowControlWindow(int i) {
        this.http2StreamFlowControlWindow = i;
    }

    public final void setHttpConnectionQplEnabled(boolean z) {
        this.httpConnectionQplEnabled = z;
    }

    public final void setMaxConsecutivePTO(long j) {
        this.maxConsecutivePTO = j;
    }

    public final void setMvfstAckTimerFactor(double d) {
        this.mvfstAckTimerFactor = d;
    }

    public final void setMvfstAlwaysPtoMultiple(boolean z) {
        this.mvfstAlwaysPtoMultiple = z;
    }

    public final void setMvfstCheckIdleTimerOnWrites(boolean z) {
        this.mvfstCheckIdleTimerOnWrites = z;
    }

    public final void setMvfstDefaultPriorityIncremental(boolean z) {
        this.mvfstDefaultPriorityIncremental = z;
    }

    public final void setMvfstEnableFlowControlTimeBasedUpdates(boolean z) {
        this.mvfstEnableFlowControlTimeBasedUpdates = z;
    }

    public final void setMvfstEnablePacing(boolean z) {
        this.mvfstEnablePacing = z;
    }

    public final void setMvfstFlowControlWindowFrequency(int i) {
        this.mvfstFlowControlWindowFrequency = i;
    }

    public final void setMvfstInitCwndInMss(long j) {
        this.mvfstInitCwndInMss = j;
    }

    public final void setMvfstInlineWrites(boolean z) {
        this.mvfstInlineWrites = z;
    }

    public final void setMvfstLeaveHeadroomForCwndLimited(boolean z) {
        this.mvfstLeaveHeadroomForCwndLimited = z;
    }

    public final void setMvfstLibevScheduleLoopImmediately(boolean z) {
        this.mvfstLibevScheduleLoopImmediately = z;
    }

    public final void setMvfstMaxCwndInMss(int i) {
        this.mvfstMaxCwndInMss = i;
    }

    public final void setMvfstMaxHttpWrites(int i) {
        this.mvfstMaxHttpWrites = i;
    }

    public final void setMvfstMinAckDelay(int i) {
        this.mvfstMinAckDelay = i;
    }

    public final void setMvfstNetworkDataPerSocketRead(boolean z) {
        this.mvfstNetworkDataPerSocketRead = z;
    }

    public final void setMvfstOnlyGrowCwndWhenLimited(boolean z) {
        this.mvfstOnlyGrowCwndWhenLimited = z;
    }

    public final void setMvfstProcessReadCallbacksPerPacket(boolean z) {
        this.mvfstProcessReadCallbacksPerPacket = z;
    }

    public final void setMvfstRxPacketsBeforeAckAfterInit(int i) {
        this.mvfstRxPacketsBeforeAckAfterInit = i;
    }

    public final void setMvfstRxPacketsBeforeAckBeforeInit(int i) {
        this.mvfstRxPacketsBeforeAckBeforeInit = i;
    }

    public final void setMvfstShouldUseRecvmmsgForBatchRecv(boolean z) {
        this.mvfstShouldUseRecvmmsgForBatchRecv = z;
    }

    public final void setMvfstStreamFlowControlAutotuneEnabled(boolean z) {
        this.mvfstStreamFlowControlAutotuneEnabled = z;
    }

    public final void setMvfstStreamFlowControlWindowSize(int i) {
        this.mvfstStreamFlowControlWindowSize = i;
    }

    public final void setMvfstTotalBufferSpaceAvailable(int i) {
        this.mvfstTotalBufferSpaceAvailable = i;
    }

    public final void setMvfstUseHandshakeTimeout(boolean z) {
        this.mvfstUseHandshakeTimeout = z;
    }

    public final void setMvfstUseInflightReorderingThreshold(boolean z) {
        this.mvfstUseInflightReorderingThreshold = z;
    }

    public final void setMvfstWriteConnectionDataPacketsLimit(int i) {
        this.mvfstWriteConnectionDataPacketsLimit = i;
    }

    public final void setMvfstWritesConnLimited(boolean z) {
        this.mvfstWritesConnLimited = z;
    }

    public final void setQuicAckReceiveTimestampsExponent(int i) {
        this.quicAckReceiveTimestampsExponent = i;
    }

    public final void setQuicAckThreshold(long j) {
        this.quicAckThreshold = j;
    }

    public final void setQuicAttemptSingleIPAddress(boolean z) {
        this.quicAttemptSingleIPAddress = z;
    }

    public final void setQuicEnableEarlyData(boolean z) {
        this.quicEnableEarlyData = z;
    }

    public final void setQuicEnableX25519(boolean z) {
        this.quicEnableX25519 = z;
    }

    public final void setQuicFlowControlAutoTuningMaxConnectionWindow(int i) {
        this.quicFlowControlAutoTuningMaxConnectionWindow = i;
    }

    public final void setQuicFlowControlAutoTuningMaxStreamWindow(int i) {
        this.quicFlowControlAutoTuningMaxStreamWindow = i;
    }

    public final void setQuicHandshakeTimeoutMs(int i) {
        this.quicHandshakeTimeoutMs = i;
    }

    public final void setQuicIdleTimeoutMs(int i) {
        this.quicIdleTimeoutMs = i;
    }

    public final void setQuicInitialMaxData(long j) {
        this.quicInitialMaxData = j;
    }

    public final void setQuicInitialMaxStreamDataBidiLocal(long j) {
        this.quicInitialMaxStreamDataBidiLocal = j;
    }

    public final void setQuicInitialRttMs(int i) {
        this.quicInitialRttMs = i;
    }

    public final void setQuicKeepAliveTimeoutMs(int i) {
        this.quicKeepAliveTimeoutMs = i;
    }

    public final void setQuicMaxReadsPerEvent(int i) {
        this.quicMaxReadsPerEvent = i;
    }

    public final void setQuicMaxReceiveTimestampsPerAck(int i) {
        this.quicMaxReceiveTimestampsPerAck = i;
    }

    public final void setQuicPacketCoalescingDisabled(boolean z) {
        this.quicPacketCoalescingDisabled = z;
    }

    public final void setQuicUseSendApi(boolean z) {
        this.quicUseSendApi = z;
    }

    public final void setQuicVersionOverride(int i) {
        this.quicVersionOverride = i;
    }

    public final void setTcpEnableEarlyData(boolean z) {
        this.tcpEnableEarlyData = z;
    }

    public final void setTcpEstablishTimeoutMs(int i) {
        this.tcpEstablishTimeoutMs = i;
    }

    public final void setTcpHappyEyeballsConnectionDelayMs(int i) {
        this.tcpHappyEyeballsConnectionDelayMs = i;
    }

    public final void setTcpMaxReadsPerEvent(int i) {
        this.tcpMaxReadsPerEvent = i;
    }

    public final void setTcpProbeDelayMs(int i) {
        this.tcpProbeDelayMs = i;
    }

    public final void setTcpReadTimeoutMs(int i) {
        this.tcpReadTimeoutMs = i;
    }

    public final void setTcpWriteTimeoutMs(int i) {
        this.tcpWriteTimeoutMs = i;
    }

    public final void setTransactionReceiveTimeoutMs(int i) {
        this.transactionReceiveTimeoutMs = i;
    }

    public final void setTrustSandboxCertificates(boolean z) {
        this.trustSandboxCertificates = z;
    }

    public final void setUdpReceiveBufferSize(int i) {
        this.udpReceiveBufferSize = i;
    }

    public final void setUseMNSForDevserver(boolean z) {
        this.useMNSForDevserver = z;
    }

    public final void setUseMnsProxy(boolean z) {
        this.useMnsProxy = z;
    }

    public final void setUseMvfstMobile(boolean z) {
        this.useMvfstMobile = z;
    }

    public final void setUseOnBodyExperimental(boolean z) {
        this.useOnBodyExperimental = z;
    }

    public TigonMNSConfig(int i, List list, int i2, int i3, long j, long j2, int i4, long j3, boolean z, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2, int i12, int i13, int i14, int i15, boolean z3, String str, int i16, int i17, int i18, int i19, int i20, int i21, boolean z4, String str2, boolean z5, boolean z6, boolean z7, boolean z8, int i22, boolean z9, int i23, int i24, boolean z10, String str3, String str4, boolean z11, String str5, boolean z12, int i25, boolean z13, boolean z14, long j4, boolean z15, String str6, boolean z16, boolean z17, int i26, int i27, int i28, boolean z18, boolean z19, boolean z20, int i29, int i30, int i31, int i32, boolean z21, double d, boolean z22, int i33, int i34, boolean z23, boolean z24, boolean z25, long j5, boolean z26, String str7, long j6, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, int i35, boolean z35) {
        C14360o3.A0B(list, 2);
        C14360o3.A0B(str, 23);
        C14360o3.A0B(str2, 31);
        C14360o3.A0B(str3, 41);
        C14360o3.A0B(str4, 42);
        C14360o3.A0B(str5, 44);
        C14360o3.A0B(str6, 51);
        C14360o3.A0B(str7, 74);
        this.eventLoopThreadPriority = i;
        this.preconnectHosts = list;
        this.quicIdleTimeoutMs = i2;
        this.quicKeepAliveTimeoutMs = i3;
        this.quicInitialMaxData = j;
        this.quicInitialMaxStreamDataBidiLocal = j2;
        this.quicInitialRttMs = i4;
        this.quicAckThreshold = j3;
        this.trustSandboxCertificates = z;
        this.quicMaxReadsPerEvent = i5;
        this.quicFlowControlAutoTuningMaxConnectionWindow = i6;
        this.quicFlowControlAutoTuningMaxStreamWindow = i7;
        this.quicHandshakeTimeoutMs = i8;
        this.udpReceiveBufferSize = i9;
        this.tcpMaxReadsPerEvent = i10;
        this.tcpEstablishTimeoutMs = i11;
        this.tcpEnableEarlyData = z2;
        this.tcpProbeDelayMs = i12;
        this.http2ConnectionFlowControlWindow = i13;
        this.http2StreamFlowControlWindow = i14;
        this.http2MaxRequestsPerConnection = i15;
        this.forceHttp2 = z3;
        this.cacheDirectory = str;
        this.tcpReadTimeoutMs = i16;
        this.tcpWriteTimeoutMs = i17;
        this.http2MaxConnectionsPerHost = i18;
        this.http2PingIntervalMs = i19;
        this.transactionReceiveTimeoutMs = i20;
        this.tcpHappyEyeballsConnectionDelayMs = i21;
        this.http2HundredRequestsPerDynamicHostConnection = z4;
        this.quicCongestionControlAlgorithm = str2;
        this.quicEnableEarlyData = z5;
        this.quicAttemptSingleIPAddress = z6;
        this.useOnBodyExperimental = z7;
        this.enableBugReport = z8;
        this.bugReportMaxLastTelemetryEvents = i22;
        this.quicEnableX25519 = z9;
        this.quicMaxReceiveTimestampsPerAck = i23;
        this.quicAckReceiveTimestampsExponent = i24;
        this.quicUseSendApi = z10;
        this.debugOptions = str3;
        this.certificateRevocationListJson = str4;
        this.enablePerRequestTransactionReceiveTimeout = z11;
        this.quicKnobsJson = str5;
        this.useMvfstMobile = z12;
        this.quicVersionOverride = i25;
        this.useMnsProxy = z13;
        this.enableEgressPrioritization = z14;
        this.maxConsecutivePTO = j4;
        this.quicPacketCoalescingDisabled = z15;
        this.quicAckReceiveTimestampsAllowedHostSubstrings = str6;
        this.mvfstDefaultPriorityIncremental = z16;
        this.enableConnectionUUIDHeader = z17;
        this.mvfstFlowControlWindowFrequency = i26;
        this.mvfstMaxHttpWrites = i27;
        this.mvfstStreamFlowControlWindowSize = i28;
        this.mvfstStreamFlowControlAutotuneEnabled = z18;
        this.mvfstOnlyGrowCwndWhenLimited = z19;
        this.mvfstLeaveHeadroomForCwndLimited = z20;
        this.mvfstMaxCwndInMss = i29;
        this.mvfstWriteConnectionDataPacketsLimit = i30;
        this.mvfstRxPacketsBeforeAckBeforeInit = i31;
        this.mvfstRxPacketsBeforeAckAfterInit = i32;
        this.mvfstShouldUseRecvmmsgForBatchRecv = z21;
        this.mvfstAckTimerFactor = d;
        this.mvfstEnableFlowControlTimeBasedUpdates = z22;
        this.mvfstTotalBufferSpaceAvailable = i33;
        this.mvfstMinAckDelay = i34;
        this.mvfstCheckIdleTimerOnWrites = z23;
        this.mvfstWritesConnLimited = z24;
        this.mvfstLibevScheduleLoopImmediately = z25;
        this.mvfstInitCwndInMss = j5;
        this.mvfstProcessReadCallbacksPerPacket = z26;
        this.dnsRefreshHosts = str7;
        this.dnsRefreshIntervalMs = j6;
        this.mvfstInlineWrites = z27;
        this.mvfstNetworkDataPerSocketRead = z28;
        this.httpConnectionQplEnabled = z29;
        this.useMNSForDevserver = z30;
        this.mvfstAlwaysPtoMultiple = z31;
        this.mvfstEnablePacing = z32;
        this.mvfstUseHandshakeTimeout = z33;
        this.enableFallbackSessions = z34;
        this.fallbackRttThresholdMs = i35;
        this.mvfstUseInflightReorderingThreshold = z35;
    }

    public /* synthetic */ TigonMNSConfig(int i, List list, int i2, int i3, long j, long j2, int i4, long j3, boolean z, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2, int i12, int i13, int i14, int i15, boolean z3, String str, int i16, int i17, int i18, int i19, int i20, int i21, boolean z4, String str2, boolean z5, boolean z6, boolean z7, boolean z8, int i22, boolean z9, int i23, int i24, boolean z10, String str3, String str4, boolean z11, String str5, boolean z12, int i25, boolean z13, boolean z14, long j4, boolean z15, String str6, boolean z16, boolean z17, int i26, int i27, int i28, boolean z18, boolean z19, boolean z20, int i29, int i30, int i31, int i32, boolean z21, double d, boolean z22, int i33, int i34, boolean z23, boolean z24, boolean z25, long j5, boolean z26, String str7, long j6, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, int i35, boolean z35, int i36, int i37, int i38, DefaultConstructorMarker defaultConstructorMarker) {
        this((i36 & 1) != 0 ? 0 : i, (i36 & 2) != 0 ? C16930sl.A00 : list, (i36 & 4) != 0 ? 60000 : i2, (i36 & 8) != 0 ? 0 : i3, (i36 & 16) != 0 ? 6291456L : j, (i36 & 32) != 0 ? 163840L : j2, (i36 & 64) != 0 ? 0 : i4, (i36 & 128) != 0 ? 15L : j3, (i36 & 256) != 0 ? false : z, (i36 & 512) != 0 ? 128 : i5, (i36 & 1024) != 0 ? 0 : i6, (i36 & C3OO.FLAG_MOVED) != 0 ? 0 : i7, (i36 & 4096) != 0 ? 0 : i8, (i36 & 8192) != 0 ? 0 : i9, (i36 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? 1 : i10, (i36 & Constants.LOAD_RESULT_PGO) != 0 ? 30000 : i11, (i36 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0 ? false : z2, (i36 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? 500 : i12, (i36 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 ? 0 : i13, (i36 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0 ? 0 : i14, (i36 & 1048576) != 0 ? 1 : i15, (i36 & 2097152) != 0 ? false : z3, (i36 & 4194304) != 0 ? "" : str, (i36 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 ? 0 : i16, (i36 & 16777216) != 0 ? 0 : i17, (i36 & 33554432) != 0 ? 0 : i18, (i36 & 67108864) != 0 ? 0 : i19, (i36 & 134217728) != 0 ? 0 : i20, (i36 & 268435456) != 0 ? 0 : i21, (i36 & 536870912) != 0 ? false : z4, (i36 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0 ? "" : str2, (i36 & Integer.MIN_VALUE) != 0 ? false : z5, (i37 & 1) != 0 ? false : z6, (i37 & 2) != 0 ? false : z7, (i37 & 4) != 0 ? false : z8, (i37 & 8) != 0 ? 100 : i22, (i37 & 16) != 0 ? false : z9, (i37 & 32) != 0 ? 0 : i23, (i37 & 64) != 0 ? 0 : i24, (i37 & 128) != 0 ? false : z10, (i37 & 256) != 0 ? "" : str3, (i37 & 512) != 0 ? "" : str4, (i37 & 1024) != 0 ? false : z11, (i37 & C3OO.FLAG_MOVED) != 0 ? "" : str5, (i37 & 4096) != 0 ? false : z12, (i37 & 8192) != 0 ? 0 : i25, (i37 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? false : z13, (i37 & Constants.LOAD_RESULT_PGO) != 0 ? false : z14, (i37 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0 ? 0L : j4, (i37 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? false : z15, (i37 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 ? "" : str6, (i37 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0 ? false : z16, (i37 & 1048576) != 0 ? false : z17, (i37 & 2097152) != 0 ? 0 : i26, (i37 & 4194304) != 0 ? 0 : i27, (i37 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 ? 0 : i28, (i37 & 16777216) != 0 ? false : z18, (i37 & 33554432) != 0 ? true : z19, (i37 & 67108864) != 0 ? true : z20, (i37 & 134217728) != 0 ? 10000 : i29, (i37 & 268435456) != 0 ? 50 : i30, (i37 & 536870912) != 0 ? 15 : i31, (i37 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0 ? 15 : i32, (i37 & Integer.MIN_VALUE) != 0 ? false : z21, (i38 & 1) != 0 ? 0.25d : d, (i38 & 2) == 0 ? z22 : true, (i38 & 4) != 0 ? 0 : i33, (i38 & 8) != 0 ? 0 : i34, (i38 & 16) != 0 ? false : z23, (i38 & 32) != 0 ? false : z24, (i38 & 64) != 0 ? false : z25, (i38 & 128) != 0 ? 10L : j5, (i38 & 256) != 0 ? false : z26, (i38 & 512) == 0 ? str7 : "", (i38 & 1024) != 0 ? 0L : j6, (i38 & C3OO.FLAG_MOVED) != 0 ? false : z27, (i38 & 4096) != 0 ? false : z28, (i38 & 8192) != 0 ? false : z29, (i38 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? false : z30, (i38 & Constants.LOAD_RESULT_PGO) != 0 ? false : z31, (i38 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0 ? false : z32, (i38 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? false : z33, (i38 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 ? false : z34, (i38 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0 ? 500 : i35, (i38 & 1048576) != 0 ? false : z35);
    }
}
