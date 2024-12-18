package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import X.C9xQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class StoryTemplateAvatarStickerOverlayDictImpl extends C0T6 implements StoryTemplateAvatarStickerOverlayDict, Parcelable {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(26);
    public final Float A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final StoryTemplateAvatarStickerOverlayDictImpl F20() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateAvatarStickerOverlayDictImpl) {
                StoryTemplateAvatarStickerOverlayDictImpl storyTemplateAvatarStickerOverlayDictImpl = (StoryTemplateAvatarStickerOverlayDictImpl) obj;
                if (!C14360o3.A0K(this.A06, storyTemplateAvatarStickerOverlayDictImpl.A06) || !C14360o3.A0K(this.A00, storyTemplateAvatarStickerOverlayDictImpl.A00) || !C14360o3.A0K(this.A07, storyTemplateAvatarStickerOverlayDictImpl.A07) || !C14360o3.A0K(this.A08, storyTemplateAvatarStickerOverlayDictImpl.A08) || !C14360o3.A0K(this.A01, storyTemplateAvatarStickerOverlayDictImpl.A01) || !C14360o3.A0K(this.A02, storyTemplateAvatarStickerOverlayDictImpl.A02) || !C14360o3.A0K(this.A03, storyTemplateAvatarStickerOverlayDictImpl.A03) || !C14360o3.A0K(this.A04, storyTemplateAvatarStickerOverlayDictImpl.A04) || !C14360o3.A0K(this.A05, storyTemplateAvatarStickerOverlayDictImpl.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        AbstractC167027dH.A0m(parcel, this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        AbstractC167027dH.A0m(parcel, this.A01);
        AbstractC167027dH.A0m(parcel, this.A02);
        AbstractC167027dH.A0m(parcel, this.A03);
        AbstractC167027dH.A0m(parcel, this.A04);
        AbstractC167027dH.A0o(parcel, this.A05, 0, 1);
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final String B3Q() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Float BDR() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final String BIf() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Float Bpa() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Float CHf() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Float CI1() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Float CIa() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Integer CIi() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryTemplateAvatarStickerOverlayDict", C9xQ.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final String getMediaType() {
        return this.A08;
    }

    public final int hashCode() {
        return (((((((((((((((AbstractC167017dG.A0O(this.A06) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A05);
    }

    public StoryTemplateAvatarStickerOverlayDictImpl(Float f, Float f2, Float f3, Float f4, Float f5, Integer num, String str, String str2, String str3) {
        this.A06 = str;
        this.A00 = f;
        this.A07 = str2;
        this.A08 = str3;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = num;
    }
}
