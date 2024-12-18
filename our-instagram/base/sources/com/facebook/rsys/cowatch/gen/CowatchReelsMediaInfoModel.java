package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class CowatchReelsMediaInfoModel {
    public static C2N9 CONVERTER = new LSW(4);
    public static long sMcfTypeId;
    public final String commentCount;
    public final String effectsTitle;
    public final String effectsUri;
    public final ArrayList hashtags;
    public final boolean isViewerLiked;
    public final String likeCount;
    public final String musicAlbumArtUri;
    public final String musicTitle;
    public final String privacyScopeImage;
    public final String privacyScopeLabel;
    public final int reelsMediaSource;
    public final String shareCount;

    public static native CowatchReelsMediaInfoModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchReelsMediaInfoModel)) {
                return false;
            }
            CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel = (CowatchReelsMediaInfoModel) obj;
            String str = this.musicTitle;
            String str2 = cowatchReelsMediaInfoModel.musicTitle;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.musicAlbumArtUri;
            String str4 = cowatchReelsMediaInfoModel.musicAlbumArtUri;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.effectsTitle;
            String str6 = cowatchReelsMediaInfoModel.effectsTitle;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.effectsUri;
            String str8 = cowatchReelsMediaInfoModel.effectsUri;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            if (!this.hashtags.equals(cowatchReelsMediaInfoModel.hashtags)) {
                return false;
            }
            String str9 = this.privacyScopeLabel;
            String str10 = cowatchReelsMediaInfoModel.privacyScopeLabel;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.privacyScopeImage;
            String str12 = cowatchReelsMediaInfoModel.privacyScopeImage;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            if (this.reelsMediaSource != cowatchReelsMediaInfoModel.reelsMediaSource) {
                return false;
            }
            String str13 = this.likeCount;
            String str14 = cowatchReelsMediaInfoModel.likeCount;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.commentCount;
            String str16 = cowatchReelsMediaInfoModel.commentCount;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            String str17 = this.shareCount;
            String str18 = cowatchReelsMediaInfoModel.shareCount;
            if (str17 != null) {
                if (!str17.equals(str18)) {
                    return false;
                }
            } else if (str18 != null) {
                return false;
            }
            if (this.isViewerLiked != cowatchReelsMediaInfoModel.isViewerLiked) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((AbstractC166997dE.A0J(this.hashtags, (((((JQ0.A01(AbstractC167017dG.A0O(this.musicTitle)) + AbstractC167017dG.A0O(this.musicAlbumArtUri)) * 31) + AbstractC167017dG.A0O(this.effectsTitle)) * 31) + AbstractC167017dG.A0O(this.effectsUri)) * 31) + AbstractC167017dG.A0O(this.privacyScopeLabel)) * 31) + AbstractC167017dG.A0O(this.privacyScopeImage)) * 31) + this.reelsMediaSource) * 31) + AbstractC167017dG.A0O(this.likeCount)) * 31) + AbstractC167017dG.A0O(this.commentCount)) * 31) + AbstractC25227BEk.A07(this.shareCount)) * 31) + (this.isViewerLiked ? 1 : 0);
    }

    public CowatchReelsMediaInfoModel(String str, String str2, String str3, String str4, ArrayList arrayList, String str5, String str6, int i, String str7, String str8, String str9, boolean z) {
        arrayList.getClass();
        this.musicTitle = str;
        this.musicAlbumArtUri = str2;
        this.effectsTitle = str3;
        this.effectsUri = str4;
        this.hashtags = arrayList;
        this.privacyScopeLabel = str5;
        this.privacyScopeImage = str6;
        this.reelsMediaSource = i;
        this.likeCount = str7;
        this.commentCount = str8;
        this.shareCount = str9;
        this.isViewerLiked = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchReelsMediaInfoModel{musicTitle=");
        A1C.append(this.musicTitle);
        A1C.append(",musicAlbumArtUri=");
        A1C.append(this.musicAlbumArtUri);
        A1C.append(",effectsTitle=");
        A1C.append(this.effectsTitle);
        A1C.append(",effectsUri=");
        A1C.append(this.effectsUri);
        A1C.append(",hashtags=");
        A1C.append(this.hashtags);
        A1C.append(",privacyScopeLabel=");
        A1C.append(this.privacyScopeLabel);
        A1C.append(",privacyScopeImage=");
        A1C.append(this.privacyScopeImage);
        A1C.append(",reelsMediaSource=");
        A1C.append(this.reelsMediaSource);
        A1C.append(",likeCount=");
        A1C.append(this.likeCount);
        A1C.append(",commentCount=");
        A1C.append(this.commentCount);
        A1C.append(",shareCount=");
        A1C.append(this.shareCount);
        A1C.append(",isViewerLiked=");
        A1C.append(this.isViewerLiked);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
