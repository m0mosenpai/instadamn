package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.C9xV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes4.dex */
public final class StoryTemplateGiphyStickerImageDict extends C0T6 implements Parcelable, StoryTemplateGiphyStickerImageDictIntf {
    public static final Parcelable.Creator CREATOR = new C206139Av(23);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final StoryTemplateGiphyStickerImageDict F27() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateGiphyStickerImageDict) {
                StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict = (StoryTemplateGiphyStickerImageDict) obj;
                if (!C14360o3.A0K(this.A00, storyTemplateGiphyStickerImageDict.A00) || !C14360o3.A0K(this.A01, storyTemplateGiphyStickerImageDict.A01) || !C14360o3.A0K(this.A02, storyTemplateGiphyStickerImageDict.A02) || !C14360o3.A0K(this.A03, storyTemplateGiphyStickerImageDict.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A03;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final String BDT() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final String BV6() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final String CHh() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateGiphyStickerImageDict", C9xV.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final String getUrl() {
        return this.A02;
    }

    public StoryTemplateGiphyStickerImageDict(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
