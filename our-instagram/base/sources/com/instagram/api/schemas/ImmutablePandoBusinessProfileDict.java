package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC39786Hkw;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class ImmutablePandoBusinessProfileDict extends C17T implements BusinessProfileDict {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(23);

    @Override // com.instagram.api.schemas.BusinessProfileDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39786Hkw.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.BusinessProfileDict
    public final ImageUrl Bhu() {
        return A0A(1782139044);
    }

    @Override // com.instagram.api.schemas.BusinessProfileDict
    public final BusinessProfileDictImpl ErS() {
        return new BusinessProfileDictImpl(A0A(1782139044), A0e(), AbstractC37301Gc2.A0m(this));
    }

    @Override // com.instagram.api.schemas.BusinessProfileDict
    public final String getId() {
        return A0e();
    }

    @Override // com.instagram.api.schemas.BusinessProfileDict
    public final String getUsername() {
        return AbstractC37301Gc2.A0m(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
