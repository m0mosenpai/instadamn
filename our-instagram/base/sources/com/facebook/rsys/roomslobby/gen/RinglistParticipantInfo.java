package com.facebook.rsys.roomslobby.gen;

import X.AbstractC166987dD;
import X.AbstractC25236BEt;
import X.AbstractC72049XLp;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rooms.gen.RoomParticipantInfo;

/* loaded from: classes12.dex */
public class RinglistParticipantInfo {
    public static C2N9 CONVERTER = YAM.A00(49);
    public static long sMcfTypeId;
    public final int inviteType;
    public final boolean isAttemptedJoiner;
    public final RoomParticipantInfo roomParticipantInfo;
    public final long timeSinceAttemptedJoin;

    public static native RinglistParticipantInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RinglistParticipantInfo)) {
            return false;
        }
        RinglistParticipantInfo ringlistParticipantInfo = (RinglistParticipantInfo) obj;
        return this.roomParticipantInfo.equals(ringlistParticipantInfo.roomParticipantInfo) && this.isAttemptedJoiner == ringlistParticipantInfo.isAttemptedJoiner && this.timeSinceAttemptedJoin == ringlistParticipantInfo.timeSinceAttemptedJoin && this.inviteType == ringlistParticipantInfo.inviteType;
    }

    public int hashCode() {
        return AbstractC25236BEt.A01(this.timeSinceAttemptedJoin, (AbstractC72049XLp.A02(this.roomParticipantInfo) + (this.isAttemptedJoiner ? 1 : 0)) * 31) + this.inviteType;
    }

    public RinglistParticipantInfo(RoomParticipantInfo roomParticipantInfo, boolean z, long j, int i) {
        roomParticipantInfo.getClass();
        this.roomParticipantInfo = roomParticipantInfo;
        this.isAttemptedJoiner = z;
        this.timeSinceAttemptedJoin = j;
        this.inviteType = i;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RinglistParticipantInfo{roomParticipantInfo=");
        A1C.append(this.roomParticipantInfo);
        A1C.append(",isAttemptedJoiner=");
        A1C.append(this.isAttemptedJoiner);
        A1C.append(",timeSinceAttemptedJoin=");
        A1C.append(this.timeSinceAttemptedJoin);
        A1C.append(",inviteType=");
        return AbstractC72049XLp.A0B(A1C, this.inviteType);
    }
}
