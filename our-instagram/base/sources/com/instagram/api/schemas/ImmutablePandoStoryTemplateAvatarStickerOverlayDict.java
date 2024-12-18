package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.C9xQ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateAvatarStickerOverlayDict extends C17T implements StoryTemplateAvatarStickerOverlayDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(93);

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, C9xQ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final String B3Q() {
        return A0i(1204402210);
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Float BDR() {
        return A0C();
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final String BIf() {
        return A0i(-652560436);
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Float Bpa() {
        return A0F();
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Float CHf() {
        return A0G();
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Float CI1() {
        return A0J();
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Float CIa() {
        return A0H();
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final Integer CIi() {
        return getOptionalIntValueByHashCode(-573585203);
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final StoryTemplateAvatarStickerOverlayDictImpl F20() {
        String A0i = A0i(1204402210);
        return new StoryTemplateAvatarStickerOverlayDictImpl(A0C(), A0F(), A0G(), A0J(), A0H(), getOptionalIntValueByHashCode(-573585203), A0i, A0i(-652560436), A0a());
    }

    @Override // com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict
    public final String getMediaType() {
        return A0a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
