package com.instagram.model.showreelnative;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC47071KrS;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIgShowreelNativeAsset extends C17T implements IgShowreelNativeAsset {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(77);

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAsset
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC47071KrS.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAsset
    public final Integer BDS() {
        return AbstractC37301Gc2.A0U(this);
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAsset
    public final Integer CHg() {
        return AbstractC37301Gc2.A0Z(this);
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAsset
    public final IgShowreelNativeAssetImpl F6a() {
        return new IgShowreelNativeAssetImpl(AbstractC37301Gc2.A0U(this), AbstractC37301Gc2.A0Z(this), A0V());
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAsset
    public final String getUrl() {
        return A0V();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
