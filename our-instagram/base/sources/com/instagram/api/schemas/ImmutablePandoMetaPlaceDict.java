package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoMetaPlaceDict extends C17T implements MetaPlaceDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(20);

    @Override // com.instagram.api.schemas.MetaPlaceDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getId() != null) {
            AbstractC37300Gc1.A12(getId(), A1I);
        }
        if (getName() != null) {
            AbstractC37300Gc1.A14(getName(), A1I);
        }
        return AbstractC25234BEr.A0P(this, AbstractC06930Yk.A0B(A1I));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.MetaPlaceDict
    public final MetaPlaceDictImpl Ewg() {
        return new MetaPlaceDictImpl(A0e(), A0W());
    }

    @Override // com.instagram.api.schemas.MetaPlaceDict
    public final String getId() {
        return A0e();
    }

    @Override // com.instagram.api.schemas.MetaPlaceDict
    public final String getName() {
        return A0W();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
