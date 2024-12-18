package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40160HrX;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductArtsLabelInformationDict extends C17T implements ProductArtsLabelInformationDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(46);

    @Override // com.instagram.api.schemas.ProductArtsLabelInformationDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40160HrX.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductArtsLabelInformationDict
    public final ProductArtsLabelInformationDictImpl EyH() {
        return new ProductArtsLabelInformationDictImpl(A0i(-2125526615), A0i(-1649475163));
    }

    @Override // com.instagram.api.schemas.ProductArtsLabelInformationDict
    public final String getLabelDisplayValue() {
        return A0i(-2125526615);
    }

    @Override // com.instagram.api.schemas.ProductArtsLabelInformationDict
    public final String getLabelType() {
        return A0i(-1649475163);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
