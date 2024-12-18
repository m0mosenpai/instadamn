package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes9.dex */
public final class ReelsData extends C0T6 {

    @SerializedName("author")
    public final String author;

    @SerializedName("avatar_url")
    public final String profilePictureUrl;

    @SerializedName("reels_url")
    public final String reelsUrl;

    @SerializedName("thumbnail_url")
    public final String thumbnailUrl;

    public final String component1() {
        return this.reelsUrl;
    }

    public final String component2() {
        return this.thumbnailUrl;
    }

    public final String component3() {
        return this.author;
    }

    public final String component4() {
        return this.profilePictureUrl;
    }

    public final ReelsData copy(String str, String str2, String str3, String str4) {
        return new ReelsData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReelsData) {
                ReelsData reelsData = (ReelsData) obj;
                if (!C14360o3.A0K(this.reelsUrl, reelsData.reelsUrl) || !C14360o3.A0K(this.thumbnailUrl, reelsData.thumbnailUrl) || !C14360o3.A0K(this.author, reelsData.author) || !C14360o3.A0K(this.profilePictureUrl, reelsData.profilePictureUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return AnonymousClass001.A17("ReelsData(reelsUrl=", this.reelsUrl, ", thumbnailUrl=", this.thumbnailUrl, ", author=", this.author, ", profilePictureUrl=", this.profilePictureUrl, ')');
    }

    public static /* synthetic */ ReelsData copy$default(ReelsData reelsData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reelsData.reelsUrl;
        }
        if ((i & 2) != 0) {
            str2 = reelsData.thumbnailUrl;
        }
        if ((i & 4) != 0) {
            str3 = reelsData.author;
        }
        if ((i & 8) != 0) {
            str4 = reelsData.profilePictureUrl;
        }
        return new ReelsData(str, str2, str3, str4);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final String getReelsUrl() {
        return this.reelsUrl;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return (((((AbstractC167017dG.A0O(this.reelsUrl) * 31) + AbstractC167017dG.A0O(this.thumbnailUrl)) * 31) + AbstractC167017dG.A0O(this.author)) * 31) + AbstractC25227BEk.A07(this.profilePictureUrl);
    }

    public ReelsData(String str, String str2, String str3, String str4) {
        this.reelsUrl = str;
        this.thumbnailUrl = str2;
        this.author = str3;
        this.profilePictureUrl = str4;
    }
}
