package com.facebook.rsys.moderator.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes9.dex */
public class ModeratorSoftMuteModel {
    public static C2N9 CONVERTER = C55648OnZ.A00(58);
    public static long sMcfTypeId;
    public final boolean actionCapabilitiesAsModerator;
    public final boolean actionCapabilitiesAsParticipant;
    public final ModeratorActionInfo actionExecuted;
    public final ModeratorActionInfo actionIssued;
    public final ModeratorActionInfo actionPending;
    public final Map conferenceParticipantCapabilities;
    public final boolean isCapabilityInitialized;
    public final boolean isFeatureEnabled;
    public final HashSet issueActionTargetUids;

    public static native ModeratorSoftMuteModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ModeratorSoftMuteModel)) {
                return false;
            }
            ModeratorSoftMuteModel moderatorSoftMuteModel = (ModeratorSoftMuteModel) obj;
            if (this.isCapabilityInitialized == moderatorSoftMuteModel.isCapabilityInitialized && this.isFeatureEnabled == moderatorSoftMuteModel.isFeatureEnabled && this.actionCapabilitiesAsModerator == moderatorSoftMuteModel.actionCapabilitiesAsModerator && this.actionCapabilitiesAsParticipant == moderatorSoftMuteModel.actionCapabilitiesAsParticipant && this.conferenceParticipantCapabilities.equals(moderatorSoftMuteModel.conferenceParticipantCapabilities)) {
                ModeratorActionInfo moderatorActionInfo = this.actionIssued;
                ModeratorActionInfo moderatorActionInfo2 = moderatorSoftMuteModel.actionIssued;
                if (moderatorActionInfo == null) {
                    if (moderatorActionInfo2 != null) {
                        return false;
                    }
                } else if (!moderatorActionInfo.equals(moderatorActionInfo2)) {
                    return false;
                }
                ModeratorActionInfo moderatorActionInfo3 = this.actionPending;
                ModeratorActionInfo moderatorActionInfo4 = moderatorSoftMuteModel.actionPending;
                if (moderatorActionInfo3 == null) {
                    if (moderatorActionInfo4 != null) {
                        return false;
                    }
                } else if (!moderatorActionInfo3.equals(moderatorActionInfo4)) {
                    return false;
                }
                ModeratorActionInfo moderatorActionInfo5 = this.actionExecuted;
                ModeratorActionInfo moderatorActionInfo6 = moderatorSoftMuteModel.actionExecuted;
                if (moderatorActionInfo5 != null) {
                    if (!moderatorActionInfo5.equals(moderatorActionInfo6)) {
                        return false;
                    }
                } else if (moderatorActionInfo6 != null) {
                    return false;
                }
                if (!this.issueActionTargetUids.equals(moderatorSoftMuteModel.issueActionTargetUids)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.issueActionTargetUids, (((((((((((((JQ0.A01(this.isCapabilityInitialized ? 1 : 0) + (this.isFeatureEnabled ? 1 : 0)) * 31) + (this.actionCapabilitiesAsModerator ? 1 : 0)) * 31) + (this.actionCapabilitiesAsParticipant ? 1 : 0)) * 31) + this.conferenceParticipantCapabilities.hashCode()) * 31) + AbstractC167017dG.A0M(this.actionIssued)) * 31) + AbstractC167017dG.A0M(this.actionPending)) * 31) + AbstractC166997dE.A0I(this.actionExecuted)) * 31);
    }

    public ModeratorSoftMuteModel(boolean z, boolean z2, boolean z3, boolean z4, Map map, ModeratorActionInfo moderatorActionInfo, ModeratorActionInfo moderatorActionInfo2, ModeratorActionInfo moderatorActionInfo3, HashSet hashSet) {
        map.getClass();
        hashSet.getClass();
        this.isCapabilityInitialized = z;
        this.isFeatureEnabled = z2;
        this.actionCapabilitiesAsModerator = z3;
        this.actionCapabilitiesAsParticipant = z4;
        this.conferenceParticipantCapabilities = map;
        this.actionIssued = moderatorActionInfo;
        this.actionPending = moderatorActionInfo2;
        this.actionExecuted = moderatorActionInfo3;
        this.issueActionTargetUids = hashSet;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ModeratorSoftMuteModel{isCapabilityInitialized=");
        A1C.append(this.isCapabilityInitialized);
        A1C.append(",isFeatureEnabled=");
        A1C.append(this.isFeatureEnabled);
        A1C.append(",actionCapabilitiesAsModerator=");
        A1C.append(this.actionCapabilitiesAsModerator);
        A1C.append(",actionCapabilitiesAsParticipant=");
        A1C.append(this.actionCapabilitiesAsParticipant);
        A1C.append(",conferenceParticipantCapabilities=");
        A1C.append(this.conferenceParticipantCapabilities);
        A1C.append(",actionIssued=");
        A1C.append(this.actionIssued);
        A1C.append(",actionPending=");
        A1C.append(this.actionPending);
        A1C.append(",actionExecuted=");
        A1C.append(this.actionExecuted);
        A1C.append(",issueActionTargetUids=");
        return JQ0.A0l(this.issueActionTargetUids, A1C);
    }
}
