package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39970Hnz;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGAdCreativeOptimizationConfigByTypeDict extends C17T implements IGAdCreativeOptimizationConfigByTypeDict {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(90);

    @Override // com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39970Hnz.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict
    public final String BZJ() {
        return A0i(-1007675833);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict
    public final String BZM() {
        return A0i(-367322628);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict
    public final IGAdCreativeOptimizationConfigByTypeDictImpl EuF() {
        return new IGAdCreativeOptimizationConfigByTypeDictImpl(A0i(-1007675833), A0i(-367322628));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
