package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C22953A9x;
import X.C41857IgB;
import X.C9xS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes4.dex */
public final class StoryTemplateFillableGalleryStickerDictImpl extends C0T6 implements StoryTemplateFillableGalleryStickerDict, Parcelable {
    public static final Parcelable.Creator CREATOR = new C41857IgB(27);
    public final StoryTemplateFillableGalleryStickerShapes A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;
    public final Float A05;
    public final Integer A06;

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final StoryTemplateFillableGalleryStickerDictImpl F23() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateFillableGalleryStickerDictImpl) {
                StoryTemplateFillableGalleryStickerDictImpl storyTemplateFillableGalleryStickerDictImpl = (StoryTemplateFillableGalleryStickerDictImpl) obj;
                if (this.A00 != storyTemplateFillableGalleryStickerDictImpl.A00 || !C14360o3.A0K(this.A01, storyTemplateFillableGalleryStickerDictImpl.A01) || !C14360o3.A0K(this.A02, storyTemplateFillableGalleryStickerDictImpl.A02) || !C14360o3.A0K(this.A03, storyTemplateFillableGalleryStickerDictImpl.A03) || !C14360o3.A0K(this.A04, storyTemplateFillableGalleryStickerDictImpl.A04) || !C14360o3.A0K(this.A05, storyTemplateFillableGalleryStickerDictImpl.A05) || !C14360o3.A0K(this.A06, storyTemplateFillableGalleryStickerDictImpl.A06)) {
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
        AbstractC167027dH.A0m(parcel, this.A01);
        AbstractC167027dH.A0m(parcel, this.A02);
        AbstractC167027dH.A0m(parcel, this.A03);
        AbstractC167027dH.A0m(parcel, this.A04);
        AbstractC167027dH.A0m(parcel, this.A05);
        AbstractC167027dH.A0o(parcel, this.A06, 0, 1);
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final /* bridge */ /* synthetic */ C22953A9x AKc() {
        return new C22953A9x(this);
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final StoryTemplateFillableGalleryStickerShapes B9Q() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Float BDR() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Float Bpa() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Float CHf() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Float CI1() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Float CIa() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Integer CIi() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateFillableGalleryStickerDict", C9xS.A00(this));
    }

    public final int hashCode() {
        return (((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A06);
    }

    public StoryTemplateFillableGalleryStickerDictImpl(StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes, Float f, Float f2, Float f3, Float f4, Float f5, Integer num) {
        this.A00 = storyTemplateFillableGalleryStickerShapes;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A04 = f4;
        this.A05 = f5;
        this.A06 = num;
    }
}
