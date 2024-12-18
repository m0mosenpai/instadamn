package com.instagram.model.shopping.productlaunchinformation;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40743I3x;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductLaunchInformation extends C17T implements ProductLaunchInformation {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(64);

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40743I3x.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final String AzZ() {
        return A0j(947334735);
    }

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final Boolean BBz() {
        return getOptionalBooleanValueByHashCode(-111871081);
    }

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final Long BMJ() {
        return A0L(-230564678);
    }

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final Boolean CW6() {
        return getOptionalBooleanValueByHashCode(-269940302);
    }

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final ProductLaunchInformationImpl F6E() {
        return new ProductLaunchInformationImpl(getOptionalBooleanValueByHashCode(-111871081), getOptionalBooleanValueByHashCode(-269940302), A0L(-230564678), A0j(947334735));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
