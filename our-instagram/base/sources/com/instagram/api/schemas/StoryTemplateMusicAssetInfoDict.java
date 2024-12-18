package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import X.C9xW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class StoryTemplateMusicAssetInfoDict extends C0T6 implements Parcelable, StoryTemplateMusicAssetInfoDictIntf {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(30);
    public final MusicCanonicalType A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final StoryTemplateMusicAssetInfoDict F28() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateMusicAssetInfoDict) {
                StoryTemplateMusicAssetInfoDict storyTemplateMusicAssetInfoDict = (StoryTemplateMusicAssetInfoDict) obj;
                if (this.A00 != storyTemplateMusicAssetInfoDict.A00 || !C14360o3.A0K(this.A04, storyTemplateMusicAssetInfoDict.A04) || !C14360o3.A0K(this.A05, storyTemplateMusicAssetInfoDict.A05) || !C14360o3.A0K(this.A03, storyTemplateMusicAssetInfoDict.A03) || !C14360o3.A0K(this.A01, storyTemplateMusicAssetInfoDict.A01) || !C14360o3.A0K(this.A02, storyTemplateMusicAssetInfoDict.A02) || !C14360o3.A0K(this.A06, storyTemplateMusicAssetInfoDict.A06) || !C14360o3.A0K(this.A07, storyTemplateMusicAssetInfoDict.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        AbstractC31179DnN.A0p(parcel, this.A01);
        AbstractC31179DnN.A0p(parcel, this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final MusicCanonicalType Ae6() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final Integer Azi() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final Boolean BC4() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final Boolean CU4() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryTemplateMusicAssetInfoDict", C9xW.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final String getCoverArtworkThumbnailUri() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final String getCoverArtworkUri() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final String getProgressiveDownloadUrl() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final String getTitle() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A07);
    }

    public StoryTemplateMusicAssetInfoDict(MusicCanonicalType musicCanonicalType, Boolean bool, Boolean bool2, Integer num, String str, String str2, String str3, String str4) {
        this.A00 = musicCanonicalType;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = num;
        this.A01 = bool;
        this.A02 = bool2;
        this.A06 = str3;
        this.A07 = str4;
    }
}
