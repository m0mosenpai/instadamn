package com.facebook.rsys.videoeffectcommunication.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes8.dex */
public class VideoEffectCommunicationModel {
    public static C2N9 CONVERTER = new LSW(22);
    public static long sMcfTypeId;
    public final VideoEffectCommunicationCallLayoutRemovingState callLayoutRemovingState;
    public final long confirmationPromptEffectId;
    public final int confirmationPromptState;
    public final boolean effectReadyForSplitScreen;
    public final VideoEffectCommunicationGroupEffectSharingState effectReceivingState;
    public final VideoEffectCommunicationGroupEffectSharingState effectSendingState;
    public final long multipeerListeningEffectId;
    public final long participantModuleEffectId;
    public final Long updatedCallLayoutEffectId;
    public final int updatedGroupEffectStatus;

    public static native VideoEffectCommunicationModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationModel)) {
                return false;
            }
            VideoEffectCommunicationModel videoEffectCommunicationModel = (VideoEffectCommunicationModel) obj;
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState = this.effectReceivingState;
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState2 = videoEffectCommunicationModel.effectReceivingState;
            if (videoEffectCommunicationGroupEffectSharingState == null) {
                if (videoEffectCommunicationGroupEffectSharingState2 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationGroupEffectSharingState.equals(videoEffectCommunicationGroupEffectSharingState2)) {
                return false;
            }
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState3 = this.effectSendingState;
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState4 = videoEffectCommunicationModel.effectSendingState;
            if (videoEffectCommunicationGroupEffectSharingState3 == null) {
                if (videoEffectCommunicationGroupEffectSharingState4 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationGroupEffectSharingState3.equals(videoEffectCommunicationGroupEffectSharingState4)) {
                return false;
            }
            if (this.confirmationPromptState != videoEffectCommunicationModel.confirmationPromptState || this.confirmationPromptEffectId != videoEffectCommunicationModel.confirmationPromptEffectId || this.multipeerListeningEffectId != videoEffectCommunicationModel.multipeerListeningEffectId || this.participantModuleEffectId != videoEffectCommunicationModel.participantModuleEffectId) {
                return false;
            }
            Long l = this.updatedCallLayoutEffectId;
            Long l2 = videoEffectCommunicationModel.updatedCallLayoutEffectId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            if (this.updatedGroupEffectStatus != videoEffectCommunicationModel.updatedGroupEffectStatus) {
                return false;
            }
            VideoEffectCommunicationCallLayoutRemovingState videoEffectCommunicationCallLayoutRemovingState = this.callLayoutRemovingState;
            VideoEffectCommunicationCallLayoutRemovingState videoEffectCommunicationCallLayoutRemovingState2 = videoEffectCommunicationModel.callLayoutRemovingState;
            if (videoEffectCommunicationCallLayoutRemovingState != null) {
                if (!videoEffectCommunicationCallLayoutRemovingState.equals(videoEffectCommunicationCallLayoutRemovingState2)) {
                    return false;
                }
            } else if (videoEffectCommunicationCallLayoutRemovingState2 != null) {
                return false;
            }
            if (this.effectReadyForSplitScreen != videoEffectCommunicationModel.effectReadyForSplitScreen) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AbstractC167007dF.A07(this.participantModuleEffectId, AbstractC167007dF.A07(this.multipeerListeningEffectId, AbstractC167007dF.A07(this.confirmationPromptEffectId, (((JQ0.A01(AbstractC167017dG.A0M(this.effectReceivingState)) + AbstractC167017dG.A0M(this.effectSendingState)) * 31) + this.confirmationPromptState) * 31))) + AbstractC167017dG.A0M(this.updatedCallLayoutEffectId)) * 31) + this.updatedGroupEffectStatus) * 31) + AbstractC166997dE.A0I(this.callLayoutRemovingState)) * 31) + (this.effectReadyForSplitScreen ? 1 : 0);
    }

    public VideoEffectCommunicationModel(VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState, VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState2, int i, long j, long j2, long j3, Long l, int i2, VideoEffectCommunicationCallLayoutRemovingState videoEffectCommunicationCallLayoutRemovingState, boolean z) {
        this.effectReceivingState = videoEffectCommunicationGroupEffectSharingState;
        this.effectSendingState = videoEffectCommunicationGroupEffectSharingState2;
        this.confirmationPromptState = i;
        this.confirmationPromptEffectId = j;
        this.multipeerListeningEffectId = j2;
        this.participantModuleEffectId = j3;
        this.updatedCallLayoutEffectId = l;
        this.updatedGroupEffectStatus = i2;
        this.callLayoutRemovingState = videoEffectCommunicationCallLayoutRemovingState;
        this.effectReadyForSplitScreen = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoEffectCommunicationModel{effectReceivingState=");
        A1C.append(this.effectReceivingState);
        A1C.append(",effectSendingState=");
        A1C.append(this.effectSendingState);
        A1C.append(",confirmationPromptState=");
        A1C.append(this.confirmationPromptState);
        A1C.append(",confirmationPromptEffectId=");
        A1C.append(this.confirmationPromptEffectId);
        A1C.append(",multipeerListeningEffectId=");
        A1C.append(this.multipeerListeningEffectId);
        A1C.append(",participantModuleEffectId=");
        A1C.append(this.participantModuleEffectId);
        A1C.append(",updatedCallLayoutEffectId=");
        A1C.append(this.updatedCallLayoutEffectId);
        A1C.append(",updatedGroupEffectStatus=");
        A1C.append(this.updatedGroupEffectStatus);
        A1C.append(",callLayoutRemovingState=");
        A1C.append(this.callLayoutRemovingState);
        A1C.append(",effectReadyForSplitScreen=");
        A1C.append(this.effectReadyForSplitScreen);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
