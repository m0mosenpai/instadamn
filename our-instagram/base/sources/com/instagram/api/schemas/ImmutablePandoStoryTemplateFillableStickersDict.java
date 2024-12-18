package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40333Hud;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateFillableStickersDict extends C17T implements StoryTemplateFillableStickersDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(98);

    @Override // com.instagram.api.schemas.StoryTemplateFillableStickersDict
    public final List B6L() {
        return A08(-1399026747, ImmutablePandoStoryTemplateFillableGalleryStickerDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableStickersDict
    public final StoryTemplateFillableMusicStickerDict B6M() {
        return (StoryTemplateFillableMusicStickerDict) A05(-1542167103, ImmutablePandoStoryTemplateFillableMusicStickerDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableStickersDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40333Hud.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableStickersDict
    public final StoryTemplateFillableStickersDictImpl F25() {
        ArrayList arrayList;
        List B6L = B6L();
        StoryTemplateFillableMusicStickerDictImpl storyTemplateFillableMusicStickerDictImpl = null;
        if (B6L != null) {
            arrayList = AbstractC167017dG.A0q(B6L);
            Iterator it = B6L.iterator();
            while (it.hasNext()) {
                arrayList.add(((StoryTemplateFillableGalleryStickerDict) it.next()).F23());
            }
        } else {
            arrayList = null;
        }
        StoryTemplateFillableMusicStickerDict B6M = B6M();
        if (B6M != null) {
            storyTemplateFillableMusicStickerDictImpl = B6M.F24();
        }
        return new StoryTemplateFillableStickersDictImpl(storyTemplateFillableMusicStickerDictImpl, arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
