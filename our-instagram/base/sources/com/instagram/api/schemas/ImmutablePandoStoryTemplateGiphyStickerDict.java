package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.C17T;
import X.C39307HXy;
import X.C9xU;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateGiphyStickerDict extends C17T implements StoryTemplateGiphyStickerDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(99);

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final StoryTemplateGiphyStickerImageDictIntf BGT() {
        return (StoryTemplateGiphyStickerImageDictIntf) A05(100313435, ImmutablePandoStoryTemplateGiphyStickerImageDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, C9xU.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final String B9l() {
        return A0i(-1246061706);
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final StoryTemplateGiphyStickerDict F26() {
        StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict;
        String A0i = A0i(-1246061706);
        StoryTemplateGiphyStickerImageDictIntf BGT = BGT();
        if (BGT != null) {
            storyTemplateGiphyStickerImageDict = BGT.F27();
        } else {
            storyTemplateGiphyStickerImageDict = null;
        }
        return new StoryTemplateGiphyStickerDict(storyTemplateGiphyStickerImageDict, A0i, A0Y(), AbstractC37301Gc2.A0m(this));
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final String getTitle() {
        return A0Y();
    }

    @Override // com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf
    public final String getUsername() {
        return AbstractC37301Gc2.A0m(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
