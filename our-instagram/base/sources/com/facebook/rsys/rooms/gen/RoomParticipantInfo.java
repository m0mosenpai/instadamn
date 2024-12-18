package com.facebook.rsys.rooms.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class RoomParticipantInfo {
    public static C2N9 CONVERTER = YAM.A00(47);
    public static long sMcfTypeId;
    public final int blockedByViewerStatus;
    public final int capabilities;
    public final long capabilities2;
    public final String firstName;
    public final String fullName;
    public final String profilePictureFallbackUrl;
    public final String profilePictureUrl;
    public final long profilePictureUrlExpirationTimestampMs;
    public final String userId;

    public static native RoomParticipantInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomParticipantInfo)) {
                return false;
            }
            RoomParticipantInfo roomParticipantInfo = (RoomParticipantInfo) obj;
            if (this.userId.equals(roomParticipantInfo.userId) && this.fullName.equals(roomParticipantInfo.fullName) && this.firstName.equals(roomParticipantInfo.firstName)) {
                String str = this.profilePictureUrl;
                String str2 = roomParticipantInfo.profilePictureUrl;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.profilePictureFallbackUrl;
                String str4 = roomParticipantInfo.profilePictureFallbackUrl;
                if (str3 != null) {
                    if (!str3.equals(str4)) {
                        return false;
                    }
                } else if (str4 != null) {
                    return false;
                }
                if (this.profilePictureUrlExpirationTimestampMs != roomParticipantInfo.profilePictureUrlExpirationTimestampMs || this.blockedByViewerStatus != roomParticipantInfo.blockedByViewerStatus || this.capabilities != roomParticipantInfo.capabilities || this.capabilities2 != roomParticipantInfo.capabilities2) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A07 = (((AbstractC167007dF.A07(this.profilePictureUrlExpirationTimestampMs, (((AbstractC166997dE.A0K(this.firstName, AbstractC166997dE.A0K(this.fullName, AbstractC50523MSb.A02(this.userId))) + AbstractC167017dG.A0O(this.profilePictureUrl)) * 31) + AbstractC25227BEk.A07(this.profilePictureFallbackUrl)) * 31) + this.blockedByViewerStatus) * 31) + this.capabilities) * 31;
        long j = this.capabilities2;
        return A07 + ((int) (j ^ (j >>> 32)));
    }

    public RoomParticipantInfo(String str, String str2, String str3, String str4, String str5, long j, int i, int i2, long j2) {
        AbstractC31180DnO.A1U(str, str2, str3);
        this.userId = str;
        this.fullName = str2;
        this.firstName = str3;
        this.profilePictureUrl = str4;
        this.profilePictureFallbackUrl = str5;
        this.profilePictureUrlExpirationTimestampMs = j;
        this.blockedByViewerStatus = i;
        this.capabilities = i2;
        this.capabilities2 = j2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RoomParticipantInfo{userId=");
        A1C.append(this.userId);
        A1C.append(",fullName=");
        A1C.append(this.fullName);
        A1C.append(",firstName=");
        A1C.append(this.firstName);
        A1C.append(",profilePictureUrl=");
        A1C.append(this.profilePictureUrl);
        A1C.append(",profilePictureFallbackUrl=");
        A1C.append(this.profilePictureFallbackUrl);
        A1C.append(",profilePictureUrlExpirationTimestampMs=");
        A1C.append(this.profilePictureUrlExpirationTimestampMs);
        A1C.append(",blockedByViewerStatus=");
        A1C.append(this.blockedByViewerStatus);
        A1C.append(",capabilities=");
        A1C.append(this.capabilities);
        A1C.append(",capabilities2=");
        A1C.append(this.capabilities2);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
