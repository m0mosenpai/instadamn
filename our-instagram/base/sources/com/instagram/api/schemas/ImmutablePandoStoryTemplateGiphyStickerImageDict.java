package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.C9xV;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateGiphyStickerImageDict extends C17T implements StoryTemplateGiphyStickerImageDictIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(0);

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, C9xV.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final String BDT() {
        return A0i(-1221029593);
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final String BV6() {
        return A0i(1211087649);
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final String CHh() {
        return A0i(113126854);
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final StoryTemplateGiphyStickerImageDict F27() {
        return new StoryTemplateGiphyStickerImageDict(A0i(-1221029593), A0i(1211087649), A0V(), A0i(113126854));
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf
    public final String getUrl() {
        return A0V();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
