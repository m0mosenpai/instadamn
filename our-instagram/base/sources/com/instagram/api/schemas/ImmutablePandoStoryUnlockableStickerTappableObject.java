package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40353Hux;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryUnlockableStickerTappableObject extends C17T implements StoryUnlockableStickerTappableObject {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(7);

    @Override // com.instagram.api.schemas.StoryUnlockableStickerTappableObject
    public final List C0p() {
        return A08(1531715286, ImmutablePandoStoryUnlockableStickerData.class);
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerTappableObject
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40353Hux.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerTappableObject
    public final StoryUnlockableStickerTappableObjectImpl F2N() {
        ArrayList arrayList;
        List C0p = C0p();
        if (C0p != null) {
            arrayList = AbstractC167017dG.A0q(C0p);
            Iterator it = C0p.iterator();
            while (it.hasNext()) {
                arrayList.add(((StoryUnlockableStickerData) it.next()).F2M());
            }
        } else {
            arrayList = null;
        }
        return new StoryUnlockableStickerTappableObjectImpl(A0U(), A0Y(), arrayList);
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerTappableObject
    public final String getSubtitle() {
        return A0U();
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerTappableObject
    public final String getTitle() {
        return A0Y();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
