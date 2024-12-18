package com.instagram.model.shopping.productcollection;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40730I3k;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductCollectionDropsMetadata extends C17T implements ProductCollectionDropsMetadata {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(62);

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40730I3k.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata
    public final boolean ApB() {
        return getBooleanValueByHashCode(-861860074);
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata
    public final long BMI() {
        return A03(-230564678);
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata
    public final Integer BXw() {
        return getOptionalIntValueByHashCode(665906685);
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata
    public final ProductCollectionDropsMetadataImpl F6C() {
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-861860074);
        return new ProductCollectionDropsMetadataImpl(getOptionalIntValueByHashCode(665906685), A03(-230564678), booleanValueByHashCode);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
