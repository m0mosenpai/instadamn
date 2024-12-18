package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.MSV;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class CowatchMediaInfoModel {
    public static C2N9 CONVERTER = YAN.A00(34);
    public static long sMcfTypeId;
    public final ArrayList captionAvailableLanguages;
    public final boolean containsLicensedMusic;
    public final String contentRating;
    public final String dashManifest;
    public final long durationMs;
    public final long expirationTimestampMs;
    public final boolean isLive;
    public final boolean isNonInteractable;
    public final boolean isReel;
    public final boolean isReportable;
    public final float mediaAspectRatio;
    public final String mediaFallbackURL;
    public final String mediaID;
    public final String mediaSource;
    public final String mediaSubtitle;
    public final String mediaTitle;
    public final int mediaType;
    public final String mediaURL;
    public final String ownerAvatarURL;
    public final String ownerId;
    public final String ownerName;
    public final String placeholderMessage;
    public final String placeholderTitle;
    public final CowatchReelsMediaInfoModel reelsMediaInfoModel;
    public final String thumbnailFallbackUrl;
    public final String thumbnailUrl;
    public final long thumbnailUrlExpirationTimestampMs;
    public final String tracking;

    public static native CowatchMediaInfoModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaInfoModel)) {
                return false;
            }
            CowatchMediaInfoModel cowatchMediaInfoModel = (CowatchMediaInfoModel) obj;
            if (this.mediaID.equals(cowatchMediaInfoModel.mediaID) && this.mediaSource.equals(cowatchMediaInfoModel.mediaSource)) {
                String str = this.mediaURL;
                String str2 = cowatchMediaInfoModel.mediaURL;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.mediaAspectRatio != cowatchMediaInfoModel.mediaAspectRatio) {
                    return false;
                }
                String str3 = this.dashManifest;
                String str4 = cowatchMediaInfoModel.dashManifest;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.mediaFallbackURL;
                String str6 = cowatchMediaInfoModel.mediaFallbackURL;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                String str7 = this.ownerName;
                String str8 = cowatchMediaInfoModel.ownerName;
                if (str7 == null) {
                    if (str8 != null) {
                        return false;
                    }
                } else if (!str7.equals(str8)) {
                    return false;
                }
                String str9 = this.ownerAvatarURL;
                String str10 = cowatchMediaInfoModel.ownerAvatarURL;
                if (str9 == null) {
                    if (str10 != null) {
                        return false;
                    }
                } else if (!str9.equals(str10)) {
                    return false;
                }
                String str11 = this.ownerId;
                String str12 = cowatchMediaInfoModel.ownerId;
                if (str11 == null) {
                    if (str12 != null) {
                        return false;
                    }
                } else if (!str11.equals(str12)) {
                    return false;
                }
                if (this.expirationTimestampMs != cowatchMediaInfoModel.expirationTimestampMs) {
                    return false;
                }
                String str13 = this.mediaTitle;
                String str14 = cowatchMediaInfoModel.mediaTitle;
                if (str13 == null) {
                    if (str14 != null) {
                        return false;
                    }
                } else if (!str13.equals(str14)) {
                    return false;
                }
                String str15 = this.mediaSubtitle;
                String str16 = cowatchMediaInfoModel.mediaSubtitle;
                if (str15 == null) {
                    if (str16 != null) {
                        return false;
                    }
                } else if (!str15.equals(str16)) {
                    return false;
                }
                String str17 = this.placeholderTitle;
                String str18 = cowatchMediaInfoModel.placeholderTitle;
                if (str17 == null) {
                    if (str18 != null) {
                        return false;
                    }
                } else if (!str17.equals(str18)) {
                    return false;
                }
                String str19 = this.placeholderMessage;
                String str20 = cowatchMediaInfoModel.placeholderMessage;
                if (str19 == null) {
                    if (str20 != null) {
                        return false;
                    }
                } else if (!str19.equals(str20)) {
                    return false;
                }
                String str21 = this.thumbnailUrl;
                String str22 = cowatchMediaInfoModel.thumbnailUrl;
                if (str21 == null) {
                    if (str22 != null) {
                        return false;
                    }
                } else if (!str21.equals(str22)) {
                    return false;
                }
                String str23 = this.thumbnailFallbackUrl;
                String str24 = cowatchMediaInfoModel.thumbnailFallbackUrl;
                if (str23 == null) {
                    if (str24 != null) {
                        return false;
                    }
                } else if (!str23.equals(str24)) {
                    return false;
                }
                if (this.thumbnailUrlExpirationTimestampMs != cowatchMediaInfoModel.thumbnailUrlExpirationTimestampMs || this.isLive != cowatchMediaInfoModel.isLive || this.durationMs != cowatchMediaInfoModel.durationMs || !this.captionAvailableLanguages.equals(cowatchMediaInfoModel.captionAvailableLanguages) || this.mediaType != cowatchMediaInfoModel.mediaType || this.isNonInteractable != cowatchMediaInfoModel.isNonInteractable || this.containsLicensedMusic != cowatchMediaInfoModel.containsLicensedMusic) {
                    return false;
                }
                String str25 = this.contentRating;
                String str26 = cowatchMediaInfoModel.contentRating;
                if (str25 == null) {
                    if (str26 != null) {
                        return false;
                    }
                } else if (!str25.equals(str26)) {
                    return false;
                }
                if (this.isReportable != cowatchMediaInfoModel.isReportable) {
                    return false;
                }
                String str27 = this.tracking;
                String str28 = cowatchMediaInfoModel.tracking;
                if (str27 == null) {
                    if (str28 != null) {
                        return false;
                    }
                } else if (!str27.equals(str28)) {
                    return false;
                }
                if (this.isReel != cowatchMediaInfoModel.isReel) {
                    return false;
                }
                CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel = this.reelsMediaInfoModel;
                CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel2 = cowatchMediaInfoModel.reelsMediaInfoModel;
                if (cowatchReelsMediaInfoModel != null) {
                    if (!cowatchReelsMediaInfoModel.equals(cowatchReelsMediaInfoModel2)) {
                        return false;
                    }
                } else if (cowatchReelsMediaInfoModel2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((AbstractC166997dE.A0J(this.captionAvailableLanguages, AbstractC167007dF.A07(this.durationMs, (AbstractC167007dF.A07(this.thumbnailUrlExpirationTimestampMs, (((((((((((AbstractC167007dF.A07(this.expirationTimestampMs, (((((((((((((AbstractC166997dE.A0K(this.mediaSource, AbstractC50523MSb.A02(this.mediaID)) + AbstractC167017dG.A0O(this.mediaURL)) * 31) + Float.floatToIntBits(this.mediaAspectRatio)) * 31) + AbstractC167017dG.A0O(this.dashManifest)) * 31) + AbstractC167017dG.A0O(this.mediaFallbackURL)) * 31) + AbstractC167017dG.A0O(this.ownerName)) * 31) + AbstractC167017dG.A0O(this.ownerAvatarURL)) * 31) + AbstractC167017dG.A0O(this.ownerId)) * 31) + AbstractC167017dG.A0O(this.mediaTitle)) * 31) + AbstractC167017dG.A0O(this.mediaSubtitle)) * 31) + AbstractC167017dG.A0O(this.placeholderTitle)) * 31) + AbstractC167017dG.A0O(this.placeholderMessage)) * 31) + AbstractC167017dG.A0O(this.thumbnailUrl)) * 31) + AbstractC167017dG.A0O(this.thumbnailFallbackUrl)) * 31) + (this.isLive ? 1 : 0)) * 31)) + this.mediaType) * 31) + (this.isNonInteractable ? 1 : 0)) * 31) + (this.containsLicensedMusic ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.contentRating)) * 31) + (this.isReportable ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.tracking)) * 31) + (this.isReel ? 1 : 0)) * 31) + AbstractC166997dE.A0I(this.reelsMediaInfoModel);
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchMediaInfoModel{mediaID=");
        A1C.append(this.mediaID);
        A1C.append(",mediaSource=");
        A1C.append(this.mediaSource);
        A1C.append(",mediaURL=");
        A1C.append(this.mediaURL);
        A1C.append(",mediaAspectRatio=");
        A1C.append(this.mediaAspectRatio);
        A1C.append(",dashManifest=");
        A1C.append(this.dashManifest);
        A1C.append(",mediaFallbackURL=");
        A1C.append(this.mediaFallbackURL);
        A1C.append(",ownerName=");
        A1C.append(this.ownerName);
        A1C.append(",ownerAvatarURL=");
        A1C.append(this.ownerAvatarURL);
        A1C.append(",ownerId=");
        A1C.append(this.ownerId);
        A1C.append(",expirationTimestampMs=");
        A1C.append(this.expirationTimestampMs);
        A1C.append(",mediaTitle=");
        A1C.append(this.mediaTitle);
        A1C.append(",mediaSubtitle=");
        A1C.append(this.mediaSubtitle);
        A1C.append(",placeholderTitle=");
        A1C.append(this.placeholderTitle);
        A1C.append(",placeholderMessage=");
        A1C.append(this.placeholderMessage);
        A1C.append(MSV.A00(654));
        A1C.append(this.thumbnailUrl);
        A1C.append(",thumbnailFallbackUrl=");
        A1C.append(this.thumbnailFallbackUrl);
        A1C.append(",thumbnailUrlExpirationTimestampMs=");
        A1C.append(this.thumbnailUrlExpirationTimestampMs);
        A1C.append(",isLive=");
        A1C.append(this.isLive);
        A1C.append(",durationMs=");
        A1C.append(this.durationMs);
        A1C.append(",captionAvailableLanguages=");
        A1C.append(this.captionAvailableLanguages);
        A1C.append(",mediaType=");
        A1C.append(this.mediaType);
        A1C.append(",isNonInteractable=");
        A1C.append(this.isNonInteractable);
        A1C.append(",containsLicensedMusic=");
        A1C.append(this.containsLicensedMusic);
        A1C.append(",contentRating=");
        A1C.append(this.contentRating);
        A1C.append(",isReportable=");
        A1C.append(this.isReportable);
        A1C.append(",tracking=");
        A1C.append(this.tracking);
        A1C.append(",isReel=");
        A1C.append(this.isReel);
        A1C.append(",reelsMediaInfoModel=");
        return JQ0.A0l(this.reelsMediaInfoModel, A1C);
    }

    public CowatchMediaInfoModel(String str, String str2, String str3, float f, String str4, String str5, String str6, String str7, String str8, long j, String str9, String str10, String str11, String str12, String str13, String str14, long j2, boolean z, long j3, ArrayList arrayList, int i, boolean z2, boolean z3, String str15, boolean z4, String str16, boolean z5, CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel) {
        AbstractC31180DnO.A1U(str, str2, arrayList);
        this.mediaID = str;
        this.mediaSource = str2;
        this.mediaURL = str3;
        this.mediaAspectRatio = f;
        this.dashManifest = str4;
        this.mediaFallbackURL = str5;
        this.ownerName = str6;
        this.ownerAvatarURL = str7;
        this.ownerId = str8;
        this.expirationTimestampMs = j;
        this.mediaTitle = str9;
        this.mediaSubtitle = str10;
        this.placeholderTitle = str11;
        this.placeholderMessage = str12;
        this.thumbnailUrl = str13;
        this.thumbnailFallbackUrl = str14;
        this.thumbnailUrlExpirationTimestampMs = j2;
        this.isLive = z;
        this.durationMs = j3;
        this.captionAvailableLanguages = arrayList;
        this.mediaType = i;
        this.isNonInteractable = z2;
        this.containsLicensedMusic = z3;
        this.contentRating = str15;
        this.isReportable = z4;
        this.tracking = str16;
        this.isReel = z5;
        this.reelsMediaInfoModel = cowatchReelsMediaInfoModel;
    }
}
