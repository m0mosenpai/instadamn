package com.facebook.rsys.call.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callinfo.gen.CallInfo;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes9.dex */
public class CallModel {
    public static C2N9 CONVERTER = C55648OnZ.A00(9);
    public static long sMcfTypeId;
    public final boolean acceptRemoteVideoEnabled;
    public final long callAnsweredTimestampMs;
    public final long callConnectedTimestampMs;
    public final CallContext callContext;
    public final long callCreatedTimestampMs;
    public final long callEndedTimestampMs;
    public final CallInfo callInfo;
    public final int callStartedWithCamera;
    public final String callTrigger;
    public final boolean canSendMultipleVideoStreams;
    public final boolean canSendScreenshareStream;
    public final String clientEndpointId;
    public final int connectionQuality;
    public final int inCallState;
    public final ArrayList initialDataMessages;
    public final int initialDirection;
    public final boolean inviteRequestedVideo;
    public final boolean joinAttemptSent;
    public final int joinMode;
    public final boolean maxParticipantsReached;
    public final ArrayList notifications;
    public final long numSuccessfulRejoins;
    public final long rejoinAttempts;
    public final long rejoinTotalAttempts;
    public final ArrayList remoteParticipants;
    public final int requiredVideoEscalationConsent;
    public final CallParticipant selfParticipant;
    public final String sharedCallId;
    public final boolean supportsSctp;
    public final int transferState;
    public final Map userCapabilities;

    public static native CallModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallModel)) {
                return false;
            }
            CallModel callModel = (CallModel) obj;
            if (this.inCallState == callModel.inCallState && this.callCreatedTimestampMs == callModel.callCreatedTimestampMs && this.callAnsweredTimestampMs == callModel.callAnsweredTimestampMs && this.callConnectedTimestampMs == callModel.callConnectedTimestampMs && this.callEndedTimestampMs == callModel.callEndedTimestampMs && this.inviteRequestedVideo == callModel.inviteRequestedVideo && this.acceptRemoteVideoEnabled == callModel.acceptRemoteVideoEnabled && this.requiredVideoEscalationConsent == callModel.requiredVideoEscalationConsent && this.callStartedWithCamera == callModel.callStartedWithCamera && this.selfParticipant.equals(callModel.selfParticipant) && this.remoteParticipants.equals(callModel.remoteParticipants) && this.callContext.equals(callModel.callContext) && this.callInfo.equals(callModel.callInfo) && this.maxParticipantsReached == callModel.maxParticipantsReached && this.canSendMultipleVideoStreams == callModel.canSendMultipleVideoStreams && this.canSendScreenshareStream == callModel.canSendScreenshareStream) {
                String str = this.sharedCallId;
                String str2 = callModel.sharedCallId;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (!this.notifications.equals(callModel.notifications)) {
                    return false;
                }
                Map map = this.userCapabilities;
                Map map2 = callModel.userCapabilities;
                if (map == null) {
                    if (map2 != null) {
                        return false;
                    }
                } else if (!map.equals(map2)) {
                    return false;
                }
                ArrayList arrayList = this.initialDataMessages;
                ArrayList arrayList2 = callModel.initialDataMessages;
                if (arrayList == null) {
                    if (arrayList2 != null) {
                        return false;
                    }
                } else if (!arrayList.equals(arrayList2)) {
                    return false;
                }
                if (this.connectionQuality != callModel.connectionQuality || this.initialDirection != callModel.initialDirection || this.rejoinAttempts != callModel.rejoinAttempts || this.rejoinTotalAttempts != callModel.rejoinTotalAttempts || this.numSuccessfulRejoins != callModel.numSuccessfulRejoins || this.transferState != callModel.transferState || this.joinMode != callModel.joinMode || !this.clientEndpointId.equals(callModel.clientEndpointId) || this.supportsSctp != callModel.supportsSctp || this.joinAttemptSent != callModel.joinAttemptSent) {
                    return false;
                }
                String str3 = this.callTrigger;
                String str4 = callModel.callTrigger;
                if (str3 != null) {
                    if (!str3.equals(str4)) {
                        return false;
                    }
                } else if (str4 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A0J = AbstractC166997dE.A0J(this.notifications, (((((((AbstractC166997dE.A0J(this.callInfo, AbstractC166997dE.A0J(this.callContext, AbstractC166997dE.A0J(this.remoteParticipants, AbstractC166997dE.A0J(this.selfParticipant, (((((((AbstractC167007dF.A07(this.callEndedTimestampMs, AbstractC167007dF.A07(this.callConnectedTimestampMs, AbstractC167007dF.A07(this.callAnsweredTimestampMs, AbstractC167007dF.A07(this.callCreatedTimestampMs, JQ0.A01(this.inCallState))))) + (this.inviteRequestedVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + this.requiredVideoEscalationConsent) * 31) + this.callStartedWithCamera) * 31)))) + (this.maxParticipantsReached ? 1 : 0)) * 31) + (this.canSendMultipleVideoStreams ? 1 : 0)) * 31) + (this.canSendScreenshareStream ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.sharedCallId)) * 31);
        Map map = this.userCapabilities;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return ((((AbstractC166997dE.A0K(this.clientEndpointId, (((AbstractC167007dF.A07(this.numSuccessfulRejoins, AbstractC167007dF.A07(this.rejoinTotalAttempts, AbstractC167007dF.A07(this.rejoinAttempts, (((((((A0J + hashCode) * 31) + AbstractC167017dG.A0M(this.initialDataMessages)) * 31) + this.connectionQuality) * 31) + this.initialDirection) * 31))) + this.transferState) * 31) + this.joinMode) * 31) + (this.supportsSctp ? 1 : 0)) * 31) + (this.joinAttemptSent ? 1 : 0)) * 31) + AbstractC25227BEk.A07(this.callTrigger);
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CallModel{inCallState=");
        A1C.append(this.inCallState);
        A1C.append(",callCreatedTimestampMs=");
        A1C.append(this.callCreatedTimestampMs);
        A1C.append(",callAnsweredTimestampMs=");
        A1C.append(this.callAnsweredTimestampMs);
        A1C.append(",callConnectedTimestampMs=");
        A1C.append(this.callConnectedTimestampMs);
        A1C.append(",callEndedTimestampMs=");
        A1C.append(this.callEndedTimestampMs);
        A1C.append(",inviteRequestedVideo=");
        A1C.append(this.inviteRequestedVideo);
        A1C.append(",acceptRemoteVideoEnabled=");
        A1C.append(this.acceptRemoteVideoEnabled);
        A1C.append(",requiredVideoEscalationConsent=");
        A1C.append(this.requiredVideoEscalationConsent);
        A1C.append(",callStartedWithCamera=");
        A1C.append(this.callStartedWithCamera);
        A1C.append(",selfParticipant=");
        A1C.append(this.selfParticipant);
        A1C.append(",remoteParticipants=");
        A1C.append(this.remoteParticipants);
        A1C.append(",callContext=");
        A1C.append(this.callContext);
        A1C.append(",callInfo=");
        A1C.append(this.callInfo);
        A1C.append(",maxParticipantsReached=");
        A1C.append(this.maxParticipantsReached);
        A1C.append(",canSendMultipleVideoStreams=");
        A1C.append(this.canSendMultipleVideoStreams);
        A1C.append(",canSendScreenshareStream=");
        A1C.append(this.canSendScreenshareStream);
        A1C.append(",sharedCallId=");
        A1C.append(this.sharedCallId);
        A1C.append(",notifications=");
        A1C.append(this.notifications);
        A1C.append(",userCapabilities=");
        A1C.append(this.userCapabilities);
        A1C.append(",initialDataMessages=");
        A1C.append(this.initialDataMessages);
        A1C.append(",connectionQuality=");
        A1C.append(this.connectionQuality);
        A1C.append(",initialDirection=");
        A1C.append(this.initialDirection);
        A1C.append(",rejoinAttempts=");
        A1C.append(this.rejoinAttempts);
        A1C.append(",rejoinTotalAttempts=");
        A1C.append(this.rejoinTotalAttempts);
        A1C.append(",numSuccessfulRejoins=");
        A1C.append(this.numSuccessfulRejoins);
        A1C.append(",transferState=");
        A1C.append(this.transferState);
        A1C.append(",joinMode=");
        A1C.append(this.joinMode);
        A1C.append(",clientEndpointId=");
        A1C.append(this.clientEndpointId);
        A1C.append(",supportsSctp=");
        A1C.append(this.supportsSctp);
        A1C.append(",joinAttemptSent=");
        A1C.append(this.joinAttemptSent);
        A1C.append(",callTrigger=");
        return AbstractC50523MSb.A0W(this.callTrigger, A1C);
    }

    public CallModel(int i, long j, long j2, long j3, long j4, boolean z, boolean z2, int i2, int i3, CallParticipant callParticipant, ArrayList arrayList, CallContext callContext, CallInfo callInfo, boolean z3, boolean z4, boolean z5, String str, ArrayList arrayList2, Map map, ArrayList arrayList3, int i4, int i5, long j5, long j6, long j7, int i6, int i7, String str2, boolean z6, boolean z7, String str3) {
        AbstractC31180DnO.A1U(callParticipant, arrayList, callContext);
        AbstractC31180DnO.A1U(callInfo, arrayList2, str2);
        this.inCallState = i;
        this.callCreatedTimestampMs = j;
        this.callAnsweredTimestampMs = j2;
        this.callConnectedTimestampMs = j3;
        this.callEndedTimestampMs = j4;
        this.inviteRequestedVideo = z;
        this.acceptRemoteVideoEnabled = z2;
        this.requiredVideoEscalationConsent = i2;
        this.callStartedWithCamera = i3;
        this.selfParticipant = callParticipant;
        this.remoteParticipants = arrayList;
        this.callContext = callContext;
        this.callInfo = callInfo;
        this.maxParticipantsReached = z3;
        this.canSendMultipleVideoStreams = z4;
        this.canSendScreenshareStream = z5;
        this.sharedCallId = str;
        this.notifications = arrayList2;
        this.userCapabilities = map;
        this.initialDataMessages = arrayList3;
        this.connectionQuality = i4;
        this.initialDirection = i5;
        this.rejoinAttempts = j5;
        this.rejoinTotalAttempts = j6;
        this.numSuccessfulRejoins = j7;
        this.transferState = i6;
        this.joinMode = i7;
        this.clientEndpointId = str2;
        this.supportsSctp = z6;
        this.joinAttemptSent = z7;
        this.callTrigger = str3;
    }
}
