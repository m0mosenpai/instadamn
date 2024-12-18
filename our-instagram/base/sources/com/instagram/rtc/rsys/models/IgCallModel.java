package com.instagram.rtc.rsys.models;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55647OnY;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audioevents.gen.AudioEventsModel;
import com.facebook.rsys.cowatch.gen.CowatchPlayerModel;
import com.facebook.rsys.mediasync.gen.MediaSyncState;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes9.dex */
public class IgCallModel {
    public static C2N9 CONVERTER = new C55647OnY(10);
    public static long sMcfTypeId;
    public final boolean areAllParticipantsAudioOnly;
    public final AudioEventsModel audioEventsModel;
    public final long callAnsweredTimestampMs;
    public final long callConnectedTimestampMs;
    public final long callCreatedTimestampMs;
    public final long callEndedTimestampMs;
    public final int connectionQuality;
    public final CowatchPlayerModel cowatchPlayerModel;
    public final boolean didSendJoinAttempt;
    public final McfReference dropInModel;
    public final boolean e2eeMandated;
    public final int inCallState;
    public final String instagramVideoCallId;
    public final boolean inviteRequestedVideo;
    public final boolean isAudioOnlyCall;
    public final String linkUrl;
    public final String localCallId;
    public final MediaSyncState mediaSyncState;
    public final long numberOfRejoinAttempts;
    public final ArrayList participants;
    public final RingNotification ringNotification;
    public final ParticipantModel selfParticipant;
    public final String serverInfoData;
    public final Map userCapabilities;

    public static native IgCallModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IgCallModel)) {
                return false;
            }
            IgCallModel igCallModel = (IgCallModel) obj;
            if (this.inCallState == igCallModel.inCallState && this.connectionQuality == igCallModel.connectionQuality && this.localCallId.equals(igCallModel.localCallId)) {
                String str = this.instagramVideoCallId;
                String str2 = igCallModel.instagramVideoCallId;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.linkUrl;
                String str4 = igCallModel.linkUrl;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.serverInfoData;
                String str6 = igCallModel.serverInfoData;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                if (!this.selfParticipant.equals(igCallModel.selfParticipant) || !this.participants.equals(igCallModel.participants) || !this.userCapabilities.equals(igCallModel.userCapabilities)) {
                    return false;
                }
                MediaSyncState mediaSyncState = this.mediaSyncState;
                MediaSyncState mediaSyncState2 = igCallModel.mediaSyncState;
                if (mediaSyncState == null) {
                    if (mediaSyncState2 != null) {
                        return false;
                    }
                } else if (!mediaSyncState.equals(mediaSyncState2)) {
                    return false;
                }
                CowatchPlayerModel cowatchPlayerModel = this.cowatchPlayerModel;
                CowatchPlayerModel cowatchPlayerModel2 = igCallModel.cowatchPlayerModel;
                if (cowatchPlayerModel == null) {
                    if (cowatchPlayerModel2 != null) {
                        return false;
                    }
                } else if (!cowatchPlayerModel.equals(cowatchPlayerModel2)) {
                    return false;
                }
                McfReference mcfReference = this.dropInModel;
                McfReference mcfReference2 = igCallModel.dropInModel;
                if (mcfReference == null) {
                    if (mcfReference2 != null) {
                        return false;
                    }
                } else if (!mcfReference.equals(mcfReference2)) {
                    return false;
                }
                if (this.inviteRequestedVideo != igCallModel.inviteRequestedVideo) {
                    return false;
                }
                RingNotification ringNotification = this.ringNotification;
                RingNotification ringNotification2 = igCallModel.ringNotification;
                if (ringNotification == null) {
                    if (ringNotification2 != null) {
                        return false;
                    }
                } else if (!ringNotification.equals(ringNotification2)) {
                    return false;
                }
                if (this.e2eeMandated != igCallModel.e2eeMandated || this.isAudioOnlyCall != igCallModel.isAudioOnlyCall || this.areAllParticipantsAudioOnly != igCallModel.areAllParticipantsAudioOnly || this.callCreatedTimestampMs != igCallModel.callCreatedTimestampMs || this.callAnsweredTimestampMs != igCallModel.callAnsweredTimestampMs || this.callConnectedTimestampMs != igCallModel.callConnectedTimestampMs || this.callEndedTimestampMs != igCallModel.callEndedTimestampMs) {
                    return false;
                }
                AudioEventsModel audioEventsModel = this.audioEventsModel;
                AudioEventsModel audioEventsModel2 = igCallModel.audioEventsModel;
                if (audioEventsModel != null) {
                    if (!audioEventsModel.equals(audioEventsModel2)) {
                        return false;
                    }
                } else if (audioEventsModel2 != null) {
                    return false;
                }
                if (this.numberOfRejoinAttempts != igCallModel.numberOfRejoinAttempts || this.didSendJoinAttempt != igCallModel.didSendJoinAttempt) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC167007dF.A07(this.numberOfRejoinAttempts, (AbstractC167007dF.A07(this.callEndedTimestampMs, AbstractC167007dF.A07(this.callConnectedTimestampMs, AbstractC167007dF.A07(this.callAnsweredTimestampMs, AbstractC167007dF.A07(this.callCreatedTimestampMs, (((((((((((((((((AbstractC166997dE.A0J(this.participants, AbstractC166997dE.A0J(this.selfParticipant, (((((AbstractC166997dE.A0K(this.localCallId, (JQ0.A01(this.inCallState) + this.connectionQuality) * 31) + AbstractC167017dG.A0O(this.instagramVideoCallId)) * 31) + AbstractC167017dG.A0O(this.linkUrl)) * 31) + AbstractC167017dG.A0O(this.serverInfoData)) * 31)) + this.userCapabilities.hashCode()) * 31) + AbstractC167017dG.A0M(this.mediaSyncState)) * 31) + AbstractC167017dG.A0M(this.cowatchPlayerModel)) * 31) + AbstractC167017dG.A0M(this.dropInModel)) * 31) + (this.inviteRequestedVideo ? 1 : 0)) * 31) + AbstractC167017dG.A0M(this.ringNotification)) * 31) + (this.e2eeMandated ? 1 : 0)) * 31) + (this.isAudioOnlyCall ? 1 : 0)) * 31) + (this.areAllParticipantsAudioOnly ? 1 : 0)) * 31)))) + AbstractC166997dE.A0I(this.audioEventsModel)) * 31) + (this.didSendJoinAttempt ? 1 : 0);
    }

    public IgCallModel(int i, int i2, String str, String str2, String str3, String str4, ParticipantModel participantModel, ArrayList arrayList, Map map, MediaSyncState mediaSyncState, CowatchPlayerModel cowatchPlayerModel, McfReference mcfReference, boolean z, RingNotification ringNotification, boolean z2, boolean z3, boolean z4, long j, long j2, long j3, long j4, AudioEventsModel audioEventsModel, long j5, boolean z5) {
        AbstractC31180DnO.A1U(str, participantModel, arrayList);
        map.getClass();
        this.inCallState = i;
        this.connectionQuality = i2;
        this.localCallId = str;
        this.instagramVideoCallId = str2;
        this.linkUrl = str3;
        this.serverInfoData = str4;
        this.selfParticipant = participantModel;
        this.participants = arrayList;
        this.userCapabilities = map;
        this.mediaSyncState = mediaSyncState;
        this.cowatchPlayerModel = cowatchPlayerModel;
        this.dropInModel = mcfReference;
        this.inviteRequestedVideo = z;
        this.ringNotification = ringNotification;
        this.e2eeMandated = z2;
        this.isAudioOnlyCall = z3;
        this.areAllParticipantsAudioOnly = z4;
        this.callCreatedTimestampMs = j;
        this.callAnsweredTimestampMs = j2;
        this.callConnectedTimestampMs = j3;
        this.callEndedTimestampMs = j4;
        this.audioEventsModel = audioEventsModel;
        this.numberOfRejoinAttempts = j5;
        this.didSendJoinAttempt = z5;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IgCallModel{inCallState=");
        A1C.append(this.inCallState);
        A1C.append(",connectionQuality=");
        A1C.append(this.connectionQuality);
        A1C.append(",localCallId=");
        A1C.append(this.localCallId);
        A1C.append(",instagramVideoCallId=");
        A1C.append(this.instagramVideoCallId);
        A1C.append(",linkUrl=");
        A1C.append(this.linkUrl);
        A1C.append(",serverInfoData=");
        A1C.append(this.serverInfoData);
        A1C.append(",selfParticipant=");
        A1C.append(this.selfParticipant);
        A1C.append(",participants=");
        A1C.append(this.participants);
        A1C.append(",userCapabilities=");
        A1C.append(this.userCapabilities);
        A1C.append(",mediaSyncState=");
        A1C.append(this.mediaSyncState);
        A1C.append(",cowatchPlayerModel=");
        A1C.append(this.cowatchPlayerModel);
        A1C.append(",dropInModel=");
        A1C.append(this.dropInModel);
        A1C.append(",inviteRequestedVideo=");
        A1C.append(this.inviteRequestedVideo);
        A1C.append(",ringNotification=");
        A1C.append(this.ringNotification);
        A1C.append(",e2eeMandated=");
        A1C.append(this.e2eeMandated);
        A1C.append(",isAudioOnlyCall=");
        A1C.append(this.isAudioOnlyCall);
        A1C.append(",areAllParticipantsAudioOnly=");
        A1C.append(this.areAllParticipantsAudioOnly);
        A1C.append(",callCreatedTimestampMs=");
        A1C.append(this.callCreatedTimestampMs);
        A1C.append(",callAnsweredTimestampMs=");
        A1C.append(this.callAnsweredTimestampMs);
        A1C.append(",callConnectedTimestampMs=");
        A1C.append(this.callConnectedTimestampMs);
        A1C.append(",callEndedTimestampMs=");
        A1C.append(this.callEndedTimestampMs);
        A1C.append(",audioEventsModel=");
        A1C.append(this.audioEventsModel);
        A1C.append(",numberOfRejoinAttempts=");
        A1C.append(this.numberOfRejoinAttempts);
        A1C.append(",didSendJoinAttempt=");
        return AbstractC50523MSb.A0X(A1C, this.didSendJoinAttempt);
    }
}
