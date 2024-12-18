package com.facebook.rsys.callinfo.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C2N9;
import X.JQ0;
import X.MSV;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class UserProfile {
    public static C2N9 CONVERTER = YAN.A00(23);
    public static long sMcfTypeId;
    public final String actorId;
    public final boolean authTypeIsAnonymousUser;
    public final int blockedByViewerStatus;
    public final boolean canViewerMessage;
    public final int capabilities;
    public final long capabilities2;
    public final int contactTypeExact;
    public final String firstName;
    public final int friendshipStatus;
    public final boolean isGuest;
    public final String name;
    public final String profilePictureUrl;
    public final long profilePictureUrlExpirationTimestampMs;
    public final String profilePictureUrlFallback;
    public final String secondaryName;
    public final String thirdPartyId;
    public final String userId;
    public final int userProfileState;

    public static native UserProfile createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UserProfile)) {
                return false;
            }
            UserProfile userProfile = (UserProfile) obj;
            if (this.userProfileState == userProfile.userProfileState && this.userId.equals(userProfile.userId)) {
                String str = this.actorId;
                String str2 = userProfile.actorId;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.thirdPartyId;
                String str4 = userProfile.thirdPartyId;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.firstName;
                String str6 = userProfile.firstName;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                String str7 = this.name;
                String str8 = userProfile.name;
                if (str7 == null) {
                    if (str8 != null) {
                        return false;
                    }
                } else if (!str7.equals(str8)) {
                    return false;
                }
                String str9 = this.profilePictureUrl;
                String str10 = userProfile.profilePictureUrl;
                if (str9 == null) {
                    if (str10 != null) {
                        return false;
                    }
                } else if (!str9.equals(str10)) {
                    return false;
                }
                String str11 = this.profilePictureUrlFallback;
                String str12 = userProfile.profilePictureUrlFallback;
                if (str11 == null) {
                    if (str12 != null) {
                        return false;
                    }
                } else if (!str11.equals(str12)) {
                    return false;
                }
                if (this.profilePictureUrlExpirationTimestampMs != userProfile.profilePictureUrlExpirationTimestampMs || this.isGuest != userProfile.isGuest || this.blockedByViewerStatus != userProfile.blockedByViewerStatus || this.contactTypeExact != userProfile.contactTypeExact) {
                    return false;
                }
                String str13 = this.secondaryName;
                String str14 = userProfile.secondaryName;
                if (str13 != null) {
                    if (!str13.equals(str14)) {
                        return false;
                    }
                } else if (str14 != null) {
                    return false;
                }
                if (this.canViewerMessage != userProfile.canViewerMessage || this.authTypeIsAnonymousUser != userProfile.authTypeIsAnonymousUser || this.friendshipStatus != userProfile.friendshipStatus || this.capabilities != userProfile.capabilities || this.capabilities2 != userProfile.capabilities2) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A07 = (((((((((((((((AbstractC167007dF.A07(this.profilePictureUrlExpirationTimestampMs, (((((((((((AbstractC166997dE.A0K(this.userId, JQ0.A01(this.userProfileState)) + AbstractC167017dG.A0O(this.actorId)) * 31) + AbstractC167017dG.A0O(this.thirdPartyId)) * 31) + AbstractC167017dG.A0O(this.firstName)) * 31) + AbstractC167017dG.A0O(this.name)) * 31) + AbstractC167017dG.A0O(this.profilePictureUrl)) * 31) + AbstractC167017dG.A0O(this.profilePictureUrlFallback)) * 31) + (this.isGuest ? 1 : 0)) * 31) + this.blockedByViewerStatus) * 31) + this.contactTypeExact) * 31) + AbstractC25227BEk.A07(this.secondaryName)) * 31) + (this.canViewerMessage ? 1 : 0)) * 31) + (this.authTypeIsAnonymousUser ? 1 : 0)) * 31) + this.friendshipStatus) * 31) + this.capabilities) * 31;
        long j = this.capabilities2;
        return A07 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UserProfile{userProfileState=");
        A1C.append(this.userProfileState);
        A1C.append(",userId=");
        A1C.append(this.userId);
        A1C.append(MSV.A00(301));
        A1C.append(this.actorId);
        A1C.append(",thirdPartyId=");
        A1C.append(this.thirdPartyId);
        A1C.append(",firstName=");
        A1C.append(this.firstName);
        A1C.append(",name=");
        A1C.append(this.name);
        A1C.append(",profilePictureUrl=");
        A1C.append(this.profilePictureUrl);
        A1C.append(",profilePictureUrlFallback=");
        A1C.append(this.profilePictureUrlFallback);
        A1C.append(",profilePictureUrlExpirationTimestampMs=");
        A1C.append(this.profilePictureUrlExpirationTimestampMs);
        A1C.append(",isGuest=");
        A1C.append(this.isGuest);
        A1C.append(",blockedByViewerStatus=");
        A1C.append(this.blockedByViewerStatus);
        A1C.append(",contactTypeExact=");
        A1C.append(this.contactTypeExact);
        A1C.append(",secondaryName=");
        A1C.append(this.secondaryName);
        A1C.append(",canViewerMessage=");
        A1C.append(this.canViewerMessage);
        A1C.append(",authTypeIsAnonymousUser=");
        A1C.append(this.authTypeIsAnonymousUser);
        A1C.append(",friendshipStatus=");
        A1C.append(this.friendshipStatus);
        A1C.append(",capabilities=");
        A1C.append(this.capabilities);
        A1C.append(",capabilities2=");
        A1C.append(this.capabilities2);
        return AbstractC166997dE.A0x("}", A1C);
    }

    public UserProfile(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, int i2, int i3, String str8, boolean z2, boolean z3, int i4, int i5, long j2) {
        str.getClass();
        this.userProfileState = i;
        this.userId = str;
        this.actorId = str2;
        this.thirdPartyId = str3;
        this.firstName = str4;
        this.name = str5;
        this.profilePictureUrl = str6;
        this.profilePictureUrlFallback = str7;
        this.profilePictureUrlExpirationTimestampMs = j;
        this.isGuest = z;
        this.blockedByViewerStatus = i2;
        this.contactTypeExact = i3;
        this.secondaryName = str8;
        this.canViewerMessage = z2;
        this.authTypeIsAnonymousUser = z3;
        this.friendshipStatus = i4;
        this.capabilities = i5;
        this.capabilities2 = j2;
    }
}
