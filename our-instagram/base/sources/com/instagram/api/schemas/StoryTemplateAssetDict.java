package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.C9xP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;

/* loaded from: classes2.dex */
public final class StoryTemplateAssetDict extends C0T6 implements StoryTemplateAssetDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(18);
    public final ImageInfo A00;
    public final ImageInfo A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final StoryTemplateAssetDict F1z() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateAssetDict) {
                StoryTemplateAssetDict storyTemplateAssetDict = (StoryTemplateAssetDict) obj;
                if (!C14360o3.A0K(this.A05, storyTemplateAssetDict.A05) || !C14360o3.A0K(this.A00, storyTemplateAssetDict.A00) || !C14360o3.A0K(this.A01, storyTemplateAssetDict.A01) || !C14360o3.A0K(this.A02, storyTemplateAssetDict.A02) || !C14360o3.A0K(this.A03, storyTemplateAssetDict.A03) || !C14360o3.A0K(this.A06, storyTemplateAssetDict.A06) || !C14360o3.A0K(this.A07, storyTemplateAssetDict.A07) || !C14360o3.A0K(this.A04, storyTemplateAssetDict.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A05;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ImageInfo imageInfo = this.A00;
        int hashCode2 = (hashCode + (imageInfo == null ? 0 : imageInfo.hashCode())) * 31;
        ImageInfo imageInfo2 = this.A01;
        int hashCode3 = (hashCode2 + (imageInfo2 == null ? 0 : imageInfo2.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.A03;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A07;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.A04;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        Boolean bool = this.A02;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        Integer num2 = this.A04;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final String Af3() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final ImageInfo Af9() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final ImageInfo BGx() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final Integer BdG() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final String C5j() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final Integer CIi() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final Boolean CaM() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateAssetDict", C9xP.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final String getPk() {
        return this.A06;
    }

    public StoryTemplateAssetDict(ImageInfo imageInfo, ImageInfo imageInfo2, Boolean bool, Integer num, Integer num2, String str, String str2, String str3) {
        this.A05 = str;
        this.A00 = imageInfo;
        this.A01 = imageInfo2;
        this.A02 = bool;
        this.A03 = num;
        this.A06 = str2;
        this.A07 = str3;
        this.A04 = num2;
    }
}
