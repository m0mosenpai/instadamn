package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39780Hkq;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ImmutablePandoBrandedContentGatingInfo extends C17T implements BrandedContentGatingInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(21);

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final Map As6() {
        return null;
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final BrandedContentGatingInfo ErN() {
        ArrayList arrayList = null;
        List As7 = As7();
        if (As7 != null) {
            arrayList = AbstractC167017dG.A0q(As7);
            Iterator it = As7.iterator();
            while (it.hasNext()) {
                arrayList.add(((BrandedContentGatingCountryMinimumAge) it.next()).ErM());
            }
        }
        return new BrandedContentGatingInfo(getOptionalIntValueByHashCode(-436636159), A0i(745126434), null, arrayList, getOptionalStringListByHashCode(1901672549));
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final List As7() {
        return A08(-2057127321, ImmutablePandoBrandedContentGatingCountryMinimumAge.class);
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39780Hkq.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final List As8() {
        return getOptionalStringListByHashCode(1901672549);
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final Integer AwA() {
        return getOptionalIntValueByHashCode(-436636159);
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingInfoIntf
    public final String BsW() {
        return A0i(745126434);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
