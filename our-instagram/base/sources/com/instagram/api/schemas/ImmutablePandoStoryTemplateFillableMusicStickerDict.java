package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40332Huc;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateFillableMusicStickerDict extends C17T implements StoryTemplateFillableMusicStickerDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(97);

    @Override // com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40332Huc.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict
    public final String Ayd() {
        return A0Z();
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict
    public final Float BDR() {
        return A0C();
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict
    public final Float Bpa() {
        return A0F();
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict
    public final Float CHf() {
        return A0G();
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict
    public final Float CI1() {
        return A0J();
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict
    public final Float CIa() {
        return A0H();
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict
    public final Integer CIi() {
        return getOptionalIntValueByHashCode(-573585203);
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict
    public final StoryTemplateFillableMusicStickerDictImpl F24() {
        return new StoryTemplateFillableMusicStickerDictImpl(A0C(), A0F(), A0G(), A0J(), A0H(), getOptionalIntValueByHashCode(-573585203), A0Z());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
