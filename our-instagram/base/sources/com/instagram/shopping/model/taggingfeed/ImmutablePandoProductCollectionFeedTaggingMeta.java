package com.instagram.shopping.model.taggingfeed;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductCollectionFeedTaggingMeta extends C17T implements ProductCollectionFeedTaggingMetaIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(85);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
