package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.B96;
import X.C17T;
import X.C22953A9x;
import X.C39307HXy;
import X.C9xS;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateFillableGalleryStickerDict extends C17T implements StoryTemplateFillableGalleryStickerDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(96);

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final /* synthetic */ C22953A9x AKc() {
        return new C22953A9x(this);
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final StoryTemplateFillableGalleryStickerShapes B9Q() {
        return (StoryTemplateFillableGalleryStickerShapes) A0N(1852713970, B96.A00);
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, C9xS.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Float BDR() {
        return A0C();
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Float Bpa() {
        return A0F();
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Float CHf() {
        return A0G();
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Float CI1() {
        return A0J();
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Float CIa() {
        return A0H();
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final Integer CIi() {
        return getOptionalIntValueByHashCode(-573585203);
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict
    public final StoryTemplateFillableGalleryStickerDictImpl F23() {
        return new StoryTemplateFillableGalleryStickerDictImpl(B9Q(), A0C(), A0F(), A0G(), A0J(), A0H(), getOptionalIntValueByHashCode(-573585203));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
