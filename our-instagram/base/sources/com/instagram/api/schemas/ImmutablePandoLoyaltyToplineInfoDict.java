package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40051Hpd;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoLoyaltyToplineInfoDict extends C17T implements LoyaltyToplineInfoDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(14);

    @Override // com.instagram.api.schemas.LoyaltyToplineInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40051Hpd.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.LoyaltyToplineInfoDict
    public final String BPQ() {
        return A0i(1345320293);
    }

    @Override // com.instagram.api.schemas.LoyaltyToplineInfoDict
    public final Boolean Cfr() {
        return getOptionalBooleanValueByHashCode(1119895441);
    }

    @Override // com.instagram.api.schemas.LoyaltyToplineInfoDict
    public final LoyaltyToplineInfoDictImpl Ew8() {
        return new LoyaltyToplineInfoDictImpl(A0i(1345320293), getOptionalBooleanValueByHashCode(1119895441));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
