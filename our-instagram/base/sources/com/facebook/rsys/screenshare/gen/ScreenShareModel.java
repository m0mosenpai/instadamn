package com.facebook.rsys.screenshare.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;

/* loaded from: classes9.dex */
public class ScreenShareModel {
    public static C2N9 CONVERTER = C55648OnZ.A00(66);
    public static long sMcfTypeId;
    public final boolean audioFeatureEnabled;
    public final boolean isSctpEnabled;
    public final long maxParticipants;
    public final PeerScreenShareStates peerStates;
    public final int screenShareAvailability;
    public final boolean screenShareInitiateSharing;
    public final boolean screenShareIntendedOn;
    public final int screenSharePlayerCurrentIndex;
    public final int screenSharePlayerMediaQueueCount;
    public final int screenShareSourceType;
    public final int screenShareState;
    public final boolean screenShareStopSharing;
    public final int screenShareStopSharingActionSource;
    public final HashSet selfRemoteScreenShareChannelIds;

    public static native ScreenShareModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ScreenShareModel)) {
                return false;
            }
            ScreenShareModel screenShareModel = (ScreenShareModel) obj;
            if (this.screenShareInitiateSharing == screenShareModel.screenShareInitiateSharing && this.screenShareState == screenShareModel.screenShareState && this.screenShareIntendedOn == screenShareModel.screenShareIntendedOn && this.screenShareSourceType == screenShareModel.screenShareSourceType && this.screenShareAvailability == screenShareModel.screenShareAvailability && this.screenShareStopSharing == screenShareModel.screenShareStopSharing && this.screenShareStopSharingActionSource == screenShareModel.screenShareStopSharingActionSource) {
                PeerScreenShareStates peerScreenShareStates = this.peerStates;
                PeerScreenShareStates peerScreenShareStates2 = screenShareModel.peerStates;
                if (peerScreenShareStates != null) {
                    if (!peerScreenShareStates.equals(peerScreenShareStates2)) {
                        return false;
                    }
                } else if (peerScreenShareStates2 != null) {
                    return false;
                }
                if (this.maxParticipants != screenShareModel.maxParticipants || this.audioFeatureEnabled != screenShareModel.audioFeatureEnabled || this.screenSharePlayerMediaQueueCount != screenShareModel.screenSharePlayerMediaQueueCount || this.screenSharePlayerCurrentIndex != screenShareModel.screenSharePlayerCurrentIndex || !this.selfRemoteScreenShareChannelIds.equals(screenShareModel.selfRemoteScreenShareChannelIds) || this.isSctpEnabled != screenShareModel.isSctpEnabled) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC166997dE.A0J(this.selfRemoteScreenShareChannelIds, (((((AbstractC25236BEt.A01(this.maxParticipants, (((((((((((((JQ0.A01(this.screenShareInitiateSharing ? 1 : 0) + this.screenShareState) * 31) + (this.screenShareIntendedOn ? 1 : 0)) * 31) + this.screenShareSourceType) * 31) + this.screenShareAvailability) * 31) + (this.screenShareStopSharing ? 1 : 0)) * 31) + this.screenShareStopSharingActionSource) * 31) + AbstractC167017dG.A0M(this.peerStates)) * 31) + (this.audioFeatureEnabled ? 1 : 0)) * 31) + this.screenSharePlayerMediaQueueCount) * 31) + this.screenSharePlayerCurrentIndex) * 31) + (this.isSctpEnabled ? 1 : 0);
    }

    public ScreenShareModel(boolean z, int i, boolean z2, int i2, int i3, boolean z3, int i4, PeerScreenShareStates peerScreenShareStates, long j, boolean z4, int i5, int i6, HashSet hashSet, boolean z5) {
        hashSet.getClass();
        this.screenShareInitiateSharing = z;
        this.screenShareState = i;
        this.screenShareIntendedOn = z2;
        this.screenShareSourceType = i2;
        this.screenShareAvailability = i3;
        this.screenShareStopSharing = z3;
        this.screenShareStopSharingActionSource = i4;
        this.peerStates = peerScreenShareStates;
        this.maxParticipants = j;
        this.audioFeatureEnabled = z4;
        this.screenSharePlayerMediaQueueCount = i5;
        this.screenSharePlayerCurrentIndex = i6;
        this.selfRemoteScreenShareChannelIds = hashSet;
        this.isSctpEnabled = z5;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ScreenShareModel{screenShareInitiateSharing=");
        A1C.append(this.screenShareInitiateSharing);
        A1C.append(",screenShareState=");
        A1C.append(this.screenShareState);
        A1C.append(",screenShareIntendedOn=");
        A1C.append(this.screenShareIntendedOn);
        A1C.append(",screenShareSourceType=");
        A1C.append(this.screenShareSourceType);
        A1C.append(",screenShareAvailability=");
        A1C.append(this.screenShareAvailability);
        A1C.append(",screenShareStopSharing=");
        A1C.append(this.screenShareStopSharing);
        A1C.append(",screenShareStopSharingActionSource=");
        A1C.append(this.screenShareStopSharingActionSource);
        A1C.append(",peerStates=");
        A1C.append(this.peerStates);
        A1C.append(",maxParticipants=");
        A1C.append(this.maxParticipants);
        A1C.append(",audioFeatureEnabled=");
        A1C.append(this.audioFeatureEnabled);
        A1C.append(",screenSharePlayerMediaQueueCount=");
        A1C.append(this.screenSharePlayerMediaQueueCount);
        A1C.append(",screenSharePlayerCurrentIndex=");
        A1C.append(this.screenSharePlayerCurrentIndex);
        A1C.append(",selfRemoteScreenShareChannelIds=");
        A1C.append(this.selfRemoteScreenShareChannelIds);
        A1C.append(",isSctpEnabled=");
        return AbstractC50523MSb.A0X(A1C, this.isSctpEnabled);
    }
}
