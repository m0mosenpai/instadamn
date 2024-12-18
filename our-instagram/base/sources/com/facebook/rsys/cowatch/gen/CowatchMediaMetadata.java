package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CowatchMediaMetadata {
    public final boolean containsLicensedMusic;
    public final String contentRating;
    public final String dashManifest;
    public final long durationMs;
    public final boolean isLive;
    public final boolean isReel;
    public final boolean isReportable;
    public final float mediaAspectRatio;
    public final String mediaSubtitle;
    public final String mediaTitle;
    public final String mediaURL;
    public final String ownerAvatarURL;
    public final String ownerName;
    public final CowatchReelsMediaInfoModel reelsMediaMetadata;

    public static native CowatchMediaMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaMetadata)) {
                return false;
            }
            CowatchMediaMetadata cowatchMediaMetadata = (CowatchMediaMetadata) obj;
            String str = this.mediaURL;
            String str2 = cowatchMediaMetadata.mediaURL;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.dashManifest;
            String str4 = cowatchMediaMetadata.dashManifest;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.isLive != cowatchMediaMetadata.isLive || this.durationMs != cowatchMediaMetadata.durationMs || this.mediaAspectRatio != cowatchMediaMetadata.mediaAspectRatio) {
                return false;
            }
            String str5 = this.mediaTitle;
            String str6 = cowatchMediaMetadata.mediaTitle;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.mediaSubtitle;
            String str8 = cowatchMediaMetadata.mediaSubtitle;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            if (this.containsLicensedMusic != cowatchMediaMetadata.containsLicensedMusic || this.isReportable != cowatchMediaMetadata.isReportable) {
                return false;
            }
            String str9 = this.contentRating;
            String str10 = cowatchMediaMetadata.contentRating;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            if (this.isReel != cowatchMediaMetadata.isReel) {
                return false;
            }
            String str11 = this.ownerName;
            String str12 = cowatchMediaMetadata.ownerName;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            String str13 = this.ownerAvatarURL;
            String str14 = cowatchMediaMetadata.ownerAvatarURL;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel = this.reelsMediaMetadata;
            CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel2 = cowatchMediaMetadata.reelsMediaMetadata;
            if (cowatchReelsMediaInfoModel != null) {
                if (!cowatchReelsMediaInfoModel.equals(cowatchReelsMediaInfoModel2)) {
                    return false;
                }
            } else if (cowatchReelsMediaInfoModel2 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((AbstractC25236BEt.A01(this.durationMs, (((JQ0.A01(AbstractC167017dG.A0O(this.mediaURL)) + AbstractC167017dG.A0O(this.dashManifest)) * 31) + (this.isLive ? 1 : 0)) * 31) + Float.floatToIntBits(this.mediaAspectRatio)) * 31) + AbstractC167017dG.A0O(this.mediaTitle)) * 31) + AbstractC167017dG.A0O(this.mediaSubtitle)) * 31) + (this.containsLicensedMusic ? 1 : 0)) * 31) + (this.isReportable ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.contentRating)) * 31) + (this.isReel ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.ownerName)) * 31) + AbstractC167017dG.A0O(this.ownerAvatarURL)) * 31) + AbstractC166997dE.A0I(this.reelsMediaMetadata);
    }

    public CowatchMediaMetadata(String str, String str2, boolean z, long j, float f, String str3, String str4, boolean z2, boolean z3, String str5, boolean z4, String str6, String str7, CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel) {
        this.mediaURL = str;
        this.dashManifest = str2;
        this.isLive = z;
        this.durationMs = j;
        this.mediaAspectRatio = f;
        this.mediaTitle = str3;
        this.mediaSubtitle = str4;
        this.containsLicensedMusic = z2;
        this.isReportable = z3;
        this.contentRating = str5;
        this.isReel = z4;
        this.ownerName = str6;
        this.ownerAvatarURL = str7;
        this.reelsMediaMetadata = cowatchReelsMediaInfoModel;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchMediaMetadata{mediaURL=");
        A1C.append(this.mediaURL);
        A1C.append(",dashManifest=");
        A1C.append(this.dashManifest);
        A1C.append(",isLive=");
        A1C.append(this.isLive);
        A1C.append(",durationMs=");
        A1C.append(this.durationMs);
        A1C.append(",mediaAspectRatio=");
        A1C.append(this.mediaAspectRatio);
        A1C.append(",mediaTitle=");
        A1C.append(this.mediaTitle);
        A1C.append(",mediaSubtitle=");
        A1C.append(this.mediaSubtitle);
        A1C.append(",containsLicensedMusic=");
        A1C.append(this.containsLicensedMusic);
        A1C.append(",isReportable=");
        A1C.append(this.isReportable);
        A1C.append(",contentRating=");
        A1C.append(this.contentRating);
        A1C.append(",isReel=");
        A1C.append(this.isReel);
        A1C.append(",ownerName=");
        A1C.append(this.ownerName);
        A1C.append(",ownerAvatarURL=");
        A1C.append(this.ownerAvatarURL);
        A1C.append(",reelsMediaMetadata=");
        return JQ0.A0l(this.reelsMediaMetadata, A1C);
    }
}
