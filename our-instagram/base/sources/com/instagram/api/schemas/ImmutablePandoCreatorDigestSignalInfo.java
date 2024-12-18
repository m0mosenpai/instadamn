package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39864HmD;
import X.C17T;
import X.C39306HXx;
import X.J9R;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorDigestSignalInfo extends C17T implements CreatorDigestSignalInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(45);

    @Override // com.instagram.api.schemas.CreatorDigestSignalInfo
    public final InspirationSignalType BxI() {
        return (InspirationSignalType) A0N(673104497, J9R.A00);
    }

    @Override // com.instagram.api.schemas.CreatorDigestSignalInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39864HmD.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CreatorDigestSignalInfo
    public final CreatorDigestSignalInfoImpl Esj() {
        return new CreatorDigestSignalInfoImpl(BxI(), A0U(), A0Y());
    }

    @Override // com.instagram.api.schemas.CreatorDigestSignalInfo
    public final String getSubtitle() {
        return A0U();
    }

    @Override // com.instagram.api.schemas.CreatorDigestSignalInfo
    public final String getTitle() {
        return A0Y();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
