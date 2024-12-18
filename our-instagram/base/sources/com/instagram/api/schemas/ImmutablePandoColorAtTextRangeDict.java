package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39837Hll;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoColorAtTextRangeDict extends C17T implements ColorAtTextRangeDictIntf {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(37);

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39837Hll.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final String BDa() {
        return A0i(448685389);
    }

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final String BDb() {
        return A0i(-834172120);
    }

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final Integer BN2() {
        return getOptionalIntValueByHashCode(-1106363674);
    }

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final Integer BYa() {
        return getOptionalIntValueByHashCode(-1019779949);
    }

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final ColorAtTextRangeDict EsL() {
        return new ColorAtTextRangeDict(getOptionalIntValueByHashCode(-1106363674), getOptionalIntValueByHashCode(-1019779949), A0i(448685389), A0i(-834172120));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
