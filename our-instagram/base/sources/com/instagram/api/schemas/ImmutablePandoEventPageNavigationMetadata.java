package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39912Hmz;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoEventPageNavigationMetadata extends C17T implements EventPageNavigationMetadata {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(65);

    @Override // com.instagram.api.schemas.EventPageNavigationMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39912Hmz.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.EventPageNavigationMetadata
    public final Integer BmM() {
        return getOptionalIntValueByHashCode(458282754);
    }

    @Override // com.instagram.api.schemas.EventPageNavigationMetadata
    public final EventPageNavigationMetadataImpl EtE() {
        return new EventPageNavigationMetadataImpl(A0T(), getOptionalIntValueByHashCode(458282754), A0U());
    }

    @Override // com.instagram.api.schemas.EventPageNavigationMetadata
    public final String getDescription() {
        return A0T();
    }

    @Override // com.instagram.api.schemas.EventPageNavigationMetadata
    public final String getSubtitle() {
        return A0U();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
