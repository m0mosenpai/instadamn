package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.C9xU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes4.dex */
public final class StoryTemplateGiphyStickerDict extends C0T6 implements Parcelable, StoryTemplateGiphyStickerDictIntf {
    public static final Parcelable.Creator CREATOR = new C206139Av(22);
    public final StoryTemplateGiphyStickerImageDict A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final StoryTemplateGiphyStickerDict F26() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateGiphyStickerDict) {
                StoryTemplateGiphyStickerDict storyTemplateGiphyStickerDict = (StoryTemplateGiphyStickerDict) obj;
                if (!C14360o3.A0K(this.A01, storyTemplateGiphyStickerDict.A01) || !C14360o3.A0K(this.A00, storyTemplateGiphyStickerDict.A00) || !C14360o3.A0K(this.A02, storyTemplateGiphyStickerDict.A02) || !C14360o3.A0K(this.A03, storyTemplateGiphyStickerDict.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict = this.A00;
        int hashCode2 = (hashCode + (storyTemplateGiphyStickerImageDict == null ? 0 : storyTemplateGiphyStickerImageDict.hashCode())) * 31;
        String str2 = this.A02;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final String B9l() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final /* bridge */ /* synthetic */ StoryTemplateGiphyStickerImageDictIntf BGT() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateGiphyStickerDict", C9xU.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final String getTitle() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final String getUsername() {
        return this.A03;
    }

    public StoryTemplateGiphyStickerDict(StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict, String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = storyTemplateGiphyStickerImageDict;
        this.A02 = str2;
        this.A03 = str3;
    }
}
