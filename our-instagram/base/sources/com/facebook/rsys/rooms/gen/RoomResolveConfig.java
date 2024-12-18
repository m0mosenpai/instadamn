package com.facebook.rsys.rooms.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callinfo.gen.UserProfile;

/* loaded from: classes12.dex */
public class RoomResolveConfig {
    public static C2N9 CONVERTER = YAM.A00(48);
    public static long sMcfTypeId;
    public final boolean attemptRetry;
    public final Integer expectedParticipantCount;
    public final boolean isAudioOnly;
    public final String localCallId;
    public final boolean shouldAutoJoin;
    public final UserProfile userToRing;
    public final Long visibleId;

    public static native RoomResolveConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomResolveConfig)) {
                return false;
            }
            RoomResolveConfig roomResolveConfig = (RoomResolveConfig) obj;
            if (this.localCallId.equals(roomResolveConfig.localCallId) && this.shouldAutoJoin == roomResolveConfig.shouldAutoJoin) {
                UserProfile userProfile = this.userToRing;
                UserProfile userProfile2 = roomResolveConfig.userToRing;
                if (userProfile == null) {
                    if (userProfile2 != null) {
                        return false;
                    }
                } else if (!userProfile.equals(userProfile2)) {
                    return false;
                }
                Integer num = this.expectedParticipantCount;
                Integer num2 = roomResolveConfig.expectedParticipantCount;
                if (num == null) {
                    if (num2 != null) {
                        return false;
                    }
                } else if (!num.equals(num2)) {
                    return false;
                }
                if (this.isAudioOnly != roomResolveConfig.isAudioOnly) {
                    return false;
                }
                Long l = this.visibleId;
                Long l2 = roomResolveConfig.visibleId;
                if (l != null) {
                    if (!l.equals(l2)) {
                        return false;
                    }
                } else if (l2 != null) {
                    return false;
                }
                if (this.attemptRetry != roomResolveConfig.attemptRetry) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((AbstractC50523MSb.A02(this.localCallId) + (this.shouldAutoJoin ? 1 : 0)) * 31) + AbstractC167017dG.A0M(this.userToRing)) * 31) + AbstractC167017dG.A0M(this.expectedParticipantCount)) * 31) + (this.isAudioOnly ? 1 : 0)) * 31) + AbstractC166997dE.A0I(this.visibleId)) * 31) + (this.attemptRetry ? 1 : 0);
    }

    public RoomResolveConfig(String str, boolean z, UserProfile userProfile, Integer num, boolean z2, Long l, boolean z3) {
        str.getClass();
        this.localCallId = str;
        this.shouldAutoJoin = z;
        this.userToRing = userProfile;
        this.expectedParticipantCount = num;
        this.isAudioOnly = z2;
        this.visibleId = l;
        this.attemptRetry = z3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RoomResolveConfig{localCallId=");
        A1C.append(this.localCallId);
        A1C.append(",shouldAutoJoin=");
        A1C.append(this.shouldAutoJoin);
        A1C.append(",userToRing=");
        A1C.append(this.userToRing);
        A1C.append(",expectedParticipantCount=");
        A1C.append(this.expectedParticipantCount);
        A1C.append(",isAudioOnly=");
        A1C.append(this.isAudioOnly);
        A1C.append(",visibleId=");
        A1C.append(this.visibleId);
        A1C.append(",attemptRetry=");
        return AbstractC50523MSb.A0X(A1C, this.attemptRetry);
    }
}
