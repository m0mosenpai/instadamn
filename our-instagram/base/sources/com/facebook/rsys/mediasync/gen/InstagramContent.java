package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class InstagramContent {
    public static C2N9 CONVERTER = C55648OnZ.A00(45);
    public static long sMcfTypeId;
    public final AudioAttribution audioAttribution;
    public final ArrayList carousel;
    public final String contentId;
    public final ArrayList images;
    public final int mediaType;
    public final InstagramContentOwner owner;
    public final int productType;
    public final String thumbnailUrl;
    public final String trackingToken;
    public final Video video;

    public static native InstagramContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InstagramContent)) {
                return false;
            }
            InstagramContent instagramContent = (InstagramContent) obj;
            if (this.contentId.equals(instagramContent.contentId) && this.owner.equals(instagramContent.owner) && this.mediaType == instagramContent.mediaType && this.productType == instagramContent.productType && this.thumbnailUrl.equals(instagramContent.thumbnailUrl)) {
                ArrayList arrayList = this.images;
                ArrayList arrayList2 = instagramContent.images;
                if (arrayList == null) {
                    if (arrayList2 != null) {
                        return false;
                    }
                } else if (!arrayList.equals(arrayList2)) {
                    return false;
                }
                Video video = this.video;
                Video video2 = instagramContent.video;
                if (video == null) {
                    if (video2 != null) {
                        return false;
                    }
                } else if (!video.equals(video2)) {
                    return false;
                }
                ArrayList arrayList3 = this.carousel;
                ArrayList arrayList4 = instagramContent.carousel;
                if (arrayList3 == null) {
                    if (arrayList4 != null) {
                        return false;
                    }
                } else if (!arrayList3.equals(arrayList4)) {
                    return false;
                }
                AudioAttribution audioAttribution = this.audioAttribution;
                AudioAttribution audioAttribution2 = instagramContent.audioAttribution;
                if (audioAttribution == null) {
                    if (audioAttribution2 != null) {
                        return false;
                    }
                } else if (!audioAttribution.equals(audioAttribution2)) {
                    return false;
                }
                String str = this.trackingToken;
                String str2 = instagramContent.trackingToken;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AbstractC166997dE.A0K(this.thumbnailUrl, (((AbstractC166997dE.A0J(this.owner, AbstractC50523MSb.A02(this.contentId)) + this.mediaType) * 31) + this.productType) * 31) + AbstractC167017dG.A0M(this.images)) * 31) + AbstractC167017dG.A0M(this.video)) * 31) + AbstractC167017dG.A0M(this.carousel)) * 31) + AbstractC167017dG.A0M(this.audioAttribution)) * 31) + AbstractC25227BEk.A07(this.trackingToken);
    }

    public InstagramContent(String str, InstagramContentOwner instagramContentOwner, int i, int i2, String str2, ArrayList arrayList, Video video, ArrayList arrayList2, AudioAttribution audioAttribution, String str3) {
        AbstractC31180DnO.A1U(str, instagramContentOwner, str2);
        this.contentId = str;
        this.owner = instagramContentOwner;
        this.mediaType = i;
        this.productType = i2;
        this.thumbnailUrl = str2;
        this.images = arrayList;
        this.video = video;
        this.carousel = arrayList2;
        this.audioAttribution = audioAttribution;
        this.trackingToken = str3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("InstagramContent{contentId=");
        A1C.append(this.contentId);
        A1C.append(",owner=");
        A1C.append(this.owner);
        A1C.append(",mediaType=");
        A1C.append(this.mediaType);
        A1C.append(",productType=");
        A1C.append(this.productType);
        A1C.append(",thumbnailUrl=");
        A1C.append(this.thumbnailUrl);
        A1C.append(",images=");
        A1C.append(this.images);
        A1C.append(",video=");
        A1C.append(this.video);
        A1C.append(",carousel=");
        A1C.append(this.carousel);
        A1C.append(",audioAttribution=");
        A1C.append(this.audioAttribution);
        A1C.append(",trackingToken=");
        return AbstractC50523MSb.A0W(this.trackingToken, A1C);
    }
}
