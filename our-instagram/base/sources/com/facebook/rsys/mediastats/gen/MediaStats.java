package com.facebook.rsys.mediastats.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class MediaStats {
    public static C2N9 CONVERTER = C55648OnZ.A00(36);
    public static long sMcfTypeId;
    public final Float audioBitrateKbps;
    public final Long audioBytesReceived;
    public final Long audioBytesSent;
    public final String audioCodec;
    public final Long audioCtpLatencyMs;
    public final Long audioCtpRoundtripLatencyMs;
    public final Long audioE2eDelayMS;
    public final Long audioEstimatedPlayoutTimestampMS;
    public final Long audioFecPacketsReceived;
    public final Long audioJitterMS;
    public final Long audioLevel;
    public final Long audioNackCount;
    public final Long audioPacketsLost;
    public final Long audioPacketsReceived;
    public final Long audioRetransmittedPacketsSent;
    public final Float audioSamplingRateKhz;
    public final String audioSsrc;
    public final Float audioTargetBitrateKbps;
    public final Long availableOutgoingBitrate;
    public final Long avgRttMs;
    public final int channelType;
    public final Long concealedSamples;
    public final String connectionType;
    public final Long curRttMs;
    public final String currentIpVersion;
    public final Integer localNetworkCost;
    public final String localType;
    public final Long maxBitrateKbps;
    public final int mediaPath;
    public final String mimeType;
    public final Long minBitrateKbps;
    public final Integer noiseSuppressionMode;
    public final Boolean nsCpuFallbackStatus;
    public final Long nsInferenceTime;
    public final Integer remoteNetworkCost;
    public final String remoteType;
    public final ScreenShareStats screenShareStats;
    public final Long startBitrateKbps;
    public final int streamDirection;
    public final String streamId;
    public final int streamType;
    public final Long totalSamplesReceived;
    public final String userId;
    public final ArrayList videoStreams;

    public static native MediaStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    /* JADX WARN: Code restructure failed: missing block: B:171:0x025c, code lost:
    
        if (r1.equals(r0) != false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x024d, code lost:
    
        if (r1.equals(r0) != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x023e, code lost:
    
        if (r1.equals(r0) != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x021f, code lost:
    
        if (r1.equals(r0) != false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0210, code lost:
    
        if (r1.equals(r0) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0201, code lost:
    
        if (r1.equals(r0) != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01ec, code lost:
    
        if (r1.equals(r0) != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01dd, code lost:
    
        if (r1.equals(r0) != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01ce, code lost:
    
        if (r1.equals(r0) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01af, code lost:
    
        if (r1.equals(r0) != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x01a0, code lost:
    
        if (r1.equals(r0) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0191, code lost:
    
        if (r1.equals(r0) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0182, code lost:
    
        if (r1.equals(r0) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0173, code lost:
    
        if (r1.equals(r0) != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0164, code lost:
    
        if (r1.equals(r0) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0155, code lost:
    
        if (r1.equals(r0) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0146, code lost:
    
        if (r1.equals(r0) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0137, code lost:
    
        if (r1.equals(r0) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0128, code lost:
    
        if (r1.equals(r0) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0119, code lost:
    
        if (r1.equals(r0) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x010a, code lost:
    
        if (r1.equals(r0) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00fb, code lost:
    
        if (r1.equals(r0) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00ec, code lost:
    
        if (r1.equals(r0) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x00dd, code lost:
    
        if (r1.equals(r0) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x00ce, code lost:
    
        if (r1.equals(r0) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x00bf, code lost:
    
        if (r1.equals(r0) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x00b0, code lost:
    
        if (r1.equals(r0) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x00a1, code lost:
    
        if (r1.equals(r0) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0092, code lost:
    
        if (r1.equals(r0) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0083, code lost:
    
        if (r1.equals(r0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0074, code lost:
    
        if (r1.equals(r0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0065, code lost:
    
        if (r1.equals(r0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0056, code lost:
    
        if (r1.equals(r0) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rsys.mediastats.gen.MediaStats.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((AbstractC166997dE.A0J(this.videoStreams, (((((((AbstractC166997dE.A0K(this.userId, AbstractC50523MSb.A02(this.streamId)) + this.channelType) * 31) + this.streamDirection) * 31) + this.streamType) * 31) + AbstractC167017dG.A0O(this.mimeType)) * 31) + AbstractC167017dG.A0O(this.audioSsrc)) * 31) + AbstractC167017dG.A0M(this.audioEstimatedPlayoutTimestampMS)) * 31) + AbstractC167017dG.A0M(this.audioSamplingRateKhz)) * 31) + AbstractC167017dG.A0M(this.audioE2eDelayMS)) * 31) + AbstractC167017dG.A0O(this.audioCodec)) * 31) + AbstractC167017dG.A0M(this.audioBitrateKbps)) * 31) + AbstractC167017dG.A0M(this.audioTargetBitrateKbps)) * 31) + AbstractC167017dG.A0M(this.audioBytesReceived)) * 31) + AbstractC167017dG.A0M(this.audioBytesSent)) * 31) + AbstractC167017dG.A0M(this.audioPacketsReceived)) * 31) + AbstractC167017dG.A0M(this.audioPacketsLost)) * 31) + AbstractC167017dG.A0M(this.audioFecPacketsReceived)) * 31) + AbstractC167017dG.A0M(this.audioNackCount)) * 31) + AbstractC167017dG.A0M(this.audioRetransmittedPacketsSent)) * 31) + AbstractC167017dG.A0M(this.audioJitterMS)) * 31) + AbstractC167017dG.A0M(this.audioCtpLatencyMs)) * 31) + AbstractC167017dG.A0M(this.audioCtpRoundtripLatencyMs)) * 31) + AbstractC167017dG.A0M(this.minBitrateKbps)) * 31) + AbstractC167017dG.A0M(this.startBitrateKbps)) * 31) + AbstractC167017dG.A0M(this.maxBitrateKbps)) * 31) + AbstractC167017dG.A0O(this.connectionType)) * 31) + AbstractC167017dG.A0O(this.currentIpVersion)) * 31) + AbstractC167017dG.A0M(this.avgRttMs)) * 31) + AbstractC167017dG.A0M(this.curRttMs)) * 31) + AbstractC167017dG.A0M(this.localNetworkCost)) * 31) + AbstractC167017dG.A0O(this.localType)) * 31) + AbstractC167017dG.A0M(this.remoteNetworkCost)) * 31) + AbstractC167017dG.A0O(this.remoteType)) * 31) + this.mediaPath) * 31) + AbstractC167017dG.A0M(this.concealedSamples)) * 31) + AbstractC167017dG.A0M(this.totalSamplesReceived)) * 31) + AbstractC167017dG.A0M(this.audioLevel)) * 31) + AbstractC167017dG.A0M(this.availableOutgoingBitrate)) * 31) + AbstractC167017dG.A0M(this.nsInferenceTime)) * 31) + AbstractC167017dG.A0M(this.nsCpuFallbackStatus)) * 31) + AbstractC167017dG.A0M(this.noiseSuppressionMode)) * 31) + AbstractC166997dE.A0I(this.screenShareStats);
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediaStats{");
        AbstractC50523MSb.A1N("streamId=", this.streamId, A1C);
        AbstractC50523MSb.A1N(",userId=", this.userId, A1C);
        A1C.append(AnonymousClass001.A0O(",channelType=", this.channelType));
        A1C.append(AnonymousClass001.A0O(",streamDirection=", this.streamDirection));
        A1C.append(AnonymousClass001.A0O(",streamType=", this.streamType));
        AbstractC50523MSb.A1N(",mimeType=", this.mimeType, A1C);
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append(",videoStreams=");
        A1C.append(AbstractC166997dE.A0v(this.videoStreams, A1C2));
        AbstractC50523MSb.A1N(",audioSsrc=", this.audioSsrc, A1C);
        StringBuilder A1C3 = AbstractC166987dD.A1C();
        A1C3.append(",audioEstimatedPlayoutTimestampMS=");
        StringBuilder A0Y = AbstractC50523MSb.A0Y(this.audioEstimatedPlayoutTimestampMS, A1C3, A1C);
        A0Y.append(",audioSamplingRateKhz=");
        StringBuilder A0Y2 = AbstractC50523MSb.A0Y(this.audioSamplingRateKhz, A0Y, A1C);
        A0Y2.append(",audioE2eDelayMS=");
        A1C.append(AbstractC166997dE.A0v(this.audioE2eDelayMS, A0Y2));
        AbstractC50523MSb.A1N(",audioCodec=", this.audioCodec, A1C);
        StringBuilder A1C4 = AbstractC166987dD.A1C();
        A1C4.append(",audioBitrateKbps=");
        StringBuilder A0Y3 = AbstractC50523MSb.A0Y(this.audioBitrateKbps, A1C4, A1C);
        A0Y3.append(",audioTargetBitrateKbps=");
        StringBuilder A0Y4 = AbstractC50523MSb.A0Y(this.audioTargetBitrateKbps, A0Y3, A1C);
        A0Y4.append(",audioBytesReceived=");
        StringBuilder A0Y5 = AbstractC50523MSb.A0Y(this.audioBytesReceived, A0Y4, A1C);
        A0Y5.append(",audioBytesSent=");
        StringBuilder A0Y6 = AbstractC50523MSb.A0Y(this.audioBytesSent, A0Y5, A1C);
        A0Y6.append(",audioPacketsReceived=");
        StringBuilder A0Y7 = AbstractC50523MSb.A0Y(this.audioPacketsReceived, A0Y6, A1C);
        A0Y7.append(",audioPacketsLost=");
        StringBuilder A0Y8 = AbstractC50523MSb.A0Y(this.audioPacketsLost, A0Y7, A1C);
        A0Y8.append(",audioFecPacketsReceived=");
        StringBuilder A0Y9 = AbstractC50523MSb.A0Y(this.audioFecPacketsReceived, A0Y8, A1C);
        A0Y9.append(",audioNackCount=");
        StringBuilder A0Y10 = AbstractC50523MSb.A0Y(this.audioNackCount, A0Y9, A1C);
        A0Y10.append(",audioRetransmittedPacketsSent=");
        StringBuilder A0Y11 = AbstractC50523MSb.A0Y(this.audioRetransmittedPacketsSent, A0Y10, A1C);
        A0Y11.append(",audioJitterMS=");
        StringBuilder A0Y12 = AbstractC50523MSb.A0Y(this.audioJitterMS, A0Y11, A1C);
        A0Y12.append(",audioCtpLatencyMs=");
        StringBuilder A0Y13 = AbstractC50523MSb.A0Y(this.audioCtpLatencyMs, A0Y12, A1C);
        A0Y13.append(",audioCtpRoundtripLatencyMs=");
        StringBuilder A0Y14 = AbstractC50523MSb.A0Y(this.audioCtpRoundtripLatencyMs, A0Y13, A1C);
        A0Y14.append(",minBitrateKbps=");
        StringBuilder A0Y15 = AbstractC50523MSb.A0Y(this.minBitrateKbps, A0Y14, A1C);
        A0Y15.append(",startBitrateKbps=");
        StringBuilder A0Y16 = AbstractC50523MSb.A0Y(this.startBitrateKbps, A0Y15, A1C);
        A0Y16.append(",maxBitrateKbps=");
        A1C.append(AbstractC166997dE.A0v(this.maxBitrateKbps, A0Y16));
        AbstractC50523MSb.A1N(",connectionType=", this.connectionType, A1C);
        AbstractC50523MSb.A1N(",currentIpVersion=", this.currentIpVersion, A1C);
        StringBuilder A1C5 = AbstractC166987dD.A1C();
        A1C5.append(",avgRttMs=");
        StringBuilder A0Y17 = AbstractC50523MSb.A0Y(this.avgRttMs, A1C5, A1C);
        A0Y17.append(",curRttMs=");
        StringBuilder A0Y18 = AbstractC50523MSb.A0Y(this.curRttMs, A0Y17, A1C);
        A0Y18.append(",localNetworkCost=");
        A1C.append(AbstractC166997dE.A0v(this.localNetworkCost, A0Y18));
        AbstractC50523MSb.A1N(",localType=", this.localType, A1C);
        StringBuilder A1C6 = AbstractC166987dD.A1C();
        A1C6.append(",remoteNetworkCost=");
        A1C.append(AbstractC166997dE.A0v(this.remoteNetworkCost, A1C6));
        AbstractC50523MSb.A1N(",remoteType=", this.remoteType, A1C);
        A1C.append(AnonymousClass001.A0O(",mediaPath=", this.mediaPath));
        StringBuilder A1C7 = AbstractC166987dD.A1C();
        A1C7.append(",concealedSamples=");
        StringBuilder A0Y19 = AbstractC50523MSb.A0Y(this.concealedSamples, A1C7, A1C);
        A0Y19.append(",totalSamplesReceived=");
        StringBuilder A0Y20 = AbstractC50523MSb.A0Y(this.totalSamplesReceived, A0Y19, A1C);
        A0Y20.append(",audioLevel=");
        StringBuilder A0Y21 = AbstractC50523MSb.A0Y(this.audioLevel, A0Y20, A1C);
        A0Y21.append(",availableOutgoingBitrate=");
        StringBuilder A0Y22 = AbstractC50523MSb.A0Y(this.availableOutgoingBitrate, A0Y21, A1C);
        A0Y22.append(",nsInferenceTime=");
        StringBuilder A0Y23 = AbstractC50523MSb.A0Y(this.nsInferenceTime, A0Y22, A1C);
        A0Y23.append(",nsCpuFallbackStatus=");
        StringBuilder A0Y24 = AbstractC50523MSb.A0Y(this.nsCpuFallbackStatus, A0Y23, A1C);
        A0Y24.append(",noiseSuppressionMode=");
        StringBuilder A0Y25 = AbstractC50523MSb.A0Y(this.noiseSuppressionMode, A0Y24, A1C);
        A0Y25.append(",screenShareStats=");
        return AbstractC50523MSb.A0W(AbstractC166997dE.A0v(this.screenShareStats, A0Y25), A1C);
    }

    public MediaStats(String str, String str2, int i, int i2, int i3, String str3, ArrayList arrayList, String str4, Long l, Float f, Long l2, String str5, Float f2, Float f3, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, String str6, String str7, Long l16, Long l17, Integer num, String str8, Integer num2, String str9, int i4, Long l18, Long l19, Long l20, Long l21, Long l22, Boolean bool, Integer num3, ScreenShareStats screenShareStats) {
        AbstractC31180DnO.A1U(str, str2, arrayList);
        this.streamId = str;
        this.userId = str2;
        this.channelType = i;
        this.streamDirection = i2;
        this.streamType = i3;
        this.mimeType = str3;
        this.videoStreams = arrayList;
        this.audioSsrc = str4;
        this.audioEstimatedPlayoutTimestampMS = l;
        this.audioSamplingRateKhz = f;
        this.audioE2eDelayMS = l2;
        this.audioCodec = str5;
        this.audioBitrateKbps = f2;
        this.audioTargetBitrateKbps = f3;
        this.audioBytesReceived = l3;
        this.audioBytesSent = l4;
        this.audioPacketsReceived = l5;
        this.audioPacketsLost = l6;
        this.audioFecPacketsReceived = l7;
        this.audioNackCount = l8;
        this.audioRetransmittedPacketsSent = l9;
        this.audioJitterMS = l10;
        this.audioCtpLatencyMs = l11;
        this.audioCtpRoundtripLatencyMs = l12;
        this.minBitrateKbps = l13;
        this.startBitrateKbps = l14;
        this.maxBitrateKbps = l15;
        this.connectionType = str6;
        this.currentIpVersion = str7;
        this.avgRttMs = l16;
        this.curRttMs = l17;
        this.localNetworkCost = num;
        this.localType = str8;
        this.remoteNetworkCost = num2;
        this.remoteType = str9;
        this.mediaPath = i4;
        this.concealedSamples = l18;
        this.totalSamplesReceived = l19;
        this.audioLevel = l20;
        this.availableOutgoingBitrate = l21;
        this.nsInferenceTime = l22;
        this.nsCpuFallbackStatus = bool;
        this.noiseSuppressionMode = num3;
        this.screenShareStats = screenShareStats;
    }
}
