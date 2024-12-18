package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39847Hlv;
import X.C17T;
import X.C39306HXx;
import X.J9O;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoCommerceReviewStatisticsDict extends C17T implements CommerceReviewStatisticsDictIntf {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(42);

    @Override // com.instagram.api.schemas.CommerceReviewStatisticsDictIntf
    public final List BkS() {
        return A0p(-316248257, J9O.A00);
    }

    @Override // com.instagram.api.schemas.CommerceReviewStatisticsDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39847Hlv.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CommerceReviewStatisticsDictIntf
    public final Float Aen() {
        return A0K(2031429119);
    }

    @Override // com.instagram.api.schemas.CommerceReviewStatisticsDictIntf
    public final Integer BpC() {
        return getOptionalIntValueByHashCode(-807286424);
    }

    @Override // com.instagram.api.schemas.CommerceReviewStatisticsDictIntf
    public final CommerceReviewStatisticsDict EsV() {
        return new CommerceReviewStatisticsDict(A0K(2031429119), getOptionalIntValueByHashCode(-807286424), BkS());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
