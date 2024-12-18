package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40351Huv;
import X.C17T;
import X.C39305HXw;
import X.C43300JBt;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryUnlockableStickerData extends C17T implements StoryUnlockableStickerData {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(6);

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final ImageURIDict C83() {
        return (ImageURIDict) A05(2074606664, ImmutablePandoImageURIDict.class);
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final UnlockableStickerStatus CCl() {
        return (UnlockableStickerStatus) A0N(979171661, C43300JBt.A00);
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40351Huv.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final StoryUnlockableStickerDataImpl F2M() {
        ImageURIDictImpl imageURIDictImpl;
        String A0e = A0e();
        String A0W = A0W();
        ImageURIDict C83 = C83();
        if (C83 != null) {
            imageURIDictImpl = C83.Evf();
        } else {
            imageURIDictImpl = null;
        }
        return new StoryUnlockableStickerDataImpl(imageURIDictImpl, CCl(), A0e, A0W);
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final String getId() {
        return A0e();
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final String getName() {
        return A0W();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
