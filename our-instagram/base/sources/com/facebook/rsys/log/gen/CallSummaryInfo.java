package com.facebook.rsys.log.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.AbstractC58318PtA;
import X.AnonymousClass001;
import X.C2N9;
import X.MSV;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CallSummaryInfo {
    public static C2N9 CONVERTER = YAN.A00(66);
    public static long sMcfTypeId;
    public final Long autoRejoinCount;
    public final Long autoRejoinSuccessfulCount;
    public final Long batteryEndLevel;
    public final Long batteryStartLevel;
    public final long callAnsweredTime;
    public final long callConnectedTime;
    public final long callCreatedTime;
    public final long callEndedTime;
    public final String callTrigger;
    public final String clientSessionId;
    public final String coldStartReason;
    public final Long deviceShutdownTime;
    public final String endCallAppState;
    public final String endCallReason;
    public final String endCallSubreason;
    public final Long engineCreatedTime;
    public final Boolean inviteRequestedVideo;
    public final Boolean isAutomation;
    public final boolean isCaller;
    public final Boolean isConnectedEnd;
    public final String joinMode;
    public final Long joinableCompleteTime;
    public final String joiningContext;
    public final long lastUpdatedTime;
    public final String localCallId;
    public final Long localVideoDuration;
    public final Long maxConcurrentConnectedParticipant;
    public final Long mediaGateBlockedFrameCount;
    public final String peerId;
    public final Boolean remoteEnded;
    public final Long remoteVideoDuration;
    public final Long rtcActorId;
    public final String sharedCallId;
    public final long steadyTime;
    public final long systemTime;
    public final String videoEscalationStatus;
    public final Boolean wasDeviceCharged;
    public final String webDeviceId;
    public final String webrtcVersion;

    /* loaded from: classes12.dex */
    public class Builder {
        public Long autoRejoinCount;
        public Long autoRejoinSuccessfulCount;
        public Long batteryEndLevel;
        public Long batteryStartLevel;
        public long callAnsweredTime;
        public long callConnectedTime;
        public long callCreatedTime;
        public long callEndedTime;
        public String callTrigger;
        public String clientSessionId;
        public String coldStartReason;
        public Long deviceShutdownTime;
        public String endCallAppState;
        public String endCallReason;
        public String endCallSubreason;
        public Long engineCreatedTime;
        public Boolean inviteRequestedVideo;
        public Boolean isAutomation;
        public boolean isCaller;
        public Boolean isConnectedEnd;
        public String joinMode;
        public Long joinableCompleteTime;
        public String joiningContext;
        public long lastUpdatedTime;
        public String localCallId;
        public Long localVideoDuration;
        public Long maxConcurrentConnectedParticipant;
        public Long mediaGateBlockedFrameCount;
        public String peerId;
        public Boolean remoteEnded;
        public Long remoteVideoDuration;
        public Long rtcActorId;
        public String sharedCallId;
        public long steadyTime;
        public long systemTime;
        public String videoEscalationStatus;
        public Boolean wasDeviceCharged;
        public String webDeviceId;
        public String webrtcVersion;

        public CallSummaryInfo build() {
            return new CallSummaryInfo(this);
        }
    }

    public static native CallSummaryInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01ff, code lost:
    
        if (r1.equals(r0) != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01f0, code lost:
    
        if (r1.equals(r0) != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01e1, code lost:
    
        if (r1.equals(r0) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01d2, code lost:
    
        if (r1.equals(r0) != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c3, code lost:
    
        if (r1.equals(r0) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01b4, code lost:
    
        if (r1.equals(r0) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0195, code lost:
    
        if (r1.equals(r0) != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0186, code lost:
    
        if (r1.equals(r0) != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0177, code lost:
    
        if (r1.equals(r0) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0168, code lost:
    
        if (r1.equals(r0) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0159, code lost:
    
        if (r1.equals(r0) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x014a, code lost:
    
        if (r1.equals(r0) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x013b, code lost:
    
        if (r1.equals(r0) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x012c, code lost:
    
        if (r1.equals(r0) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x011d, code lost:
    
        if (r1.equals(r0) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x010e, code lost:
    
        if (r1.equals(r0) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x00ff, code lost:
    
        if (r1.equals(r0) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x00f0, code lost:
    
        if (r1.equals(r0) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x00e1, code lost:
    
        if (r1.equals(r0) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x00d2, code lost:
    
        if (r1.equals(r0) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00c3, code lost:
    
        if (r1.equals(r0) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x00b4, code lost:
    
        if (r1.equals(r0) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x00a5, code lost:
    
        if (r1.equals(r0) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0096, code lost:
    
        if (r1.equals(r0) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x006f, code lost:
    
        if (r1.equals(r0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0048, code lost:
    
        if (r1.equals(r0) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rsys.log.gen.CallSummaryInfo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((AbstractC166997dE.A0K(this.callTrigger, AbstractC167007dF.A07(this.lastUpdatedTime, (AbstractC167007dF.A07(this.callEndedTime, AbstractC167007dF.A07(this.callConnectedTime, AbstractC167007dF.A07(this.callAnsweredTime, (AbstractC167007dF.A07(this.callCreatedTime, AbstractC167007dF.A07(this.steadyTime, AbstractC167007dF.A07(this.systemTime, (AbstractC50523MSb.A02(this.localCallId) + AbstractC167017dG.A0O(this.sharedCallId)) * 31))) + AbstractC167017dG.A0M(this.engineCreatedTime)) * 31))) + AbstractC167017dG.A0M(this.joinableCompleteTime)) * 31)) + (this.isCaller ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.peerId)) * 31) + AbstractC167017dG.A0O(this.endCallReason)) * 31) + AbstractC167017dG.A0M(this.remoteEnded)) * 31) + AbstractC167017dG.A0M(this.inviteRequestedVideo)) * 31) + AbstractC167017dG.A0M(this.mediaGateBlockedFrameCount)) * 31) + AbstractC167017dG.A0O(this.videoEscalationStatus)) * 31) + AbstractC167017dG.A0M(this.localVideoDuration)) * 31) + AbstractC167017dG.A0M(this.remoteVideoDuration)) * 31) + AbstractC167017dG.A0M(this.batteryStartLevel)) * 31) + AbstractC167017dG.A0M(this.batteryEndLevel)) * 31) + AbstractC167017dG.A0M(this.wasDeviceCharged)) * 31) + AbstractC167017dG.A0O(this.joiningContext)) * 31) + AbstractC167017dG.A0O(this.webDeviceId)) * 31) + AbstractC167017dG.A0O(this.endCallSubreason)) * 31) + AbstractC167017dG.A0O(this.coldStartReason)) * 31) + AbstractC167017dG.A0M(this.isConnectedEnd)) * 31) + AbstractC167017dG.A0M(this.deviceShutdownTime)) * 31) + AbstractC167017dG.A0M(this.maxConcurrentConnectedParticipant)) * 31) + AbstractC167017dG.A0M(this.rtcActorId)) * 31) + AbstractC167017dG.A0M(this.autoRejoinCount)) * 31) + AbstractC167017dG.A0O(this.joinMode)) * 31) + AbstractC167017dG.A0M(this.autoRejoinSuccessfulCount)) * 31) + AbstractC167017dG.A0O(this.webrtcVersion)) * 31) + AbstractC167017dG.A0O(this.clientSessionId)) * 31) + AbstractC167017dG.A0O(this.endCallAppState)) * 31) + AbstractC166997dE.A0I(this.isAutomation);
    }

    public CallSummaryInfo(Builder builder) {
        builder.localCallId.getClass();
        builder.callTrigger.getClass();
        this.localCallId = builder.localCallId;
        this.sharedCallId = builder.sharedCallId;
        this.systemTime = builder.systemTime;
        this.steadyTime = builder.steadyTime;
        this.callCreatedTime = builder.callCreatedTime;
        this.engineCreatedTime = builder.engineCreatedTime;
        this.callAnsweredTime = builder.callAnsweredTime;
        this.callConnectedTime = builder.callConnectedTime;
        this.callEndedTime = builder.callEndedTime;
        this.joinableCompleteTime = builder.joinableCompleteTime;
        this.lastUpdatedTime = builder.lastUpdatedTime;
        this.callTrigger = builder.callTrigger;
        this.isCaller = builder.isCaller;
        this.peerId = builder.peerId;
        this.endCallReason = builder.endCallReason;
        this.remoteEnded = builder.remoteEnded;
        this.inviteRequestedVideo = builder.inviteRequestedVideo;
        this.mediaGateBlockedFrameCount = builder.mediaGateBlockedFrameCount;
        this.videoEscalationStatus = builder.videoEscalationStatus;
        this.localVideoDuration = builder.localVideoDuration;
        this.remoteVideoDuration = builder.remoteVideoDuration;
        this.batteryStartLevel = builder.batteryStartLevel;
        this.batteryEndLevel = builder.batteryEndLevel;
        this.wasDeviceCharged = builder.wasDeviceCharged;
        this.joiningContext = builder.joiningContext;
        this.webDeviceId = builder.webDeviceId;
        this.endCallSubreason = builder.endCallSubreason;
        this.coldStartReason = builder.coldStartReason;
        this.isConnectedEnd = builder.isConnectedEnd;
        this.deviceShutdownTime = builder.deviceShutdownTime;
        this.maxConcurrentConnectedParticipant = builder.maxConcurrentConnectedParticipant;
        this.rtcActorId = builder.rtcActorId;
        this.autoRejoinCount = builder.autoRejoinCount;
        this.joinMode = builder.joinMode;
        this.autoRejoinSuccessfulCount = builder.autoRejoinSuccessfulCount;
        this.webrtcVersion = builder.webrtcVersion;
        this.clientSessionId = builder.clientSessionId;
        this.endCallAppState = builder.endCallAppState;
        this.isAutomation = builder.isAutomation;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CallSummaryInfo{");
        AbstractC50523MSb.A1N("localCallId=", this.localCallId, A1C);
        AbstractC50523MSb.A1N(MSV.A00(651), this.sharedCallId, A1C);
        A1C.append(AnonymousClass001.A0Q(",systemTime=", this.systemTime));
        A1C.append(AnonymousClass001.A0Q(",steadyTime=", this.steadyTime));
        A1C.append(AnonymousClass001.A0Q(",callCreatedTime=", this.callCreatedTime));
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append(",engineCreatedTime=");
        A1C2.append(this.engineCreatedTime);
        AbstractC58318PtA.A1V(A1C, A1C2);
        A1C.append(AnonymousClass001.A0Q(",callAnsweredTime=", this.callAnsweredTime));
        A1C.append(AnonymousClass001.A0Q(",callConnectedTime=", this.callConnectedTime));
        A1C.append(AnonymousClass001.A0Q(",callEndedTime=", this.callEndedTime));
        StringBuilder A1C3 = AbstractC166987dD.A1C();
        A1C3.append(",joinableCompleteTime=");
        A1C3.append(this.joinableCompleteTime);
        AbstractC58318PtA.A1V(A1C, A1C3);
        A1C.append(AnonymousClass001.A0Q(",lastUpdatedTime=", this.lastUpdatedTime));
        AbstractC50523MSb.A1N(",callTrigger=", this.callTrigger, A1C);
        A1C.append(AnonymousClass001.A1D(",isCaller=", this.isCaller));
        AbstractC50523MSb.A1N(",peerId=", this.peerId, A1C);
        AbstractC50523MSb.A1N(",endCallReason=", this.endCallReason, A1C);
        StringBuilder A1C4 = AbstractC166987dD.A1C();
        A1C4.append(",remoteEnded=");
        StringBuilder A0Y = AbstractC50523MSb.A0Y(this.remoteEnded, A1C4, A1C);
        A0Y.append(MSV.A00(648));
        StringBuilder A0Y2 = AbstractC50523MSb.A0Y(this.inviteRequestedVideo, A0Y, A1C);
        A0Y2.append(",mediaGateBlockedFrameCount=");
        A0Y2.append(this.mediaGateBlockedFrameCount);
        AbstractC58318PtA.A1V(A1C, A0Y2);
        AbstractC50523MSb.A1N(",videoEscalationStatus=", this.videoEscalationStatus, A1C);
        StringBuilder A1C5 = AbstractC166987dD.A1C();
        A1C5.append(",localVideoDuration=");
        StringBuilder A0Y3 = AbstractC50523MSb.A0Y(this.localVideoDuration, A1C5, A1C);
        A0Y3.append(",remoteVideoDuration=");
        StringBuilder A0Y4 = AbstractC50523MSb.A0Y(this.remoteVideoDuration, A0Y3, A1C);
        A0Y4.append(",batteryStartLevel=");
        StringBuilder A0Y5 = AbstractC50523MSb.A0Y(this.batteryStartLevel, A0Y4, A1C);
        A0Y5.append(",batteryEndLevel=");
        StringBuilder A0Y6 = AbstractC50523MSb.A0Y(this.batteryEndLevel, A0Y5, A1C);
        A0Y6.append(",wasDeviceCharged=");
        A0Y6.append(this.wasDeviceCharged);
        AbstractC58318PtA.A1V(A1C, A0Y6);
        AbstractC50523MSb.A1N(",joiningContext=", this.joiningContext, A1C);
        AbstractC50523MSb.A1N(",webDeviceId=", this.webDeviceId, A1C);
        AbstractC50523MSb.A1N(",endCallSubreason=", this.endCallSubreason, A1C);
        AbstractC50523MSb.A1N(",coldStartReason=", this.coldStartReason, A1C);
        StringBuilder A1C6 = AbstractC166987dD.A1C();
        A1C6.append(",isConnectedEnd=");
        StringBuilder A0Y7 = AbstractC50523MSb.A0Y(this.isConnectedEnd, A1C6, A1C);
        A0Y7.append(",deviceShutdownTime=");
        StringBuilder A0Y8 = AbstractC50523MSb.A0Y(this.deviceShutdownTime, A0Y7, A1C);
        A0Y8.append(",maxConcurrentConnectedParticipant=");
        StringBuilder A0Y9 = AbstractC50523MSb.A0Y(this.maxConcurrentConnectedParticipant, A0Y8, A1C);
        A0Y9.append(",rtcActorId=");
        StringBuilder A0Y10 = AbstractC50523MSb.A0Y(this.rtcActorId, A0Y9, A1C);
        A0Y10.append(",autoRejoinCount=");
        A0Y10.append(this.autoRejoinCount);
        AbstractC58318PtA.A1V(A1C, A0Y10);
        AbstractC50523MSb.A1N(",joinMode=", this.joinMode, A1C);
        StringBuilder A1C7 = AbstractC166987dD.A1C();
        A1C7.append(",autoRejoinSuccessfulCount=");
        A1C7.append(this.autoRejoinSuccessfulCount);
        AbstractC58318PtA.A1V(A1C, A1C7);
        AbstractC50523MSb.A1N(",webrtcVersion=", this.webrtcVersion, A1C);
        AbstractC50523MSb.A1N(",clientSessionId=", this.clientSessionId, A1C);
        AbstractC50523MSb.A1N(",endCallAppState=", this.endCallAppState, A1C);
        StringBuilder A1C8 = AbstractC166987dD.A1C();
        A1C8.append(",isAutomation=");
        A1C8.append(this.isAutomation);
        return AbstractC50523MSb.A0W(A1C8.toString(), A1C);
    }
}
