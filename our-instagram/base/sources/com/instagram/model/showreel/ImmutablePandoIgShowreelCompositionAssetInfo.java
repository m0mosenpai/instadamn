package com.instagram.model.showreel;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.I4O;
import X.JDM;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIgShowreelCompositionAssetInfo extends C17T implements IgShowreelCompositionAssetInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(75);

    @Override // com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf
    public final IgShowreelCompositionAssetType CBh() {
        return (IgShowreelCompositionAssetType) A0N(3575610, JDM.A00);
    }

    @Override // com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I4O.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf
    public final IgShowreelCompositionAssetInfo F6X() {
        return new IgShowreelCompositionAssetInfo(CBh(), A0V());
    }

    @Override // com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf
    public final String getUrl() {
        return A0V();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
