package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CowatchMediaModel {
    public final boolean containsLicensedMusic;
    public final String dashManifest;
    public final long expirationTimestampMs;
    public final CowatchExternalMediaConfig externalMediaConfig;
    public final boolean isLive;
    public final String logInfo;
    public final float mediaAspectRatio;
    public final String mediaAuthor;
    public final String mediaDescription;
    public final String mediaFallbackURL;
    public final String mediaID;
    public final long mediaLastWatchedPositionMs;
    public final String mediaRankingRequestId;
    public final String mediaSource;
    public final long mediaStartPlayPositionMs;
    public final String mediaSubtitle;
    public final String mediaTitle;
    public final int mediaType;
    public final String mediaURL;
    public final boolean ownerIsVerified;
    public final long playableDurationMs;
    public final int tapAction;
    public final String thumbnailURL;
    public final String tracking;

    public static native CowatchMediaModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaModel)) {
                return false;
            }
            CowatchMediaModel cowatchMediaModel = (CowatchMediaModel) obj;
            if (this.mediaID.equals(cowatchMediaModel.mediaID) && this.mediaSource.equals(cowatchMediaModel.mediaSource)) {
                String str = this.mediaURL;
                String str2 = cowatchMediaModel.mediaURL;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.mediaAspectRatio != cowatchMediaModel.mediaAspectRatio) {
                    return false;
                }
                String str3 = this.dashManifest;
                String str4 = cowatchMediaModel.dashManifest;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                if (this.mediaType != cowatchMediaModel.mediaType) {
                    return false;
                }
                String str5 = this.thumbnailURL;
                String str6 = cowatchMediaModel.thumbnailURL;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                String str7 = this.mediaTitle;
                String str8 = cowatchMediaModel.mediaTitle;
                if (str7 == null) {
                    if (str8 != null) {
                        return false;
                    }
                } else if (!str7.equals(str8)) {
                    return false;
                }
                String str9 = this.mediaAuthor;
                String str10 = cowatchMediaModel.mediaAuthor;
                if (str9 == null) {
                    if (str10 != null) {
                        return false;
                    }
                } else if (!str9.equals(str10)) {
                    return false;
                }
                String str11 = this.mediaSubtitle;
                String str12 = cowatchMediaModel.mediaSubtitle;
                if (str11 == null) {
                    if (str12 != null) {
                        return false;
                    }
                } else if (!str11.equals(str12)) {
                    return false;
                }
                String str13 = this.mediaDescription;
                String str14 = cowatchMediaModel.mediaDescription;
                if (str13 == null) {
                    if (str14 != null) {
                        return false;
                    }
                } else if (!str13.equals(str14)) {
                    return false;
                }
                String str15 = this.mediaFallbackURL;
                String str16 = cowatchMediaModel.mediaFallbackURL;
                if (str15 == null) {
                    if (str16 != null) {
                        return false;
                    }
                } else if (!str15.equals(str16)) {
                    return false;
                }
                if (this.expirationTimestampMs != cowatchMediaModel.expirationTimestampMs || this.playableDurationMs != cowatchMediaModel.playableDurationMs || this.mediaLastWatchedPositionMs != cowatchMediaModel.mediaLastWatchedPositionMs || this.ownerIsVerified != cowatchMediaModel.ownerIsVerified || this.isLive != cowatchMediaModel.isLive) {
                    return false;
                }
                String str17 = this.mediaRankingRequestId;
                String str18 = cowatchMediaModel.mediaRankingRequestId;
                if (str17 == null) {
                    if (str18 != null) {
                        return false;
                    }
                } else if (!str17.equals(str18)) {
                    return false;
                }
                if (this.containsLicensedMusic != cowatchMediaModel.containsLicensedMusic) {
                    return false;
                }
                String str19 = this.logInfo;
                String str20 = cowatchMediaModel.logInfo;
                if (str19 == null) {
                    if (str20 != null) {
                        return false;
                    }
                } else if (!str19.equals(str20)) {
                    return false;
                }
                if (this.tapAction != cowatchMediaModel.tapAction) {
                    return false;
                }
                String str21 = this.tracking;
                String str22 = cowatchMediaModel.tracking;
                if (str21 == null) {
                    if (str22 != null) {
                        return false;
                    }
                } else if (!str21.equals(str22)) {
                    return false;
                }
                if (this.mediaStartPlayPositionMs != cowatchMediaModel.mediaStartPlayPositionMs) {
                    return false;
                }
                CowatchExternalMediaConfig cowatchExternalMediaConfig = this.externalMediaConfig;
                CowatchExternalMediaConfig cowatchExternalMediaConfig2 = cowatchMediaModel.externalMediaConfig;
                if (cowatchExternalMediaConfig != null) {
                    if (!cowatchExternalMediaConfig.equals(cowatchExternalMediaConfig2)) {
                        return false;
                    }
                } else if (cowatchExternalMediaConfig2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A07(this.mediaStartPlayPositionMs, (((((((((((((AbstractC167007dF.A07(this.mediaLastWatchedPositionMs, AbstractC167007dF.A07(this.playableDurationMs, AbstractC167007dF.A07(this.expirationTimestampMs, (((((((((((((((((((AbstractC166997dE.A0K(this.mediaSource, AbstractC50523MSb.A02(this.mediaID)) + AbstractC167017dG.A0O(this.mediaURL)) * 31) + Float.floatToIntBits(this.mediaAspectRatio)) * 31) + AbstractC167017dG.A0O(this.dashManifest)) * 31) + this.mediaType) * 31) + AbstractC167017dG.A0O(this.thumbnailURL)) * 31) + AbstractC167017dG.A0O(this.mediaTitle)) * 31) + AbstractC167017dG.A0O(this.mediaAuthor)) * 31) + AbstractC167017dG.A0O(this.mediaSubtitle)) * 31) + AbstractC167017dG.A0O(this.mediaDescription)) * 31) + AbstractC167017dG.A0O(this.mediaFallbackURL)) * 31))) + (this.ownerIsVerified ? 1 : 0)) * 31) + (this.isLive ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.mediaRankingRequestId)) * 31) + (this.containsLicensedMusic ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.logInfo)) * 31) + this.tapAction) * 31) + AbstractC167017dG.A0O(this.tracking)) * 31) + AbstractC166997dE.A0I(this.externalMediaConfig);
    }

    public CowatchMediaModel(String str, String str2, String str3, float f, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, long j, long j2, long j3, boolean z, boolean z2, String str11, boolean z3, String str12, int i2, String str13, long j4, CowatchExternalMediaConfig cowatchExternalMediaConfig) {
        str.getClass();
        str2.getClass();
        this.mediaID = str;
        this.mediaSource = str2;
        this.mediaURL = str3;
        this.mediaAspectRatio = f;
        this.dashManifest = str4;
        this.mediaType = i;
        this.thumbnailURL = str5;
        this.mediaTitle = str6;
        this.mediaAuthor = str7;
        this.mediaSubtitle = str8;
        this.mediaDescription = str9;
        this.mediaFallbackURL = str10;
        this.expirationTimestampMs = j;
        this.playableDurationMs = j2;
        this.mediaLastWatchedPositionMs = j3;
        this.ownerIsVerified = z;
        this.isLive = z2;
        this.mediaRankingRequestId = str11;
        this.containsLicensedMusic = z3;
        this.logInfo = str12;
        this.tapAction = i2;
        this.tracking = str13;
        this.mediaStartPlayPositionMs = j4;
        this.externalMediaConfig = cowatchExternalMediaConfig;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchMediaModel{mediaID=");
        A1C.append(this.mediaID);
        A1C.append(",mediaSource=");
        A1C.append(this.mediaSource);
        A1C.append(",mediaURL=");
        A1C.append(this.mediaURL);
        A1C.append(",mediaAspectRatio=");
        A1C.append(this.mediaAspectRatio);
        A1C.append(",dashManifest=");
        A1C.append(this.dashManifest);
        A1C.append(",mediaType=");
        A1C.append(this.mediaType);
        A1C.append(",thumbnailURL=");
        A1C.append(this.thumbnailURL);
        A1C.append(",mediaTitle=");
        A1C.append(this.mediaTitle);
        A1C.append(",mediaAuthor=");
        A1C.append(this.mediaAuthor);
        A1C.append(",mediaSubtitle=");
        A1C.append(this.mediaSubtitle);
        A1C.append(",mediaDescription=");
        A1C.append(this.mediaDescription);
        A1C.append(",mediaFallbackURL=");
        A1C.append(this.mediaFallbackURL);
        A1C.append(",expirationTimestampMs=");
        A1C.append(this.expirationTimestampMs);
        A1C.append(",playableDurationMs=");
        A1C.append(this.playableDurationMs);
        A1C.append(",mediaLastWatchedPositionMs=");
        A1C.append(this.mediaLastWatchedPositionMs);
        A1C.append(",ownerIsVerified=");
        A1C.append(this.ownerIsVerified);
        A1C.append(",isLive=");
        A1C.append(this.isLive);
        A1C.append(",mediaRankingRequestId=");
        A1C.append(this.mediaRankingRequestId);
        A1C.append(",containsLicensedMusic=");
        A1C.append(this.containsLicensedMusic);
        A1C.append(",logInfo=");
        A1C.append(this.logInfo);
        A1C.append(",tapAction=");
        A1C.append(this.tapAction);
        A1C.append(",tracking=");
        A1C.append(this.tracking);
        A1C.append(",mediaStartPlayPositionMs=");
        A1C.append(this.mediaStartPlayPositionMs);
        A1C.append(",externalMediaConfig=");
        return JQ0.A0l(this.externalMediaConfig, A1C);
    }
}
