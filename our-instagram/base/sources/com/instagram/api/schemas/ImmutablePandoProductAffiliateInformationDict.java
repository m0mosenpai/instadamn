package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.HrV;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductAffiliateInformationDict extends C17T implements ProductAffiliateInformationDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(45);

    @Override // com.instagram.api.schemas.ProductAffiliateInformationDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, HrV.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductAffiliateInformationDict
    public final String AaM() {
        return A0j(68906680);
    }

    @Override // com.instagram.api.schemas.ProductAffiliateInformationDict
    public final String Aps() {
        return A0i(961471412);
    }

    @Override // com.instagram.api.schemas.ProductAffiliateInformationDict
    public final ProductAffiliateInformationDictImpl EyG() {
        return new ProductAffiliateInformationDictImpl(A0j(68906680), A0i(961471412));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
