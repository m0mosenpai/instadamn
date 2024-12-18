package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoCallAdsInfoDict extends C17T implements CallAdsInfoDict {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(25);

    @Override // com.instagram.api.schemas.CallAdsInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (BbU() != null) {
            A1I.put("parsed_phone_number", BbU());
        }
        BvP();
        return AbstractC25234BEr.A0P(this, AbstractC37301Gc2.A0r("should_render_phone_number_to_cta", Boolean.valueOf(BvP()), A1I));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CallAdsInfoDict
    public final String BbU() {
        return A0i(-1034922840);
    }

    @Override // com.instagram.api.schemas.CallAdsInfoDict
    public final boolean BvP() {
        return getBooleanValueByHashCode(-74850092);
    }

    @Override // com.instagram.api.schemas.CallAdsInfoDict
    public final CallAdsInfoDictImpl ErZ() {
        return new CallAdsInfoDictImpl(A0i(-1034922840), getBooleanValueByHashCode(-74850092));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
