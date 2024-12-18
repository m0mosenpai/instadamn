package com.facebook.rsys.rooms.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class RoomJoiningModel {
    public final boolean active;
    public final boolean canAnonymousUserJoin;
    public final RoomCapabilityModel capabilities;
    public final String conferenceName;
    public final int groupRoomType;
    public final boolean isAudioOnly;
    public final boolean isE2eEncrypted;
    public final boolean isHostPresent;
    public final Boolean isJoinPermissionMutable;
    public final boolean isOnlineLearningSpace;
    public final boolean isVideoAllowed;
    public final boolean isWorkrooms;
    public final int joinPermissionSetting;
    public final Long linkId;
    public final String linkUrl;
    public final int lockStatus;
    public final RoomMetadataModel metadata;
    public final boolean notInAudience;
    public final boolean open;
    public final int participantCount;
    public final boolean roomChatIsCommunityMessagingThread;
    public final boolean shouldDisplayBloksLobby;
    public final boolean shouldJoinWithAudio;

    public static native RoomJoiningModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomJoiningModel)) {
                return false;
            }
            RoomJoiningModel roomJoiningModel = (RoomJoiningModel) obj;
            if (this.linkUrl.equals(roomJoiningModel.linkUrl)) {
                Long l = this.linkId;
                Long l2 = roomJoiningModel.linkId;
                if (l == null) {
                    if (l2 != null) {
                        return false;
                    }
                } else if (!l.equals(l2)) {
                    return false;
                }
                if (this.participantCount != roomJoiningModel.participantCount || this.active != roomJoiningModel.active || this.open != roomJoiningModel.open || this.notInAudience != roomJoiningModel.notInAudience || this.lockStatus != roomJoiningModel.lockStatus || this.canAnonymousUserJoin != roomJoiningModel.canAnonymousUserJoin || this.isHostPresent != roomJoiningModel.isHostPresent || this.isE2eEncrypted != roomJoiningModel.isE2eEncrypted || !this.metadata.equals(roomJoiningModel.metadata) || !this.capabilities.equals(roomJoiningModel.capabilities)) {
                    return false;
                }
                String str = this.conferenceName;
                String str2 = roomJoiningModel.conferenceName;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.joinPermissionSetting != roomJoiningModel.joinPermissionSetting) {
                    return false;
                }
                Boolean bool = this.isJoinPermissionMutable;
                Boolean bool2 = roomJoiningModel.isJoinPermissionMutable;
                if (bool != null) {
                    if (!bool.equals(bool2)) {
                        return false;
                    }
                } else if (bool2 != null) {
                    return false;
                }
                if (this.isAudioOnly != roomJoiningModel.isAudioOnly || this.isOnlineLearningSpace != roomJoiningModel.isOnlineLearningSpace || this.roomChatIsCommunityMessagingThread != roomJoiningModel.roomChatIsCommunityMessagingThread || this.groupRoomType != roomJoiningModel.groupRoomType || this.isVideoAllowed != roomJoiningModel.isVideoAllowed || this.shouldDisplayBloksLobby != roomJoiningModel.shouldDisplayBloksLobby || this.shouldJoinWithAudio != roomJoiningModel.shouldJoinWithAudio || this.isWorkrooms != roomJoiningModel.isWorkrooms) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((AbstractC166997dE.A0J(this.capabilities, AbstractC166997dE.A0J(this.metadata, (((((((((((((((((AbstractC50523MSb.A02(this.linkUrl) + AbstractC167017dG.A0M(this.linkId)) * 31) + this.participantCount) * 31) + (this.active ? 1 : 0)) * 31) + (this.open ? 1 : 0)) * 31) + (this.notInAudience ? 1 : 0)) * 31) + this.lockStatus) * 31) + (this.canAnonymousUserJoin ? 1 : 0)) * 31) + (this.isHostPresent ? 1 : 0)) * 31) + (this.isE2eEncrypted ? 1 : 0)) * 31)) + AbstractC167017dG.A0O(this.conferenceName)) * 31) + this.joinPermissionSetting) * 31) + AbstractC166997dE.A0I(this.isJoinPermissionMutable)) * 31) + (this.isAudioOnly ? 1 : 0)) * 31) + (this.isOnlineLearningSpace ? 1 : 0)) * 31) + (this.roomChatIsCommunityMessagingThread ? 1 : 0)) * 31) + this.groupRoomType) * 31) + (this.isVideoAllowed ? 1 : 0)) * 31) + (this.shouldDisplayBloksLobby ? 1 : 0)) * 31) + (this.shouldJoinWithAudio ? 1 : 0)) * 31) + (this.isWorkrooms ? 1 : 0);
    }

    public RoomJoiningModel(String str, Long l, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, boolean z5, boolean z6, RoomMetadataModel roomMetadataModel, RoomCapabilityModel roomCapabilityModel, String str2, int i3, Boolean bool, boolean z7, boolean z8, boolean z9, int i4, boolean z10, boolean z11, boolean z12, boolean z13) {
        AbstractC31180DnO.A1U(str, roomMetadataModel, roomCapabilityModel);
        this.linkUrl = str;
        this.linkId = l;
        this.participantCount = i;
        this.active = z;
        this.open = z2;
        this.notInAudience = z3;
        this.lockStatus = i2;
        this.canAnonymousUserJoin = z4;
        this.isHostPresent = z5;
        this.isE2eEncrypted = z6;
        this.metadata = roomMetadataModel;
        this.capabilities = roomCapabilityModel;
        this.conferenceName = str2;
        this.joinPermissionSetting = i3;
        this.isJoinPermissionMutable = bool;
        this.isAudioOnly = z7;
        this.isOnlineLearningSpace = z8;
        this.roomChatIsCommunityMessagingThread = z9;
        this.groupRoomType = i4;
        this.isVideoAllowed = z10;
        this.shouldDisplayBloksLobby = z11;
        this.shouldJoinWithAudio = z12;
        this.isWorkrooms = z13;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RoomJoiningModel{linkUrl=");
        A1C.append(this.linkUrl);
        A1C.append(",linkId=");
        A1C.append(this.linkId);
        A1C.append(",participantCount=");
        A1C.append(this.participantCount);
        A1C.append(",active=");
        A1C.append(this.active);
        A1C.append(",open=");
        A1C.append(this.open);
        A1C.append(",notInAudience=");
        A1C.append(this.notInAudience);
        A1C.append(",lockStatus=");
        A1C.append(this.lockStatus);
        A1C.append(",canAnonymousUserJoin=");
        A1C.append(this.canAnonymousUserJoin);
        A1C.append(",isHostPresent=");
        A1C.append(this.isHostPresent);
        A1C.append(",isE2eEncrypted=");
        A1C.append(this.isE2eEncrypted);
        A1C.append(",metadata=");
        A1C.append(this.metadata);
        A1C.append(",capabilities=");
        A1C.append(this.capabilities);
        A1C.append(",conferenceName=");
        A1C.append(this.conferenceName);
        A1C.append(",joinPermissionSetting=");
        A1C.append(this.joinPermissionSetting);
        A1C.append(",isJoinPermissionMutable=");
        A1C.append(this.isJoinPermissionMutable);
        A1C.append(",isAudioOnly=");
        A1C.append(this.isAudioOnly);
        A1C.append(",isOnlineLearningSpace=");
        A1C.append(this.isOnlineLearningSpace);
        A1C.append(",roomChatIsCommunityMessagingThread=");
        A1C.append(this.roomChatIsCommunityMessagingThread);
        A1C.append(",groupRoomType=");
        A1C.append(this.groupRoomType);
        A1C.append(",isVideoAllowed=");
        A1C.append(this.isVideoAllowed);
        A1C.append(",shouldDisplayBloksLobby=");
        A1C.append(this.shouldDisplayBloksLobby);
        A1C.append(",shouldJoinWithAudio=");
        A1C.append(this.shouldJoinWithAudio);
        A1C.append(",isWorkrooms=");
        return AbstractC50523MSb.A0X(A1C, this.isWorkrooms);
    }
}
