package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.C17T;
import X.C39307HXy;
import X.C9xP;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateAssetDict extends C17T implements StoryTemplateAssetDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(92);

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final ImageInfo Af9() {
        return (ImageInfo) A05(-697531610, ImmutablePandoImageInfo.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final ImageInfo BGx() {
        return (ImageInfo) A05(-1876344045, ImmutablePandoImageInfo.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, C9xP.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final String Af3() {
        return A0j(-1893603668);
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final Integer BdG() {
        return getOptionalIntValueByHashCode(-977447900);
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final String C5j() {
        return A0i(1519672386);
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final Integer CIi() {
        return getOptionalIntValueByHashCode(-573585203);
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final Boolean CaM() {
        return getOptionalBooleanValueByHashCode(1955261344);
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final StoryTemplateAssetDict F1z() {
        ImageInfoImpl imageInfoImpl;
        String A0j = A0j(-1893603668);
        ImageInfo Af9 = Af9();
        ImageInfoImpl imageInfoImpl2 = null;
        if (Af9 != null) {
            imageInfoImpl = Af9.F5B();
        } else {
            imageInfoImpl = null;
        }
        ImageInfo BGx = BGx();
        if (BGx != null) {
            imageInfoImpl2 = BGx.F5B();
        }
        return new StoryTemplateAssetDict(imageInfoImpl, imageInfoImpl2, getOptionalBooleanValueByHashCode(1955261344), getOptionalIntValueByHashCode(-977447900), getOptionalIntValueByHashCode(-573585203), A0j, AbstractC37301Gc2.A0k(this), A0i(1519672386));
    }

    @Override // com.instagram.api.schemas.StoryTemplateAssetDictIntf
    public final String getPk() {
        return AbstractC37301Gc2.A0k(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
